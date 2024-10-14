/*
 * Copyright (c) 2024, Zoinkwiz <https://github.com/Zoinkwiz>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.questhelper.helpers.quests.templeoftheeye;

import com.questhelper.questhelpers.QuestHelper;
import com.questhelper.steps.ObjectStep;
import net.runelite.api.ChatMessageType;
import net.runelite.api.ObjectID;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;

public class RuneEnergyStep extends ObjectStep
{
	int currentPos = 0;

	RunicEnergy[] useList = new RunicEnergy[6];

	RunicEnergy[] runicEnergies = new RunicEnergy[]{
		new RunicEnergy("earth", new WorldPoint(3040, 4834, 0), ObjectID.EARTH_ENERGY, 13747),
		new RunicEnergy("cosmic", new WorldPoint(3041, 4832, 0), ObjectID.COSMIC_ENERGY, 13748),
		new RunicEnergy("death", new WorldPoint(3037, 4832, 0), ObjectID.DEATH_ENERGY, 13749),
		new RunicEnergy("nature", new WorldPoint(3038, 4830, 0), ObjectID.NATURE_ENERGY, 13750),
		new RunicEnergy("law", new WorldPoint(3038, 4834, 0), ObjectID.LAW_ENERGY, 13751),
		new RunicEnergy("fire", new WorldPoint(3040, 4830, 0), ObjectID.FIRE_ENERGY, 13752),
	};

	public RuneEnergyStep(QuestHelper questHelper)
	{
		super(questHelper, -1,
			"Work out the correct order to activate the runes through trial and error.");
		addAlternateObjects(ObjectID.EARTH_ENERGY, ObjectID.COSMIC_ENERGY,
			ObjectID.DEATH_ENERGY,
			ObjectID.NATURE_ENERGY, ObjectID.LAW_ENERGY,
			ObjectID.FIRE_ENERGY);
	}

	@Override
	public void startUp()
	{
		super.startUp();
		setupHighlights();
	}

	@Override
	public void onVarbitChanged(VarbitChanged varbitChanged)
	{
		for (RunicEnergy re : runicEnergies)
		{
			if (varbitChanged.getVarbitId() == re.stateVarbit)
			{
				if (varbitChanged.getValue() == 2)
				{
					useList[currentPos] = re;
					currentPos++;
					setupHighlights();
				}
				else
				{
					currentPos = 0;
					setupHighlights();
				}
			}
		}
	}

	private void setupHighlights()
	{
		if (useList[currentPos] == null)
		{
			return;
		}

		alternateObjectIDs.clear();
		alternateObjectIDs.add(useList[currentPos].id);
		worldPoint = useList[currentPos].wp;

		loadObjects();
	}
}

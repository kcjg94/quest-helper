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
package com.questhelper.util.worldmap;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum WorldMapPointMapping
{
	ANCIENT_CAVERN_6995(WorldMapArea.ANCIENT_CAVERN, 1, 6995, 7252, 0, 0, 0, 0, 64, 64, false),
	ANCIENT_CAVERN_6994(WorldMapArea.ANCIENT_CAVERN, 1, 6994, 7251, 0, 0, 0, 0, 64, 64, false),
	DS2_ANCIENT_CAVERN_6483(WorldMapArea.ANCIENT_CAVERN, 0, 6483, 6995, 0, 0, 0, 0, 64, 64, true),
	DS2_ANCIENT_CAVERN_6483_PLANE1(WorldMapArea.ANCIENT_CAVERN, 1, 6483, 6995, 0, 0, 0, 0, 64, 64, true),
	ASGARNIA_ICE_CAVE_12181(WorldMapArea.ASGARNIA_ICE_CAVE, 1, 12181, 12437, 0, 0, 0, 0, 64, 64, false),
	ASGARNIA_ICE_CAVE_12437(WorldMapArea.ASGARNIA_ICE_CAVE, 1, 12437, 12693, 0, 0, 0, 0, 16, 64, false),
	ASGARNIA_ICE_CAVE_RAT_PITS_11926(WorldMapArea.ASGARNIA_ICE_CAVE, 0, 11926, 12182, 0, 0, 0, 16, 64, 64, false),
	DORGESH_KAAN_10834(WorldMapArea.DORGESH_KAAN, 1, 10834, 11091, 0, 0, 0, 0, 64, 64, false),
	DORGESH_KAAN_10835(WorldMapArea.DORGESH_KAAN, 1, 10835, 11092, 0, 0, 0, 0, 64, 64, false),
	DORGESH_KAAN_10834_PLANE2(WorldMapArea.DORGESH_KAAN, 2, 10834, 11348, 0, 0, 0, 0, 64, 64, false),
	DORGESH_KAAN_10835_PLANE2(WorldMapArea.DORGESH_KAAN, 2, 10835, 11349, 0, 0, 0, 0, 64, 64, false),
	DWARVEN_MINES_14936(WorldMapArea.DWARVEN_MINES, 0, 14936, 12439, 0, 0, 0, 0, 64, 64, false),
	DWARVEN_MINES_14936_PLANE1(WorldMapArea.DWARVEN_MINES, 1, 14936, 12951, -32, 0, 0, 0, 64, 64, false),
	FELDIP_HILLS_UNDERGROUND_10130(WorldMapArea.FELDIP_HILLS_UNDERGROUND, 0, 10130, 8077, 24, 16, 0, 24, 32, 56, false),
	FELDIP_HILLS_UNDERGROUND_7564(WorldMapArea.FELDIP_HILLS_UNDERGROUND, 1, 7564, 7564, 0, 0, 0, 0, 64, 64, false),
	FELDIP_HILLS_UNDERGROUND_7820(WorldMapArea.FELDIP_HILLS_UNDERGROUND, 1, 7820, 7820, 0, 0, 0, 0, 64, 64, false),
	FELDIP_HILLS_UNDERGROUND_7821(WorldMapArea.FELDIP_HILLS_UNDERGROUND, 1, 7821, 7821, 0, 0, 0, 0, 64, 64, false),
	FELDIP_HILLS_UNDERGROUND_8076(WorldMapArea.FELDIP_HILLS_UNDERGROUND, 1, 8076, 8076, 0, 0, 0, 0, 64, 64, false),
	FELDIP_HILLS_UNDERGROUND_8332(WorldMapArea.FELDIP_HILLS_UNDERGROUND, 1, 8332, 8332, 0, 0, 0, 0, 64, 64, false),
	FELDIP_HILLS_UNDERGROUND_SOUL_WARS_8593(WorldMapArea.FELDIP_HILLS_UNDERGROUND, 0, 8593, 7310, 0, 0, 0, 0, 64, 64, false),
	FELDIP_HILLS_UNDERGROUND_CRUMBING_TOWER_7827(WorldMapArea.FELDIP_HILLS_UNDERGROUND, 0, 7827, 6799, 0, 0, 0, 0, 64, 64, false),
	FOSSIL_ISLAND_UNDERGROUND_VOLCANIC_MINE_15262(WorldMapArea.FOSSIL_ISLAND_UNDERGROUND, 3, 15262, 15518, 32, 32, 0, 0, 64, 64, false),
	FOSSIL_ISLAND_UNDERGROUND_VOLCANIC_MINE_15263(WorldMapArea.FOSSIL_ISLAND_UNDERGROUND, 3, 15263, 15519, 32, 32, 0, 0, 64, 64, false),
	FREMENNIK_SLAYER_CAVE_ENTRANCE(WorldMapArea.FREMENNIK_SLAYER_CAVE, 0, 10908, 10908, 0, -32, 0, 0, 40, 8, false),
	FREMENNIK_SLAYER_CAVE_10907(WorldMapArea.FREMENNIK_SLAYER_CAVE, 0, 10907, 10907, 0, -32, 0, 0, 64, 64, false),
	GHORROCK_PRISON_11619(WorldMapArea.GHORROCK_PRISON, 2, 11619, 11619, 0, 0, 0, 0, 64, 64, false),
	GHORROCK_PRISON_11620(WorldMapArea.GHORROCK_PRISON, 2, 11620, 11620, 0, 0, 0, 0, 64, 64, false),
	GHORROCK_PRISON_11875(WorldMapArea.GHORROCK_PRISON, 2, 11875, 11875, 0, 0, 0, 0, 64, 64, false),
	GHORROCK_PRISON_11876(WorldMapArea.GHORROCK_PRISON, 2, 11876, 11876, 0, 0, 0, 0, 64, 64, false),
	GOD_WARS_11346(WorldMapArea.GOD_WARS_DUNGEON, 2, 11346, 11346, 0, 0, 0, 0, 64, 64, false),
	GOD_WARS_11347(WorldMapArea.GOD_WARS_DUNGEON, 2, 11347, 11347, 0, 0, 0, 0, 64, 64, false),
	GOD_WARS_11602(WorldMapArea.GOD_WARS_DUNGEON, 2, 11602, 11602, 0, 0, 0, 0, 64, 64, false),
	GOD_WARS_11603(WorldMapArea.GOD_WARS_DUNGEON, 2, 11603, 11603, 0, 0, 0, 0, 64, 64, false),
	GOD_WARS_SARA_ENCAMPMENT(WorldMapArea.GOD_WARS_DUNGEON, 1, 11602, 11602, 32, -8, 24, 24, 64, 64, false),
	GOD_WARS_ZILYANA_ROOM(WorldMapArea.GOD_WARS_DUNGEON, 0, 11602, 11601, 8, 32, 0, 0, 56, 40, false),
	GOD_WARS_DUNGEON_11345(WorldMapArea.GOD_WARS_DUNGEON, 0, 11345, 11344, 0, 32, 0, 0, 64, 48, false),
	GOD_WARS_DUNGEON_11601(WorldMapArea.GOD_WARS_DUNGEON, 0, 11601, 11600, 0, 32, 0, 0, 64, 48, false),
	KARAMJA_BRIMHAVEN_DUNGEON_10644(WorldMapArea.KARAMJA_UNDERGROUND, 2, 10644, 10388, 0, 0, 0, 0, 64, 64, false),
	KARAMJA_BRIMHAVEN_DUNGEON_10645(WorldMapArea.KARAMJA_UNDERGROUND, 2, 10645, 10389, 0, 0, 0, 0, 64, 64, false),
	KARAMJA_UNDERGROUND_11412(WorldMapArea.KARAMJA_UNDERGROUND, 1, 11412, 11667, 0, 0, 0, 0, 64, 64, false),
	KEBOS_UNDERGROUND_KARUULM_DUNGEON_F1_W(WorldMapArea.KEBOS_UNDERGROUND, 1, 5023, 4510, -24, 24, 0, 0, 64, 64, false),
	KEBOS_UNDERGROUND_KARUULM_DUNGEON_F1_S(WorldMapArea.KEBOS_UNDERGROUND, 1, 5278, 4765, -24, 24, 32, 48, 64, 64, false),
	KEBOS_UNDERGROUND_KARUULM_DUNGEON_F1_C(WorldMapArea.KEBOS_UNDERGROUND, 1, 5279, 4766, -24, 24, 0, 0, 64, 64, false),
	KEBOS_UNDERGROUND_KARUULM_DUNGEON_F1_N(WorldMapArea.KEBOS_UNDERGROUND, 1, 5280, 4767, -24, 24, 0, 0, 64, 32, false),
	KEBOS_UNDERGROUND_KARUULM_DUNGEON_F1_E(WorldMapArea.KEBOS_UNDERGROUND, 1, 5535, 5022, -24, 24, 0, 0, 24, 64, false),
	KEBOS_UNDERGROUND_KARUULM_DUNGEON_F1_NE(WorldMapArea.KEBOS_UNDERGROUND, 1, 5536, 5023, -24, 24, 0, 0, 24, 32, false),
	KEBOS_UNDERGROUND_KARUULM_DUNGEON_F2_W(WorldMapArea.KEBOS_UNDERGROUND, 2, 5023, 4512, -16, 0, 48, 0, 64, 56, false),
	KEBOS_UNDERGROUND_KARUULM_DUNGEON_F2_C(WorldMapArea.KEBOS_UNDERGROUND, 2, 5279, 4768, -16, 0, 0, 0, 64, 56, false),
	KEBOS_UNDERGROUND_KARUULM_DUNGEON_F2_E(WorldMapArea.KEBOS_UNDERGROUND, 2, 5535, 5024, -16, 0, 0, 0, 16, 56, false),
	KEBOS_UNDERGROUND_HESPORI(WorldMapArea.KEBOS_UNDERGROUND, 0, 5021, 4765, 0, -16, 0, 0, 64, 64, false),
	KEBOS_UNDERGROUND_LIZARDMAN_TEMPLE(WorldMapArea.KEBOS_UNDERGROUND, 0, 5277, 5276, 0, 16, 0, 0, 64, 64, false),
	KEBOS_UNDERGROUND_LIZARDMAN_CAVES(WorldMapArea.KEBOS_UNDERGROUND, 0, 5275, 5275, 0, -16, 0, 0, 64, 64, false),
	KELDAGRIM_11166(WorldMapArea.KELDAGRIM, 0, 11166, 11421, -8, 16, 8, 8, 56, 40, false),
	KELDAGRIM_11166_2(WorldMapArea.KELDAGRIM, 0, 11166, 11421, -8, 16, 8, 40, 32, 56, false),
	KHARIDIAN_DESERT_UNDERGROUND_KALPHITE_13204(WorldMapArea.KHARIDIAN_DESERT_UNDERGROUND, 0, 13204, 13460, 0, 0, 0, 0, 64, 64, false),
	KHARIDIAN_DESERT_UNDERGROUND_KALPHITE_13205(WorldMapArea.KHARIDIAN_DESERT_UNDERGROUND, 0, 13205, 13461, 0, 0, 0, 0, 64, 16, false),
	KHARIDIAN_DESERT_UNDERGROUND_KALPHITE_13460(WorldMapArea.KHARIDIAN_DESERT_UNDERGROUND, 0, 13460, 13716, 0, 0, 0, 0, 32, 56, false),
	KHARIDIAN_DESERT_UNDERGROUND_KALPHITE_13460_2(WorldMapArea.KHARIDIAN_DESERT_UNDERGROUND, 0, 13460, 13716, 0, 0, 0, 56, 16, 64, false),
	KHARIDIAN_DESERT_UNDERGROUND_KALPHITE_LAIR_13972(WorldMapArea.KHARIDIAN_DESERT_UNDERGROUND, 2, 13972, 12692, 32, 0, 0, 0, 64, 64, false),
	KHARIDIAN_DESERT_UNDERGROUND_KALPHITE_LAIR_13972_PLANE0(WorldMapArea.KHARIDIAN_DESERT_UNDERGROUND, 0, 13972, 12691, 32, -8, 0, 0, 64, 64, false),
	KOUREND_UNDERGROUND_7070(WorldMapArea.KOUREND_UNDERGROUND, 0, 7070, 7326, 0, 0, 0, 0, 64, 64, false),
	KOUREND_UNDERGROUND_7326(WorldMapArea.KOUREND_UNDERGROUND, 0, 7326, 7582, 0, 0, 0, 0, 64, 64, false),
	KOUREND_UNDERGROUND_SHAYZIEN_CRYPTS_6043(WorldMapArea.KOUREND_UNDERGROUND, 1, 6043, 6042, -32, 0, 0, 0, 64, 64, false),
	KOUREND_UNDERGROUND_SHAYZIEN_CRYPTS_6043_PLANE2(WorldMapArea.KOUREND_UNDERGROUND, 2, 6043, 6043, -32, 32, 0, 0, 64, 64, false),
	KOUREND_UNDERGROUND_SHAYZIEN_CRYPTS_6043_PLANE3(WorldMapArea.KOUREND_UNDERGROUND, 3, 6043, 6045, -32, 0, 0, 0, 64, 64, false),
	KOUREND_UNDERGROUND_CHASM_OF_FIRE_5789(WorldMapArea.KOUREND_UNDERGROUND, 3, 5789, 5533, 0, 0, 0, 0, 64, 64, false),
	KOUREND_UNDERGROUND_CHASM_OF_FIRE_5789_PLANE2(WorldMapArea.KOUREND_UNDERGROUND, 2, 5789, 5532, 0, -32, 0, 0, 64, 64, false),
	KOUREND_UNDERGROUND_CHASM_OF_FIRE_5789_PLANE1(WorldMapArea.KOUREND_UNDERGROUND, 1, 5789, 5530, 0, 0, 0, 0, 64, 64, false),
	KOUREND_UNDERGROUND_GIANTS_DEN_5786(WorldMapArea.KOUREND_UNDERGROUND, 0, 5786, 5785, 0, 0, 0, 0, 64, 64, false),
	LAIR_OF_TARN_RAZORLOR_12615_PLANE1(WorldMapArea.LAIR_OF_TARN_RAZORLOR, 1, 12615, 12871, 32, 0, 0, 0, 64, 64, false),
	LAIR_OF_TARN_RAZORLOR_12615_PLANE2(WorldMapArea.LAIR_OF_TARN_RAZORLOR, 2, 12615, 13383, 0, 0, 0, 0, 64, 64, false),
	LASSAR_UNDERCITY_9314(WorldMapArea.LASSAR_UNDERCITY, -1, 9314, 10338, 0, 0, 0, 0, 64, 64, true),
	LASSAR_UNDERCITY_9315(WorldMapArea.LASSAR_UNDERCITY, -1, 9315, 10339, 0, 0, 0, 0, 64, 64, true),
	LASSAR_UNDERCITY_9316(WorldMapArea.LASSAR_UNDERCITY, -1, 9316, 10340, 0, 0, 0, 0, 64, 64, true),
	LASSAR_UNDERCITY_9570(WorldMapArea.LASSAR_UNDERCITY, -1, 9570, 10594, 0, 0, 0, 0, 64, 64, true),
	LASSAR_UNDERCITY_9571(WorldMapArea.LASSAR_UNDERCITY, -1, 9571, 10595, 0, 0, 0, 0, 64, 64, true),
	LASSAR_UNDERCITY_9572(WorldMapArea.LASSAR_UNDERCITY, -1, 9572, 10596, 0, 0, 0, 0, 64, 64, true),
	LASSAR_UNDERCITY_9826(WorldMapArea.LASSAR_UNDERCITY, -1, 9826, 10850, 0, 0, 0, 0, 64, 64, true),
	LASSAR_UNDERCITY_9827(WorldMapArea.LASSAR_UNDERCITY, -1, 9827, 10851, 0, 0, 0, 0, 64, 64, true),
	LASSAR_UNDERCITY_9828(WorldMapArea.LASSAR_UNDERCITY, -1, 9828, 10852, 0, 0, 0, 0, 64, 64, true),
	MISCELLANIA_UNDERGROUND_9632(WorldMapArea.MISCELLANIA_UNDERGROUND, 1, 9632, 9632, 0, 0, 0, 0, 64, 64, false),
	MOR_UL_REK_9043(WorldMapArea.MOR_UL_REK, 0, 9043, 9806, 32, 0, 0, 0, 64, 64, false),
	MORYTANIA_UNDERGROUND_MEIYERDITCH_LABS_13977(WorldMapArea.MORYTANIA_UNDERGROUND, 0, 13977, 14233, 0, 0, 56, 16, 64, 32, false),
	MORYTANIA_UNDERGROUND_MEIYERDITCH_LABS_13978(WorldMapArea.MORYTANIA_UNDERGROUND, 0, 13978, 14233, -24, 0, 24, 0, 64, 24, false),
	MORYTANIA_UNDERGROUND_MEIYERDITCH_LABS_14233(WorldMapArea.MORYTANIA_UNDERGROUND, 0, 14233, 14489, 0, 0, 0, 0, 64, 64, false),
	MORYTANIA_UNDERGROUND_MEIYERDITCH_LABS_14232(WorldMapArea.MORYTANIA_UNDERGROUND, 0, 14232, 14488, 0, 0, 0, 0, 64, 64, false),
	MORYTANIA_UNDERGROUND_MEIYERDITCH_LABS_14488(WorldMapArea.MORYTANIA_UNDERGROUND, 0, 14488, 14744, 0, 0, 0, 0, 64, 64, false),
	MORYTANIA_UNDERGROUND_MEIYERDITCH_LABS_14487(WorldMapArea.MORYTANIA_UNDERGROUND, 0, 14487, 14743, 0, 0, 0, 0, 64, 64, false),
	MORYTANIA_UNDERGROUND_SLEPE_BASEMENT(WorldMapArea.MORYTANIA_UNDERGROUND, 0, 14999, 14999, -16, 24, 16, 8, 32, 24, false),
	MORYTANIA_UNDERGROUND_SHADE_CATACOMBS_13975(WorldMapArea.MORYTANIA_UNDERGROUND, 0, 13975, 13975, 0, -24, 0, 0, 64, 64, false),
	MORYTANIA_UNDERGROUND_MYREQUE_HIDEOUT_13974(WorldMapArea.MORYTANIA_UNDERGROUND, 0, 13974, 13973, 0, 24, 0, 0, 64, 64, false),
	MORYTANIA_UNDERGROUND_ECTOFUNTUS_BASEMENT(WorldMapArea.MORYTANIA_UNDERGROUND, 0, 14746, 14747, -16, -32, 8, 8, 56, 56, false),
	MORYTANIA_UNDERGROUND_PORT_PHASMATYS_BREWERY(WorldMapArea.MORYTANIA_UNDERGROUND, 0, 14747, 14746, 0, -8, 24, 32, 40, 48, false),
	MORYTANIA_UNDERGROUND_PATERDOMUS_UNDERGROUND(WorldMapArea.MORYTANIA_UNDERGROUND, 0, 13722, 13722, -16, -8, 0, 0, 64, 64, false),
	PRIFDDINAS_GRAND_LIBRARY_F1_10335(WorldMapArea.PRIFDDINAS_GRAND_LIBRARY, 1, 10335, 11103, 0, 0, 0, 0, 64, 64, false),
	PRIFDDINAS_GRAND_LIBRARY_F1_10336(WorldMapArea.PRIFDDINAS_GRAND_LIBRARY, 1, 10336, 11104, 0, 0, 0, 0, 64, 64, false),
	PRIFDDINAS_GRAND_LIBRARY_F1_10591(WorldMapArea.PRIFDDINAS_GRAND_LIBRARY, 1, 10591, 11359, 0, 0, 0, 0, 64, 64, false),
	PRIFDDINAS_GRAND_LIBRARY_F1_10592(WorldMapArea.PRIFDDINAS_GRAND_LIBRARY, 1, 10592, 11360, 0, 0, 0, 0, 64, 64, false),
	PRIFDDINAS_GRAND_LIBRARY_F2_10335(WorldMapArea.PRIFDDINAS_GRAND_LIBRARY, 2, 10335, 11871, 0, 0, 0, 0, 64, 64, false),
	PRIFDDINAS_GRAND_LIBRARY_F2_10336(WorldMapArea.PRIFDDINAS_GRAND_LIBRARY, 2, 10336, 11872, 0, 0, 0, 0, 64, 64, false),
	PRIFDDINAS_GRAND_LIBRARY_F2_10591(WorldMapArea.PRIFDDINAS_GRAND_LIBRARY, 2, 10591, 12127, 0, 0, 0, 0, 64, 64, false),
	PRIFDDINAS_GRAND_LIBRARY_F2_10592(WorldMapArea.PRIFDDINAS_GRAND_LIBRARY, 2, 10592, 12128, 0, 0, 0, 0, 64, 64, false),
	PRIFFDDINAS_UNDERGROUND_TRAHAERN_MINE(WorldMapArea.PRIFFDDINAS_UNDERGROUND, 0, 13250, 13249, 0, 0, 0, 0, 64, 64, false),
	PRIFFDDINAS_UNDERGROUND_ZALCANO(WorldMapArea.PRIFFDDINAS_UNDERGROUND, 0, 12126, 13250, 0, 0, 0, 0, 64, 64, false),
	PRIFFDDINAS_UNDERGROUND_GAUNTLET(WorldMapArea.PRIFFDDINAS_UNDERGROUND, 1, 12127, 12995, 0, -32, 16, 40, 40, 64, false),
	STRONGHOLD_OF_SECURITY_7505_PLANE1(WorldMapArea.STRONGHOLD_OF_SECURITY, 1, 7505, 7504, 32, -32, 0, 0, 64, 64, false),
	STRONGHOLD_OF_SECURITY_7505_PLANE2(WorldMapArea.STRONGHOLD_OF_SECURITY, 2, 7505, 7758, 0, 0, 0, 0, 64, 64, false),
	STRONGHOLD_OF_SECURITY_7505_PLANE3(WorldMapArea.STRONGHOLD_OF_SECURITY, 3, 7505, 7757, 32, -32, 0, 0, 64, 64, false),
	TAVERLEY_DUNGEON_11161(WorldMapArea.TAVERLEY_UNDERGROUND, 1, 11161, 11158, 0, 0, 0, 0, 64, 64, false),
	TAVERLEY_DUNGEON_11417(WorldMapArea.TAVERLEY_UNDERGROUND, 1, 11417, 11414, 0, 0, 0, 0, 64, 64, false),
	TAVERLEY_DUNGEON_11673(WorldMapArea.TAVERLEY_UNDERGROUND, 1, 11673, 11670, 0, 0, 0, 0, 64, 64, false),
	TAVERLEY_DUNGEON_11929(WorldMapArea.TAVERLEY_UNDERGROUND, 1, 11929, 11926, 0, 0, 0, 8, 32, 56, false),
	WARRIORS_GUILD_BASEMENT_11675(WorldMapArea.TAVERLEY_UNDERGROUND, 0, 11675, 11420, 0, -32, 24, 32, 64, 56, false),
	CERBERUS_LAIR_5139(WorldMapArea.TAVERLEY_UNDERGROUND, 0, 5139, 10650, 32, -8, 0, 8, 64, 64, false),
	TROLL_STRONGHOLD_11421_PLANE1(WorldMapArea.TROLL_STRONGHOLD, 1, 11421, 11677, 0, 32, 0, 0, 64, 64, false),
	TROLL_STRONGHOLD_11421_PLANE2(WorldMapArea.TROLL_STRONGHOLD, 2, 11421, 11934, 0, 0, 0, 0, 64, 64, false),
	WATERBIRTH_DUNGEON_7236_F0(WorldMapArea.WATERBIRTH_DUNGEON, 0, 7236, 10392, -16, 0, 0, 0, 64, 64, false),
	WATERBIRTH_DUNGEON_7492_F0(WorldMapArea.WATERBIRTH_DUNGEON, 0, 7492, 10648, -16, 0, 0, 0, 64, 64, false),
	WATERBIRTH_DUNGEON_7748_F0(WorldMapArea.WATERBIRTH_DUNGEON, 0, 7748, 10904, -16, 0, 0, 0, 64, 64, false),
	WATERBIRTH_DUNGEON_7236_F1(WorldMapArea.WATERBIRTH_DUNGEON, 1, 7236, 10393, -16, 32, 0, 0, 64, 64, false),
	WATERBIRTH_DUNGEON_7492_F1(WorldMapArea.WATERBIRTH_DUNGEON, 1, 7492, 10649, -16, 32, 0, 0, 64, 64, false),
	WATERBIRTH_DUNGEON_7748_F1(WorldMapArea.WATERBIRTH_DUNGEON, 1, 7748, 10905, -16, 32, 0, 0, 64, 64, false),
	WATERBIRTH_DUNGEON_7236_F2(WorldMapArea.WATERBIRTH_DUNGEON, 2, 7236, 10395, -16, 0, 0, 0, 64, 64, false),
	WATERBIRTH_DUNGEON_7492_F2(WorldMapArea.WATERBIRTH_DUNGEON, 2, 7492, 10651, -16, 0, 0, 0, 64, 64, false),
	WATERBIRTH_DUNGEON_7748_F2(WorldMapArea.WATERBIRTH_DUNGEON, 2, 7748, 10907, -16, 0, 0, 0, 64, 64, false),
	WATERBIRTH_DUNGEON_7236_F3(WorldMapArea.WATERBIRTH_DUNGEON, 3, 7236, 10397, -16, -32, 0, 0, 64, 64, false),
	WATERBIRTH_DUNGEON_7492_F3(WorldMapArea.WATERBIRTH_DUNGEON, 3, 7492, 10653, -16, -32, 0, 0, 64, 64, false),
	WATERBIRTH_DUNGEON_7748_F3(WorldMapArea.WATERBIRTH_DUNGEON, 3, 7748, 10909, -16, -32, 0, 0, 64, 64, false),
	WATERBIRTH_DUNGEON_DAGG_KINGS_11589(WorldMapArea.WATERBIRTH_DUNGEON, 0, 11589, 10647, -32, -32, 0, 0, 64, 64, false),
	WATERBIRTH_DUNGEON_IRONMAN_DAGG_KINGS_11588(WorldMapArea.WATERBIRTH_DUNGEON, 0, 11588, 10903, -32, -32, 0, 0, 64, 64, false),
	WILDERNESS_DUNGEONS_CORPOREAL_BEAST(WorldMapArea.WILDERNESS_DUNGEONS, 2, 11844, 13213, 0, 0, 16, 16, 56, 48, false),
	WILDERNESS_DUNGEONS_KBD_LAIR(WorldMapArea.WILDERNESS_DUNGEONS, 0, 9033, 12448, 8, 0, 8, 0, 56, 48, false),
	WILDERNESS_DUNGEONS_MAGE_ARENA_BANK(WorldMapArea.WILDERNESS_DUNGEONS, 0, 10057, 12449, 0, 8, 0, 8, 56, 64, false),
	WILDERNESS_DUNGEONS_GWD(WorldMapArea.WILDERNESS_DUNGEONS, 0, 12190, 11933, -16, 24, 0, 0, 64, 56, false),
	WILDERNESS_DUNGEONS_GWD_ENTRANCE(WorldMapArea.WILDERNESS_DUNGEONS, 3, 12190, 12190, -48, -24, 48, 24, 64, 40, false),
	WILDERNESS_DUNGEONS_GWD_ENTRANCE_2(WorldMapArea.WILDERNESS_DUNGEONS, 3, 12190, 12190, -48, -24, 32, 40, 64, 64, false),
	YANILLE_UNDERGROUND_SMALL_ROOM(WorldMapArea.YANILLE_UNDERGROUND, 0, 10389, 10644, -48, -24, 48, 24, 64, 40, false),
	YANILLE_UNDERGROUND_POISON_SPIDERS(WorldMapArea.YANILLE_UNDERGROUND, 0, 10389, 10131, 24, 8, 0, 8, 48, 56, false);

	private final WorldMapArea area;
	private final int plane;
	private final int worldChunkID;
	private final int mapChunkID;
	private final int shiftX;
	private final int shiftY;
	private final int minX;
	private final int minY;
	private final int maxX;
	private final int maxY;
	private final boolean mirror;
}

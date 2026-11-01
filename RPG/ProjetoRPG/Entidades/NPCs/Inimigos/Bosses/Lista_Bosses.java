package Entidades.NPCs.Inimigos.Bosses;

public enum Lista_Bosses{
    MARGIT_THE_FELL_OMEN("Margit, the Fell Omen", 10812, 331, 52, 136, 134, 11280),
    MORGOTT_THE_OMEN_KING("Morgott, the Omen King", 13432, 494, 122, 110, 132, 206559),
    GODRICK_THE_GRAFTED("Godrick the Grafted", 10389, 514, 137, 144, 148, 24453),
    RENNALA_QUEEN_OF_THE_FULL_MOON("Rennala, Queen of the Full Moon", 11999, 412, 319, 137, 141, 11902),
    STARSCOURGE_RADAHN("Starscourge Radahn", 10371, 472, 103, 120, 139, 18364),
    RYKARD_LORD_OF_BLASPHEMY("Rykard, Lord of Blasphemy", 14195, 573, 6, 135, 147, 11776),
    MOHG_LORD_OF_BLOOD("Mohg, Lord of Blood", 5375, 519, 34, 139, 121, 13295),
    MALENIA_BLADE_OF_MIQUELLA("Malenia, Blade of Miquella", 23524, 494, 83, 123, 139, 221361),
    MALIKETH_THE_BLACK_BLADE("Maliketh, the Black Blade", 9529, 494, 71, 136, 126, 15367),
    DRAGONLORD_PLACIDUSAX("Dragonlord Placidusax", 30411, 309, 138, 113, 132, 24694),
    SIR_GIDEON_OFNIR("Sir Gideon Ofnir", 14651, 335, 10, 111, 125, 23065),
    GODFREY_HOARAH_LOUX("Godfrey / Hoarah Loux", 4333, 378, 61, 118, 140, 17496),
    RADAGON_OF_THE_GOLDEN_ORDER("Radagon of the Golden Order", 33480, 411, 119, 126, 133, 20996),
    ELDEN_BEAST("Elden Beast", 34853, 358, 449, 120, 129, 106674),
    ASTEL_NATURALBORN_OF_THE_VOID("Astel, Naturalborn of the Void", 13481, 313, 487, 129, 146, 34596),
    LICHDRAGON_FORTISSAX("Lichdragon Fortissax", 10498, 401, 19, 147, 150, 25915),
    REGAL_ANCESTOR_SPIRIT("Regal Ancestor Spirit", 5669, 454, 30, 146, 112, 32754),
    ANCESTOR_SPIRIT("Ancestor Spirit", 12728, 519, 94, 114, 142, 32362),
    COMMANDER_NIALL("Commander Niall", 4207, 515, 125, 116, 137, 33736),
    COMMANDER_O_NEIL("Commander O'Neil", 14413, 535, 39, 137, 121, 44193),
    ELEMER_OF_THE_BRIAR("Elemer of the Briar", 14657, 438, 137, 140, 139, 38545),
    LORETTA("Loretta", 13707, 437, 82, 125, 115, 28279),
    MIMIC_TEAR("Mimic Tear", 11385, 424, 118, 146, 149, 34837),
    BLACK_KNIFE_ASSASSIN("Black Knife Assassin", 9511, 314, 126, 130, 121, 41952),
    BELL_BEARING_HUNTER("Bell Bearing Hunter", 7475, 481, 66, 131, 127, 28105),
    CRUCIBLE_KNIGHT("Crucible Knight", 13106, 305, 132, 122, 115, 25817),
    CLEANROT_KNIGHT("Cleanrot Knight", 10658, 550, 142, 125, 140, 42166),
    DEATH_RITE_BIRD("Death Rite Bird", 11342, 308, 23, 128, 124, 36502),
    NIGHTS_CAVALRY("Night's Cavalry", 7986, 456, 148, 133, 140, 44794),
    RED_WOLF_OF_RADAGON("Red Wolf of Radagon", 26264, 517, 140, 131, 132, 39736),
    GODSKIN_APOSTLE("Godskin Apostle", 8438, 456, 64, 124, 117, 22621),
    GODSKIN_NOBLE("Godskin Noble", 9169, 361, 137, 121, 122, 24180),
    GODSKIN_DUO("Godskin Duo", 11933, 441, 150, 143, 148, 28546),
    ERDTREE_AVATAR("Erdtree Avatar", 5647, 399, 75, 124, 133, 21759),
    PUTRID_AVATAR("Putrid Avatar", 8952, 307, 136, 118, 127, 12982),
    TREE_SENTINEL("Tree Sentinel", 4893, 583, 74, 118, 150, 42170),
    DRACONIC_TREE_SENTINEL("Draconic Tree Sentinel", 5680, 306, 146, 128, 140, 41373),
    ULCERATED_TREE_SPIRIT("Ulcerated Tree Spirit", 11216, 474, 47, 113, 126, 41308),
    PUTRID_TREE_SPIRIT("Putrid Tree Spirit", 5869, 333, 102, 141, 114, 13513),
    FALLINGSTAR_BEAST("Fallingstar Beast", 6485, 376, 144, 129, 115, 26265),
    FULL_GROWN_FALLINGSTAR_BEAST("Full-Grown Fallingstar Beast", 5940, 585, 106, 148, 148, 24790),
    LEONINE_MISBEGOTTEN("Leonine Misbegotten", 12561, 494, 115, 138, 129, 38103),
    ADULA_GLINTSTONE_DRAGON("Adula, Glintstone Dragon", 9003, 591, 15, 149, 116, 23617),
    BOREALIS_THE_FREEZING_FOG("Borealis, the Freezing Fog", 14248, 408, 67, 115, 120, 25719),
    FLYING_DRAGON_AGHEEL("Flying Dragon Agheel", 6847, 582, 19, 120, 110, 36772),
    FLYING_DRAGON_GREYLL("Flying Dragon Greyll", 11381, 540, 74, 112, 124, 28881),
    ANCIENT_DRAGON_LANSSEAX("Ancient Dragon Lansseax", 8632, 532, 18, 124, 126, 22964);

    String nome;
    int vida, dano_fisico, dano_magico, defesa_fisica, defesa_magica, exp_drop;

    Lista_Bosses(String nome, int vida, int dano_fis, int dano_mag, int def_fis, int def_mag, int exp_drop){
        this.nome = nome;
        this.vida = vida;
        this.dano_fisico = dano_fis;
        this.dano_magico = dano_mag;
        this.defesa_fisica = def_fis;
        this.defesa_magica = def_mag;
        this.exp_drop = exp_drop;
    }

}
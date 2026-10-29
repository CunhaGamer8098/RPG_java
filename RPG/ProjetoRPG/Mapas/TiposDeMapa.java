package Mapas;

public enum TiposDeMapa {
    FORTALEZA_ABANDONADA(Matrizes.mapa_1),
    CAVERNA_DO_DRAGAO(Matrizes.mapa_2),
    TEMPLO_ESQUECIDO(Matrizes.mapa_3),
    VILA_MURADA(Matrizes.mapa_4),
    BOSQUE_SOMBRIO(Matrizes.mapa_5),
    MINA_DE_FERRO(Matrizes.mapa_6),
    CASTELO_EM_RUINAS(Matrizes.mapa_7),
    ARENA_DOS_CAMPEOES(Matrizes.mapa_8),
    PORTO_PIRATA(Matrizes.mapa_9),
    LABIRINTO_ANTIGO(Matrizes.mapa_10),
    CRIPTA_DOS_MORTOS(Matrizes.mapa_11),
    CIDADE_SUBTERRANEA(Matrizes.mapa_12),
    PANTANO_MALDITO(Matrizes.mapa_13),
    PRISAO_IMPERIAL(Matrizes.mapa_14),
    TORRE_ARCANA(Matrizes.mapa_15),
    COMPLEXO_MILITAR(Matrizes.mapa_16),
    JARDIM_REAL(Matrizes.mapa_17),
    TUMBA_DO_REI(Matrizes.mapa_18),
    ILHA_VULCANICA(Matrizes.mapa_19),
    CAPITAL_DO_REINO(Matrizes.mapa_20),
    ;
    int[][] matriz;
    TiposDeMapa(Matrizes tipo) {
        this.matriz = tipo.mapa;
    }
}

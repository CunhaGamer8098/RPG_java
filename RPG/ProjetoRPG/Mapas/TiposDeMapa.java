package Mapas;

public enum TiposDeMapa {
    FORTALEZA_ABANDONADA(Matrizes.mapa_1), // ok
    CAVERNA_DO_DRAGAO(Matrizes.mapa_2), // ok
    TEMPLO_ESQUECIDO(Matrizes.mapa_3), // ok
    VILA_MURADA(Matrizes.mapa_4), //ok
    BOSQUE_SOMBRIO(Matrizes.mapa_5), // ok
    MINA_DE_FERRO(Matrizes.mapa_6), // ok
    CASTELO_EM_RUINAS(Matrizes.mapa_7), // OK
    ARENA_DOS_CAMPEOES(Matrizes.mapa_8), //ok
    PORTO_PIRATA(Matrizes.mapa_9), // ok
    LABIRINTO_ANTIGO(Matrizes.mapa_10), // ok
    CRIPTA_DOS_MORTOS(Matrizes.mapa_11), // ok
    CIDADE_SUBTERRANEA(Matrizes.mapa_12), // ok
    PANTANO_MALDITO(Matrizes.mapa_13), // ok
    PRISAO_IMPERIAL(Matrizes.mapa_14),
    TORRE_ARCANA(Matrizes.mapa_15), // ok
    COMPLEXO_MILITAR(Matrizes.mapa_16), // ok
    JARDIM_REAL(Matrizes.mapa_17), //ok
    TUMBA_DO_REI(Matrizes.mapa_18),
    ILHA_VULCANICA(Matrizes.mapa_19),
    CAPITAL_DO_REINO(Matrizes.mapa_20),
    ;
    int[][] matriz;
    TiposDeMapa(Matrizes tipo) {
        this.matriz = tipo.mapa;
    }
}

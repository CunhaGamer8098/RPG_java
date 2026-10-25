package Itens.Armas.Magias;

import java.util.concurrent.atomic.AtomicReferenceArray;

// gastos de 1 até 10

public enum MagiasListas {

    //PROJETIL LONGO
    CALHAU_BRILHANTE(TipoMagias.PROJETIL_LONGO, 12, 6, 10, 10, 0, 2),
    COMETA_AZUR(TipoMagias.PROJETIL_LONGO, 14, 10, 10, 12, 0, 3),
    lANCA_RAIOS(TipoMagias.PROJETIL_LONGO, 16, 14, 10, 16, 0, 5),
    ARCO_DE_LUZ(TipoMagias.PROJETIL_LONGO, 14, 10, 10, 14, 0, 3),

    //ATAQUE CURTO ALCANCE
    ESPADA_BOREAL(TipoMagias.ATAQUE_CORPO, 14 , 10, 1, 10, 0, 2),
    LAMINA_ADULA(TipoMagias.ATAQUE_CORPO),
    GARRA_DE_DRAGAO(TipoMagias.ATAQUE_CORPO),

    //ATAQUES DE AREA
    CHAMAS(TipoMagias.ATAQUE_AREA),
    MASSA_DE_CASCALHO(TipoMagias.ATAQUE_AREA),
    SOPRO_DE_PODRIDAO(TipoMagias.ATAQUE_AREA),

    //CURA
    CURA(TipoMagias.CURA),
    CURA_MAIOR(TipoMagias.CURA),
    VITALIDADE_FERA(TipoMagias.CURA),

    // ENCANTAMENTOS(BUFFS)
    VOTO_AUREO(TipoMagias.FORTALECIMENTOS),
    ARMAMENTO_SCHOLAR(TipoMagias.FORTALECIMENTOS);




    // Atributos mínimos
    int inteligencia;
    int fe;
    // Range, de blocos no mapa;
    int alcance;
    //(Dano, defesa)Estipulados
    int dano;
    int defesa;
    int gasto;

    int modelo_magia;

    MagiasListas(TipoMagias magia, int inteligencia, int fe, int alcance, int dano, int defesa, int gasto){
        this.inteligencia = inteligencia;
        this.fe = fe;
        this.alcance = alcance;
        this.dano = dano;
        this.defesa = defesa;
        this.gasto = gasto;
        this.modelo_magia = magia.modelo_magia;
    }
}

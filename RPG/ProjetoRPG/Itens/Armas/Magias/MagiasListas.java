package Itens.Armas.Magias;

import java.util.concurrent.atomic.AtomicReferenceArray;

// gastos de 1 até 10

public enum MagiasListas {

    //PROJETIL LONGO
    CALHAU_BRILHANTE("Calhau Brilhante", TipoMagias.PROJETIL_LONGO, 12, 6, 10, 10, 0, 2),
    COMETA_AZUR("Projétil Longo", TipoMagias.PROJETIL_LONGO, 14, 10, 10, 12, 0, 3),
    lANCA_RAIOS("Lança Raios", TipoMagias.PROJETIL_LONGO, 16, 14, 10, 16, 0, 5),
    ARCO_DE_LUZ("Arco de Luz", TipoMagias.PROJETIL_LONGO, 14, 10, 10, 14, 0, 3),

    //ATAQUE CURTO ALCANCE
    ESPADA_BOREAL("Espada Boreal", TipoMagias.ATAQUE_CORPO, 14 , 10, 1, 10, 0, 2),
    LAMINA_ADULA("Lâmina Adula", TipoMagias.ATAQUE_CORPO, 16, 16, 1, 14, 0, 4),
    GARRA_DE_DRAGAO("Garra de Dragão", TipoMagias.ATAQUE_CORPO, 16, 20, 1, 16, 0, 5),

    //ATAQUES DE AREA
    CHAMAS("Chamas", TipoMagias.ATAQUE_AREA, 12, 10, 1, 10, 0, 3),
    MASSA_DE_CASCALHO("Massa de Cascalho", TipoMagias.ATAQUE_AREA, 12, 14, 2, 12, 0, 4),
    SOPRO_DE_PODRIDAO("Sopro de Podridão", TipoMagias.ATAQUE_AREA, 14, 18, 3, 15, 0, 7),

    //CURA
    CURA("Cura", TipoMagias.CURA, 12, 14, 1, -8, 1, 2),
    CURA_MAIOR("Cura Maior", TipoMagias.CURA, 14, 16, 2, -15, 5, 5),
    VITALIDADE_FERA("Vitalidade da Fera", TipoMagias.CURA, 16, 20, 3, -25, 10, 8),

    // ENCANTAMENTOS(BUFFS)
    VOTO_AUREO("Voto Aureo", TipoMagias.FORTALECIMENTOS, 10, 14, 1, 0, 15, 4);
    //ARMAMENTO_SCHOLAR(TipoMagias.FORTALECIMENTOS);



    String nome;
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

    MagiasListas(String nome, TipoMagias magia, int inteligencia, int fe, int alcance, int dano, int defesa, int gasto){
        this.nome = nome;
        this.inteligencia = inteligencia;
        this.fe = fe;
        this.alcance = alcance;
        this.dano = dano;
        this.defesa = defesa;
        this.gasto = gasto;
        this.modelo_magia = magia.modelo_magia;
    }
}

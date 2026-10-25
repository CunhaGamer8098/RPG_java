package Itens.Armas;

// atributos variando de 1 a 20 visando serem multiplicados pelos atributos do personagem

public enum ArmasListas {
    // ESPADAS
    ESPADA_LONGA(TipoArmas.ESPADAS, 16, 12, 6, 0, 2, 15, 2),
    LAMINA_BLASFEMA(TipoArmas.ESPADAS, 20, 12, 10, 10, 1, 18, 2),
    ESPADA_GRANDE_LUA(TipoArmas.ESPADAS, 14, 12, 16, 4, 2, 14, 3),
    ESPADA_CAVALEIRO(TipoArmas.ESPADAS, 12, 10, 0, 0, 1, 10, 2),
    LAMINA_CAO_DE_CACA(TipoArmas.ESPADAS, 14, 16, 4, 3, 2, 12, 3),
    ESPADA_ESTOCADA_LIMPIDA(TipoArmas.ESPADAS, 10, 14, 2, 1, 2, 10, 2),

    // MACHADOS
    MACHADO_HIGHLAND(TipoArmas.MACHADOS, 14, 6, 6, 8, 1,15, 3),
    MACHADO_CARRASCO(TipoArmas.MACHADOS, 12, 3, 0, 0, 1, 10, 2),
    MACHADO_STORMBREAKER(TipoArmas.MACHADOS, 18, 14, 10, 0, 2, 20, 3), // PEDIDO DO MEU AMIGO GORDO

    // MARTELOS
    MACA(TipoArmas.MARTELOS, 12, 3, 0, 0, 1, 11, 2),
    GRANDES_ESTRELAS(TipoArmas.MARTELOS, 18, 12, 6, 12, 2, 16, 3),
    MARTELO_DO_PRELUDIO(TipoArmas.MARTELOS, 14, 10, 0, 0, 1, 12, 2),
    MARTELO_OLHOS_SOLTOS(TipoArmas.MARTELOS, 25, 18, -3, 0, 3, 21, 4), //ZOIO REFERENCIA (2% DROPRATE CICLOPE)

    // KATANAS
    UCHIGATANA(TipoArmas.KATANAS, 10, 12, 12, 3, 2, 10, 1),
    KATANA_CACA_DRAGOES(TipoArmas.KATANAS, 10, 16, 14, 6, 3, 15, 1),

    // LANCAS
    LANCA_CURTA(TipoArmas.LANCAS, 14, 12, 10, 2, 3, 13, 0),
    LANCA_BOLT_GRANSAX(TipoArmas.LANCAS, 18, 16, 14, 14, 4, 16, 2),
    LANCA_INVERTIDA(TipoArmas.LANCAS, 16, 14, 14, 5, 3, 14, 1),

    // ALABARDA
    ALABARDA_BANIMENTO(TipoArmas.ALABARDAS, 15, 13, 6, 4, 3, 14, 2),

    // FOICE
    FOICE_FARMER(TipoArmas.FOICES, 10, 12, 6, 3, 1, 8, 0),
    FOICCE_UNDEAD(TipoArmas.FOICES, 10, 16, 12, 14, 2, 14, 2),

    // PUNHOS
    GARRAS_DE_PRESA(TipoArmas.PUNHOS, 10, 10, 4, 3, 1, 10, 2),
    PUNHO_DE_FERRO(TipoArmas.PUNHOS, 10, 10, 6, 3, 1, 8, 2),

    // CAJADOS
    ACADEMIA_DECAIDA(TipoArmas.CAJADOS, 6, 6, 12, 10, 1, 2, 0), // REFERENCIA USP
    CAJADO_COMETA(TipoArmas.CAJADOS, 6, 4, 14, 12, 1, 5, 0),
    CONSORTE_LUNAR(TipoArmas.CAJADOS, 8, 6, 18, 16, 1, 6, 0),
    RAIZES_YGGDRASIL(TipoArmas.CAJADOS, 10, 8, 25, 20, 1, 10, 0), // DROPRATE (5% BOSS PARECIDO COM BERÇO DO CAOS)

    // SELOS
    SELO_CRISOL(TipoArmas.SELOS, 0, 0, 12, 14, 0, 0, 0),
    SELO_PRIMAL(TipoArmas.SELOS, 0, 0, 10, 12, 0, 0, 0),
    SELO_SANGRENTO(TipoArmas.SELOS, 0, 0, 15, 20, 0, 0, 0),


    //ESCUDOS
    PORTAO_DE_FERRO(TipoArmas.ESCUDOS, 12, 5, 0, 0, 1, 2, 10),
    DRAGON_SCALE(TipoArmas.ESCUDOS, 14, 12, 6, 10, 1, 5, 15),
    AMERICAN_DAY(TipoArmas.ESCUDOS, 10, 12, 15, 4, 6, 18, 20); // DROPRATE (1%)

    TipoArmas setor_arma;

    //(Força, Destreza, Inteligência e Fé)Minimo
    int forca;
    int destreza;
    int inteligencia;
    int fe;
    // Range, de blocos no mapa;
    int alcance;
    //(Dano, defesa)Estipulados
    int dano;
    int defesa;

    int modelo_ataque;

    ArmasListas(TipoArmas setor_arma, int forca, int destreza, int inteligencia, int fe, int alcance, int dano, int defesa){
        this.setor_arma = setor_arma;
        this.forca = forca;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.fe = fe;
        this.alcance = alcance;
        this.dano = dano;
        this.defesa = defesa;
        this.modelo_ataque = setor_arma.modelo_ataque;

    }
}

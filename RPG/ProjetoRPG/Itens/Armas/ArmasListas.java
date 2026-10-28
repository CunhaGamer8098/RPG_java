package Itens.Armas;

// atributos variando de 1 a 20 visando serem multiplicados pelos atributos do personagem

public enum ArmasListas {
    // ESPADAS
    ESPADA_LONGA("Espada Longa", TipoArmas.ESPADAS, 16, 12, 6, 0, 2, 15, 2, 1),
    LAMINA_BLASFEMA("Lâmina Blasfema", TipoArmas.ESPADAS, 20, 12, 10, 10, 1, 18, 2, 2),
    ESPADA_GRANDE_LUA("Moon blade", TipoArmas.ESPADAS, 14, 12, 16, 4, 2, 14, 3, 3),
    ESPADA_CAVALEIRO("Espada de cavaleiro", TipoArmas.ESPADAS, 12, 10, 0, 0, 1, 10, 2, 4),
    LAMINA_CAO_DE_CACA("Lâmina cão de caça", TipoArmas.ESPADAS, 14, 16, 4, 3, 2, 12, 3, 5),
    ESPADA_ESTOCADA_LIMPIDA("Rapieira", TipoArmas.ESPADAS, 10, 14, 2, 1, 2, 10, 2, 6),

    // MACHADOS
    MACHADO_HIGHLAND("Machado Altas Terras", TipoArmas.MACHADOS, 14, 6, 6, 8, 1,15, 3, 7),
    MACHADO_CARRASCO("Machado do CArrasco", TipoArmas.MACHADOS, 12, 3, 0, 0, 1, 10, 2, 8),
    MACHADO_STORMBREAKER("Stormbreaker", TipoArmas.MACHADOS, 18, 14, 10, 0, 2, 20, 3, 9), // PEDIDO DO MEU AMIGO GORDO

    // MARTELOS
    MACA("Maça", TipoArmas.MARTELOS, 12, 3, 0, 0, 1, 11, 2, 10),
    GRANDES_ESTRELAS("Meteoro", TipoArmas.MARTELOS, 18, 12, 6, 12, 2, 16, 3, 11),
    MARTELO_DO_PRELUDIO("Martelo do Prelúdio", TipoArmas.MARTELOS, 14, 10, 0, 0, 1, 12, 2, 12),
    MARTELO_OLHOS_SOLTOS("Mareta do Zoio", TipoArmas.MARTELOS, 25, 18, -3, 0, 3, 21, 4, 13), //ZOIO REFERENCIA (2% DROPRATE CICLOPE)

    // KATANAS
    UCHIGATANA("Uchigatana", TipoArmas.KATANAS, 10, 12, 12, 3, 2, 10, 1, 14),
    KATANA_CACA_DRAGOES("Katana Caça Dragões", TipoArmas.KATANAS, 10, 16, 14, 6, 3, 15, 1, 15),

    // LANCAS
    LANCA_CURTA("Lança Curta", TipoArmas.LANCAS, 14, 12, 10, 2, 3, 13, 0, 16),
    LANCA_BOLT_GRANSAX("Lança de Gransax", TipoArmas.LANCAS, 18, 16, 14, 14, 4, 16, 2, 17),
    LANCA_INVERTIDA("Lança Invertida", TipoArmas.LANCAS, 16, 14, 14, 5, 3, 14, 1, 18),

    // ALABARDA
    ALABARDA_BANIMENTO("Alabarda do Banimento", TipoArmas.ALABARDAS, 15, 13, 6, 4, 3, 14, 2, 19),

    // FOICE
    FOICE_FARMER("Foice de Fazendeiro", TipoArmas.FOICES, 10, 12, 6, 3, 1, 8, 0, 20),
    FOICCE_UNDEAD("Foice Morto-Vivo", TipoArmas.FOICES, 10, 16, 12, 14, 2, 14, 2, 21),

    // PUNHOS
    GARRAS_DE_PRESA("Garras", TipoArmas.PUNHOS, 10, 10, 4, 3, 1, 10, 2, 22),
    PUNHO_DE_FERRO("Punho de Ferro", TipoArmas.PUNHOS, 10, 10, 6, 3, 1, 8, 2, 23),

    // CAJADOS
    ACADEMIA_DECAIDA("Cajado da Academia decaída", TipoArmas.CAJADOS, 6, 6, 12, 10, 1, 2, 0, 24), // REFERENCIA USP
    CAJADO_COMETA("Cajado Cometa", TipoArmas.CAJADOS, 6, 4, 14, 12, 1, 5, 0, 25),
    CONSORTE_LUNAR("Cajado Consorte Lunar", TipoArmas.CAJADOS, 8, 6, 18, 16, 1, 6, 0, 26),
    RAIZES_YGGDRASIL("Raízes Yggdrasil", TipoArmas.CAJADOS, 10, 8, 25, 20, 1, 10, 0, 27), // DROPRATE (5% BOSS PARECIDO COM BERÇO DO CAOS)

    // SELOS
    SELO_CRISOL("Selo Crisol", TipoArmas.SELOS, 0, 0, 12, 14, 0, 0, 0, 28),
    SELO_PRIMAL("Selo Primal", TipoArmas.SELOS, 0, 0, 10, 12, 0, 0, 0, 29),
    SELO_SANGRENTO("Selo Sangrento", TipoArmas.SELOS, 0, 0, 15, 20, 0, 0, 0, 30),


    //ESCUDOS
    PORTAO_DE_FERRO("Portão de Ferro", TipoArmas.ESCUDOS, 12, 5, 0, 0, 1, 2, 10, 31),
    DRAGON_SCALE("Escama de Dragão", TipoArmas.ESCUDOS, 14, 12, 6, 10, 1, 5, 15, 32),
    AMERICAN_DAY("American Day", TipoArmas.ESCUDOS, 10, 12, 15, 4, 6, 18, 20, 33); // DROPRATE (1%)

    TipoArmas setor_arma;
    String nome;
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

    int codigo_item;

    ArmasListas(String nome, TipoArmas setor_arma, int forca, int destreza, int inteligencia, int fe, int alcance, int dano, int defesa, int codigo_item){
        this.nome = nome;
        this.setor_arma = setor_arma;
        this.forca = forca;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.fe = fe;
        this.alcance = alcance;
        this.dano = dano;
        this.defesa = defesa;
        this.modelo_ataque = setor_arma.modelo_ataque;
        this.codigo_item = codigo_item

    }
}

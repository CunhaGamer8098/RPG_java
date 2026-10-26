package Itens.Equipamentos;

//essa eu pedi pro Gemini me fazer um excel de todas então vou organizar por sets

public enum ListasEquipamentos {


// ARMADURAS PESADAS E DE TANQUE


    // Bull-Goat (Touro-Bode)
    CAPACETE_BULL_GOAT("Capacete de Bode", TipoEquipamentos.CAPACETE, 40, 10, 0, 0, 45, 28),
    PEITORAL_BULL_GOAT("Peitoral de Bode", TipoEquipamentos.PEITORAL, 40, 10, 0, 0, 45, 28),
    LUVAS_BULL_GOAT("Luvas de Bode", TipoEquipamentos.LUVAS, 40, 10, 0, 0, 45, 28),
    CALCAS_BULL_GOAT("Calças de Bode", TipoEquipamentos.CALCAS, 40, 10, 0, 0, 45, 28),
    BOTAS_BULL_GOAT("Botas de Bode", TipoEquipamentos.BOTAS, 40, 10, 0, 0, 45, 28),

    // Lionel's Set
    CAPACETE_LIONEL("Capacete do Lionel", TipoEquipamentos.CAPACETE, 38, 10, 0, 0, 43, 30),
    PEITORAL_LIONEL("Peitoral do Lionel", TipoEquipamentos.PEITORAL, 38, 10, 0, 0, 43, 30),
    LUVAS_LIONEL("Luvas do Lionel", TipoEquipamentos.LUVAS, 38, 10, 0, 0, 43, 30),
    CALCAS_LIONEL("Calças do Lionel", TipoEquipamentos.CALCAS, 38, 10, 0, 0, 43, 30),
    BOTAS_LIONEL("Botas do Lionel", TipoEquipamentos.BOTAS, 38, 10, 0, 0, 43, 30),

    // Solitude Set (DLC Erdtree)
    CAPACETE_SOLITUDE("Capacete da Solidão", TipoEquipamentos.CAPACETE, 42, 12, 0, 0, 47, 26),
    PEITORAL_SOLITUDE("Peitoral da Solidão", TipoEquipamentos.PEITORAL, 42, 12, 0, 0, 47, 26),
    LUVAS_SOLITUDE("Luvas da Solidão", TipoEquipamentos.LUVAS, 42, 12, 0, 0, 47, 26),
    CALCAS_SOLITUDE("Calças da Solidão", TipoEquipamentos.CALCAS, 42, 12, 0, 0, 47, 26),
    BOTAS_SOLITUDE("Botas da Solidão", TipoEquipamentos.BOTAS, 42, 12, 0, 0, 47, 26),

    // Verdigris Set (Verdete)
    CAPACETE_VERDIGRIS("Capacete de Verdete", TipoEquipamentos.CAPACETE, 45, 10, 0, 0, 49, 25),
    PEITORAL_VERDIGRIS("Peitoral de Verdete", TipoEquipamentos.PEITORAL, 45, 10, 0, 0, 49, 25),
    LUVAS_VERDIGRIS("Luvas de Verdete", TipoEquipamentos.LUVAS, 45, 10, 0, 0, 49, 25),
    CALCAS_VERDIGRIS("Calças de Verdete", TipoEquipamentos.CALCAS, 45, 10, 0, 0, 49, 25),
    BOTAS_VERDIGRIS("Botas de Verdete", TipoEquipamentos.BOTAS, 45, 10, 0, 0, 49, 25),

    // Malformed Dragon (Dragão Deformado)
    CAPACETE_MALFORMED_DRAGON("Capacete do Dragão Deformado", TipoEquipamentos.CAPACETE, 35, 12, 0, 0, 40, 32),
    PEITORAL_MALFORMED_DRAGON("Peitoral do Dragão Deformado", TipoEquipamentos.PEITORAL, 35, 12, 0, 0, 40, 32),
    LUVAS_MALFORMED_DRAGON("Luvas do Dragão Deformado", TipoEquipamentos.LUVAS, 35, 12, 0, 0, 40, 32),
    CALCAS_MALFORMED_DRAGON("Calças do Dragão Deformado", TipoEquipamentos.CALCAS, 35, 12, 0, 0, 40, 32),
    BOTAS_MALFORMED_DRAGON("Botas do Dragão Deformado", TipoEquipamentos.BOTAS, 35, 12, 0, 0, 40, 32),

    // Veteran's Set (Veterano)
    CAPACETE_VETERAN("Capacete do Veterano", TipoEquipamentos.CAPACETE, 32, 12, 0, 0, 38, 32),
    PEITORAL_VETERAN("Peitoral do Veterano", TipoEquipamentos.PEITORAL, 32, 12, 0, 0, 38, 32),
    LUVAS_VETERAN("Luvas do Veterano", TipoEquipamentos.LUVAS, 32, 12, 0, 0, 38, 32),
    CALCAS_VETERAN("Calças do Veterano", TipoEquipamentos.CALCAS, 32, 12, 0, 0, 38, 32),
    BOTAS_VETERAN("Botas do Veterano", TipoEquipamentos.BOTAS, 32, 12, 0, 0, 38, 32),


// ARMADURAS HÍBRIDAS E DE CAVALEIRO (FÉR, INT, FOR, DES)

    // Crucible Axe (Machado do Cadinho)
    CAPACETE_CRUCIBLE_AXE("Capacete do Cadinho", TipoEquipamentos.CAPACETE, 28, 12, 0, 18, 36, 35),
    PEITORAL_CRUCIBLE_AXE("Peitoral do Cadinho", TipoEquipamentos.PEITORAL, 28, 12, 0, 18, 36, 35),
    LUVAS_CRUCIBLE_AXE("Luvas do Cadinho", TipoEquipamentos.LUVAS, 28, 12, 0, 18, 36, 35),
    CALCAS_CRUCIBLE_AXE("Calças do Cadinho", TipoEquipamentos.CALCAS, 28, 12, 0, 18, 36, 35),
    BOTAS_CRUCIBLE_AXE("Botas do Cadinho", TipoEquipamentos.BOTAS, 28, 12, 0, 18, 36, 35),

    // Carian Knight (Cavaleiro de Caria)
    CAPACETE_CARIAN_KNIGHT("Capacete do Cavaleiro de Caria", TipoEquipamentos.CAPACETE, 18, 16, 22, 0, 26, 38),
    PEITORAL_CARIAN_KNIGHT("Peitoral do Cavaleiro de Caria", TipoEquipamentos.PEITORAL, 18, 16, 22, 0, 26, 38),
    LUVAS_CARIAN_KNIGHT("Luvas do Cavaleiro de Caria", TipoEquipamentos.LUVAS, 18, 16, 22, 0, 26, 38),
    CALCAS_CARIAN_KNIGHT("Calças do Cavaleiro de Caria", TipoEquipamentos.CALCAS, 18, 16, 22, 0, 26, 38),
    BOTAS_CARIAN_KNIGHT("Botas do Cavaleiro de Caria", TipoEquipamentos.BOTAS, 18, 16, 22, 0, 26, 38),

    // Fingerprint (Impressão Digital)
    CAPACETE_FINGERPRINT("Capacete de Digitais", TipoEquipamentos.CAPACETE, 22, 14, 0, 15, 30, 32),
    PEITORAL_FINGERPRINT("Peitoral de Digitais", TipoEquipamentos.PEITORAL, 22, 14, 0, 15, 30, 32),
    LUVAS_FINGERPRINT("Luvas de Digitais", TipoEquipamentos.LUVAS, 22, 14, 0, 15, 30, 32),
    CALCAS_FINGERPRINT("Calças de Digitais", TipoEquipamentos.CALCAS, 22, 14, 0, 15, 30, 32),
    BOTAS_FINGERPRINT("Botas de Digitais", TipoEquipamentos.BOTAS, 22, 14, 0, 15, 30, 32),

    // Cleanrot (Podridão Pura)
    CAPACETE_CLEANROT("Capacete da Podridão Pura", TipoEquipamentos.CAPACETE, 24, 18, 0, 16, 32, 30),
    PEITORAL_CLEANROT("Peitoral da Podridão Pura", TipoEquipamentos.PEITORAL, 24, 18, 0, 16, 32, 30),
    LUVAS_CLEANROT("Luvas da Podridão Pura", TipoEquipamentos.LUVAS, 24, 18, 0, 16, 32, 30),
    CALCAS_CLEANROT("Calças da Podridão Pura", TipoEquipamentos.CALCAS, 24, 18, 0, 16, 32, 30),
    BOTAS_CLEANROT("Botas da Podridão Pura", TipoEquipamentos.BOTAS, 24, 18, 0, 16, 32, 30),

    // Briar (Espinheiro)
    CAPACETE_BRIAR("Capacete do Espinheiro", TipoEquipamentos.CAPACETE, 22, 14, 0, 0, 28, 26),
    PEITORAL_BRIAR("Peitoral do Espinheiro", TipoEquipamentos.PEITORAL, 22, 14, 0, 0, 28, 26),
    LUVAS_BRIAR("Luvas do Espinheiro", TipoEquipamentos.LUVAS, 22, 14, 0, 0, 28, 26),
    CALCAS_BRIAR("Calças do Espinheiro", TipoEquipamentos.CALCAS, 22, 14, 0, 0, 28, 26),
    BOTAS_BRIAR("Botas do Espinheiro", TipoEquipamentos.BOTAS, 22, 14, 0, 0, 28, 26),

    // Hoslow's Set
    CAPACETE_HOSLOW("Capacete de Hoslow", TipoEquipamentos.CAPACETE, 20, 20, 0, 0, 29, 31),
    PEITORAL_HOSLOW("Peitoral de Hoslow", TipoEquipamentos.PEITORAL, 20, 20, 0, 0, 29, 31),
    LUVAS_HOSLOW("Luvas de Hoslow", TipoEquipamentos.LUVAS, 20, 20, 0, 0, 29, 31),
    CALCAS_HOSLOW("Calças de Hoslow", TipoEquipamentos.CALCAS, 20, 20, 0, 0, 29, 31),
    BOTAS_HOSLOW("Botas de Hoslow", TipoEquipamentos.BOTAS, 20, 20, 0, 0, 29, 31),


// ARMADURAS MEDIAS E DE DESTREZA / AGILIDADE

    // Night Set (Noite)
    CAPACETE_NIGHT("Capacete da Noite", TipoEquipamentos.CAPACETE, 16, 22, 0, 0, 26, 28),
    PEITORAL_NIGHT("Peitoral da Noite", TipoEquipamentos.PEITORAL, 16, 22, 0, 0, 26, 28),
    LUVAS_NIGHT("Luvas da Noite", TipoEquipamentos.LUVAS, 16, 22, 0, 0, 26, 28),
    CALCAS_NIGHT("Calças da Noite", TipoEquipamentos.CALCAS, 16, 22, 0, 0, 26, 28),
    BOTAS_NIGHT("Botas da Noite", TipoEquipamentos.BOTAS, 16, 22, 0, 0, 26, 28),

    // Rakshasa Set
    CAPACETE_RAKSHASA("Capacete de Rakshasa", TipoEquipamentos.CAPACETE, 18, 24, 0, 0, 27, 24),
    PEITORAL_RAKSHASA("Peitoral de Rakshasa", TipoEquipamentos.PEITORAL, 18, 24, 0, 0, 27, 24),
    LUVAS_RAKSHASA("Luvas de Rakshasa", TipoEquipamentos.LUVAS, 18, 24, 0, 0, 27, 24),
    CALCAS_RAKSHASA("Calças de Rakshasa", TipoEquipamentos.CALCAS, 18, 24, 0, 0, 27, 24),
    BOTAS_RAKSHASA("Botas de Rakshasa", TipoEquipamentos.BOTAS, 18, 24, 0, 0, 27, 24),

    // Ronin's Set
    CAPACETE_RONIN("Chapéu de Ronin", TipoEquipamentos.CAPACETE, 14, 20, 0, 0, 23, 27),
    PEITORAL_RONIN("Peitoral de Ronin", TipoEquipamentos.PEITORAL, 14, 20, 0, 0, 23, 27),
    LUVAS_RONIN("Luvas de Ronin", TipoEquipamentos.LUVAS, 14, 20, 0, 0, 23, 27),
    CALCAS_RONIN("Calças de Ronin", TipoEquipamentos.CALCAS, 14, 20, 0, 0, 23, 27),
    BOTAS_RONIN("Botas de Ronin", TipoEquipamentos.BOTAS, 14, 20, 0, 0, 23, 27),

    // Vagabond Set (Vagabundo)
    CAPACETE_VAGABOND("Capacete de Vagabundo", TipoEquipamentos.CAPACETE, 18, 12, 0, 0, 27, 25),
    PEITORAL_VAGABOND("Peitoral de Vagabundo", TipoEquipamentos.PEITORAL, 18, 12, 0, 0, 27, 25),
    LUVAS_VAGABOND("Luvas de Vagabundo", TipoEquipamentos.LUVAS, 18, 12, 0, 0, 27, 25),
    CALCAS_VAGABOND("Calças de Vagabundo", TipoEquipamentos.CALCAS, 18, 12, 0, 0, 27, 25),
    BOTAS_VAGABOND("Botas de Vagabundo", TipoEquipamentos.BOTAS, 18, 12, 0, 0, 27, 25),

    // Hero Set (Herói)
    CAPACETE_HERO("Capacete do Herói", TipoEquipamentos.CAPACETE, 22, 10, 0, 0, 29, 22),
    PEITORAL_HERO("Peitoral do Herói", TipoEquipamentos.PEITORAL, 22, 10, 0, 0, 29, 22),
    LUVAS_HERO("Luvas do Herói", TipoEquipamentos.LUVAS, 22, 10, 0, 0, 29, 22),
    CALCAS_HERO("Calças do Herói", TipoEquipamentos.CALCAS, 22, 10, 0, 0, 29, 22),
    BOTAS_HERO("Botas do Herói", TipoEquipamentos.BOTAS, 22, 10, 0, 0, 29, 22),

    // Shadow Set (Sombra)
    CAPACETE_SHADOW("Máscara da Sombra", TipoEquipamentos.CAPACETE, 8, 22, 0, 0, 15, 25),
    PEITORAL_SHADOW("Peitoral da Sombra", TipoEquipamentos.PEITORAL, 8, 22, 0, 0, 15, 25),
    LUVAS_SHADOW("Luvas da Sombra", TipoEquipamentos.LUVAS, 8, 22, 0, 0, 15, 25),
    CALCAS_SHADOW("Calças da Sombra", TipoEquipamentos.CALCAS, 8, 22, 0, 0, 15, 25),
    BOTAS_SHADOW("Botas da Sombra", TipoEquipamentos.BOTAS, 8, 22, 0, 0, 15, 25),

    // Bandit Set (Bandido)
    CAPACETE_BANDIT("Máscara de Bandido", TipoEquipamentos.CAPACETE, 10, 16, 0, 0, 17, 20),
    PEITORAL_BANDIT("Peitoral de Bandido", TipoEquipamentos.PEITORAL, 10, 16, 0, 0, 17, 20),
    LUVAS_BANDIT("Luvas de Bandido", TipoEquipamentos.LUVAS, 10, 16, 0, 0, 17, 20),
    CALCAS_BANDIT("Calças de Bandido", TipoEquipamentos.CALCAS, 10, 16, 0, 0, 17, 20),
    BOTAS_BANDIT("Botas de Bandido", TipoEquipamentos.BOTAS, 10, 16, 0, 0, 17, 20),


// ARMADURAS LEVES, MAGOS E INICIALES

    // Azur's Glintstone Set (Mago Sênior - INT Alta)
    CAPACETE_AZUR("Coroa de Pedrilhante de Azur", TipoEquipamentos.CAPACETE, 6, 8, 45, 0, 10, 48),
    PEITORAL_AZUR("Túnica de Azur", TipoEquipamentos.PEITORAL, 6, 8, 45, 0, 10, 48),
    LUVAS_AZUR("Luvas de Azur", TipoEquipamentos.LUVAS, 6, 8, 45, 0, 10, 48),
    CALCAS_AZUR("Calças de Azur", TipoEquipamentos.CALCAS, 6, 8, 45, 0, 10, 48),
    BOTAS_AZUR("Sapatilhas de Azur", TipoEquipamentos.BOTAS, 6, 8, 45, 0, 10, 48),

    // Lusat's Glintstone Set (Mago Sênior - INT Alta)
    CAPACETE_LUSAT("Coroa de Pedrilhante de Lusat", TipoEquipamentos.CAPACETE, 6, 8, 45, 0, 11, 49),
    PEITORAL_LUSAT("Túnica de Lusat", TipoEquipamentos.PEITORAL, 6, 8, 45, 0, 11, 49),
    LUVAS_LUSAT("Luvas de Lusat", TipoEquipamentos.LUVAS, 6, 8, 45, 0, 11, 49),
    CALCAS_LUSAT("Calças de Lusat", TipoEquipamentos.CALCAS, 6, 8, 45, 0, 11, 49),
    BOTAS_LUSAT("Sapatilhas de Lusat", TipoEquipamentos.BOTAS, 6, 8, 45, 0, 11, 49),

    // Alberich's Set (Mago de Sangue/Híbrido)
    CAPACETE_ALBERICH("Chapéu de Alberich", TipoEquipamentos.CAPACETE, 8, 10, 25, 0, 14, 40),
    PEITORAL_ALBERICH("Túnica de Alberich", TipoEquipamentos.PEITORAL, 8, 10, 25, 0, 14, 40),
    LUVAS_ALBERICH("Luvas de Alberich", TipoEquipamentos.LUVAS, 8, 10, 25, 0, 14, 40),
    CALCAS_ALBERICH("Calças de Alberich", TipoEquipamentos.CALCAS, 8, 10, 25, 0, 14, 40),
    BOTAS_ALBERICH("Botas de Alberich", TipoEquipamentos.BOTAS, 8, 10, 25, 0, 14, 40),

    // Court Sorcerer Set (Feiticeiro da Corte - DS3)
    CAPACETE_COURT_SORCERER("Capuz do Feiticeiro da Corte", TipoEquipamentos.CAPACETE, 6, 10, 30, 0, 12, 42),
    PEITORAL_COURT_SORCERER("Túnica do Feiticeiro da Corte", TipoEquipamentos.PEITORAL, 6, 10, 30, 0, 12, 42),
    LUVAS_COURT_SORCERER("Luvas do Feiticeiro da Corte", TipoEquipamentos.LUVAS, 6, 10, 30, 0, 12, 42),
    CALCAS_COURT_SORCERER("Calças do Feiticeiro da Corte", TipoEquipamentos.CALCAS, 6, 10, 30, 0, 12, 42),
    BOTAS_COURT_SORCERER("Botas do Feiticeiro da Corte", TipoEquipamentos.BOTAS, 6, 10, 30, 0, 12, 42),

    // Deathbed Dress Set (Vestido Leito de Morte)
    CAPACETE_DEATHBED("Tiaras de Leito de Morte", TipoEquipamentos.CAPACETE, 5, 8, 0, 15, 6, 44),
    PEITORAL_DEATHBED("Vestido Leito de Morte", TipoEquipamentos.PEITORAL, 5, 8, 0, 15, 6, 44),
    LUVAS_DEATHBED("Braçadeiras Leito de Morte", TipoEquipamentos.LUVAS, 5, 8, 0, 15, 6, 44),
    CALCAS_DEATHBED("Saia Leito de Morte", TipoEquipamentos.CALCAS, 5, 8, 0, 15, 6, 44),
    BOTAS_DEATHBED("Sandálias Leito de Morte", TipoEquipamentos.BOTAS, 5, 8, 0, 15, 6, 44),

    // Prisoner Set (Prisioneiro)
    CAPACETE_PRISONER("Máscara de Ferro do Prisioneiro", TipoEquipamentos.CAPACETE, 10, 12, 14, 0, 18, 22),
    PEITORAL_PRISONER("Roupas de Prisioneiro", TipoEquipamentos.PEITORAL, 10, 12, 14, 0, 18, 22),
    LUVAS_PRISONER("Luvas de Prisioneiro", TipoEquipamentos.LUVAS, 10, 12, 14, 0, 18, 22),
    CALCAS_PRISONER("Calças de Prisioneiro", TipoEquipamentos.CALCAS, 10, 12, 14, 0, 18, 22),
    BOTAS_PRISONER("Sapatos de Prisioneiro", TipoEquipamentos.BOTAS, 10, 12, 14, 0, 18, 22);

    String nome;
    //Buffs
    int forca;
    int destreza;
    int inteligencia;
    int fe;
    // atributos de defesa
    int def_fis;
    int def_mag;
    int tipo_equipamento;

    ListasEquipamentos(String nome, TipoEquipamentos equipamento, int forca, int destreza, int inteligencia, int fe, int def_fis, int def_mag){
        this.nome = nome;
        this.forca = forca;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.fe = fe;
        this.def_fis = def_fis;
        this.def_mag = def_mag;
        this.tipo_equipamento = equipamento.tipo;
    }
}

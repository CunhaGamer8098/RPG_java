package Entidades.Player.Classes;

import Itens.KitsPredefinidos;

// Dados retirados de Elden Ring
public enum Classes {
    VAGABUNDO(15, 10, 11, 14, 13, 9, 9, 7, 9, KitsPredefinidos.VAGABUNDO_KIT),
    GUERREIRO(11, 12, 11, 10, 16, 10, 8, 9, 8, KitsPredefinidos.GUERREIRO_KIT),
    HEROI(14, 9, 12, 16, 9, 7, 8, 11, 7, KitsPredefinidos.HEROI_KIT),
    BANDIDO(10, 11, 10, 9, 13, 9, 8, 14, 5, KitsPredefinidos.BANDIDO_KIT),
    ASTROLOGO(9, 15, 9, 8, 12, 16, 7, 9, 6, KitsPredefinidos.ASTROLOGO_KIT),
    PROFETA(10, 14, 8, 11, 10, 7, 16, 10, 7, KitsPredefinidos.PROFETA_KIT),
    SAMURAI(12, 11, 13, 12, 15, 9, 8, 8, 9, KitsPredefinidos.SAMURAI_KIT),
    PRISIONEIRO(11, 12, 11, 11, 14, 14, 6, 9, 9, KitsPredefinidos.PRISIONEIRO_KIT),
    CONFESSOR(10, 13, 10, 12, 12, 9, 14, 9, 10, KitsPredefinidos.CONFESSOR_KIT),
    INFELIZ(10, 10, 10, 10, 10, 10, 10, 10, 1, KitsPredefinidos.INFELIZ_KIT);
    // Atributos de Utilidade
    int vigor;
    int mente;
    int resistencia;
    // Atributos de Dano e desempenho
    int forca;
    int destreza;
    int inteligencia;
    int fe;
    int arcano;
    //nivel inicial da Classe selecionada
    int nivel;

    KitsPredefinidos kit;

    Classes(int vigor, int mente, int resistencia, int forca, int destreza, int inteligencia, int fe, int arcano, int nivel, KitsPredefinidos kit){
        // Atributos de Utilidade
        this.vigor = vigor;
        this.mente = mente;
        this.resistencia = resistencia;
        // Atributos de Dano e desempenho
        this.forca = forca;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.fe = fe;
        this.arcano = arcano;
        // nivel
        this.nivel = nivel;

        this.kit = kit;
    }
}
package Itens.Armas;

import Itens.Item;

public class Armas extends Item {
    String nome;
    int  forca;
    int destreza;
    int inteligencia;
    int fe;
    // Range, de blocos no mapa;
    int alcance;
    //(Dano, defesa)Estipulados
    int dano;
    int defesa;
    // modelo ataque
    int modelo_ataque;

    public Armas(ArmasListas arma){

        this.forca = arma.forca;
        this.destreza = arma.destreza;
        this.inteligencia = arma.inteligencia;;
        this.fe = arma.fe;

        this.alcance = arma.alcance;
        this.dano = arma.dano;
        this.defesa = arma.defesa;

        this.modelo_ataque = arma.modelo_ataque;
    }
}

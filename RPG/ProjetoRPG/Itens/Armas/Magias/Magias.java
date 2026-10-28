package Itens.Armas.Magias;

import Itens.Item;

public class Magias extends Item {
    String nome;
    int inteligencia;
    int fe;
    int alcance;
    int dano;
    int defesa;
    int modelo_magia;
    int id_coisa;

    public Magias(MagiasListas magia){
        this.nome = magia.nome;
        this.inteligencia = magia.inteligencia;
        this.fe = magia.fe;
        this.alcance = magia.alcance;
        this.dano = magia.dano;
        this.defesa = magia.defesa;
        this.modelo_magia = magia.modelo_magia;
        this.id_coisa = magia.codigo_item;

    }

}

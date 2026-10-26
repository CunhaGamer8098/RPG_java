package Itens.Equipamentos;

import Itens.Item;

public class Equipamentos extends Item {
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

    public Equipamentos(ListasEquipamentos equipamento){
        this.nome = equipamento.nome;
        this.forca = equipamento.forca;
        this.destreza = equipamento.destreza;
        this.inteligencia = equipamento.destreza;
        this.fe = equipamento.fe;
        this.def_fis = equipamento.def_fis;
        this.def_mag = equipamento.def_mag;
        this.tipo_equipamento = equipamento.tipo_equipamento;

    }

}

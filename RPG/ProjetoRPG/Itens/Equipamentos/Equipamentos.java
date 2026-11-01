package Itens.Equipamentos;

public class Equipamentos {
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

    int id_coisa;

    public Equipamentos(ListasEquipamentos equipamento){
        this.nome = equipamento.nome;
        this.forca = equipamento.forca;
        this.destreza = equipamento.destreza;
        this.inteligencia = equipamento.destreza;
        this.fe = equipamento.fe;
        this.def_fis = equipamento.def_fis;
        this.def_mag = equipamento.def_mag;
        this.tipo_equipamento = equipamento.tipo_equipamento;
        this.id_coisa = equipamento.codigo_item;

    }

}

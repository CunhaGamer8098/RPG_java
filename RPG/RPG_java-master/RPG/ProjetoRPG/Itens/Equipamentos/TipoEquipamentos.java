package Itens.Equipamentos;

public enum TipoEquipamentos {
    CAPACETE(1),
    PEITORAL(2),
    LUVAS(3),
    CALCAS(4),
    BOTAS(5);

    int tipo;

    TipoEquipamentos(int tipo){
        this.tipo = tipo;
    }

}

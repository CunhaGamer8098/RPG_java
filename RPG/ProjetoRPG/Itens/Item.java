package Itens;
import Itens.Armas.TipoArmas;
import Itens.Equipamentos.TipoEquipamentos;
public abstract class Item{
    //Variável de durabilidade,
    protected int durabilidade;
    //armas e armaduras equipados
    protected TipoArmas arma_atual_dir;
    protected TipoArmas arma_atual_esq;
    protected TipoEquipamentos capacete_atual;
    protected TipoEquipamentos peitoral_atual;
    protected TipoEquipamentos luvas_atual;
    protected TipoEquipamentos calcas_atual;
    protected TipoEquipamentos botas_atual;
}
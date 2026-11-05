package Entidades;

import Entidades.Player.Classes.Classes;
import Entidades.Player.Estado;
import Itens.Equipados;

public abstract class Entidade {

    public String nome;
    protected Estado estado_atual;
    protected int nivel;
    public int[] posicao;
    protected int vida_max;
    protected int vida_atual;
    protected int stamina_max;
    protected int stamina_atual;
    protected int mana_max;
    protected int mana_atual;

}

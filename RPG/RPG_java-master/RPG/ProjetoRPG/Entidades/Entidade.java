package Entidades;

import Entidades.Player.Classes.Classes;
import Entidades.Player.Classes.Player;
import Entidades.Player.Estado;
import Itens.Equipados;

import java.util.ArrayList;

public abstract class Entidade {


    public String nome;
    protected Estado estado_atual;
    public int nivel;
    public int[] posicao = new int[] {0,0};
    protected int vida_max;
    protected int vida_atual;
    protected int stamina_max;
    protected int stamina_atual;
    protected int mana_max;
    protected int mana_atual;
}



package Entidades;

import Itens.Equipados;

public abstract class Entidades {
    
    public String nome;
    protected Estado estado_atual;
    public int[] posicao;
    protected int vida_max;
    protected int vida_atual;
    protected int stamina_max;
    protected int stamina_atual;
    protected int mana_max;
    protected int mana_atual;
    protected Equipados equipamento_atual;

}

    public void descer(){
        this.posicao[1] = this.posicao[1] + 1;
    }
    public void subir(){

        this.posicao[1] = this.posicao[1] - 1;
    }
    public void direita(){
        this.posicao[0] = this.posicao[0] - 1;
    }
    public void esquerda(){

        this.posicao[0] = this.posicao[0] + 1;
    }

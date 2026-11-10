package Entidades.Player;

import Entidades.Entidade;
import Itens.Equipados;
import Entidades.Player.Classes.Classes;

public abstract class Personagem extends Entidade {

    // Variáveis coringas de personagens, que variam de acordo com a classe e status

    public String nome;
    protected int expericencia;
    protected Classes classe_personagem;


    public Personagem(String nome, int[] posicao, Classes classe){
        this.nome = nome;
        this.posicao = posicao;
        this.classe_personagem = classe;

        // Variáveis Comuns aos Personagens
        this.estado_atual = Estado.VIVO;
        this.expericencia = 0;
    }

    public void descer(){
        this.posicao[1] = this.posicao[1] + 1;
    }
    public void subir(){

        this.posicao[1] = this.posicao[1] - 1;
    }
    public void direita(){
        this.posicao[0] = this.posicao[0] + 1;
    }
    public void esquerda(){
        this.posicao[0] = this.posicao[0] - 1;
    }



}

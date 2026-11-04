package Entidades.Player;

import Itens.Equipados;
import Entidades.Player.Classes.Classes;

public abstract class Personagem {

    // Variáveis coringas de personagens, que variam de acordo com a classe e status

    public String nome;
    protected Estado estado_atual;
    protected int nivel;
    protected int expericencia;
    protected Classes classe_personagem;
    public int[] posicao;
    protected int vida_max;
    protected int vida_atual;
    protected int stamina_max;
    protected int stamina_atual;
    protected int mana_max;
    protected int mana_atual;
    protected Equipados equipamento_atual;


    public Personagem(String nome, int[] posicao, Classes classe){
        this.nome = nome;
        this.posicao = posicao;
        this.classe_personagem = classe;

        // Variáveis Comuns aos Personagens
        this.estado_atual = Estado.VIVO;
        this.expericencia = 0;
    }


}

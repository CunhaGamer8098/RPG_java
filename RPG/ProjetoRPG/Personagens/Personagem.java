package Personagens;

import Itens.Item;
import Personagens.Classes.Classes;

public abstract class Personagem {

    // Variáveis coringas de personagens, que variam de acordo com a classe e status

    public String nome;
    protected Estado estado_atual;
    protected int nivel;
    protected int expericencia;
    protected Classes classe_personagem;
    protected int[] posicao;
    protected int vida_max;
    protected int vida_atual;
    protected int stamina_max;
    protected int stamina_atual;
    protected int mana_max;
    protected int mana_atual;
    protected Item equipamento_atual;
    protected int def_fis; // Deixar para armaduras e equipamentos
    protected int def_mag; // Deixar para armaduras e equipamentos

    public Personagem(String nome, int[] posicao, Classes classe){
        this.nome = nome;
        this.posicao = posicao;
        this.classe_personagem = classe;

        // Variáveis Comuns aos Personagens
        this.estado_atual = Estado.VIVO;
        this.expericencia = 0;
    }


}

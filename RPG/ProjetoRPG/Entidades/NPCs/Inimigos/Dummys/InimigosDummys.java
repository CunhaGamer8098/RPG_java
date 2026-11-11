package Entidades.NPCs.Inimigos.Dummys;

import Entidades.NPCs.NPCs;
import Entidades.Player.Classes.Player;
import Entidades.Player.Estado;
import Itens.KitsPredefinidos;
import Mapas.Mapa;

import java.util.ArrayList;

public class InimigosDummys extends NPCs {

    ArrayList<Player> players = new ArrayList<>();

    public String nome;
    Estado estado_atual;
    protected int nivel;
    int[] posicao = new int[] {0,0};
    protected int vida_max;
    protected int vida_atual;
    int dano_fisico, dano_magico, defesa_fisica, defesa_magica, exp_drop;
    float drop_rate;
    KitsPredefinidos kit;
    public InimigosDummys(Lista_Inimigos inimigo, Mapa mapa){
        this.nome = inimigo.nome;
        this.estado_atual = Estado.VIVO;

        this.vida_max = inimigo.vida;
        this.vida_atual = inimigo.vida;

        this.dano_fisico = inimigo.dano_fisico;
        this.dano_magico = inimigo.dano_magico;
        this.defesa_fisica = inimigo.defesa_fisica;
        this.defesa_magica = inimigo.defesa_magica;
        this.exp_drop = inimigo.exp_drop;
        this.drop_rate = inimigo.drop_rate;
        this.kit = inimigo.kit;
        this.nivel = this.calcularMediaNivel();
        this.posicao = mapa.sortearPosicaoValida;

        this.atualizarStatusNivel();

    }
    public void atualizarStatusNivel(){
        this.vida_max = this.vida_max * this.nivel;
        this.vida_atual = this.vida_atual * this.nivel;

        this.dano_fisico = this.dano_fisico * this.nivel;
        this.dano_magico = this.dano_magico * this.nivel;
        this.defesa_fisica = this.defesa_fisica * this.nivel;
        this.defesa_magica = this.defesa_magica * this.nivel;
    }
    public int calcularMediaNivel() {

        if (players.isEmpty()) {
            return 1;
        }

        int soma = 0;

        for (Player p : players) {
            soma += p.nivel;
        }

        return soma / players.size();
    }

}


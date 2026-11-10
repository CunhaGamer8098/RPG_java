package Mapas;
    // ID COISA
    // 0 Casa vazia que pode ser ocupada.
    // 1 Blocos que não podem ser ultrapassados
    // 2 Entidades.Player
    // 3 NPC amigo
    // 4 NPC inimigo
    // 5 Item -- Isso significa enumerar os itens por códigos de Dois dígitos
    // 6 Portas para outros mapas
    // 7 Casas que estão sofrendo ataque de armas

import Entidades.Entidade;
import Entidades.Player.Classes.Player;
import Entidades.Player.Personagem;

import java.util.ArrayList;
import java.util.Random;

public class Mapa {


    public int[] sortearPosicaoValida;
    // Mapas serão criados a partir de uma matriz a qual é definida por zeros e
    // Variável que categoriza o que está na posição do mapa, sendo esse alterado pelo turno
    int quantidade_de_entidades;
    ArrayList<Entidade> entidades = new ArrayList<>();;
    int[][] mapa_antigo;
    int[][] mapa_atual;
    int[][] mapa_ataque;

    public Mapa(TiposDeMapa mapa){
        this.quantidade_de_entidades = 0;
        this.mapa_antigo = mapa.matriz;
        this.mapa_atual = new int [20][20];
        this.mapa_ataque = new int [20][20];

    }
    public void desenhar_mapa(){
        for (int i = 0; this.mapa_atual.length > i; i++){
            for (int j  = 0; this.mapa_atual[i].length > j; j++){
                if (mapa_atual[i][j] == 0){
                    System.out.print("____");
                } else if (mapa_atual[i][j] == 6) {
                    System.out.print("[bd]");
                } else if (mapa_atual[i][j] == 2) {
                    System.out.print("-P1-");
                }
                else {
                    System.out.print("||||");
                }
            }
            System.out.println();
        }
    }
    //Transformar a partir do for na lista de criaturas do mapa
    public void posicionarPlayer(Player pessoa) {

        int y = pessoa.posicao[0];
        int x = pessoa.posicao[1];

        this.resetarMapa();

        if (this.mapa_atual[x][y] == 0) {
            this.mapa_atual[x][y] = 2;
        }
        this.desenhar_mapa();

    }
    public void resetarMapa(){
        for (int i = 0; this.mapa_antigo.length > i; i++){
            this.mapa_atual[i] = this.mapa_antigo[i].clone();
            for (int j = 0; this.mapa_antigo[i].length>j; j++){
                this.mapa_ataque[i][j] = 0;
            }
        }
    }
    public void adicionarEntidades() {

        if (entidades.isEmpty()) {
            entidades = new ArrayList<>();
        }
        else {
            for (Entidade e : entidades){
                entidades.add(e);
            }

        }

    }
    public void posicionarEntidades(){
        this.resetarMapa();
        this.adicionarEntidades();

        for (Entidade e : entidades){
            int novoX = e.posicao[0] + 1;
            int novoY = e.posicao[1];

            if (posicaoValida(novoX, novoY)) {
                e.posicao[0] = novoX;
                e.posicao[1] = novoY;
                mapa_atual[novoX][novoY] = 2;
            }
            this.desenhar_mapa();
        }
    }
    public boolean posicaoValida(int x, int y) {

        if (x < 0 || x >= mapa_atual.length ||
                y < 0 || y >= mapa_atual[x].length) {
            return false;
        }

        return mapa_atual[x][y] != 1;
    }
    public int[] sortearPosicaoValida() {

        Random random = new Random();

        int x, y;

        do {
            x = random.nextInt(mapa_antigo.length);
            y = random.nextInt(mapa_antigo[x].length);

        } while (mapa_antigo[x][y] != 0 ||
                mapa_antigo[x][y] != 0);

        return new int[]{x, y};
    }
}

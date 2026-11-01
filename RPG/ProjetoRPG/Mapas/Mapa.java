package Mapas;
    // ID COISA
    // 0 Casa vazia que pode ser ocupada.
    // 1 Blocos que não podem ser ultrapassados
    // 2 Entidades.Player
    // 3 NPC amigo
    // 4 NPC inimigo
    // 5 Item -- Isso significa enumerar os itens por códigos de Dois dígitos
    // 6 Portas para outros mapas

import Entidades.Player.Classes.Player;
import Entidades.Player.Personagem;

public class Mapa {
    // Mapas serão criados a partir de uma matriz a qual é definida por zeros e 
    // Variável que categoriza o que está na posição do mapa, sendo esse alterado pelo turno
    int id_coisa_atual;
    int[][] posicao_coisa_atual;
    int[][] mapa;

    public Mapa(TiposDeMapa mapa){
        this.id_coisa_atual = 0;
        this.posicao_coisa_atual = new int[0][0];
        this.mapa = mapa.matriz;

    }
    public void desenhar_mapa(){
        for (int i = 0; this.mapa.length > i; i++){
            for (int j  = 0; this.mapa[i].length > j; j++){
                if (mapa[i][j] == 0){
                    System.out.print("____");
                } else if (mapa[i][j] == 6) {
                    System.out.print("[bd]");
                } else if (mapa[i][j] == 2) {
                    System.out.print("-P1-");
                }
                else {
                    System.out.print("||||");
                }
            }
            System.out.println();
        }
    }
    public void posicionarPlayer(Player pessoa) {

        int x = pessoa.posicao[0];
        int y = pessoa.posicao[1];

        if (this.mapa[x][y] == 0) {
            this.mapa[x][y] = 2;
        }
        else {
            System.out.println("O personagem não pode ser posicionado aqui");
            pessoa.posicao = null;
        }
        System.out.println(pessoa.posicao);
        this.desenhar_mapa();
    }

}

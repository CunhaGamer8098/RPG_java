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
    int quantidade_de_entidades;
    int[] posicao_coisa_atual;
    static int[][] mapa_antigo;
    int[][] mapa_atual;

    public Mapa(TiposDeMapa mapa){
        this.quantidade_de_entidades = 0;
        this.posicao_coisa_atual = new int[]{0,0};
        this.mapa_antigo = mapa.matriz;
        this.mapa_atual = mapa.matriz;

    }
    public void verificar_posicoes(){
        // verificar se existe algo vivo ou item dentro do mapa atual
        // caso tenha conferir suas posições e atualizar, mantendo o estado original
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
    public void posicionarPlayer(Player pessoa) {

        int y = pessoa.posicao[0];
        int x = pessoa.posicao[1];

        this.mapa_atual = this.mapa_antigo;

        while (this.mapa_atual[y][x] == 1){

            // tenta valores brancos da esquerda e direita
            if (pessoa.posicao[0]+1<10){
                pessoa.posicao[0] = pessoa.posicao[0] + 1;
                y = pessoa.posicao[0];
            }
            else {
                pessoa.posicao[0] = pessoa.posicao[0] - 1;
                y = pessoa.posicao[0];
            }

            // tenta valores brancos de cima e baixo
            if (pessoa.posicao[1]+1<10){
                pessoa.posicao[1] = pessoa.posicao[1] + 1;
                x = pessoa.posicao[1];
            }
            else {
                pessoa.posicao[1] = pessoa.posicao[1] - 1;
                x = pessoa.posicao[0];
            }
        }
        if (this.mapa_atual[x][y] == 0) {
            this.mapa_atual[x][y] = 2;
        }
        this.desenhar_mapa();

    }


}

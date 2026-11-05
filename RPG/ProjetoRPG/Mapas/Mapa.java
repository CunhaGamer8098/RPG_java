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

public class Mapa {
    // Mapas serão criados a partir de uma matriz a qual é definida por zeros e 
    // Variável que categoriza o que está na posição do mapa, sendo esse alterado pelo turno
    int quantidade_de_entidades;
    Entidade[] lista_criaturas_no_mapa;
    int[][] mapa_antigo;
    int[][] mapa_atual;

    public Mapa(TiposDeMapa mapa){
        this.quantidade_de_entidades = 0;
        this.lista_criaturas_no_mapa = null;
        this.mapa_antigo = mapa.matriz;
        this.mapa_atual = new int [20][20];

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
    public void resetarMapa(){
        for (int i = 0; this.mapa_antigo.length > i; i++){
            this.mapa_atual[i] = this.mapa_antigo[i].clone();
        }
    }
    public void adicionarAoMapa(Entidade entidade){
        this.quantidade_de_entidades = this.quantidade_de_entidades + 1;
        this.lista_criaturas_no_mapa[this.quantidade_de_entidades-1] = entidade;
    }
    public void posicionarEntidades(){
        for (int i = 0; lista_criaturas_no_mapa.length > i; i++){
            int y = this.lista_criaturas_no_mapa[i].posicao[0];
            int x = this.lista_criaturas_no_mapa[i].posicao[1];
            if (this.mapa_atual[x][y] == 0) {
                this.mapa_atual[x][y] = 2;
            }
            this.desenhar_mapa();
        }
    }
}

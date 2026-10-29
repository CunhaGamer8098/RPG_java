package Mapas;
    // ID COISA
    // 0 Casa vazia que pode ser ocupada.
    // 1 Blocos que não podem ser ultrapassados
    // 2 Player
    // 3 NPC amigo
    // 4 NPC inimigo
    // 5 Item -- Isso significa enumerar os itens por códigos de Dois dígitos
    // 6 Portas para outros mapas

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


}

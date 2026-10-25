package Itens.Armas;

//ATAQUE 1 (Range: 1 casa da frente e diagonal; Range: 2 duas casas a frente e duas diagonal, pega 5 casas)
//ATAQUE 2 (Range: 1 pega duas diagonais e casa frente; Range: 2 pega uma diagonal duas casas da frente, e um movimento do cavalo)
//ATAQUE 3 (Range: 3 pega tres casas para frente, e duas diagonais; Range: 4 4 casas para frente e 3 diagonais)
//ATAQUE 4 (Range: 1 pega uma casa da frente e duas diagonais ao lado; Range: 2 pega os movimentos ao lado do cavalo duas diagonais cavalo frente-lado, duas frente, um diagonal)
//ATAQUE 5 (Range: 1 pega frente e duas diagonais)

public enum TipoArmas {
    ESPADAS(1),
    MACHADOS(2),
    MARTELOS(2),
    KATANAS(1),
    LANCAS(3),
    ALABARDAS(3),
    FOICES(4),
    PUNHOS(5),
    CAJADOS(1),
    SELOS(0),
    ESCUDOS(5);

    // COLOCAR NÍVEL DE ARMAS, MODELO DE ATAQUE E DURABILIDADE
    //int nivel;
    int modelo_ataque;


    TipoArmas(int modelo_ataque){
        this.modelo_ataque = modelo_ataque;
    }
}

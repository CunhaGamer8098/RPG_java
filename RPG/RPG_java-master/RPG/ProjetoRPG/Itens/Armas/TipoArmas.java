package Itens.Armas;

// modelo 1 : ataque básico distância de uma casa, ou duas para ataque pesado
// modelo 2 : ataque básico distância de uma casa, 3 para ataque pesado
// modelo 3 : ataque com duas casas de distância numa reta, quadrado + 1 para atque pesado
// modelo 4 : quadrado para ataque leve, área com um de distância para ataque pesado
// modelo 5 : quina para ataque leve, quadrado mais um para ataque pesado
// modelo 6 : um de distância para ataque leve, cruz para ataque pesado
// modelo 7 : um de distância para ambos ataques
// modelo 8 : capacete de defesa para ataque leve, raio de defesa para ataque pesado ( defesa absoluta)


//Revisar os ataques e modelos para fazer mais lógica
// Padronizar range nos tipos de armas

public enum TipoArmas {
    ESPADAS(1, 1),
    MACHADOS(1, 1),
    MARTELOS(1, 1),
    KATANAS(2, 1),
    LANCAS(3, 2),
    ALABARDAS(4, 2),
    FOICES(5, 1),
    PUNHOS(6, 1),
    CAJADOS(7, 1),
    SELOS(0, 1),
    ESCUDOS(8, 0);

    // COLOCAR NÍVEL DE ARMAS, MODELO DE ATAQUE E DURABILIDADE
    //int nivel;
    int modelo_ataque;
    // Range, de blocos no mapa;
    int alcance;


    TipoArmas(int modelo_ataque, int alcance){
        this.modelo_ataque = modelo_ataque;
        this.alcance = alcance;

    }
}

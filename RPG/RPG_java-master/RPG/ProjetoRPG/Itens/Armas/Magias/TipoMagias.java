package Itens.Armas.Magias;

//Modelo 1 projetil que para após ultrapassar o range
//Modelo 2 ataque que pega as 3 casas da frente do personagem
//modelo 3 Ocorre na área selecionada quanto maior mais se aproxima de um círculo

public enum TipoMagias {
    PROJETIL_LONGO(1),
    ATAQUE_CORPO(2),
    ATAQUE_AREA(3),
    CURA(3),// destinar o encantamento para mais de uma pessoa com direito a repetição
    FORTALECIMENTOS(3); // destinar o encantamento para mais de uma pessoa com direito a repetição

    int modelo_magia;

    TipoMagias(int modelo_magia){
        this.modelo_magia = modelo_magia;
    }
}
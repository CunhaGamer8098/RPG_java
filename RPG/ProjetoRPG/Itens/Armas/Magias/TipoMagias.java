package Itens.Armas.Magias;
public enum TipoMagias {
    PROJETIL_LONGO,
    ATAQUE_CORPO,
    ATAQUE_AREA,
    CURA,// destinar o encantamento para mais de uma pessoa com direito a repetição
    FORTALECIMENTOS; // destinar o encantamento para mais de uma pessoa com direito a repetição

    int modelo_magia;

    TipoMagias(int modelo_magia){
        this.modelo_magia = modelo_magia;
    }
}
package Mapas;

public enum TiposDeComodo {
    ARENA(10, 10),
    COMODO(5, 5),
    CORREDOR_VERT(6, 3),
    CORREDOR_HORI(3,6)
    ;
    int[][] matriz;
    TiposDeComodo(int x, int y) {
        this.matriz = new int[x][y];
    }
    public void desenhar_comodo(){
        for (int i = 0; this.matriz.length > i; i += 1){
            for (int j = 0; this.matriz[i].length > j; j+=1){
                System.out.println("|__|");
            }
            System.out.println();
        }
    }
}

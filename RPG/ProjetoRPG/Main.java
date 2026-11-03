import Entidades.Player.Classes.Player;

import Entidades.Player.Classes.Classes;
import Mapas.Mapa;
import Mapas.TiposDeMapa;


public class Main {
    public static void main(String[] args){

        Player kenan = new Player("kenan", new int[]{10, 10}, Classes.BANDIDO);
        kenan.printarDados();

        Mapa cenario1 = new Mapa(TiposDeMapa.ARENA_DOS_CAMPEOES);
        cenario1.posicionarPlayer(kenan);
        kenan.direita();
        cenario1.posicionarPlayer(kenan);
    }

}

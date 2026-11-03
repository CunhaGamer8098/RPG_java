import Entidades.Player.Classes.Player;

import Entidades.Player.Classes.Classes;
import Mapas.Mapa;
import Mapas.TiposDeMapa;


public class Main {
    public static void main(String[] args){

        Player kenan = new Player("kenan", new int[]{4, 4}, Classes.BANDIDO);
        kenan.printarDados();

        Mapa cenario1 = new Mapa(TiposDeMapa.BOSQUE_SOMBRIO);
        cenario1.posicionarPlayer(kenan);
        kenan.esquerda();
        cenario1.posicionarPlayer(kenan);
    }

}

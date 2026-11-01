import Entidades.Player.Classes.Player;

import Entidades.Player.Classes.Classes;
import Mapas.Mapa;
import Mapas.TiposDeMapa;


public class Main {
    public static void main(String[] args){

        Player kenan = new Player("kenan", new int[]{2, 5}, Classes.GUERREIRO);
        //kenan.printarDados();

        Mapa cenario1 = new Mapa(TiposDeMapa.FORTALEZA_ABANDONADA);
        cenario1.posicionarPlayer(kenan);

    }

}

import Entidades.NPCs.Inimigos.Dummys.InimigosDummys;
import Entidades.NPCs.Inimigos.Dummys.Lista_Inimigos;
import Entidades.Player.Classes.Player;

import Entidades.Player.Classes.Classes;
import Mapas.Mapa;
import Mapas.TiposDeMapa;


public class Main {
    public static void main(String[] args){

        Player kenan = new Player("kenan", new int[]{10, 10}, Classes.BANDIDO);
        Mapa cenario1 = new Mapa(TiposDeMapa.ARENA_DOS_CAMPEOES);
        InimigosDummys esqueleto = new InimigosDummys(Lista_Inimigos.SKELETON, cenario1);
        cenario1.posicionarEntidades();

    }

}

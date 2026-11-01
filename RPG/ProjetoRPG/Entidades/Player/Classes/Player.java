package Entidades.Player.Classes;
import Entidades.Player.Personagem;
import Itens.Equipados;

public class Player extends Personagem {

    // Atributos de Utilidade
    protected int vigor;
    protected int mente;
    protected int resistencia;

    // Atributos de Dano e desempenho
    protected int forca;
    protected int destreza;
    protected int inteligencia;
    protected int fe;
    protected int arcano;

    //Itens e Inventário
    protected Equipados equipados;
    //protected Inventario inventario;

    public Player(String nome, int[] posicao, Classes classe){
        super(nome, posicao, classe);
        // Define os Atributos do personagem
        // Utilidade
        this.vigor = classe.vigor;
        this.mente = classe.mente;
        this.resistencia = classe.resistencia;
        // Desempenho
        this.forca = classe.forca;
        this.destreza = classe.destreza;
        this.inteligencia = classe.inteligencia;
        this.fe = classe.fe;
        this.arcano = classe.arcano;
        this.vida_max = (this.vigor*35);
        this.vida_atual = this.vida_max;
        this.stamina_max = (this.resistencia*30);
        this.stamina_atual = this.stamina_max;
        this.mana_max = (this.mente*25);
        this.mana_atual = this.mana_max;
        this.nivel = classe.nivel;

        this.equipados = classe.kit.criar();
        //this.inventario =
    }
    public void movimentar(int eixoX, int eixoY){

    }

    // TESTE DE FUNCIONAMENTO CÓDIGO VIA IA
    public void printarDados() {
        System.out.println("========================================");
        System.out.println("          DADOS DO PERSONAGEM           ");
        System.out.println("========================================");
        System.out.println("Nome: " + this.nome);
        System.out.println("Classe: " + (this.classe_personagem != null ? this.classe_personagem : "Nenhuma"));
        System.out.println("Nível: " + this.nivel);
        System.out.println("Experiência: " + this.expericencia);
        // Tratamento para o estado atual (caso seja um objeto ou enum)
        System.out.println("Estado Atual: " + (this.estado_atual != null ? this.estado_atual : "Normal"));
        // Tratamento para o array de posição [x, y]
        if (this.posicao != null && this.posicao.length >= 2) {
            System.out.println("Posição: X=" + this.posicao[0] + ", Y=" + this.posicao[1]);
        } else {
            System.out.println("Posição: Desconhecida");
        }
        System.out.println("----------------------------------------");
        System.out.println("ATRIBUTOS VITAIS:");
        System.out.println("Vida: " + this.vida_atual + " / " + this.vida_max);
        System.out.println("Stamina: " + this.stamina_atual + " / " + this.stamina_max);
        System.out.println("Mana: " + this.mana_atual + " / " + this.mana_max);
        System.out.println("----------------------------------------");
        System.out.println("ESTATÍSTICAS:");
        System.out.println("Força: " + this.vigor);
        System.out.println("Mente: " + this.mente);
        System.out.println("Resistência: " + this.resistencia);
        System.out.println("Força: " + this.forca);
        System.out.println("Destreza: " + this.destreza);
        System.out.println("Inteligência: " + this.inteligencia);
        System.out.println("Fé: " + this.fe);
        System.out.println("Arcano: " + this.arcano);
        System.out.println("========================================");
    }
}
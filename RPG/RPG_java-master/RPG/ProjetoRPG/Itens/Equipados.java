package Itens;
import Itens.Armas.Armas;
import Itens.Armas.ArmasListas;
import Itens.Equipamentos.Equipamentos;
import Itens.Equipamentos.ListasEquipamentos;

public class Equipados {
    //Variável de durabilidade,
    //protected int durabilidade;
    //armas e armaduras equipados
    protected Armas arma_atual_dir;
    protected Armas arma_atual_esq;
    protected Equipamentos capacete_atual;
    protected Equipamentos peitoral_atual;
    protected Equipamentos luvas_atual;
    protected Equipamentos calcas_atual;
    protected Equipamentos botas_atual;

    public Equipados(Armas arma_atual_dir, Armas arma_atual_esq, Equipamentos capacete_atual, Equipamentos peitoral_atual, Equipamentos luvas_atual, Equipamentos calcas_atual, Equipamentos botas_atual){
        this.arma_atual_dir = arma_atual_dir;
        this.arma_atual_esq = arma_atual_esq;
        this.capacete_atual = capacete_atual;
        this.peitoral_atual = peitoral_atual;
        this.luvas_atual = luvas_atual;
        this.calcas_atual = calcas_atual;
        this.botas_atual = botas_atual;

    }
    // Arrumar

}
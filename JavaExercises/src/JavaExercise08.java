import java.util.Scanner;
public class JavaExercise08 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o Valor do salário mínimo: ");
        float salario = entrada.nextFloat();
        float kw_price = salario/500;
        System.out.print("Quantos Quilowatts essa residência usou? ");
        float num_kw = entrada.nextFloat();
        float valor_pagar = num_kw*kw_price;
        float valor_c_desconto = (float) (valor_pagar*0.85);
        System.out.println("O Quilowatt está custando "+ kw_price+" reais, por Kw usados");
        System.out.println("A residência pagará R$"+valor_pagar+" para o gasto da residência");
        System.out.println("Se tiverem 15% de desconto o valor cai para R$"+valor_c_desconto);

    }
}

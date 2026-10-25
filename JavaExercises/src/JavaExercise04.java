import java.util.Scanner;
public class JavaExercise04 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print(" Digite seu salário: R$");
        double salario = entrada.nextDouble();
        float novo_valor = (float) (salario*1.25);
        System.out.println("Seu novo salário após um aumento de 25% será: R$"+novo_valor );
    }
}

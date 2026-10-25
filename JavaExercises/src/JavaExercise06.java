import java.util.Scanner;
public class JavaExercise06 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n1 = entrada.nextInt();
        System.out.print("Digite outro número inteiro: ");
        int n2 = entrada.nextInt();
        System.out.print("O produto desses números é: "+ (n1*n2));
    }
}

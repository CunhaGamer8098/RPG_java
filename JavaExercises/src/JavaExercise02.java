import java.util.Scanner;
public class JavaExercise02 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        int n4;
        System.out.println("Digite o primeiro número: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextInt();
        System.out.println("Digite o terceiro número: ");
        n3 = entrada.nextInt();
        System.out.println("Digite o quarto número: ");
        n4 = entrada.nextInt();
        int soma = n1+n2+n3+n4;
        System.out.print("A soma de todos os quatro números é: " + soma);
    }

}

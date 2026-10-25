import java.util.Scanner;
public class JavaExercise07 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu ano de nascimento");
        int nasc = entrada.nextInt();
        int age = 2026 - nasc;
        int idade = 2030 - nasc;
        System.out.println("Você tem "+age+" Caso já tenha feito aniversário.");
        System.out.println("Você terá "+idade+" em 2030 caso já tenha feito aniversário.");
    }
}

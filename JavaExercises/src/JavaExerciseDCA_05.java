import java.util.Scanner;

public class JavaExerciseDCA_05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a idade do nadador:");
        int age = entrada.nextInt();

        if (age < 5) {
            System.out.println("Seu nadador não tem a idade mínima para competir");
        }
        else if (age <= 7) {
            System.out.println("Seu nadador é da categoria infantil A");
        }
        else if (age <= 10) {
            System.out.println("Seu nadador é da categoria infantil B");
        }
        else if (age <= 13) {
            System.out.println("Seu nadador é da categoria Juvenil A");
        }
        else if (age <= 17) {
            System.out.println("Seu nadador é da categoria Juvenil B");
        }
        else {
            System.out.println("Seu nadador é da categoria Sênior");
        }

        entrada.close();
    }
}
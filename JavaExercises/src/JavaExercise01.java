import java.util.Scanner;
public class JavaExercise01 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name = entrada.nextLine();
        System.out.println("Digite o seu gênero: ");
        String gender = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        int age = entrada.nextInt();
        System.out.print("Seu nome é "+ name);
        System.out.print(", você tem "+age+" anos, ");
        System.out.print("seu gênero é "+ gender);
    }

}

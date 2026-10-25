import java.util.Scanner;
public class JavaExercise05 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a base do triângulo: ");
        float base = entrada.nextFloat();
        System.out.print("Digite a altura do triângulo: ");
        float altura = entrada.nextFloat();
        float area = (altura*base)/2;
        System.out.print("A área do triângulo é: "+ area);
    }
}

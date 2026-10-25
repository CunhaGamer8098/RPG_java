import java.util.Scanner;
public class JavaExerciseDCA_06 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o código referente ao cargo do funcionário");
        int code = entrada.nextInt();
        switch (code){
            case 1:
                System.out.println("O percentual do aumento será de 50%");
                break;
            case 2:
                System.out.println("O percentual do aumento será de 35%");
                break;
            case 3:
                System.out.println("O percentual do aumento será de 20%");
                break;
            case 4:
                System.out.println("O percentual do aumento será de 10%");
                break;
            case 5:
                System.out.println("Não há percentual de aumento destinado a este cargo");
                break;
            default:
                System.out.print("Código inválido");
        }
    }
}

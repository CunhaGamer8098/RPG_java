import java.util.Scanner;
public class JavaExerciseDCA_04 {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número");
        float n1 = entrada.nextFloat();
        System.out.println("Digite a operação a ser feita, sendo:");
        System.out.println("'+' Para a soma");
        System.out.println("'-' Para a subtração");
        System.out.println("'/' Para a divisão");
        System.out.println("'*' Para a multiplicação");
        String sinal = entrada.next();
        System.out.println("Digite outro número");
        float n2 = entrada.nextFloat();
        switch(sinal){
            case "+":
                System.out.print(n1+"+"+n2+"=");
                System.out.println(n1+n2);
                break;
            case "-":
                System.out.print(n1+"-"+n2+"=");
                System.out.println(n1-n2);
                break;
            case "/":
                if (n2 != 0 ){
                    System.out.print(n1+"/"+n2+"=");
                    System.out.println(n1/n2);
                }
                else {
                    System.out.println("Não se pode dividir números por 0");
                }
            case "*":
                System.out.print(n1+"*"+n2+"=");
                System.out.println(n1*n2);
            default:
                System.out.println("Sinal inválido");
        }

    }
}
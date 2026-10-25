import java.util.Scanner;
public class JavaExercise03 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float n1;
        float n2;
        float n3;
        System.out.print("Digite a primeira nota do aluno: ");
        n1 = entrada.nextFloat();
        System.out.print("Digite a segudna nota do aluno: ");
        n2 = entrada.nextFloat();
        System.out.print("Digite a terceira nota do aluno: ");
        n3 = entrada.nextFloat();
        float nf = (n1+n2+n3)/3;
        System.out.print("A nota final do aluno é: "+ nf);
    }
}

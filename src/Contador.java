import java.util.Scanner;
import java.util.Locale;
public class Contador {
    public static void main(String[] args){
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.printf("Defina o primeiro parametro: ");
        Integer parametro1 = terminal.nextInt();
        System.out.printf("Defina o segundo parametro: ");
        Integer parametro2 = terminal.nextInt();

        try {
            contar(parametro1, parametro2);
        } catch (Exception ParametrosInvalidosException) {
            System.out.printf("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    public static void contar(int parametro1, int parametro2) {
        int contagem = parametro2 - parametro1;
        for(int i=1;i<=contagem;i++){
            System.out.printf("Imprimindo o número "+ i);
            System.out.printf(" | ");
        }
    }
}

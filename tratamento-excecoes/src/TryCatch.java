
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        /* Tratamento de exceções
     * A instrução try, permite que você defina um bloco de código, para ser testado 
     * quanto a erros enquanto está sendo executado. */

     Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

     try{

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobre nome: ");
        String sobreNome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobreNome.toUpperCase());
        System.out.println("Tenho " + idade + " anos");
        System.out.println("minha altura é " + altura + "cm");
     }
     catch(InputMismatchException e){
        System.out.println("Os campos idade e altura precisam ser numéricos");
     }

     scanner.close();
     /*
      * listando algumas possíveis exceções, que podem acontecer.
      * Não informar o nome e sobrenome;
      * O valor da idade ter um caractere NÃO numérico;
      * O valor da altura ter uma vírgula ao invés de ser um ponto (conforme padrão americano);
      */
        
    }
    
    
}

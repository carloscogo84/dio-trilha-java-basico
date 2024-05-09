import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        double saldo = 237.48;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Seja bem vindo ao seu banco digital");

        System.out.println("Por favor, insira seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " +  numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
       
        scanner.close();
    }

    
}
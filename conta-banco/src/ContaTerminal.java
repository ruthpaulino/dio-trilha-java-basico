import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Agora, digite o seu nome!");
        String nome = scanner.next();

        System.out.println("Por favor, digite o saldo!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia);
        System.out.println("conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque");

        // Fechando o Scanner
        scanner.close();
    }
}
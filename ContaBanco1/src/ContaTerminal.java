import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem vindo ao banco digital SNTJ");

        System.out.println("Digite o número de sua Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite sua Agência: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu saldo: ");
        Float saldoCliente = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta: " + numeroConta + " e seu saldo: "+ saldoCliente + " já está disponível para saque.");
    }
}
import java.util.Scanner;

public class contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de início do laço");
        int valorInicio = scanner.nextInt();

        System.out.println("Digite o valor final do laço");
        int valorFinal = scanner.nextInt();

        try {
            contar(valorInicio, valorFinal);
        } catch (ParametrosInvalidosException e) {
            throw new RuntimeException(e);
        }
    }

    static void contar(int valorInicio, int valorFinal) throws ParametrosInvalidosException {
        if (valorFinal < valorInicio) {
            throw new ParametrosInvalidosException("O valor final informado é menor que o valor de início!");
        } else {
            System.out.println("Contando..");
            int contagem = valorFinal - valorInicio;
            for (int contador = 1; contador <= contagem; contador++){
                System.out.println("Imprimindo o número: " + contador);
            }
        }

    }
}

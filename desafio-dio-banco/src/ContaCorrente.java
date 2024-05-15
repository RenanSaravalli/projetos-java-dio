import java.sql.SQLOutput;

public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("===Estrato Conta Corrente===");
        System.out.println(String.format("Agência: %d", super.agencia));
        System.out.println(String.format("Número: %d", super.numero));
        System.out.println(String.format("Saldo: %.2f", super.saldo));
    }
}

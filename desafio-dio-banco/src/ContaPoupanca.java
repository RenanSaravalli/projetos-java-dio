public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("===Estrato Conta Poupanca===");
        System.out.println(String.format("Agência: %d", super.agencia));
        System.out.println(String.format("Número: %d", super.numero));
        System.out.println(String.format("Saldo: %.2f", super.saldo));
    }
}

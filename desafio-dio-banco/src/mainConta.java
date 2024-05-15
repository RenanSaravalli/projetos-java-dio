public class mainConta {
    public static void main(String[] args) {
        Cliente renan = new Cliente();
        renan.setNome("Renan");

        Cliente cleber = new Cliente();
        cleber.setNome("Cleber");

        Conta cc = new ContaCorrente(renan);
        cc.depositar(100);
        Conta poupanca = new ContaPoupanca(cleber);

        cc.transferir(100, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}

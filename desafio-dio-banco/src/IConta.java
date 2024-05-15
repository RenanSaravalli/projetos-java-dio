public interface IConta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void  imprimirExtrato();
}
/*A interface serve para definirmos um contrato*/

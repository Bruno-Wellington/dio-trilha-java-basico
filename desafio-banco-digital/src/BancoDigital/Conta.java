package BancoDigital;

public abstract class Conta {


    private static final int AGENCIA_PADRAO = 1;
    private static  int CONTADOR = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = CONTADOR++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        if(this.saldo > 0){
            this.saldo -= valor;
        } else {
            System.out.println("Você nao tem saldo na conta!");
        }
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino){
         this.sacar(valor);
         contaDestino.depositar(valor);
    }


}

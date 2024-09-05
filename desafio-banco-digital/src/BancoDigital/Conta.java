package BancoDigital;

public abstract class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int CONTADOR = 1;
    private static double SALDO_ESPECIAL = 800;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected double creditoEspecial;
    protected Cliente cliente;
    protected Banco banco;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = CONTADOR++;
        this.creditoEspecial = SALDO_ESPECIAL;
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

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public double getCreditoEspecial() {
        return creditoEspecial;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void sacar(double valor){
        if(this.saldo > 0){
            this.saldo -= valor;
        }else {
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

    public void usarCreditoEspecial(double valor){
        if(this.saldo == 0 && creditoEspecial > 0){
            this.creditoEspecial -= valor;
            this.saldo = valor * -1;
        }
    }

}

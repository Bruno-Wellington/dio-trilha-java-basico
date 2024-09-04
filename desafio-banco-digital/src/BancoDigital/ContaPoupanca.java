package BancoDigital;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", banco=" + banco.getNome()+
                '}';
    }
}

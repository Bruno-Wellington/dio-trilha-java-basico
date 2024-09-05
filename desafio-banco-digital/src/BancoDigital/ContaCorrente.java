package BancoDigital;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", creditoEspecial=" + creditoEspecial +
                ", banco=" + banco.getNome() +
                '}';
    }

//    @Override
//    public String toString() {
//        return "ContaCorrente{" +
//                "agencia=" + agencia +
//                ", numero=" + numero +
//                ", saldo=" + saldo +
//                ", banco=" + banco.getNome()+
//                '}';
//    }
}

package BancoDigital;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new ClienteCpf("Bruno","75689466125", "Bruno@gmail.com");
        Conta conta = new ContaCorrente(cliente);
        cliente.setConta(conta);

        Cliente cliente1 = new ClienteCnpj("Suan", "01976704000167", "Suan@gmail.com");
        Conta conta1 = new ContaPoupanca(cliente1);
        cliente1.setConta(conta1);

        Banco banco = new Banco("Nubank");
        banco.adicionarConta(conta);
        banco.adicionarConta(conta1);
        conta.setBanco(banco);
        conta1.setBanco(banco);

        conta.depositar(200);
        conta1.depositar(1000);

        conta1.transferir(300, conta);
        conta1.sacar(50);

        System.out.println(cliente);
        System.out.println(cliente1);
        System.out.println("---------------------------------------------");
        System.out.println(conta);
        System.out.println(conta1);
        System.out.println("---------------------------------------------");
        System.out.println(banco);
    }
}

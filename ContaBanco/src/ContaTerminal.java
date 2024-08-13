import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia, nomeCliente;
        double saldo;
    
        System.out.println("Por favor, digite o número da Agência:");
        numero = sc.nextInt();

        System.out.println("Por favor, digite a Agência:");
        agencia = sc.next();
        sc.nextLine();

        System.out.println("Por favor, digite o seu nome:");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o seu saldo:");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
            + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        sc.close();
    }
}

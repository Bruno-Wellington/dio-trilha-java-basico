import java.util.Locale;
import java.util.Scanner;

public class Codigo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome");
        String nome = sc.next();
        
        System.out.println("Digite o seu sobrenome");
        String sobrenome = sc.next();
        
        //Aqui poderemos estourar uma exceção caso o usuario digite por extenso o valor da idade, pois essa é uma variavel de Numeros inteiros
        System.out.println("Digite sua idade");
        int idade = sc.nextInt();
        
        //Aqui podemos estourar uma exceção caso o usuario coloque " , " em vez de " . " para separar as casas decimais, pois estamos usando o padrão Americano de formatação.
        System.out.println("Digite sua altura");
        double altura = sc.nextDouble();


        System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");

        sc.close();
    }

    //Exceções mais comuns de acontecer
    /*
     * java.lang.NullPointerException - Quando tentamos obter alguma informação de uma variavel que se encontra nula.
     * java.lang.ArithmeticException - Quando tentamos dividir um valor por zero.
     * java.sql.SQLException - Quando existe um erro relacionadoa interação com a base de dados.
     * java.io.FileNotFoundException - Quando tentamos ler ou escrever em um arquivo que nao existe.
     * java.util.InputMismatchException - Quando o valor digitado não corresponde ao padrão para o tipo esperado.
     */

    //Estrutura de um bloco try catch
    /*  try {
     *       //Bloco de codigo conforme esperado
     *
     *   }catch(Exception e){ //Precisamos saber qual exceção.
     *       //Bloco de codigo que captura as exceções que podem acontecer
     *       //em caso de um fluxo não precisto
     *   }
     */
}

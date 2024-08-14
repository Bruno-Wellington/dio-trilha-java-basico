import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        //João recebeu R$50,00 de mesada e foi em uma loja de doces gastar todo
        //o seu dinheiro, logo, ENQUANTO o valor dos doces não igualar a R$ 50,00
        //ele foi adicionando itens no carrinho.

        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            if(valorDoce > mesada){
                valorDoce = mesada;
            }
            System.out.println("Doce do valor: R$" + valorDoce + " adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("João gastou toda a sua mesada!");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}

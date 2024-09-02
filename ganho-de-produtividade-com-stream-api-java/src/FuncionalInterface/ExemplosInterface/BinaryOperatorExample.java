package FuncionalInterface.ExemplosInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
 * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
 */
public class BinaryOperatorExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
        BinaryOperator<Integer> somar = Integer::sum;

        // Usar o BinaryOperator para somar todos os números no Stream
        int result = numeros.stream()
                .reduce(0, somar);//identity representa uma variavel temporaria que irá iniciar com o valor zero, algo parecido com a variavel que usamos em um FOR para incrementar
        System.out.println("A soma dos números é: " + result);
        System.out.println();

        //ou de um modo mais compacto
        // Usar o BinaryOperator para somar todos os números no Stream
        int resultado = numeros.stream()
                //.reduce(0, (n1, n2) -> n1 + n2);
                .reduce(0, Integer::sum);

        // Imprimir o resultado da soma
        System.out.println("A soma dos números é: " + resultado);
    }
}

package DesafioStreamApi.Desafio04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.*/
public class Desafio {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0) // Filtra a Stream para manter apenas os números que são pares (ou seja, aqueles cujo resto da divisão por 2 é igual a 0)
                //.collect(Collectors.toList()) // Coleta os elementos filtrados em uma nova lista
                .toList(); //Coleta os elementos filtrados em uma nova lista
        System.out.println("Lista sem os numeros impares: " + numerosPares);
    }

}

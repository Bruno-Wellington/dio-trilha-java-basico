package DesafioStreamApi.Desafio02;

import java.util.*;
import java.util.stream.Collectors;

/*Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.*/
public class Desafio {
    private List<Integer> numeros;

    public Desafio() {
        this.numeros = new ArrayList<>();
    }

    public void somarNumerosPares(){
        numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaPares = numeros.stream()
                .filter(n -> (n % 2 == 0))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Soma total dos numeros pares: " + somaPares);
    }

    //Aqui estamos somando os numero usando o Set para que os numeros repetidos nao sejam somados
    public void somarSetNumerosPares(){
        numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Set<Integer> setNumerosPares = numeros.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toSet());

        int somaSetNumerosPares = setNumerosPares.stream()
                .filter(n -> (n % 2 == 0))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Soma total dos numeros pares sem repetição é: " + somaSetNumerosPares);
    }
}

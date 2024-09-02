package DesafioStreamApi.Desafio01;

import java.util.*;
import java.util.stream.Collectors;

/*Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.*/
public class Desafio {
    private List<Integer> numeros;

    public Desafio() {
        this.numeros = new ArrayList<>();
    }

    //Ordenação com Numeros repetidos devido ao uso do List
    public void OrdenarNumeros(){
        numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Ordenação usando List:");
        List<Integer> ordemNumerica = numeros.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(ordemNumerica);
    }

    //Ordenação sem numeros repetidos usando o Set
    public void OrdenarNumerosUnicos(){
        numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Ordenação usando Set:");
        Set<Integer> ordemNumericaSet = numeros.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toSet());
        System.out.println(ordemNumericaSet);
    }

}



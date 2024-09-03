package DesafioStreamApi.Desafio03;

import java.util.Arrays;
import java.util.List;

/*Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.*/
public class Desafio {
    private List<Integer> numeros;

    public void verificaPositivos (){
        numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //numeros = Arrays.asList(1, -2, 3, 4, -5, 6, 7, 8, -9, 10, 5, 4, -3);

        boolean numerosPositivos = numeros.stream()
                .allMatch(n -> n > 0); //allMatch: Verifica se todos os elementos da Stream atendem à condição especificada (neste caso, se cada número é maior que 0).
        System.out.println(numerosPositivos);

        if (numerosPositivos){
            System.out.println("Todos os numeros da lista são positivos");
        } else {
            System.out.println("Existem numeros negativos na lista");
        }
    }

}

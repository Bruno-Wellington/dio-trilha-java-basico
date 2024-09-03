package DesafioStreamApi.Desafio05;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;


/*Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.*/
public class Desafio {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalDouble media = numeros.stream()  //stream Cria uma Stream a partir da lista numeros
                .filter(n -> n > 5)  //filter Filtra a Stream para manter apenas os números maiores que 5
                .mapToInt(Integer::intValue)  //mapToInt Converte a Stream de Integer para IntStream, o que permite usar o método average.
                .average();  //average Calcula a média dos valores na IntStream e retorna um OptionalDouble, que pode ou não conter um valor.

        if (media.isPresent()){ //media.isPresent() Verifica se o OptionalDouble contém um valor.
            System.out.printf("A media dos numeros maiores que 5 é %.2f: ", media.getAsDouble());
        } else {
            System.out.println("Não há numeros maiores que 5 na lista!");
        }
    }
}

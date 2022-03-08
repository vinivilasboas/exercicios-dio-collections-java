package br.com.br.dio.collections.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

    public static void main(String[] args) {

        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos");

        numerosAleatorios.forEach(System.out::println);

        System.out.println("Coloque os 5 primeiros números dentro de um Set");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("transforme a lista de Strings em lista de inteiros");
        List<Integer> collectList = numerosAleatorios.stream().
                map(Integer::parseInt).
                collect(Collectors.toList());
        System.out.println(collectList);

        System.out.println("Coloque os números pares e maiores que 2 em uma lista");
        List<Integer> listParesmaiores =
        numerosAleatorios.stream().map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList());
        System.out.println(listParesmaiores);

        System.out.println("mostre a média");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores ímpares");
        collectList.removeIf(next -> next % 2 != 0);

    }

}

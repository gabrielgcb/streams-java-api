package main.java.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
* Representa uma função que aceita um argumento do tipo T e retorna um valor booleano
* È comumente usada para filtrar os elementos do Stream com base em alguma condição
* */

public class PredicateExample {
    public static void main(String[] args) {

        // Criar uma lista de palavras
        List<String> palavras = Arrays.asList("java", "csharp", "c", "typescript", "c++", "go", "javascript");

        // Criar um predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

//        List<String> listaFiltrada = palavras.stream()
//                .filter(palavra -> palavra.length() > 5)
//                .collect(Collectors.toList());

        // Usar o Stream para filtrar as palavraa que tem mais de 5 caracteres e, em seguida,
        // imprimir cada palavra que passou no filtro
        List<String> listaFiltrada = palavras.stream().filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.length() < 5;
                    }
                })
                .collect(Collectors.toList());

        listaFiltrada.forEach(System.out::println);
    }
}

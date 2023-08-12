package main.java.function;

/*
Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {

        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // Usar a Function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * numero;

        // Usar a função para dobrar todos os númeors na Stream e armazená-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .collect(Collectors.toList());

        // Imprimir a lista de números dobrados
        numerosDobrados.forEach(numero -> System.out.print(numero + " "));

    }
}

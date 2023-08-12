package main.java.binaryOperator;

import java.util.List;
import java.util.function.BinaryOperator;

/*
* Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T
* É utiliado para realizar operações de redução em pares de elementos, como somar números ou combinar objetos
* */

public class BinaryOperatorExample {
    public static void main(String[] args) {

        // Criar uma lista de números inteiros
        List<Integer> numeros  = List.of(1,2,3,4,5);

        // Usar p BinaryOperator com expressão lambda para somar dois números inteiros
        BinaryOperator<Integer> soma = (n1, n2) -> n1 + n2;

        // Usar o BinaryOperatorpara somar todos os números no Stream
        Integer resultado = numeros.stream().reduce(0, soma);

        // Imprimir todos os números
        System.out.println(resultado);

    }
}

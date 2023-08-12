package main.java.consumer;

/*
Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
É utilizado principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream, sem modificar,
ou retornar um valor.
*/

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        // Criar uma lista de números inteiros
        List<Integer> numeros = List.of(0,1,2,3,4,5,6,7,8,9);

        // Usar o Consumer com expressão para imprimir os números pares
//        Consumer<Integer> imprimirNumeroPar = numero -> {
//            if(numero % 2 == 0) {
//                System.out.print(numero + " ");
//            }
//        };

        // Usar o Consumer para imprimir os números pares no Stream
        numeros.stream().forEach(numero -> {
                if (numero % 2 == 0) {
                    System.out.print(numero + " ");
                }
            }
        );
    }
}

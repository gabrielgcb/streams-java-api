package main.java.supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
*/
public class SupplierExample {
    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Oi, tudo tranquilo?";

        // Usar o Supplier para obter uma lista com 5 saudações
//        List<String> listSaudacao = Stream.generate(saudacao)
//                .limit(5)
//                .collect(Collectors.toList());
        
        List<String> listSaudacao = Stream.generate(() -> "Opa, tudo bom?")
        .limit(5)
        .collect(Collectors.toList());       
        

        // Imprimir as saudações geradas
        listSaudacao.forEach(System.out::println);
    }
}

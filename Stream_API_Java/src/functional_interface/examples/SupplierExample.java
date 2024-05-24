package functional_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    /**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
    public static void main(String[] args) {
        
        // Usando o Supplier para obter a saudação
        Supplier<String> saudacao = () -> "Olá!, Seja bem vindo(a)";

         // Usar o Supplier para obter uma lista com 5 saudações
         List<String> listaSaudacao = Stream.generate(saudacao)//generate recebe um supplier
            .limit(5) // numero de repeticoes
            .toList(); //Colocando dentro de um list

        // Imprimir as saudações geradas
        listaSaudacao.forEach(System.out::println);

        
        
    }
}

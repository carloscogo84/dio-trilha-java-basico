package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

       /**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Usar a Function com expressão lambda para dobrar todos os números
                //Entrada-saida
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
            .map(dobrar) //mapear de um valor para outro
            .toList();

        // Imprimir a lista de números dobrados
        numerosDobrados.forEach(System.out::println);
        
    }
 

}

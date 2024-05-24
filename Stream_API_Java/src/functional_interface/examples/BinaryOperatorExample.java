package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    /**
 * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
 * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
 */

    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
        BinaryOperator<Integer> somar = (num1, num2) -> (num1 + num2);

        // Usar o BinaryOperator para somar todos os números no Stream
        int resultado = numeros.stream()
            .reduce(0, somar); //ident  ity - variavel temporaria, nesta caso somar - soma com o 0 e incrementa
       
        // Imprimir o resultado da soma
        System.out.println("A soma dos números é: " + resultado);

        System.out.println();

        //OUTRA FORMA DE FAZER
        BinaryOperator<Integer> somar1 = Integer::sum;
        int resultado1 = numeros.stream()
            .reduce(0, Integer::sum);
        
            System.out.println("A soma dos números é: " + resultado1);
        
        


    }
}

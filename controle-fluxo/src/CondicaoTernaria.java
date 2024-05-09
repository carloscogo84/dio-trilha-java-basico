public class CondicaoTernaria {
    public static void main(String[] args) {
        
        /*
         * Condição ternária
         * Como vimos em operadores, podemos abreviar nosso algoritmo condicional, 
         * refatorando com o conceito de operador ternário. Vamos refatorar os exemplos acima, 
         * para ilustrar o poder deste recurso:
         */

        int nota = 6;
        //                           IF         ELSE
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);


        int media = 4;
        String notaFinal = media >= 7 ? "Aprovado" : media >= 5 && media < 7 ? "Recuperação" : "Reprovado";
        System.out.println(notaFinal);
    
    }

        
    
}

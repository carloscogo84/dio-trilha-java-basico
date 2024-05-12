public class For_For_Each {
    public static void main(String[] args) throws Exception {

        /*
         * For
         * O comando for permite que uma variável contadora, seja testada e incrementada a 
         * cada iteração, sendo essas informações definidas na chamada do comando. 
         * O comando for recebe como entrada uma variável contadora, a condição para continuar
         * a execução e o valor de incrementação.
         */
        
        // Bloco de declaração - validação - incremento ou decremento
        for(int i=0; i <=20; i++){
            System.out.println("Contando " + i);
        }

        System.out.println("--------");

        // EXEMPLO DE FOR USANDO UM ARRAY

        //Array - Conjunto de elementos de um tipo correspondente
        // Em arrays sempre inicia em 0
       String alunos[] = {"Carlos", "Karen", "Mateus", "Vilmar"};

       //                    Tamanho
       for(int i=0; i<alunos.length; i++){
        System.out.println("O aluno no índice i=" + i + " é " + alunos[i]);
       }

       System.out.println();
       /*
        * For Each
        * O uso do for / each está fortemente relacionado, com um cenário onde contenha
        * um array ou coleção, e assim , a interação é baseada nos elementos da coleção.
        */

        // Para cada iteração de item no array o item atual , do indice atual, atualiza a variavel 
        for (String aluno : alunos){
            System.out.println("O nome do aluno é " + aluno);
        }
       
    }
}

public class CondicionaisCompostas {
    public static void main(String[] args) {
        
        /*
         * Condicionais Composta
         * Algumas vezes, o nosso programa deverá seguir mais de uma jornada de execução, 
         * condionado a uma regra de negócio, este cenário é demoninado Estrutura Condicional Composta.
         * Vejamos o exemplo abaixo:
         */

        int nota = 6;

        if(nota >= 7){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }



        double saldo = 25.0;
        double valorSolicitado = 17.0;
    
        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo " + saldo);
        }
        else{
            System.out.println("Saldo insulficiente");
        }
    }
    
}

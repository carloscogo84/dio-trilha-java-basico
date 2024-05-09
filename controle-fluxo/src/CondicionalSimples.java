public class CondicionalSimples {
    public static void main(String[] args) throws Exception {

        /*
         * Condicionais Simples
         * Quando ocorre uma validação de execução de fluxo, somente quando a condição for positiva, 
         * consideramos como uma estrutura Simples, exemplo:
         */
        
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
        
        System.out.println(saldo);
    }
}





public class CondicionaisEncadeadas {
    public static void main(String[] args) {
        
        /*
         * Condicionais encadeadas
         * Em um controle de fluxo condicional, nem sempre nos limitamos ao se (if) e senão (else), 
         * poderemos ter uma terceira, quarta e ou inúmeras condições.
         */
    
         int nota = 4;

         if(nota >= 7){
            System.out.println("Aprovado"); //true
         }
         else if(nota >= 5 && nota < 7){
            System.out.println("Recuperação"); //true or false
         }
         else{
            System.out.println("Reprovado");
         }


    }
}

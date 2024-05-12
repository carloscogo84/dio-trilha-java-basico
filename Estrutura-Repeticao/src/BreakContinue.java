public class BreakContinue {
    public static void main(String[] args) {

        //BREAK
        for(int numero=1; numero<=5; numero++){
            if(numero == 3){
                break;
            }
            System.out.println(numero);
        }
        System.out.println();

        //CONTINUE
        // Neste caso não imprimiu o número 3
        for(int i=1; i<=5; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }


        
    }
}


//Gera numeros aleatorios
import java.util.concurrent.ThreadLocalRandom;

/*
 * WHILE
 * O laço while (na tradução literal para a língua portuguesa “enquanto”) 
 * determina que, enquanto uma condição for válida, o bloco de código será executado. 
 * O laço while, testa a condição antes de executar o código, logo, caso a condição 
 * seja inválida no primeiro teste o bloco nem será executado.
 */
    


public class While {
    public static void main(String[] args) {
        
        double mesada = 50.0;
        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada){
                valorDoce = mesada;
            }
            System.out.println("Doce do valor: " + valorDoce + " Adicionado ao carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãzinho gastou toda sua mesada em doces");
    } 

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8); // gera um valor entre 2 e 8

    }
    
}

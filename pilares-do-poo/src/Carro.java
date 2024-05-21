public class Carro extends Veiculo{
    
    /*ENCAPUSALAMENTO - 
    Esconder ações que serão executadas somente dentro do própria classe
    */
    
    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado");
    }

    private void confereCombustivel(){
        System.out.println("Conferindo combustível");
    }

    private void confereCambio(){
        System.out.println("Conferindo cambio na posição P");
    }

}
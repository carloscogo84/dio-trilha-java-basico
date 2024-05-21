public class Autodromo {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setChassi("ABC-123");
        carro.ligar();

        System.out.println("-----");

        Moto moto = new Moto();
        moto.setChassi("DEF-456");
        moto.ligar();

        System.out.println("----");

        Veiculo coringa = moto;
        coringa.ligar();
        
        
    }
    
}

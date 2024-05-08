public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //criação de métodos
    //void - não retorna nada
    
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        //volume = volume + 1;
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }
    // Este novo canal somente e2 visível neste bloco de método, pois ele é um parametro
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
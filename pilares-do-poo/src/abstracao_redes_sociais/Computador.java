package abstracao_redes_sociais;

public class Computador {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        System.out.println("MSN MESSENGER");
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println();

        FacebookMessenger fcb = new FacebookMessenger();
        System.out.println("FACEBOOK");
        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println();

        Telegram telegram = new Telegram();
        System.out.println("TELEGRAM");
        telegram.enviarMensagem();
        telegram.receberMensagem();


    }
    
}

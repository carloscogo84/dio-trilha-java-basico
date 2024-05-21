package polimorfismo_redes_sociais;

import polimorfismo_redes_sociais.apps.FacebookMessenger;
import polimorfismo_redes_sociais.apps.MSNMessenger;
import polimorfismo_redes_sociais.apps.ServicomansagemInstantanea;
import polimorfismo_redes_sociais.apps.Telegram;

public class Computador {
    public static void main(String[] args) {
    ServicomansagemInstantanea smi = null;

    /*
     * Não se sabe qual app, mas qualquer um deverá enviar e receber mensagem
     */

     String appEscolhido = "tlg";

     if(appEscolhido.equals("msn")){
        smi = new MSNMessenger();
     }else if(appEscolhido.equals("fbm")){
        smi = new FacebookMessenger();
     }else if(appEscolhido.equals("tlg")){
        smi = new Telegram();
     }

     smi.enviarMensagem();
     smi.receberMensagem();


    }
    
}

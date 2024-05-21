package polimorfismo_redes_sociais.apps;

public class Telegram extends ServicomansagemInstantanea{
    public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
    
}

package heranca_redes_sociais;

public class ServicomansagemInstantanea {

    /*
     * HERANÇA
     * Características e comportamentos comuns, podem ser elevados e compartilhados através 
     * de uma hierarquia de objetos.
     * Exemplo: Um Carro e uma Motocicleta possuem propriedades como placa, chassi, ano de 
     * fabricação e métodos como acelerar e frear. Logo, para não ser um processo 
     * de codificação redundante, podemos desfrutar da herança criando uma classe Veículo para 
     * que seja herdada por Carro e Motocicleta.
     */

    public void enviarMensagem(){
        //primeiro confirmar se esta conectado a internet
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        //depois de enviada, salva o histórico da mensagem
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }

    //métodos privadas, visíveis somente na classe
    private void validarConectadoInternet(){
        System.out.println("Validando se está concectado a internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem");
    }

    
}

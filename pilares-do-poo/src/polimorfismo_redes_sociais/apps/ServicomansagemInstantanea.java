package polimorfismo_redes_sociais.apps;

/*
 * POLIMORFISMO 
 * São as inúmeras maneiras de se realizar uma mesma ação.
 * Exemplo: Veículo determina duas ações como acelerar e frear, primeiramente, precisamos 
 * identificar se estaremos nos referindo a Carro** ** ou Motocicleta, para determinar a lógica 
 * de aceleração e frenagem dos respectivos veículos.
 */

public abstract class ServicomansagemInstantanea {
    public abstract void enviarMensagem();
	public abstract void receberMensagem();


    //Somente os filhos conhecem esse metodo
    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }
}

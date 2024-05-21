package abstracao_redes_sociais;

/*
 * ABSTRAÇÃO
 * É a indisponibilidade, para determinar a lógica de um ou vários comportamentos, em um objeto.
 * Exemplo: Veículo** ** determina duas ações como acelerar e frear, logo, estes comportamentos 
 * deverão ser abstratos, pois existem mais de uma maneira de se realizar a mesma operação. 
 * ver Polimorfismo.
 */

public abstract class ServicomansagemInstantanea {
    public abstract void enviarMensagem();
	public abstract void receberMensagem();
}

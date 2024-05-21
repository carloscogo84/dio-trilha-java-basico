package lanchonete.area;

public class Cliente {
    public void escolherLanche() {
        System.out.println ("ESCOLHENDO 0 LANCHE" );
    }
    public void fazerPedido (){
        System.out.println ("FAZENDO 0 PEDIDO");
    }
    public void pagarConta(){
        consultarSaldoAplicativo();
        System.out. println("PAGANDO A CONTA" );
    }
    private void consultarSaldoAplicativo() {
        System.out. println ("CONSULTANDO SALDO NO APLICATIVO");
    } 
}

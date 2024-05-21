public abstract class Veiculo {

       /*HERANÇA
     Capacidade que se tem de disponibilizar recursos
    */
    private String chassi;
    
    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    /*
 * ABSTRAÇÃO
 * É a indisponibilidade para determinar a lógica de um ou vários comportamentos em um objeto
 */
    public abstract void ligar();

}

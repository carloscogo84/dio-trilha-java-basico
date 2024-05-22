package list.operacoes_basicas;

public class Item {
    //Atributos
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidae){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidae;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Nome = " + nome + 
                ", Preço=" + preco + 
                ", Quantidade=" + quantidade;
    }
}

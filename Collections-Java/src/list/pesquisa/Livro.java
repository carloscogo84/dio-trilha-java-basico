package list.pesquisa;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPulicacao;


    public Livro(String titulo, String autor, int anoPulicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPulicacao = anoPulicacao;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPulicacao() {
        return anoPulicacao;
    }


    @Override
    public String toString() {
        return "Livro - título: " + titulo + ", autor: " + autor + ", Ano de pulicacao: " + anoPulicacao;
    }

    

    
    
    
}

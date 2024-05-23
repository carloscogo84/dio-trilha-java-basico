package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //Atributo
    private Set<Contato> contatoSet;

    //Contrutor iniciando um HashSet vazio
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

   public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
   }

   public void exibirContato(){
        System.out.println(contatoSet);
   }

   public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato contato: contatoSet){
            if(contato.getNome().startsWith(nome)){
                contatoPorNome.add(contato);
            }
        }
        return contatoPorNome;
   }

   public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato contato: contatoSet){
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
   }

   public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.exibirContato();

    agendaContatos.adicionarContato("Camila", 123456);
    agendaContatos.adicionarContato("Camila", 5665);
    agendaContatos.adicionarContato("Camila Cavalcante", 111111);
    agendaContatos.adicionarContato("Camila DIO", 654987);
    agendaContatos.adicionarContato("Maria Silva", 111111);

    agendaContatos.exibirContato();

    System.out.println(agendaContatos.pesquisarPorNome("Camila"));

    System.out.println(agendaContatos.pesquisarPorNome("Maria Silva"));
    System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 555555));

    agendaContatos.exibirContato();


   }
}

    
    


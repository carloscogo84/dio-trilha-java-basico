package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    
    //Atributos
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }
    
    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if(!tarefasSet.isEmpty()){
            for(Tarefa tarefa: tarefasSet){
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = tarefa;
                    break;
                }
            }
            tarefasSet.remove(tarefaParaRemover);
        }else{
            System.out.println("O conjunto está vazio.");
        }

        if(tarefaParaRemover == null){
            System.out.println("Tarefa não encontrada.");
        }
    }

    public void exibirTarefas(){
        if(!tarefasSet.isEmpty()){
            System.out.println(tarefasSet);
        }else{
            System.out.println("Tarefa não encontrada.");
        }
    }

    public int contarTarefas(){
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : tarefasSet) {
          if (tarefa.isConcluida()) {
            tarefasConcluidas.add(tarefa);
          }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
        for(Tarefa tarefa: tarefasSet){
            if(!tarefa.isConcluida()){
                tarefasNaoConcluidas.add(tarefa);
            }
        }
        return tarefasNaoConcluidas;

    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa tarefa: tarefasSet){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setConcluida(true);
            }
        }
    }


    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t : tarefasSet) {
          if (t.getDescricao().equalsIgnoreCase(descricao)) {
            tarefaParaMarcarComoPendente = t;
            break;
          }
        }

        if(tarefaParaMarcarComoPendente != null){
            tarefaParaMarcarComoPendente.setConcluida(false);

        }else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    public void limparListaTarefas() {
        if(tarefasSet.isEmpty()) {
          System.out.println("A lista já está vazia!");
        } else {
          tarefasSet.clear();
        }
    }
    
    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
    ListaTarefas listaTarefas = new ListaTarefas();

    // Adicionando tarefas à lista
    listaTarefas.adicionarTarefa("Estudar Java");
    listaTarefas.adicionarTarefa("Fazer exercícios físicos");
    listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
    listaTarefas.adicionarTarefa("Ler livro");
    listaTarefas.adicionarTarefa("Preparar apresentação");

    // Exibindo as tarefas na lista
    listaTarefas.exibirTarefas();

    // Removendo uma tarefa
    listaTarefas.removerTarefa("Fazer exercícios físicos");
    listaTarefas.exibirTarefas();

    // Contando o número de tarefas na lista
    System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

    // Obtendo tarefas pendentes
    System.out.println(listaTarefas.obterTarefasPendentes());

    // Marcando tarefas como concluídas
    listaTarefas.marcarTarefaConcluida("Ler livro");
    listaTarefas.marcarTarefaConcluida("Estudar Java");

    // Obtendo tarefas concluídas
    System.out.println(listaTarefas.obterTarefasConcluidas());

    // Marcando tarefas como pendentes
    listaTarefas.marcarTarefaPendente("Estudar Java");
    listaTarefas.exibirTarefas();

    // Limpando a lista de tarefas
    listaTarefas.limparListaTarefas();
    listaTarefas.exibirTarefas();
  
    }
}

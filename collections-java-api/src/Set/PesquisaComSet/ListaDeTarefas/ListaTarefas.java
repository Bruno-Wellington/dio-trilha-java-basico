package Set.PesquisaComSet.ListaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao) ){
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        } else {
            System.out.println("Tarefa nao encontrada, pois o Set esta vazio!");
        }

        if(tarefaParaRemover == null){
            System.out.println("Tarefa nao encontrada!");
        }
    }

    /*public void removerTarefa(String descricao){
        if(tarefaSet.contains(descricao)){
            tarefaSet.remove(descricao);
        } else {
            System.out.println("Tarefa não encontrada no conjunto!");
        }
    }*/

    public void exibirTarefas(){
        if (!tarefaSet.isEmpty()){
            System.out.println(tarefaSet);

        } else {
            System.out.println("Nenhuma tarefa encontrada!");
        }
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public void marcarTarefaConcluida(String descricao){
        if (!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluida(true);
                }
            }
        } else {
            System.out.println("Tarefa nao encontrada, pois o Set esta vazio!");
        }

    }

    public void marcarTarefaPendente(String descricao){
        if (!tarefaSet.isEmpty()){
            Tarefa tarefaPendente = null;
            for(Tarefa t : tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    //t.setConcluida(false);
                    tarefaPendente = t;
                    break;
                }
            }

            if(tarefaPendente != null){
                if (tarefaPendente.isConcluida()){
                    tarefaPendente.setConcluida(false);
                }
            } else {
                System.out.println("Tarefa não encontrada na lista!");
            }

        } else {
            System.out.println("Tarefa nao encontrada, pois o Set esta vazio!");
        }
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        if (!tarefaSet.isEmpty()){
            Set<Tarefa> tarefasConcluidas = new HashSet<>();
            for(Tarefa t : tarefaSet){
                if(t.isConcluida()){
                    tarefasConcluidas.add(t);
                }
            }
            return tarefasConcluidas;
        } else {
            throw new RuntimeException("Tarefa nao encontrada, pois o Set esta vazio!");
        }
    }

    public Set<Tarefa> obterTarefasPendentes(){
        if (!tarefaSet.isEmpty()){
            Set<Tarefa> tarefasPendentes = new HashSet<>();
            for(Tarefa t : tarefaSet){
                if(!t.isConcluida()){
                    tarefasPendentes.add(t);
                }
            }
            return tarefasPendentes;
        } else {
            throw new RuntimeException("Tarefa nao encontrada, pois o Set esta vazio!");
        }
    }

    public void limparListaTarefas(){
        if (!tarefaSet.isEmpty()){
            tarefaSet.removeAll(tarefaSet);

        } else {
            System.out.println("Nenhuma tarefa encontrada, pois o Set esta vazio!");
        }
    }
}

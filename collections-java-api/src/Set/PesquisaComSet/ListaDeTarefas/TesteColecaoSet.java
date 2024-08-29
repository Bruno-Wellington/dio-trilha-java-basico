package Set.PesquisaComSet.ListaDeTarefas;

public class TesteColecaoSet {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        // Exibindo tarefas
        listaTarefas.exibirTarefas();


        // adicionando tarefas
        System.out.println("Tarefas adicionadas:");
        listaTarefas.adicionarTarefa("Tirar lixo");
        listaTarefas.adicionarTarefa("Varrer casa");
        listaTarefas.adicionarTarefa("Lavar carro");
        listaTarefas.adicionarTarefa("Lavar moto");
        listaTarefas.adicionarTarefa("Lavar roupas");
        listaTarefas.exibirTarefas();
        // Mostrando a quantidade atual de tarefas
        System.out.println("Quantidade de tarefas: " + listaTarefas.contarTarefas());
        System.out.println();


        // Removendo uma tarefa
        System.out.println("Removendo tarefa Lavar roupas");
        listaTarefas.removerTarefa("Lavar roupas");
        // Exibindo tarefas
        listaTarefas.exibirTarefas();
        // Monstrando a quantidade de tarefas
        System.out.println("Quantidade de tarefas: " + listaTarefas.contarTarefas());
        System.out.println();


        // Marcar tarefa como concluida
        System.out.println("Marcando tarefas 'Varrer casa, Lavar carro e Tirar lixo' como concluida");
        listaTarefas.marcarTarefaConcluida("Tirar lixo");
        listaTarefas.marcarTarefaConcluida("Varrer casa");
        listaTarefas.marcarTarefaConcluida("Lavar carro");
        // Exibindo tarefas
        listaTarefas.exibirTarefas();
        System.out.println();

        // obtendo tarefas concluidas
        System.out.println("Obtendo tarefas concluidas");
        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println();


        // Marcar tarefa como Pendente
        System.out.println("Marcando tarefa 'Varrer casa' como pendente");
        listaTarefas.marcarTarefaPendente("Varrer casa");
        // Exibindo tarefas
        listaTarefas.exibirTarefas();
        System.out.println();

        // Exibindo tarefas pendentes
        System.out.println("Obtendo tarefas pendentes");
        System.out.println(listaTarefas.obterTarefasPendentes());
        System.out.println();


        // Exibindo tarefas
        System.out.println("Resultado final do Set antes de remover tudo");
        listaTarefas.exibirTarefas();
        System.out.println();


        // Limpando todas as tarefas do Set
        System.out.println("Limpando todo o Set");
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();

    }
}

package Set.OrdenacaoComSet.GerenciadorDeAlunos;

import Set.OrdenacaoComSet.CadastroDeProdutos.CadastroProdutos;

public class TesteColecaoSet {
    public static void main(String[] args) {
        // Criando uma instância do GerenciadoAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando Alunos ao cadastro
        gerenciadorAlunos.adicionarAluno("Bruno", 1000L, 7.0);
        gerenciadorAlunos.adicionarAluno("Patricia", 1002L, 8.0);
        gerenciadorAlunos.adicionarAluno("Suan", 1000L, 10.0);
        gerenciadorAlunos.adicionarAluno("Renato", 1003L, 5.5);
        gerenciadorAlunos.adicionarAluno("Lucas", 1004L, 9.0);

        // Exibindo todos os alunos no cadastro
        System.out.println("Exibindo todos os Alunos");
        gerenciadorAlunos.exibirAlunos();
        System.out.println();

        // Exibindo alunos ordenados pelo nome
        System.out.println("Exibindo os alunos ordenados pelo nome");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println();

        // Exibindo alunos ordenados pola nota
        System.out.println("Exibindo os alunos ordenados pela nota");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}

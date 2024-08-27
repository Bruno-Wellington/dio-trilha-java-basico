package List.OrdenacaoEmList;

public class TesteList {
    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        // Adicionando pessoas à lista
        ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

        // Exibindo a lista de pessoas adicionadas
        System.out.println("Imprimindo a Lista:");
        System.out.println(ordenacaoPessoas.getPessoaList());
        System.out.println();

        // Ordenando e exibindo por idade
        System.out.println("Ordenando por Idade:");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println();
        
        // Ordenando e exibindo por altura
        System.out.println("Ordenando por Altura:");
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}

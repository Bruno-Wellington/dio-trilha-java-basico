package Map.PesquisaComMap.EstoqueDeProdutosComPreco;

public class TesteMap {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        //Exibindo produtos
        estoqueProdutos.exibirProdutos();

        //Adicionando produtos
        estoqueProdutos.adicionarProduto(1001L, "Memoria", 2, 250 );
        estoqueProdutos.adicionarProduto(1002L, "Ssd 500gb", 6, 500 );
        estoqueProdutos.adicionarProduto(1001L, "Celular", 2, 1000 );
        estoqueProdutos.adicionarProduto(1003L, "Notebook", 1, 1500 );
        estoqueProdutos.adicionarProduto(1004L, "Monitor", 4, 3500 );
        estoqueProdutos.adicionarProduto(1005L, "Placa de video", 3, 3600 );
        System.out.println();

        //Exibindo produtos
        estoqueProdutos.exibirProdutos();
        System.out.println();

        //Obtendo valor total do estoque
        System.out.println("Valor total do estoque");
        System.out.println(estoqueProdutos.calcularValorTotalEstoque());
        System.out.println();

        //Obtendo o produto mais caro
        System.out.println("Produto mais caro");
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
        System.out.println();

        //Obtendo o produto mais barato
        System.out.println("Produto mais barato");
        System.out.println(estoqueProdutos.obterProdutoMaisBarato());
        System.out.println();

        //Obtendo o produto com maior valor no estoque considerando quantidade * valor
        System.out.println("Produto com maior valor no estoque considerando quantidade * valor");
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}

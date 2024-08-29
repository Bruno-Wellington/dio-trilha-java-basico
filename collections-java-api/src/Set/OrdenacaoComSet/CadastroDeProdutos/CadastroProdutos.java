package Set.OrdenacaoComSet.CadastroDeProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    //Para esse metodo foi implementado o uso do Comparable na classe produto
    //No Set nao utilizamos o Collections como é feito no List, pois no list ele recebe uma lista e ordena, e no Set precisamos de uma coleção
    //e para isso usamos o TreeSet<>(Passanado aqui a coleção)
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    //Para esse metodo coo estamos usando o Comparator iremos passar ele como argumento
    //no TreeSet<>()
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return  produtosPorPreco;
    }

    public void exibirTodosProdutos(){
        System.out.println(produtoSet);
    }
}

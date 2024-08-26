package List.OperacoesBasicas.CarrinhoCompras;

public class TestList {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.adicionarItem("CELULAR",1000,2);
        carrinhoDeCompras.adicionarItem("NOTEBOOK",3000,2);
        carrinhoDeCompras.exibirItens();

        System.out.println("valor total = R$" + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("celular");
        carrinhoDeCompras.exibirItens();

        System.out.println("valor total = R$" + carrinhoDeCompras.calcularValorTotal());
    }
}

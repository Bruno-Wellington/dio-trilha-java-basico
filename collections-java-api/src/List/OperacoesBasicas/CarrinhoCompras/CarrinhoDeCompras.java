package List.OperacoesBasicas.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItemCarrinho;

    public CarrinhoDeCompras() {
        this.listaItemCarrinho =  new ArrayList<>();

    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItemCarrinho.add(new Item(nome, preco, quantidade));

    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if(!listaItemCarrinho.isEmpty()){
            for(Item i : listaItemCarrinho ){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(i);
                }
            }
            listaItemCarrinho.removeAll(itensParaRemover);

        } else {
            System.out.println("A lista esta vazia!");

        }

    }

    public double calcularValorTotal(){
       double total = 0;
       if(!listaItemCarrinho.isEmpty()){
           for(Item i : listaItemCarrinho){
               double subTotal = i.getPreco() * i.getQuantidade();
               total += subTotal;
           }
           return total;

       }else {
           throw new RuntimeException("A lista esta vazia!");

       }
    }

    public void exibirItens(){
        System.out.println(listaItemCarrinho);

    }
}

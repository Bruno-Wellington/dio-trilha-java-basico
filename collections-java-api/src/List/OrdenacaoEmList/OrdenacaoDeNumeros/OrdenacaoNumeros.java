package List.OrdenacaoEmList.OrdenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numerosLits;

    public OrdenacaoNumeros() {
        this.numerosLits = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numerosLits.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(this.numerosLits);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendente = new ArrayList<>(this.numerosLits);
        numerosDescendente.sort(Collections.reverseOrder());
        return numerosDescendente;
    }

    public void exibirNumeros(){
        System.out.println(this.numerosLits);
    }

}

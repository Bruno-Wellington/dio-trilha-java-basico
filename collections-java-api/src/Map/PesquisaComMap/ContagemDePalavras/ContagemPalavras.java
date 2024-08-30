package Map.PesquisaComMap.ContagemDePalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if (!palavrasMap.isEmpty()){
            palavrasMap.remove(palavra);
        } else {
            System.out.println("O Map esta vazio!");
        }
    }

    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        if (!palavrasMap.isEmpty()){
            for (int contagem : palavrasMap.values()) {
                contagemTotal += contagem;
            }
        } else {
            System.out.println("O Map esta vazio!");
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        if (!palavrasMap.isEmpty()){
            for(Map.Entry<String, Integer> entry : palavrasMap.entrySet()){
                if (entry.getValue() > maiorContagem){
                    maiorContagem = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
        } else {
            System.out.println("O Map esta vazio!");
        }
        return palavraMaisFrequente;
    }

}

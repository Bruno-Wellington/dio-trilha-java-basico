package Set.OperacoesBasicas.ConjuntoDePalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(palavra);
    }

    /*public void removerPalavra(String palavra){
        String palavraParaRemover = null;
        for(String p : palavrasUnicasSet){
            if(p.equalsIgnoreCase(palavra) ){
                palavraParaRemover = p;
                break;
            }
        }
        palavrasUnicasSet.remove(palavraParaRemover);
    }
    */

    //correção removerPalavra
    public void removerPalavra(String palavra){
        if (palavrasUnicasSet.contains(palavra)) {
            palavrasUnicasSet.remove(palavra);
        } else {
            System.out.println("Palavra não encontrada no conjunto!");
        }
    }

    /*
    //Esse metodo que fiz ele compara melhor pois ele iginora a forma que foi escrita a palavra
    public boolean verificarPalavra(String palavra){
        boolean palavraVerificadar = false;
        for(String p : palavrasUnicasSet) {
            if (p.equalsIgnoreCase(palavra)) {
                palavraVerificadar = true;
            }
        }
        return palavraVerificadar;
    }
    */

    //Correção verificarPalavra
    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }


    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicasSet);
    }
}

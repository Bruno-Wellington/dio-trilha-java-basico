package Set.OperacoesBasicas.ConjuntoDePalavrasUnicas;

public class TesteColecaoSet {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        //Adicionando uma palavra no conjunto
        System.out.println("Adicionando palavras");
        conjuntoPalavrasUnicas.adicionarPalavra("Amor");
        conjuntoPalavrasUnicas.adicionarPalavra("Tempo");
        conjuntoPalavrasUnicas.adicionarPalavra("Morte");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        //Removendo uma palavra do conjunto
        System.out.println();
        System.out.println("Removendo palavra");
        conjuntoPalavrasUnicas.removerPalavra("Tempo");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        //Verificando se a palavra esta no conjunto
        System.out.println();
        conjuntoPalavrasUnicas.verificarPalavra("amor");
        System.out.println("A palavra 'Tempo' esta no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Tempo"));
        System.out.println("A palavra 'Amor' esta no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Amor"));
    }
}

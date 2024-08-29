package Map.OperacoesBasicas.Dicionario;

import Map.OperacoesBasicas.AgendaDeContatos.AgendaContatos;

public class TesteMap {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        //Exibindo palavras
        dicionario.exibirPalavras();

        //Adicionando palavras no map
        dicionario.adicionarPalavra("Bruno", "Significa Moreno ou escuro");
        dicionario.adicionarPalavra("Patricia", "Significa Parica ou nobre");
        dicionario.adicionarPalavra("Suan", "Significa luz");
        dicionario.adicionarPalavra("Renato", "Significa renascido ou ressuscitado");
        dicionario.adicionarPalavra("Ivalmir Jose", "Significa escolhido por sua fama");
        dicionario.adicionarPalavra("Bruno", "Significa Escuro ou Moreno");

        //Exibindo palavras
        System.out.println("Exibindo palavras");
        dicionario.exibirPalavras();
        System.out.println();

        //Removendo palavras
        System.out.println("Removendo palavra");
        dicionario.removerPalavra("Ivalmir Jose");
        dicionario.exibirPalavras();
        System.out.println();

        //Pesquisando palavras por nome
        System.out.println("Pesquisando palavras pelo nome");
        System.out.println("A definição da palavra é: " + dicionario.pesquisarPorPalavra("Bruno"));
    }
}

package List.PesquisaComList.CatalogoLivros;

public class TesteList {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("LIVRO 1", "AUTOR 1", 2020);
        catalogoLivros.adicionarLivro("LIVRO 1", "AUTOR 2", 2021);
        catalogoLivros.adicionarLivro("LIVRO 2", "AUTOR 2", 2022);
        catalogoLivros.adicionarLivro("LIVRO 3", "AUTOR 3", 2023);
        catalogoLivros.adicionarLivro("LIVRO 4", "AUTOR 4", 1996);

        //Pesquisando por Autor
        System.out.println(catalogoLivros.pesquisarPorAutor("AUTOR 2"));

        //Pesquisando por Intervalo de anos
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));

        //Pesquisando pelo primeiro titulo que aparecer na lista
        System.out.println(catalogoLivros.pesquisarPorTitulo("livro 1"));
    }
}

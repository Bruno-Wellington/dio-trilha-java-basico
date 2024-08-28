package List.PesquisaComList.CatalogoLivros;

public class Livro {
    private String título;
    private String autor;
    private int anoPublicacao;

    public Livro(String título, String autor, int anoPublicacao) {
        this.título = título;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTítulo() {
        return título;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "{título=" + título +
                ", autor=" +
                ", ano=" + anoPublicacao + "}";
    }
}

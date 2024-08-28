package Set.ConjuntoDeConvidados;

public class TesteColecaoSet {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de coleções!");

        System.out.println();
        System.out.println("Adicionando convidados");
        conjuntoConvidados.adicionarConvidado("Alice", 1234);
        conjuntoConvidados.adicionarConvidado("Bob", 1235);
        conjuntoConvidados.adicionarConvidado("Charlie", 1235);
        conjuntoConvidados.adicionarConvidado("David", 1236);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de coleções!");
        System.out.println("Imprimindo Set de convidados");
        conjuntoConvidados.exibirConvidados();

        System.out.println();
        System.out.println("Removendo convidado");
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de coleções!");
        conjuntoConvidados.exibirConvidados();

        System.out.println();
        System.out.println("A quantidade final de convidados é: " + conjuntoConvidados.contarConvidados());
    }
}

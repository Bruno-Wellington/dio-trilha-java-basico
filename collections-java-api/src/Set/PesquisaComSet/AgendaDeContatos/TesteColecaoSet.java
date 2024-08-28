package Set.PesquisaComSet.AgendaDeContatos;

public class TesteColecaoSet {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        //Mostrando a agenda de contatos no conjunto
        agendaContatos.exibirContatos();

        //Adicionando contatos à agenda
        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Ana", 88889999);
        agendaContatos.adicionarContato("Fernando", 77778888);
        agendaContatos.adicionarContato("Carolina", 55555555);

        System.out.println("Coleção de contatos:");
        agendaContatos.exibirContatos();
        System.out.println();

        //Pesquisando contatos pelo nome dentro da coleção
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));
        System.out.println();

        //Atualizando o numero de um contato dentro de uma coleção
        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);
        System.out.println();

        System.out.println("Contatos apos a Atualização");
        agendaContatos.exibirContatos();
    }
}

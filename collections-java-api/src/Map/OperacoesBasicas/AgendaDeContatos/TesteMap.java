package Map.OperacoesBasicas.AgendaDeContatos;

public class TesteMap {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        //Exibindo contatos
        agendaContatos.exibirContatos();

        //Adicionando contatos no map
        //Na hora de adicionar na lista o map nao obedece uma ordem
        agendaContatos.adicionarContato("Bruno", 81406615);
        agendaContatos.adicionarContato("Patricia", 91625718);
        agendaContatos.adicionarContato("Suna", 82556613);
        agendaContatos.adicionarContato("Renato", 81531514);
        agendaContatos.adicionarContato("Ivalmir Jose", 96125115);
        //Aqui o metodo PUT ira atualizar o contato sobrescrevendo o primeiro acima, diferente do Metodo Set que traz a primeira informação com o valor e iginora as seguintes
        agendaContatos.adicionarContato("Bruno", 86166621);

        //Exibindo contatos
        System.out.println("Exibindo agenda de contatos");
        agendaContatos.exibirContatos();
        System.out.println();

        //Removendo contato
        System.out.println("Removendo contato");
        agendaContatos.removerContato("Ivalmir Jose");
        agendaContatos.exibirContatos();
        System.out.println();

        //Pesquisando contato por nome
        System.out.println("Pesquisando contato pelo nome");
        System.out.println("O numero do contato é: " + agendaContatos.pesquisarPorNome("Bruno"));
    }
}

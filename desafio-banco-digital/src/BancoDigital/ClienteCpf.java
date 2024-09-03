package BancoDigital;

public class ClienteCpf extends Cliente {

    private String cpf;

    public ClienteCpf(String nome, String cpfCnpj) {
        super(nome);
        this.cpf = cpfCnpj;
    }
}

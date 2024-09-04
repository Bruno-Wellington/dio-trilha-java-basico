package BancoDigital;

public class ClienteCpf extends Cliente {

    private String cpf;

    public ClienteCpf(String nome, String cpf, String email) {
        super(nome,email);

        if(cpf.length() == 11){
            this.cpf = cpf;
        } else {
            System.out.println("A quantidade de digitos do cpf é invalido!");
        }
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "ClienteCpf{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", conta=" + conta +
                '}';
    }
}

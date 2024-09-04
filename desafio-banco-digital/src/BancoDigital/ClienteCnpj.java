package BancoDigital;

public class ClienteCnpj extends Cliente {

    private String cnpj;

    public ClienteCnpj(String nome, String cnpj, String email) {
        super(nome, email);

        if(cnpj.length() == 14){
            this.cnpj = cnpj;
        } else {
            System.out.println("A quantidade de digitos do cnpj é invalido!");
        }
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String toString() {
        return "ClienteCnpj{" +
                "cnpj='" + cnpj + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", conta=" + conta +
                '}';
    }

}

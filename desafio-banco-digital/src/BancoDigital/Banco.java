package BancoDigital;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    private String nome;
    private Set<Conta> contaList;

    public Banco(String nome) {
        this.nome = nome;
        this.contaList = new HashSet<>();
    }

    public void adicionarConta(Conta conta){
        contaList.add(conta);
    }

    public Set<Conta> getContaList() {
        return contaList;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", contaList=" + contaList +
                '}';
    }
}

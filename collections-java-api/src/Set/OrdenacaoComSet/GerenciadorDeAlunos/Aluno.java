package Set.OrdenacaoComSet.GerenciadorDeAlunos;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private long matrícula;
    private double nota;

    public Aluno(String nome, long matrícula, double nota) {
        this.nome = nome;
        this.matrícula = matrícula;
        this.nota = nota;
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    public String getNome() {
        return nome;
    }

    public long getMatrícula() {
        return matrícula;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matrícula == aluno.matrícula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matrícula);
    }

    @Override
    public String toString() {
        return "{nome=" + nome +
                ", matrícula=" + matrícula +
                ", nota=" + nota +
                "} \n";
    }
}

class ComparatorPorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }
}

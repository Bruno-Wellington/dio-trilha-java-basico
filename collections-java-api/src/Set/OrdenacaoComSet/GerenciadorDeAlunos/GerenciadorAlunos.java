package Set.OrdenacaoComSet.GerenciadorDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunosSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        if (!alunosSet.isEmpty()){
            if(alunosSet.contains(matricula)){
                alunosSet.remove(matricula);
            } else {
                System.out.println("Matricula nao encontrada");
            }
        } else {
            System.out.println("A coleção Set está vazia!");
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        if (!alunosSet.isEmpty()){
            Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
            return alunosPorNome;
        } else {
            throw new RuntimeException("A coleção Set está vazia!");
        }
    }

    public Set<Aluno> exibirAlunosPorNota(){
        if (!alunosSet.isEmpty()){
            Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
            alunosPorNota.addAll(alunosSet);
            return alunosPorNota;
        } else {
            throw new RuntimeException("A coleção Set está vazia!");
        }
    }

    public void exibirAlunos(){
        System.out.println(alunosSet);
    }
}

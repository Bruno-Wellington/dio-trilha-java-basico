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
            Aluno alunoParaRemover = null;
            for(Aluno a : alunosSet){
                if(a.getMatrícula() == matricula){
                    alunoParaRemover = a;
                    break;
                }
            }
            alunosSet.remove(alunoParaRemover);
        } else {
            throw new RuntimeException("A coleção Set está vazia!");
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

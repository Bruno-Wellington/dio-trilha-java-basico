import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Descrição curso C#");
        curso2.setCargaHoraria(18);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria do curso java");
        mentoria1.setDescricao("Descrição mentoria do curso java");
        mentoria1.setData(LocalDate.now());//LocalDate.now() atribui a data de criação á data atual.

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria do curso c#");
        mentoria2.setDescricao("Descrição mentoria do curso C#");
        mentoria2.setData(LocalDate.now());//LocalDate.now() atribui a data de criação á data atual.

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);
//        System.out.println(mentoria2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno Wellington");
        devBruno.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos de " + devBruno.getNome() + ": " + devBruno.getConteudosInscritos());

        devBruno.progredir();
        devBruno.progredir();
        System.out.println("---");
        System.out.println("Conteudos Incritos de " + devBruno.getNome() + ": " + devBruno.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de " + devBruno.getNome() + ": " + devBruno.getConteudosConcluidos());
        System.out.println("XP:" + devBruno.calcularTotalXp());


        System.out.println("----------------------------------------------------------");
        Dev devEvandro = new Dev();
        devEvandro.setNome("Evandro Marques");
        devEvandro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos de " + devEvandro.getNome() + ": " + devEvandro.getConteudosInscritos());

        devEvandro.progredir();
        devEvandro.progredir();
        devEvandro.progredir();
        System.out.println("---");
        System.out.println("Conteudos Incritos de " + devEvandro.getNome() + ": " + devEvandro.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de " + devEvandro.getNome() + ": " + devEvandro.getConteudosConcluidos());
        System.out.println("XP:" + devEvandro.calcularTotalXp());
    }
}

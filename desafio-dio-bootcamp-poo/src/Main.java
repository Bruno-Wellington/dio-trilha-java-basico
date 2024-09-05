import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);
    }
}

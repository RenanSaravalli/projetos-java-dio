import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso JAVA");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JAVASCRIPT");
        curso2.setCargaHoraria(5);

        Mentoria mentoria =  new Mentoria();

        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria JAVA");
        mentoria.setData(LocalDate.now());


       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); ?*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev renan = new Dev();
        renan.setNome("Renan");
        renan.inscreverBootcamp(bootcamp);
        renan.progredir();

        System.out.println("Conteúdos inscritos de Renan: " + renan.getConteudosInscritos());
        System.out.println("Conteudos concluidos de Renan: " + renan.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos de Renan: " + renan.getConteudosInscritos());
        System.out.println("XP: " + renan.calcularXp());

        renan.progredir();

        System.out.println("XP: " + renan.calcularXp());

    }
}

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

/*        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRodrigo = new Dev();
        devRodrigo.setNome("Rodrigo");
        devRodrigo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Rodrigo: " + devRodrigo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Rodrigo: " + devRodrigo.getConteudosConcluidos());
        devRodrigo.progredir();
        devRodrigo.progredir();
        System.out.println("Conteúdos inscritos Rodrigo: " + devRodrigo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Rodrigo: " + devRodrigo.getConteudosConcluidos());
        System.out.println("XP: " + devRodrigo.calcularTotalXp());

        Dev devArthur = new Dev();
        devArthur.setNome("Arthur");
        devArthur.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Arthur: " + devArthur.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Arthur: " + devArthur.getConteudosConcluidos());
        devArthur.progredir();
        devArthur.progredir();
        devArthur.progredir();
        devArthur.progredir();
        System.out.println("Conteúdos inscritos Arthur: " + devArthur.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Arthur: " + devArthur.getConteudosConcluidos());
        System.out.println("XP: " + devArthur.calcularTotalXp());
    }
}
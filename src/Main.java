import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJuliana = new Dev();
        devJuliana.setNome("Juliana");
        devJuliana.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Juliana: " + devJuliana.getConteudosInscritos());

        devJuliana.progredir();
        devJuliana.progredir();
        System.out.println("-");

        System.out.println("Conteudos Inscritos Juliana: " + devJuliana.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Juliana: " + devJuliana.getConteudosConcluidos());
        System.out.println("XP: " + devJuliana.calcularTotalXp());

        System.out.println("----------------------------");

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Gabriel: " + devGabriel.getConteudosInscritos());

        devGabriel.progredir();
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("-");

        System.out.println("Conteudos Inscritos Gabriel: " + devGabriel.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Gabriel: " + devGabriel.getConteudosConcluidos());
        System.out.println("XP: " + devGabriel.calcularTotalXp());



    }
}
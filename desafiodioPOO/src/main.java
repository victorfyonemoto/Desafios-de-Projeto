import br.com.dio.desafio.dominio.*;

import java.time.LocalDateTime;

public class main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java POO");
        curso1.setDescricao("Este Curso foi destinado ao estudo de java POO");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java POO 2");
        curso2.setDescricao("Avançando na POO");
        curso2.setCargaHoraria(6);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("MentoriaJava POO 2");
        mentoria1.setDescricao("Primeira parte da Mentoria Java POO");
        mentoria1.setData(LocalDateTime.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bem vindo ao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devVictor = new Dev();
        devVictor.setNome("Victor");
        devVictor.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos - Victor:" + devVictor.getConteudoInscritos());

        devVictor.progredir();
        devVictor.progredir();
        devVictor.progredir();

        System.out.println("-----------------------Progresso--------------------------");
        System.out.println("Conteúdos inscritos - Victor:" + devVictor.getConteudoInscritos());
        System.out.println("Conteúdos concluídos - Victor:" + devVictor.getConteudosConcluidos());
        System.out.println("XP :" + devVictor.calcularTotalXP());

        System.out.println("-------------------------------------------------");

        Dev devMonica = new Dev();
        devMonica.setNome("Monica");
        devMonica.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos - Monica:" + devMonica.getConteudoInscritos());

        devMonica.progredir();
        devMonica.progredir();

        System.out.println("-----------------------Progresso--------------------------");
        System.out.println("Conteúdos inscritos - Monica:" + devMonica.getConteudoInscritos());
        System.out.println("Conteúdos concluídos - Monica:" + devMonica.getConteudosConcluidos());
        System.out.println("XP :" + devMonica.calcularTotalXP());


    }
}
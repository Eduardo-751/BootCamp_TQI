package Main;

import java.time.LocalDate;

import Model.*;

public class MainApplication {

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
	        mentoria.setTitulo("mentoria java");
	        mentoria.setDescricao("descricao mentoria java");
	        mentoria.setData(LocalDate.now());

//	        System.out.println(curso1);
//	        System.out.println(curso2);
//	        System.out.println(mentoria);
//	        System.out.println(curso1.calcularXp());
//	        System.out.println(curso2.calcularXp());
//	        System.out.println(mentoria.calcularXp());

	        Bootcamp bootcamp = new Bootcamp();
	        bootcamp.setNome("Bootcamp java developer");
	        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
	        bootcamp.getConteudos().add(curso1);
	        bootcamp.getConteudos().add(curso2);
	        bootcamp.getConteudos().add(mentoria);

	        Dev devEduardo = new Dev();
	        devEduardo.setNome("Eduardo");
	        devEduardo.inscreverBootcamp(bootcamp);
	        System.out.println("Contéudos inscritos " + devEduardo.getNome() + ": " + devEduardo.getConteudoInscritos());
	        devEduardo.progredir();
	        devEduardo.progredir();
	        devEduardo.progredir();
	        System.out.println("-");
	        System.out.println("Contéudos inscritos " + devEduardo.getNome() + ": " + devEduardo.getConteudoInscritos());
	        System.out.println("Contéudos concluidos " + devEduardo.getNome() + ": " +  devEduardo.getConteudosConcluidos());
	        System.out.println("Xp de " + devEduardo.getNome() + ": " + devEduardo.calcularTotalXP());

	        System.out.println("--------------------------------");

	        Dev devIsabela = new Dev();
	        devIsabela.setNome("Isabela");
	        devIsabela.inscreverBootcamp(bootcamp);
	        System.out.println("Contéudos inscritos " + devIsabela.getNome() + ": " + devIsabela.getConteudoInscritos());
	        devIsabela.progredir();
	        System.out.println("-");
	        System.out.println("Contéudos inscritos " + devIsabela.getNome() + ": " + devIsabela.getConteudoInscritos());
	        System.out.println("Contéudos concluidos " + devIsabela.getNome() + ": " + devIsabela.getConteudosConcluidos());
	        System.out.println("Xp de " + devIsabela.getNome() + ": " + devIsabela.calcularTotalXP());
	}

}

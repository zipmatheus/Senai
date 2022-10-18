package atividade01;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("a) Questao01");
		System.out.println("b) Questao02");
		System.out.println("c) Questao03");
		System.out.println("d) Questao04");
		System.out.println("e) Questao05");
		System.out.println("f) Questao06");
		System.out.println("Escolha a questao: ");
		
		String opcao = entrada.next();
				
		switch (opcao) {
		case "a" :
			System.out.println("-- Questao01 --");
			Questao01.main(args);
			break;
		case "b" :
			System.out.println("-- Questao02 --");
			Questao02.main(args);
			break;
		case "c" :
			System.out.println("-- Questao03 --");
			Questao03.main(args);
			break;
		case "d" :
			System.out.println("-- Questao04 --");
			Questao04.main(args);
			break;
		case "e" :
			System.out.println("-- Questao05 --");
			Questao05.main(args);
			break;
		case "f" :
			System.out.println("-- Questao06 --");
			Questao06.main(args);
			break;
		}
		
		entrada.close();
	}

}

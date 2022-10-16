package atividade01;

import java.util.Scanner;

public class Questao03 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = entrada.nextLine();
		
		System.out.println("Ola " + nome);
		
		entrada.close();
	}

}

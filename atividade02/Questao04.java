package atividade02;

import java.util.Scanner;

public class Questao04 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Atividade: 4. Escreva um programa que solicita a idade de uma pessoa e verifica se ela pode dirigir (idade>=18).
		
		System.out.println("Digite sua idade: exemplo: 25");
		int idade = entrada.nextInt();
		
		if (idade >= 18) {
			System.out.println("Parabens! Voce pode dirigir!");
			System.out.println("Lembre-se, se beber nao dirija!");
		} else {
			System.out.println("Que pena! Voce ainda nao pode dirigir!");
		}	
		
		entrada.close();
	}

}

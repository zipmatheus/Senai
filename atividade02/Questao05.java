package atividade02;

import java.util.Scanner;

public class Questao05 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Atividade: 5. Escreva um programa que dada a idade de uma pessoa, retorna uma das seguintes mensagens: 
		//“Não pode nem votar e nem dirigir”, “Pode votar, mas não pode dirigir”, “Pode votar e pode dirigir”.
		
		System.out.println("Digite sua idade: Exemplo: 25");
		int idade = entrada.nextInt();
		
		if (idade >= 18) {
			System.out.println("Parabens! Voce pode votar e dirigir!");
		} else if (idade < 16) {
			System.out.println("Voce nao pode votar nem dirigir!");
		} else {
			System.out.println("Voce pode votar, porem nao pode dirigir!");
		}
		
		entrada.close();
	}

}

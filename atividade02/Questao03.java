package atividade02;

import java.util.Scanner;

public class Questao03 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Atividade: 3. Escreva um programa que solicita a idade de uma pessoa e verifica se ela pode votar (idade>=16)
		
		System.out.println("Digite sua idade: exemplo: 25");
		int idade = entrada.nextInt();
		
		if (idade >= 16) {
			System.out.println("Parabens! Voce pode votar!");
		} else {
			System.out.println("Que pena! Voce ainda nao pode votar!");
		}
		
		entrada.close();
	}

}

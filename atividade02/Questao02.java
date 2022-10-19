package atividade02;

import java.util.Scanner;

public class Questao02 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Atividade: 2. Escreva um programa que receba três inteiros e diga qual deles é o maior e qual o menor.
		
		System.out.println("Digite o primeiro numero:");
		int a = entrada.nextInt();
		System.out.println("Digite o segundo numero:");
		int b = entrada.nextInt();
		System.out.println("Digite o terceiro numero:");
		int c = entrada.nextInt();
		
		int maior, menor;
		
		maior = Math.max(a, b);
		maior = Math.max(maior, c);
		menor = Math.min(a, b);
		menor = Math.min(menor, c);
		
		System.out.println("O maior numero digitado foi: " + maior +" e o menor foi: " + menor + ".");
		
		entrada.close();
	}

}

package atividade03;

import java.util.Scanner;

public class Questao05 {
	
	public static void main(String[] args) {
		
		//Atividade: 5. Escreva um programa que vai ler a idade de 5 pessoas, o sistema vai mostrar quantas são maior ou iguais a 18 e quantas são de menor.
		
		Scanner entrada = new Scanner(System.in);
		int qtMaior = 0;
		int qtMenor = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite a idade:");
			int idade = entrada.nextInt();
			if (idade >= 18) {
				qtMaior++;
			} else {
				qtMenor++;
			}
		}
		
		System.out.println(qtMaior + " sao maior de idade.");
		System.out.println(qtMenor + " sao menor de idade.");

		entrada.close();
	}
}	
	    

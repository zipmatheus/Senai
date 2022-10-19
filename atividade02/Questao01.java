package atividade02;

import java.util.Scanner;

public class Questao01 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Atividade: 1. Escreva um programa que leia um número e escreva na tela se o número é menor, igual ou maior que zero
		
		System.out.println("Digite um numero:");
		int a = entrada.nextInt();
		
		if (a < 0 ) {
			System.out.println("Numero digitado e menor que 0 (zero)!");
		} else if (a == 0) {
			System.out.println("Numero digitado e igual a 0 (zero)!");
		} else {
			System.out.println("Numero digitado e maior que 0 (zero)!");
		}
		
		entrada.close();
	}

}

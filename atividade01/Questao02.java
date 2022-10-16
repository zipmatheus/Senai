package atividade01;

import java.util.Scanner;

public class Questao02 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int numero = entrada.nextInt();
		int anterior = numero - 1;
		int proximo = numero + 1;
		
		System.out.println("O numero anterior ao digitado e: " + anterior + " e o proximo e: " + proximo);
		
		entrada.close();

	}

}

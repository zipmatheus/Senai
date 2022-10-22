package atividade03;

import java.util.Scanner;

public class Questao04 {
	
	public static void main(String[] args) {
		
		/* Atividade: 4. Escreva um programa que vai ler uma palavra, se a palavra for diferente de "Java-2022" o retorno vai ser "Palavra Errada" 
		 se igual "Palavra Ok" a pessoa pode faze no máximo 5 tentativas de acertar a palavra.*/
		 
		Scanner entrada = new Scanner(System.in);
		

	    for (int i = 0; i < 5; i++) {
	        System.out.println("Digite a Palavra Passe:");
	        String palavra = entrada.nextLine();

	        if (palavra.contentEquals("Java-2022")) {
	            System.out.println("Palavra OK");
	            break;
	        } else 
	            System.out.println("Palavra Errada! Tente de novo");
   
	    entrada.close();
	    }
	}
}	

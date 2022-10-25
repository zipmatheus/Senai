package atividade03;

import java.util.Scanner;

public class Questao04 {
	
	public static void main(String[] args) {
		
		/* Atividade: 4. Escreva um programa que vai ler uma palavra, se a palavra for diferente de "Java-2022" o retorno vai ser "Palavra Errada" 
		 se igual "Palavra Ok" a pessoa pode faze no máximo 5 tentativas de acertar a palavra.*/
		 
		Scanner entrada = new Scanner(System.in);
		String palavra = "";
		int i = 0;
		 
		do {
			i++;
			System.out.println("Digite a Palavra Passe: (Tentativa " + i + "/5):");
	        palavra = entrada.nextLine();
	        
	        if (palavra.equals("Java-2022")) {
	            System.out.println("Palavra OK");
	        } else {
	        	 System.out.println("Palavra Errada!");
	        } 
		} while (!palavra.equals("Java-2022")&& i < 5);
		
		
	    entrada.close();
	 }
}


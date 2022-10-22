package atividade03;

import java.util.Scanner;

public class Questao05 {
	
	public static void main(String[] args) {
		
		//Atividade: 5. Escreva um programa que vai ler a idade de 5 pessoas, o sistema vai mostrar quantas são maior ou iguais a 18 e quantas são de menor.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a idade da pessoa:");
		int a entrada.nextInt();
		entrada.close();
		
        int b = 0;
 
        for (int i = 1; i <= 5) {
      
           if (a >= 18) {
               b = b + 1;
            }
        }
 
        System.out.println("A quantidade de pessoas com idade maior ou igual a 18 anos é de " + b);

	}
}	
	    

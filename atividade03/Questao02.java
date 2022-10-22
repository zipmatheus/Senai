package atividade03;

import java.util.Scanner;

public class Questao02 {
	
	public static void main(String[] args) {
		
		//Atividade: 2. Escreva um programa que vai ler uma mensagem e um número, o sistema vai repetir a mensagem digitada x vezes o número digitado.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma mensagem:");
		String msg = entrada.nextLine();
        System.out.println("Digite um numero: ");
        int numero = entrada.nextInt();
        
        for(int i = 0; i < numero; i++) {
        	System.out.println(msg);
        }
		
		entrada.close();	
	}

}

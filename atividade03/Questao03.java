package atividade03;

import java.util.Scanner;

public class Questao03 {
	
	public static void main(String[] args) {
		
		//Atividade: 3. Escreva um programa que vai ler 2 números, o sistema vai escrever na tela todos os número entre os 2 digitados.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
        int num1 = entrada.nextInt();
        System.out.println("Digite o segundo numero:");
        int num2 = entrada.nextInt();

        if (num1 < num2) {
            for (int i = num1 + 1; i > num1 && i < num2; i++) {        
                System.out.println(i);
            }

        } else if (num2 < num1) {
            for (int i = num2 + 1; i > num2 && i < num1; i++) {        
                System.out.println(i);
            }           
        } else {
            System.out.println("Os numeros digitados sao iguais.");
         
         // Outra alternativa de laco   
        //for (int i = n1; i <= n2; i++)
        //    System.out.println(i);
            
         entrada.close();    
        }
		
	}

}

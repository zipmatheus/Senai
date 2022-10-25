package atividade03;

import java.util.Scanner;

public class Questao06 {
	
	public static void main(String[] args) {
		
		//Atividade: 6. Escreva um programa que vai ler 5 números o sistema vai mostrar o maior o menor a soma e a média dos números digitados.
		
		Scanner entrada = new Scanner(System.in);
		
	    int maior = 0, menor = 100, media = 0, soma = 0;
	    int contMaior = 0, contMenor = 0, i;
	    
	    for(i = 0; i < 5; i++){
	        System.out.println("Digite um numero:");
	        int num = entrada.nextInt();
	        	        
	        if( (num < 1) || (num > 100) ){
	            i = i - 1;
	        } else{
	            soma = soma + num;

	            if(num > maior){
	                maior = num;
	                contMaior++;
	            }

	            if(num < menor){
	                menor = num;
	                contMenor++;
	            }   
	        
	        }
	    }
	    
	    System.out.println("O maior numero digitado foi " + maior);
	    System.out.println("O menor numero digitado foi " + menor);
	    System.out.println("A soma e "+ soma);
	    System.out.println("A media foi " + (media = soma / i));
	    
	    entrada.close();
	    }

	}
		
		

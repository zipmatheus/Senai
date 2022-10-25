package atividade03;

import java.util.Scanner;

public class Questao01 {
	
    public static void main(String[] args) {
    	
        /*1. Escreva um programa que vai ler um número, o sistema vai escrever
        na tela a tabuada de 1 até 10 do número digitado. */
    	
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = entrada.nextInt();

        for (int i=1; i<=10; i++){
            //System.out.println("Exibindo a tabuada de 1 ate 10: " + numero + " x " + i + " = " + numero*i);
            System.out.printf("%s x %s = %s \n", numero, i, i * numero);
        	
        entrada.close();
        }
    }
    
}
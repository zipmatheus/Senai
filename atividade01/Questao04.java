package atividade01;

import java.util.Scanner;

public class Questao04 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();
        System.out.println("Digite o valor da hora:");
        int valorHora = entrada.nextInt();
        System.out.println("Digite a quantidade de horas trabalhadas:");
        int horasTrab = entrada.nextInt();
        double salario = valorHora * horasTrab;
        
        System.out.printf(nome + " ira receber R$%.2f", salario, " de salario.");
        		
		entrada.close();
	}

}

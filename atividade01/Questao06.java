package atividade01;

import java.util.Scanner;

public class Questao06 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor da conta:");
		double conta = entrada.nextDouble();
		System.out.println("Digite para quantas pessoas a conta sera dividida:");
		int pessoas = entrada.nextInt();
		double divisao = conta / pessoas;
		
		System.out.printf("Cada pessoa ira pagar R$%.2f reais.", divisao);
		
		entrada.close();
	}

}

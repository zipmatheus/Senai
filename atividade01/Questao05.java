package atividade01;

import java.util.Scanner;

public class Questao05 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do jantar:");
		double valorJantar = entrada.nextDouble();
		
		double txGarcom = (valorJantar * 10) / 100;
		double valorTotal = valorJantar + txGarcom;
		
		System.out.printf("O jantar vai custar no total: R$%.2f sendo R$%.2f valor do jantar e R$%.2f taxa do garcom.", valorTotal, valorJantar, txGarcom);
		
		entrada.close();
	}

}

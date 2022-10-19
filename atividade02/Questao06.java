package atividade02;

import java.util.Scanner;

public class Questao06 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		/*Atividade: 6. Escreva um programa para calcular O IMC (índice de massa corpórea) que indica o grau de obesidade de uma pessoa.
	    Este índice é obtido pelo peso (em kg) dividido pelo quadrado da altura (em metros).
	    Entradas peso e altura, saída resultado do IMC e Avaliação.
	    A tabela a seguir apresenta as faixas deste índice:
	    IMC = Avaliação
	    menor que 20 = Abaixo do normal
	    entre 20, 25 = Normal
	    entre 25, 30 = Sobrepeso
	    entre 30, 35 = Obesidade leve
	    entre 35, 40 = Obesidade moderada
	    maior que 40 = Obesidade mórbida*/
		
		System.out.println("Digite seu peso (Em Kilogramas - Ex: 55,6): ");
		double peso = entrada.nextDouble();
		System.out.println("Digite sua altura (Em metros - Ex: 1,80)");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		
		if (imc < 20) {
			System.out.printf("Seu IMC e: %.2f e sua classificacao e: Peso abaixo do Normal", imc);
		} else if (imc >= 20 && imc <= 25) {
			System.out.printf("Seu IMC e: %.2f e sua classificacao e: Peso Normal", imc);
		} else if (imc > 25 && imc <= 30) {
			System.out.printf("Seu IMC e: %.2f e sua classificacao e: Sobrepeso", imc);
		} else if (imc > 30 && imc <= 35) {
			System.out.printf("Seu IMC e: %.2f e sua classificacao e: Obesidade Leve", imc);
		} else if (imc > 35 && imc <= 40) {
			System.out.printf("Seu IMC e: %.2f e sua classificacao e: Obesidade Moderada", imc);
		} else if (imc > 40) {
			System.out.printf("Seu IMC e: %.2f e sua classificacao e: Obesidade Morbida", imc);
		}
				
		entrada.close();
	}

}

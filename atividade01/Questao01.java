package atividade01;

import java.util.Scanner;

public class Questao01 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
        System.out.println("Digite a primeira nota: (0 a 10)");
        int a = entrada.nextInt();
        System.out.println("Digite a segunda nota: (0 a 10)");
        int b = entrada.nextInt();
        
        int med = (a + b) / 2;
        
        if (med > 7) {
        	System.out.println("Media Final: " + med + " Aprovado!");
        } else
        	System.out.println("Media Final: " + med + " Reprovado!");
		
		entrada.close();
	}

}

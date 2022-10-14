package exemplos;

import java.util.Scanner;

public class TesteScan {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int n1 = entrada.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int n2 = entrada.nextInt();
		
		int soma = n1 + n2;
		System.out.println("A soma dos dois numeros e: " + soma);
		
		entrada.close();
	}

}
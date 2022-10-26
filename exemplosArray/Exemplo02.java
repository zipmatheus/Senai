package exemplosArray;

import javax.swing.JOptionPane;

public class Exemplo02 {
	
	public static void main(String[] args) {
		
		int [] numeros = new int[5];
		
		for (int i = 0; i < numeros.length; i++) {
			String temp = JOptionPane.showInputDialog("Digite um numero:");
			numeros[i] = Integer.parseInt(temp);
		}
		for (int i : numeros) {
			System.out.println(i);
		}
		
	}

}

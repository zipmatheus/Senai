package exemplos;

public class LacoDeRepeticao {
	
	public static void main(String[] args) {
		
		int contar = 1;
		
		while (contar <= 10) {
			System.out.print(contar);
			System.out.println(" Dentro do Loop While");
			contar++; //mesmo que "contar = contar +1;"
		}
		
		do {
			contar--;
			System.out.print(contar);
			System.out.println(" Dentro do loop Do-while");
		} while (contar > 1);
		
		for (int i = 1; i <=10; i++) {
			System.out.print(i);
			System.out.println(" dentro do for");
		}
	}

}

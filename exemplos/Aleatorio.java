package exemplos;

public class Aleatorio {
	
	public static void main(String[] args) {
		
        Dado dado6 = new Dado(6);
        Dado dado12 = new Dado(12);
        for (int index = 0; index < 60; index++) {
            System.out.println("Dado de 6 lados " + dado6.rolar());
            System.out.println("Dado de 12 lados " + dado12.rolar());
        }
    }
}

package exemplosPoo;

public class Exemplo00 {
	
	public static void main(String[] args) {
		
		Caneta caneta1 = new Caneta("BIC", "Azul");
		
		caneta1.status();
		caneta1.rabiscar();
		caneta1.status();
		caneta1.destampar();
		caneta1.rabiscar();
		caneta1.status();
		caneta1.escrever("Matheus Barbosa Souza Lindao");
		caneta1.status();
		
		Caneta caneta2 = new Caneta("BIC", "Preta");
		caneta2.status();
	}

}
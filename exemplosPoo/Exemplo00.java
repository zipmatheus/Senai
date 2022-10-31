package exemplosPoo;

public class Exemplo00 {
	
	public static void main(String[] args) {
		
		Caneta caneta1 = new Caneta();
		caneta1.modelo = "BIC";
		caneta1.cor = "Azul";
		caneta1.ponta = 0.9f;
		caneta1.carga = 100;
		caneta1.tampa = false;
		
		caneta1.rabiscar();
		caneta1.tampar();
		caneta1.rabiscar();
		
	}

}

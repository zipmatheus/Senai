package exemplosPoo;

public class Caneta {
	
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampa;
	
	void rabiscar() {
		if (tampa) {
			System.out.println("Rabisco");
		} else {
			System.out.println("Retire a tampa");
		}
	}
	
	void tampar() {
		tampa = true;
	}

}

package exercicioPOO;

public class Carro {
	
	private String marca;
	private String modelo;
	private int velocidade;
	
	Carro (String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;	
		velocidade = 0;
	}
	
	void acelerar(int a) {
		System.out.println("Acelerando");
		velocidade = velocidade + a;
		if (velocidade > 200) {
			velocidade = 200;
			System.out.println("Velocidade Maxima atingida. " + velocidade + " Km/h.");
		} else {
			System.out.println("Velocidade atual: " + velocidade + " Km/h.");
		}
	}
	
	void frear(int b) {
		System.out.println("Freiando");
		velocidade = velocidade - b;
		if (velocidade < 0) {
			velocidade = 0;
			System.out.println("Velocidade minima atingida. " + velocidade + " Km/h.");
		} else {
			System.out.println("Velocidade atual: " + velocidade + " Km/h.");
		}
	}
		
	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", velocidade=" + velocidade + "]";
	}

	public void status() {
		System.out.println(toString());		
	}

}

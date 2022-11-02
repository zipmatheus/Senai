package exercicioPOO;

public class ExercicioLPOO1 {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro("FIAT","Palio");
		c1.status();
		c1.acelerar(20);
		c1.acelerar(50);
		c1.acelerar(200);
		c1.frear(100);
		c1.frear(150);
		c1.status();
	}

}

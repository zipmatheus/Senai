package exemplosPoo;

public class Caneta {
	
	private String modelo;
	private String cor;
	private int carga;
	private boolean tampa;
	
	//metodo construtor
	Caneta (String modelo, String cor) {
		tampa = false;
		this.modelo = modelo;
		this.cor = cor;
		this.carga = 30;
		
	}
	
	void rabiscar() {
		escrever("Rabisco");
	}
	
	void escrever(String texto) {
		if (tampa) {
			
			if (carga >= texto.length()) {
				System.out.println(texto);
				texto = texto.replaceAll(" ", "");
				carga -= texto.length();			
			} else {
				System.out.println("Carga insuficiente");
			}
			
			
		} else {
			System.out.println("Retire a tampa");
		}
	}
	
	void tampar() {
		tampa = false;
	}
	
	void destampar() {
		tampa = true;
	}

	public void status() {
		System.out.println("Caneta [modelo=" + modelo + ", cor=" + cor + ", carga=" + carga + ", tampa=" + tampa + "]");
	}
	
}

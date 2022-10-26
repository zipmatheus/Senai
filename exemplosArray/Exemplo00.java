package exemplosArray;

public class Exemplo00 {
	
	public static void main(String[] args) {
		
		// Array inicia na posicao 0
		String[] pessoas = {"Chaves", "Seu Madruga", "Dona Florinda", "Chiquinha"};
		System.out.println(pessoas.length);
		System.out.println(pessoas[2]);
	
		System.out.println("Primeiro For");		
		for (int i = 0; i < pessoas.length; i++) {
			System.out.println(pessoas[i]);
		}
		System.out.println("Segundo For");
		pessoas[0] = "Kiko";
		for (String pessoa : pessoas) {
			System.out.println(pessoa);
		}
		System.out.println("Terceiro For");
		for (int i = pessoas.length - 1; i >= 0; i--) {
			String pessoa = pessoas[i];
			System.out.println(pessoa);
		}
	}

}

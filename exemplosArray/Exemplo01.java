package exemplosArray;

public class Exemplo01 {
	
	public static void main(String[] args) {
        String[][] lista = { { "A", "B", "C", "D" }, { "E", "F", "G", "H" }, { "I", "J", "K", "L" } };
        // System.out.println(lista[1][0]);
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                System.out.print(lista[i][j] + "*");
            }
            System.out.println();
        }
    }
}

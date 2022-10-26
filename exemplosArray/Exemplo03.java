package exemplosArray;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Exemplo03 {
	
	public static void main(String[] args) {
		
		ArrayList <String> lista = new ArrayList<String>();
		
		int selecionado = 0;
		Object [] opcoes = {"Incluir", "Listar", "Apagar", "Finalizar"};
		
		do {
			selecionado = JOptionPane.showOptionDialog(null, "O que voce deseja?", "Exemplo", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
				null, opcoes, opcoes[0]);
		
		if (selecionado == 0) {
			String item = JOptionPane.showInputDialog("Digite");
			lista.add(item);
		}
		
		if (selecionado == 1) {
			String msg = "";
			for (String item : lista) {
				msg += item + "\n";
			}
			JOptionPane.showConfirmDialog(null, msg);
		}
		
		if (selecionado == 2) {
			Object [] opcaoApagar = new Object[lista.size()];
			for (int i = 0; i < opcaoApagar.length; i++) {
				opcaoApagar[i] = lista.get(i);
			}
			Object ItemSelecionado = JOptionPane.showInputDialog(null, "Selecione o item para apagar",
					"Apagar", JOptionPane.INFORMATION_MESSAGE, null, opcaoApagar, opcaoApagar[0]);
			for (int i = 0; i <lista.size(); i++) {
				if (ItemSelecionado.toString().equals(lista.get(i))) {
					lista.remove(i);
				}
			}
		}
		
	} while (selecionado != 3);
}
}

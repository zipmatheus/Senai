package exemplosArray;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Exemplo03 {
	
	public static void main(String[] args) {
		
		ArrayList <String> lista = new ArrayList<String>();
		
		int selecionado = 0;
		Object [] opcoes = {"Incluir", "Listar", "Apagar", "Editar", "Finalizar"};
		
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
		
		if (selecionado == 3) {
			Object [] altera = new Object[lista.size()];
			
			for (int i = 0; i < altera.length; i++) {
				altera[i] = lista.get(i);
			}
		
			
			Object ItemSelecionado = JOptionPane.showInputDialog(null, "Selecione o item para alterado:",
					"Alterar", JOptionPane.INFORMATION_MESSAGE, null, altera, altera[0]);
			
			String item = JOptionPane.showInputDialog("Digite");
			for (int i = 0; i < altera.length; i++) {
				if(ItemSelecionado.equals(lista.get(i)))
					lista.set(i, item);
			}
			
 		}
		
	} while (selecionado != 4);
}
}

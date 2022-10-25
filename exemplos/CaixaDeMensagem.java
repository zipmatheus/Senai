package exemplos;

import javax.swing.JOptionPane;

public class CaixaDeMensagem {
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Java com JOptionPane");
		JOptionPane.showConfirmDialog(null, "Mensagem no JOP", "Titulo", JOptionPane.YES_NO_OPTION);
		
		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		JOptionPane.showMessageDialog(null, "Bem vindo " + nome);
		
		
	}

}

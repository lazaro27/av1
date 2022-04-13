package Questao1;

import javax.swing.JOptionPane;

public class Encontrar {

	public static void main(String[] args) {
		
		Usuario a1 = new Usuario("Zé","ze@gmail.com","zezinho2022");
		
		AchadoPerdido ap = new AchadoPerdido("Smartphone", "Iphone 13", "foto de iphone preto", "eletronicos", "recepção", "12/04/2022", "Perdido");
		
		JOptionPane.showMessageDialog(null, ap.buscarTitulo("Smartphone"));	
		ap.visualizarDetalhes();
		
	}

}

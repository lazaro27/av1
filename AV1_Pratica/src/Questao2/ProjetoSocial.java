package Questao2;

import javax.swing.JOptionPane;

public class ProjetoSocial {

	public static void main(String[] args) {
		 String op;
		 
		 op = JOptionPane.showInputDialog(null,"1-Distribuição" + "\n2-Trabalho Voluntario" + "\n3-Sair" );
		 
		 	 
		 switch( op ) {	 
		 case "1":
			 distribuicaoAlimento d1 = new distribuicaoAlimento("Saude da escola", "teste", " Rua da escola", "25/04/2022", "12/12/2022", "Leite", 100);
			 d1.validaProjeto("teste");
			 JOptionPane.showMessageDialog(null, d1.imprimeProjeto());
			 
			 break;
		 case "2":
			 TrabalhoVoluntario t1 = new TrabalhoVoluntario("Teste", "teste", "teste", "teste", "teste", "teste", 10);
			 t1.validaProjeto("Teste");
			 JOptionPane.showMessageDialog(null, t1.imprimeProjeto());
			 break;
		 case "3":
			 break;
			 
			 default:
				 JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!!!");
		 }


	}

}

import javax.swing.JOptionPane;

public class MenuPrincipal {
	
	public static void main(String[] args) {
		String opcoes = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu Principal", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de moedas", }, "Escolha").toString();

		String inputValid = JOptionPane.showInputDialog(null, "Insira um valor");
		ValorConfirmado valorCon = new ValorConfirmado();
	    while (!valorCon.valorNumerico(inputValid) && inputValid != null) {
			 
		 
			inputValid = JOptionPane.showInputDialog( null,  "Insira um valor",0);
			if (inputValid  == null) {
			break ;
			}
	  }
	    
	    Funcao funcao = new Funcao();
	    
	    switch (opcoes) {
	    case "Conversor de moedas":
	    double ValorRecebido = Double.parseDouble(inputValid);
	    	
	    	
	    funcao.converterMoedas(ValorRecebido);
	    int resposta = JOptionPane.showConfirmDialog(null,"Deseja continuar?");
	    if (resposta == JOptionPane.OK_CANCEL_OPTION) {
	    	System.out.println("Programa Finalizado");
	    	JOptionPane.showInternalMessageDialog(null, funcao, "Programa Finalizado", resposta);
	    	
	    }else if (resposta == JOptionPane.YES_OPTION) {
	    	main(args);
	    	
	    }else if (resposta == JOptionPane.NO_OPTION) {
	    	JOptionPane.showMessageDialog(null," Programa Finalizado");
	    	
	    }
	    	
	    break;
	   
	    }
	  
	}
}
		 		
	


	    
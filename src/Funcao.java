
import javax.swing.JOptionPane;



public class Funcao {
	
	ConversorDeMoeda moedas = new ConversorDeMoeda();

	public void converterMoedas(double valorRecebido) {
		
	
	String opcao = JOptionPane.showInputDialog(null, 
			"Insira a moeda a qual deseja converter", "Moedas",
	JOptionPane.PLAIN_MESSAGE, null, 
	new Object[] {"De reais para dolares","De reais para euros","De reais para libras","De reais para pesos argentinos","De reais para pesos chilenos",
						"De dolares para reais","De euros para reais","De libras para reais","De pesos argentinos para reais","De pesos chilenos para reais"}, 
    "Escolha"
	
	).toString();
		switch(opcao) {
		case "De reais para dolares":
		moedas.transformarRealEmDolar(valorRecebido);
		break;
		
		
       case "De reais para euros":
	   moedas.transformaRealEmEuro(valorRecebido);
	   break;

       case "De reais para libras":
    	   moedas.transformarRealEmLibras(valorRecebido);
    	   break;
    	   
       case "De reais para pesos argentinos":
    	   moedas.transformarRealEmPesosArgentinos(valorRecebido);
    	   break;
    	   
       case "De reais para pesos chilenos":
    	   moedas.transformarRealEmPesosChilenos(valorRecebido);
    	   break;
	  
      case "De dolares para reais":
    	  	moedas.transformarDolarEmReal(valorRecebido);
      		break;
		
      
      case "De euros para reais":
          moedas.transformarEuroEmReal(valorRecebido);
          break;
          
      case "De libras para reais":
          moedas.transformarLibrasEmReal(valorRecebido);
          break;
          
      case "De pesos argentinos para reais":
          moedas.transformarPesosArgentinosEmReal(valorRecebido);
          break;
          
      case "De pesos chilenos para reais":
          moedas.transformarPesosChilenosEmReal(valorRecebido);
          break;
    
		}
		
	 }		
 
}

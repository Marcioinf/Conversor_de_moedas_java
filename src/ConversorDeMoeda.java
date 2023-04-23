import javax.swing.*;


	public class ConversorDeMoeda {
	
		public void transformarRealEmDolar (double valor) {
			
		double moedaDolar = valor / 5.08;
		moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog( null,  "Você tem $ " + moedaDolar + " dolares ", null, 0);
		
	} 
		
		public void transformaRealEmEuro (double valor) { 
		double moedaEuro = valor / 5.56;
		moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog( null,  "Você tem $ " + moedaEuro + " euros ", null, 0);
		
	} 
		public void transformarRealEmLibras (double valor) {
		double moedaLibras = valor / 6.31;
		moedaLibras = (double) Math.round(moedaLibras * 100d) / 100;
		JOptionPane.showMessageDialog( null,  "Você tem $ " + moedaLibras + " libras ", null , 0);
		
	} 
		public void transformarRealEmPesosArgentinos (double valor) {
		double moedaPesosArgentinos = valor / 0.023;
		moedaPesosArgentinos = (double) Math.round(moedaPesosArgentinos * 100d) / 100;
		JOptionPane.showMessageDialog( null,  "Você tem $ " + moedaPesosArgentinos + " pesos argentinos ", null , 0);
		
	} 	
		public void transformarRealEmPesosChilenos (double valor) {
		double moedaPesosChilenos = valor / 0.0064;
		moedaPesosChilenos = (double) Math.round(moedaPesosChilenos * 100d) / 100;
		JOptionPane.showMessageDialog( null,  "Você tem $ " + moedaPesosChilenos + " pesos chilenos ",null ,0);
	}
	
	    public void transformarDolarEmReal (double valorReal) {
		double moedaReal = valorReal * 5.08;
		moedaReal = (double) Math.round(moedaReal);
		JOptionPane.showMessageDialog( null,  "Você tem $ " + moedaReal + " reais ", null, 0);
		
	}    
		public void transformarEuroEmReal( double valorReal) { 
		double moedaReal = valorReal * 5.56;
		moedaReal = (double) Math.round(moedaReal);
		JOptionPane.showMessageDialog( null,  "Você tem $ " + moedaReal + " reais ", null,0);
		
	} 
	
		public void transformarLibrasEmReal( double valorReal) {
		double moedaReal = valorReal * 6.31;
		moedaReal = (double) Math.round(moedaReal );
		JOptionPane.showMessageDialog( null,  "Você tem $ " + moedaReal + " reais ", null, 0);
	} 
		
		public void transformarPesosArgentinosEmReal( double valorReal) {
		double moedaReal = valorReal * 0.023;
		moedaReal = (double) Math.round(moedaReal );
		JOptionPane.showMessageDialog( null,  "Você tem $ " + moedaReal + " reais", null, 0 );
	} 
		
		public void transformarPesosChilenosEmReal ( double valorReal) {
		double moedaReal = valorReal * 0.0064;
		moedaReal = (double) Math.round(moedaReal );
		JOptionPane.showMessageDialog( null,  "Você tem $ " + moedaReal + " reais ", null, 0);
		
	}
}
		
	

import javax.swing.JOptionPane;

public class ValorConfirmado {

	public boolean  valorNumerico (String inputValid) {
		try {
			
				Double.parseDouble(inputValid);
				return true;
		} catch (Exception ex) {
			return false;
		}
	}
}
	

		
		

import javax.swing.JOptionPane;

public class ArithimetcException  extends Exception{
	
	public void errDiv(){
		JOptionPane.showMessageDialog(null,"Divisao por 0 impossivel","ERROR",JOptionPane.PLAIN_MESSAGE);
	}

	
}
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc implements ActionListener{
	
	private static float x;
	private static JFrame jan = new JFrame("Calculadora");
		
	private static JLabel label1 = new JLabel("Valor1");
	private static JLabel label2 = new JLabel("Valor2");
	private static JLabel label3 = new JLabel("Resultado");
	
	private static JTextField field1 = new JTextField("Digite o valor");
	private static JTextField field2 = new JTextField("Digite o valor");
	private static JTextField field3 = new JTextField("                                        ");
	
	private static JButton bt1 = new JButton("+");
	private static JButton bt2 = new JButton("-");
	private static JButton bt3 = new JButton("/");
	private static JButton bt4 = new JButton("*");
	private static JButton bt5 = new JButton("=");
	private static JButton bt6 = new JButton("Clear");
	private static JButton bt7 = new JButton("Exit");
	
	
	public static void main(String args[]){
		jan.setSize(300,500);
		jan.add(label1);
		jan.add(field1);
		jan.add(label2);
		jan.add(field2);
		jan.add(label3);
		jan.add(field3);

		jan.add(bt1);
		bt1.addActionListener(new Calc());
		
		jan.add(bt2);
		bt2.addActionListener(new Calc());
		
		jan.add(bt3);
		bt3.addActionListener(new Calc());
		
		jan.add(bt4);
		bt4.addActionListener(new Calc());
		
		jan.add(bt5);
		bt5.addActionListener(new Calc());

		jan.add(bt6);
		bt6.addActionListener(new Calc());
		
		jan.add(bt7);
		bt7.addActionListener(new Calc());
	
		jan.setLayout(new FlowLayout());
		jan.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource().equals(bt1)){
			try{
			this.x = soma(Float.parseFloat(field1.getText()), Float.parseFloat(field2.getText()));
			}
			catch(NumberFormatException nfE){
			JOptionPane.showMessageDialog(null,"Use apenas numeros","ERROR",JOptionPane.PLAIN_MESSAGE);
			field1.setText("");
			field2.setText("");
			field3.setText("");
			field1.requestFocus();
			}
		}
		
		if(ae.getSource().equals(bt2)){
			try{
			this.x = subtracao(Float.parseFloat(field1.getText()), Float.parseFloat(field2.getText()));
			}
			catch(NumberFormatException nfE){
			JOptionPane.showMessageDialog(null,"Use apenas numeros","ERROR",JOptionPane.PLAIN_MESSAGE);
			field1.setText("");
			field2.setText("");
			field3.setText("");
			field1.requestFocus();
			}
		}
		
		if(ae.getSource().equals(bt3)){
			try{
			this.x = divisao(Float.parseFloat(field1.getText()), Float.parseFloat(field2.getText()));
			}
			
			catch(ArithimetcException arith){
				arith.errDiv();
				field1.setText("");
				field2.setText("");
				field3.setText("");
				field1.requestFocus();
			}
			catch(NumberFormatException nfE){
			JOptionPane.showMessageDialog(null,"Use apenas numeros","ERROR",JOptionPane.PLAIN_MESSAGE);
			field1.setText("");
			field2.setText("");
			field3.setText("");
			field1.requestFocus();
			}
		}
		
		if(ae.getSource().equals(bt4)){
			try{
			this.x = multiplicacao(Float.parseFloat(field1.getText()), Float.parseFloat(field2.getText()));
			}
			catch(NumberFormatException nfE){
			JOptionPane.showMessageDialog(null,"Use apenas numeros","ERROR",JOptionPane.PLAIN_MESSAGE);
			field1.setText("");
			field2.setText("");
			field3.setText("");
			field1.requestFocus();
			}
			
		}
		
		
		
		if(ae.getSource().equals(bt5)){
			field3.setText(Float.toString(x));
			
		}
		
		if(ae.getSource().equals(bt6)){
			field1.setText("");
			field2.setText("");
			field3.setText("");
			field1.requestFocus();
		}
		
		if(ae.getSource().equals(bt7)){
			System.exit(0);
		}
	}
	
	public float soma(float valor1, float valor2) throws NumberFormatException{
		return valor1+valor2;
	}
	
	public float subtracao(float valor1, float valor2) throws NumberFormatException{
		return valor1 - valor2;
	}
	
	public float divisao(float valor1, float valor2) throws NumberFormatException, ArithimetcException{
		if(valor2 == 0)
			throw new ArithimetcException();
		else
			return valor1/valor2;
	}
	
	public float multiplicacao(float valor1, float valor2) throws NumberFormatException{
		return valor1*valor2;
	}
	
	
	
	
	
	
	
}
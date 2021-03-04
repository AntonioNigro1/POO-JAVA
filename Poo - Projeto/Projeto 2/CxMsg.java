import javax.swing.JOptionPane;

public class CxMsg{

    public static void main(String args[]){

        JOptionPane.showMessageDialog(null,"METAL IS LOVE METAL IS LIFE", "ROCKLIFE",JOptionPane.PLAIN_MESSAGE);

        String x = JOptionPane.showInputDialog(null, "R U METAL?", "XDDD", JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(null,"UR ANSWER: "+x,"Retorno da caixa de entrada", JOptionPane.PLAIN_MESSAGE);

        int res = JOptionPane.showConfirmDialog(null, "METAL PORRA", "ROCKNROLL", JOptionPane.YES_NO_CANCEL_OPTION);

        if(res==0)
            JOptionPane.showMessageDialog(null, "METAL CARAI","retorno da cx anterior", JOptionPane.PLAIN_MESSAGE);
        
        if(res==1)
            JOptionPane.showMessageDialog(null,"SEU BOSTINHA","Metal porra",JOptionPane.PLAIN_MESSAGE);
        if(res==2)
            JOptionPane.showMessageDialog(null,"cancela o carai, METAL PORRa","METAL", JOptionPane.PLAIN_MESSAGE);
    }

    
}
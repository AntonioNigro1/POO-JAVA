import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
    public class CriaJan{

        public static void main(String args[]){

            JMenuBar bm;
            JMenu menuzaum;
            JMenu arq;
            JMenuItem abr;

            JFrame jan1 = new JFrame("Eaew");
            jan1.setSize(500,500);//larg, altt
        //    jan1.setTitle("primeiro titulo da primeira janela da primeira okaldf,ak,");
            JLabel rot1 = new JLabel();
            rot1.setText("Rotulo - nome");
            jan1.add(rot1);
            JTextField entrada1 = new JTextField(20);
            jan1.add(entrada1);
            JButton bt1= new JButton("Clique aqui"); // cria botao de ok
            bt1.setMnemonic('C'); // adciona um atalho para o botao
            jan1.add(bt1);//adciona o botao
            

            abr = new JMenuItem("Abrir");
            arq= new JMenu("Arquivo");
            arq.add(abr);

            menuzaum = new JMenu("Menuzaum");
            menuzaum.add(arq);
            bm = new JMenuBar();
            bm.add(menuzaum);
            jan1.setJMenuBar(bm);
            jan1.setLayout(new FlowLayout());//Centraliza todos os componentes
            jan1.setVisible(true);
        }

    }
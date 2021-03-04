import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Leitura{


    public String inDados(String rotulo){
        InputStreamReader teclado = new InputStreamReader(System.in);//entrada de dados
        BufferedReader mem = new BufferedReader(teclado);//Organização dos dados na memoria principal

        String entrada = "";
        System.out.println(rotulo);


        try{
            entrada = mem.readLine();

        }
        catch(IOException ioe){
            System.out.println("\nErro no sistema");
        }
        return entrada; 

    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntDados{

    public String inData(String rotulo){
        //captura o teclado e armazena em tec
        InputStreamReader tec  = new InputStreamReader(System.in);
        //buferiza a entrada do teclado
        BufferedReader buff = new BufferedReader(tec);

        String retorno = "";

        System.out.println(rotulo);

        try{
            retorno = buff.readLine(); //readline faz uma leitura daquilo que esta em buff e manda pra retorno
        }
        catch(IOException ioe){

        }
        return retorno;
    }
}
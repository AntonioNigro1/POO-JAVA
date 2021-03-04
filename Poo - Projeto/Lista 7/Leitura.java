import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura{

    public String entraDados(String rotulo){
        InputStreamReader tec  = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(tec);

        String retorno = "";

        System.out.println(rotulo);

        try{
            retorno = buff.readLine();
        }
        catch(IOException ioe){

        }
        return retorno;
    }
}
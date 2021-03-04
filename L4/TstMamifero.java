import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TstMamifero implements Entrada{

public String inDados(String rotulo){
            InputStreamReader teclado = new InputStreamReader(System.in);
            BufferedReader mem = new BufferedReader(teclado);

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
    public static void main(String arg[]) {
        Gato cat = new Gato();
        Cao dog = new Cao();
        TstMamifero aux=new TstMamifero();

        //Integer.parseInt(inDados("\nDigite a informção: "));
        
        System.out.println("\nGato");
        cat.setRaca(aux.inDados("\nDigite a raca: "));
        cat.setNome(aux.inDados("\nDigite o nome: "));
        cat.setVelocidade(Integer.parseInt(aux.inDados("\nDigite a velocidade em m/h: ")));
        cat.setDistVisNot(Integer.parseInt(aux.inDados("\nDigite a distancia da visão noturna do gato: ")));
        cat.getPOrig().setCodPais(Integer.parseInt(aux.inDados("\nDigite o codigo do pais: ")));
        cat.getPOrig().setNomePais(aux.inDados("\nDigite o nome do pais: "));

        System.out.println("\nCachorro");
        dog.setRaca(aux.inDados("\nDigite a raca: "));
        dog.setNome(aux.inDados("\nDigite o nome: "));
        dog.setVelocidade(Integer.parseInt(aux.inDados("\nDigite a velocidade em m/h: ")));
        dog.setTipo(aux.inDados("\nDigite o tipo do cao: "));
        dog.getPOrig().setCodPais(Integer.parseInt(aux.inDados("\nDigite o codigo do pais: ")));
        dog.getPOrig().setNomePais(aux.inDados("\nDigite o nome do pais: "));
      


        System.out.println("\nGato");
        System.out.println("\nRaca: "+cat.getRaca());
        System.out.println("\nNome: "+cat.getNome()); 
        System.out.println("\nDistancia da visao noturna: "+cat.getDistVisNot());
        System.out.println("\nCodigo do pais de origem: "+cat.getPOrig().getCodPais());
        System.out.println("\nNome do pais de origem: "+cat.getPOrig().getNomePais());
        cat.calcVeloc();
        cat.emitirSom();

        System.out.println("\nCachorro");
        System.out.println("\nRaca: "+dog.getRaca());
        System.out.println("\nNome: "+dog.getNome());
        System.out.println("\nTipo: "+dog.getTipo());
        System.out.println("\nCodigo do pais de origem: "+dog.getPOrig().getCodPais());
        System.out.println("\nNome do pais de origem: "+dog.getPOrig().getNomePais());
        dog.emitirSom();
        dog.calcVeloc();
    }
}
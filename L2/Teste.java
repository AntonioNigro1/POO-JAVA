import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Teste{

    public static void main(String arg[]) {

        Leitura l = new Leitura();

       // int reString = Integer.parseInt(l.inDados("\nDigite a informção: "));


        Passeio carPas = new Passeio();
        Carga carCarg = new Carga();


        carPas.setQtdePassageiros(Integer.parseInt(l.inDados("\nDigite a qtd de passageiros: ")));
        carPas.setMarca(l.inDados("\nDigite a marca: "));
        carPas.setModelo(l.inDados("\nDigite o modelo: "));
        carPas.setVelocMax(Float.parseFloat(l.inDados("\nDigite a velocidade maxima: ")));
        carPas.setPlaca(l.inDados("\nDigite a placa: "));
        carPas.getMot().setPotencia(Integer.parseInt(l.inDados("\nDigite a potencia do motor: ")));
        carPas.getMot().setQtdPistoes(Integer.parseInt(l.inDados("\nDigite a qtd de pistoes: ")));
  
        carPas.getTstPlaca().certificPlaca(carPas.getPlaca());

       // if(carPas.getTstPlaca().certificPlaca() == false)
         //   carPas.setPlaca("AAA-AAAA");

        carCarg.setTara(Float.parseFloat(l.inDados("\nDigite a tara: ")));
        carCarg.setCargaMax(Float.parseFloat(l.inDados("\nDigite a carga maxima: ")));
        carCarg.setMarca(l.inDados("\nDigite a marca: "));
        carCarg.setModelo(l.inDados("\nDigite o modelo: "));
        carCarg.setVelocMax(Float.parseFloat(l.inDados("\nDigite a velocidade maxima: ")));
        carCarg.setPlaca(l.inDados("\nDigite a placa: "));
        carCarg.getMot().setPotencia(Integer.parseInt(l.inDados("\nDigite a potencia do motor: ")));
        carCarg.getMot().setQtdPistoes(Integer.parseInt(l.inDados("\nDigite a qtd de pistoes: ")));
  
        carCarg.getTstPlaca().certificPlaca(carCarg.getPlaca());

    //    if(carCarg.getTstPlaca() == false)
     //       carCarg.setPlaca("AAA-AAAA");

        System.out.println("\nCarro de passeio");
        System.out.println("\nMarca: "+carPas.getMarca());
        System.out.println("\nModelo: "+carPas.getModelo());
        System.out.println("\nVelocidade max: "+carPas.getVelocMax());
        System.out.println("\nPlaca: "+carPas.getPlaca());
        System.out.println("\nPotencia: "+carPas.getMot().getPotencia());
        System.out.println("\nQtd de Pistoes: "+carPas.getMot().getQtdPistoes());
        System.out.println("\nQtd de passageiros"+carPas.getQtdePassageiros());


        System.out.println("\n---------------------\nCarro de carga");
        System.out.println("\nMarca: "+carCarg.getMarca());
        System.out.println("\nModelo: "+carCarg.getModelo());
        System.out.println("\nVelocidade max: "+carCarg.getVelocMax());
        System.out.println("\nPlaca: "+carCarg.getPlaca());
        System.out.println("\nPotencia: "+carCarg.getMot().getPotencia());
        System.out.println("\nQtd de Pistoes: "+carCarg.getMot().getQtdPistoes());
        System.out.println("\nTara: "+carCarg.getTara());
        System.out.println("znCarga max: "+carCarg.getCargaMax());
    }

}
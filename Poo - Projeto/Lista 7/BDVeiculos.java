import java.util.ArrayList;
import java.util.List;

public class BDVeiculos{


    public void setBDPs(Passeio ps){
        BDPs.add(ps);
        System.out.println("\nVeiculo de placa:"+ps.getPlaca()+"Cadastrado com sucesso!");
    }

    public int buscPlacaPas(String placa, List<Passeio> LstPas)throws VeicExistException{
 
        for(int i =0;i<=sizeof(LstPas);i++){
            if(placa == LstPas.get(i).getPlaca()){
            throw new VeicExistException();
            return i;
            }
        }
      
    }

    public int buscPlacaCarg(String placa, List<Carga> LstCarg)throws VeicExistException{
  
        for(int i =0;i<=sizeof(LstCarg);i++){
            if(placa == LstCarg.get(i).getPlaca()){
            throw new VeicExistException();
            return i;
            }
        }
       
    }

    public void altBDPs(Passeio ps,List<Passeio> LstPas, int i){
        LstPas.set(i, ps);
    }

    public void altBDCg(Carga cg, List<Carga> LstCarg, int i){
        LstCarg.set(i, cg);
    }

}
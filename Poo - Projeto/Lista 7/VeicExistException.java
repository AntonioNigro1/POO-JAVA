import java.util.List;

public class VeicExistException{


    public void sobreesPas(int i, List<Passeio> LstPas, Passeio ps){
        LstPas.set(i, ps);
    };

    public void sobreesCarg(int i, List<Carga> LstCarg, Carga cg){
        LstCarg.set(i, cg);
    }
}
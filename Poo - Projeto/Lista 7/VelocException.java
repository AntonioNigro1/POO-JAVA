public class VelocException extends Exception{

    public VelocException(){
    }

    public void atribuiPas(ArrayList<Passeio> ps){
    ps.setVelocMax(150);
    }

    public void atribuiPas(ArrayList<Carga> cg){
    cg.setVelocMax(120);
    }
        
}
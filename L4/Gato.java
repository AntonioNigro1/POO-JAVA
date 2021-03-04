public class Gato extends Mamifero{

    private int distVisNot;

    public Gato(){
        distVisNot = 0;

    }

    public Gato(int disVisNot){
        this.distVisNot = disVisNot;
    }

    public int getDistVisNot(){
        return distVisNot;
    }

    public final void setDistVisNot(int distVisNot){
        this.distVisNot = distVisNot;
    }

    public void emitirSom(){
        System.out.println("\nmiau-miau");
    }

    public void calcVeloc(){
        int x;
        x = getVelocidade() * 100;

        System.out.println("\nA velocidade do gato em Cm/h eh: "+x);
    }
}
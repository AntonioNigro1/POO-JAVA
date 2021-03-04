public final class Cao extends Mamifero{

    private String tipo;

    public Cao(){
        tipo = " ";

    }

    public Cao(String tipo){
        this.tipo = tipo;

    }

    public String getTipo(){
        return tipo;
    }

    public final void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void emitirSom(){
        System.out.println("\nAu-au");
    }

    public void calcVeloc(){
        float x = getVelocidade()/1000;
        System.out.println("\nA velocidade do cao em km/h eh: "+x);
    }

}
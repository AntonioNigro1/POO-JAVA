public abstract class Mamifero{

    private String raca;
    private String nome;
    private int velocidade;

    PaisOrigem pOrig;

    public Mamifero(){
        raca = " ";
        nome = " ";
        velocidade = 0;
        pOrig = new PaisOrigem();
    }

    public Mamifero(String raca, String nome, int velocidade){
        this.raca=raca;
        this.nome=nome;
        this.velocidade=velocidade;
        pOrig = new PaisOrigem();
    }

    public PaisOrigem getPOrig(){
        return pOrig;
    }

    public void setPOrig(PaisOrigem pOrig){
        this.pOrig = pOrig;
    }

    //----------------------------------------//

    public String getRaca(){
        return raca;
    }

    public String getNome(){
        return nome;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public final void setRaca(String raca){
        this.raca = raca;
    }

    public final void setNome(String nome){
        this.nome = nome;
    }

    public final void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }

    public abstract void emitirSom();

    public abstract void calcVeloc();


}
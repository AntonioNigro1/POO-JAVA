public class Motor{

    private int qtdPistoes;
    private int potencia;

    public Motor(){
        int qtdPistoes = 0;
        int potencia = 0;
    }

    public void setQtdPistoes(int qtdPistoes){
        this.qtdPistoes = qtdPistoes;
    }

    public int getQtdPistoes(){
        return qtdPistoes;
    }

    public void setPotencia(int potencia){
        this.potencia = potencia;
    }

    public int getPotencia(){
        return potencia;
    }

}
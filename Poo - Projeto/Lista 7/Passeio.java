public final class Passeio extends Veiculo implements Calc{

    private int qtdePassageiro;

    public Passeio(){
        int qtdePassageiro = 0;
    }

    public final int getQtdePassageiro() {
        return qtdePassageiro;
    }

    public final void setQtdePassageiro(int qtdePassageiro) {
        this.qtdePassageiro = qtdePassageiro;
    }

    public final int calcular(Passeio ps){

        int x = ps.getMarca().length() + ps.getModelo().length() + ps.getPlaca().length() + ps.getCor().length();

        return x;
    }

    public int calcVel(Passeio ps){
        int x = ps.getVelocMax() * 1000;

        return x;
    }
    
}
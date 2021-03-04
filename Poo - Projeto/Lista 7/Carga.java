public final class Carga extends Veiculo implements Calc{

    private int tara;
    private int cargaMax;
    
    public Carga(){
        int tara = 0;
        int cargaMax = 0;
    }

    public final int getTara() {
        return tara;
    }


    public final int getCargaMax() {
        return cargaMax;
    }

    public final void setTara(int tara) {
        this.tara = tara;
    }


    public final void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public final int Calcular(Carga cg){
        int x = cg.getTara() + gc.getCargaMax() + cg.getQtdRodas() + cg.getVelocMax();
        return x;
    }

    public int calcVel(Carga cg){
        int x = cg.getVelocMax() * 100000;
        return x;
    }

}
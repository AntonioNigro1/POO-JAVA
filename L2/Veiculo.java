public abstract class Veiculo{

    private String placa;
    private String marca;
    private String modelo;
    private float velocMax;

    Motor mot = new Motor();
    TstPlaca tst = new TstPlaca();

    public Motor getMot(){
        return mot;
    }

    public void setMot(Motor mot){
        this.mot = mot;
    }

    public TstPlaca getTstPlaca(){
        return tst;
    }

    public void setTstPlaca(TstPlaca tst){
        this.tst= tst;
    }

    public String getPlaca(){
        return placa;
    }

    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }

    public float getVelocMax(){
        return velocMax;
    }

    public void setPlaca(String placa){
        if(tst.certificPlaca(placa)){
        this.placa = placa;
        }else{
            System.out.println("\nPlaca invalida, resetando...");
            this.placa = "AAA-AAAA";
        }
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setVelocMax(float velocMax){
        this.velocMax = velocMax;
    }

}
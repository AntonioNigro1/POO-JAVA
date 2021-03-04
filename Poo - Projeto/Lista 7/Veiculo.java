public abstract class Veiculo{
  
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int qtdRodas;
    private int velocMax;
    private Motor motor = new Motor();

    public Veiculo(){
        String placa = " ";
        String marca = " ";
        String modelo = " ";
        String cor = " ";
        int qtdRodas = 0;
        int velocMax = 0;
    }


    public Motor getMotor() {
        return motor;
    }

    public final void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public int getVelocMax() {
        return velocMax;
    }

    public final void setPlaca(String placa)  {
        this.placa = placa;
    }


    public final void setMarca(String marca) {
        this.marca = marca;
    }


    public final void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public final void setCor(String cor) {
        this.cor = cor;
    }


    public final void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }


    public final void setVelocMax(int velocMax) throws VelocException{
        if(velocMax < 100 || velocMax > 250)
        throw new VelocException();
        else
        this.velocMax = velocMax;
    }

    public abstract int calcVel();
}
public abstract class Computador{

    private String proces;
    private String armazen;
    protected String marca;
    private final String so = "Windows";


    private Venda ven = new Venda();

    public Venda getVen(){
        return ven;
    }

    public void setVen(Venda ven){
        this.ven = ven;
    }

    public String getProces(){
        return proces;
    }

    public String getArmazen(){
        return armazen;
    }
    
    public String getMarca(){
        return marca;
    }

    public String getSo(){
        return so;
    }

    public void setProces(String proces){
        this.proces = proces;
    }

    

    public void setArmazen(String armazen){
        this.armazen = armazen;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public abstract int calcFC(); //metodo abstrato e polimorfismo por sobreescrição

}
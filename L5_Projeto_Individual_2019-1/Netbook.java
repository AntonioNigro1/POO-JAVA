public class Netbook extends Computador implements IntA{

    private int tam;
    private int peso;

    Netbook net1 = new Netbook(); // reflexividade 

    public int getTam(){
        return tam;
    }

    public int getPeso(){
        return peso;
    }

    public void setTam(int tam){
        this.tam = tam;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }

    public int calcFC(){

        return 0;
    }

    public String exemp(){
        System.out.println("Aq temos um exemplo de interface");
    }

}
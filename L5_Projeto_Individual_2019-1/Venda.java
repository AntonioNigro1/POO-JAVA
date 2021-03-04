public class Venda{
    private String local;
    private int preco;

    private Fabricacao fab = new Fabricacao();

    public Fabricacao getFab(){
        return fab;
    }

    public void setFab(Fabricacao fab){
        this.fab = fab;
    }

    public String getLocal(){
        return local;
    }

    public int getPreco(){
        return preco;
    }

    public void setLocal(String local){
        this.local = local;
    }

    public void setPreco(int preco){
        this.preco = preco;
    }

}
public class PaisOrigem{
    private int codPais;
    private String nomePais;

    public PaisOrigem(){
        codPais = 0;
        nomePais = " ";
    }

    public PaisOrigem(int codPais, String nomePais){
        this.codPais = codPais;
        this.nomePais = nomePais;
    }


    public int getCodPais(){
        return codPais;
    }

    public String getNomePais(){
        return nomePais;
    }

    public final void setCodPais(int codPais){
        this.codPais = codPais;
    }

    public final void setNomePais(String nomePais){
        this.nomePais = nomePais;
    }
}
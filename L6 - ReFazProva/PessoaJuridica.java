public final class PessoaJuridica extends ClienteBanco{

    private int cnpj = 0;

    PessoaFisica responsavel = new PessoaFisica();
   
    public PessoaFisica getResponsavel() {
        return responsavel;
    }


    public void setResponsavel(PessoaFisica responsavel) {
        this.responsavel = responsavel;
    }


    public int getCnpj() {
        return cnpj;
    }

 
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public void verifDoc(){
        if(this.cnpj>= 50 && this.cnpj<=100)
        System.out.println("\nCNPJ valido");
        else
        System.out.println("\nCNPJ invalido");

    }


}
public class Pessoa{
    
    private int salario;
    private int cpf;

    PesException pe = new PesException();

    SalGdException se = new SalGdException();

    public void setPesException(PesException pe){
        this.pe = pe;
    }

    public PesException getPesException(){
        return pe;
    }



    public void setSal(int salario) throws PesException, SalGdException{
        if(salario < 950)
        throw new PesException();
        else if(salario > 5000)
        throw new SalGdException();
        else
        this.salario = salario;
        
    }

    public int getSal(){
        return salario;
    }

    public void setCpf(int cpf) throws PesException{
        if(cpf <= 0 )
        throw new PesException();
        else
        this.cpf = cpf;

    }

    public int getCpf(){
        return cpf;
    }

   

}
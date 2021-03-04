public abstract class ClienteBanco implements Verifica{

    Endereco end = new Endereco();

    private int numeroConta = 0;
    private String nome = " ";

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }


    public String getNome() {
        return nome;
    }


    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void validar(){
        if(this.numeroConta % 2 == 0)
            System.out.println("\nA conta eh par");
            else
            System.out.println("\nA conta eh impar");

    }

    public abstract void verifDoc(); 

}
public final class PessoaFisica extends ClienteBanco{

    private int cpf = 0;

    public int getCpf() {
        return cpf;
    }


    public void setCpf(int cpf) {
        this.cpf = cpf;
    }


    public void verifDoc(){
        if(this.cpf>= 10 && this.cpf<=20)
        System.out.println("\nCPF valido");
        else
        System.out.println("\nCPF invalido");
    }
}
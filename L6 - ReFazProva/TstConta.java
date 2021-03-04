public class TstConta{

    

    public static void main(String arg[]) {
        
        PessoaJuridica pj = new PessoaJuridica();


        pj.setNome("Antonio");
        pj.getResponsavel().setCpf(15);
        pj.getEnd().setRua("Asterio valim vilela");
        pj.setNumeroConta(1004344);
        pj.setCnpj(75);

        System.out.println("\nNome: "+ pj.getNome());     
        System.out.println("\nCpf: "+pj.getResponsavel().getCpf());    
        pj.getResponsavel().verifDoc();
        System.out.println("\nRua: " +pj.getEnd().getRua());
        System.out.println("\nNumero da conta: "+pj.getNumeroConta());
        System.out.println("\nCNPJ: "+pj.getCnpj());
        pj.verifDoc();
        pj.validar();

    }
}
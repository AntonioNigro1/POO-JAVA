public class TstPes{

    public static void main(String args[]){

        PesException pe = new PesException();
        SalGdException se = new SalGdException();
        Pessoa ps = new Pessoa();

        try{
            ps.setCpf(Integer.parseInt(new Entrada().inData("\nInforme o cpf: ")));
            ps.setSal(Integer.parseInt(new Entrada().inData("\nInforme o salario: ")));
        }

        catch(PesException ePe){
            if(ps.getSal() < 950)
            ePe.eSal();
            if(ps.getCpf() <=0)
            ePe.eCpf();
        }

        catch(SalGdException eSe){
            eSe.salGrnd();
        }

       catch(NumberFormatException nfe){
           System.out.println("\n--Erro na alimentacao de dados, deve ser inteiro--");
        }

        finally{//executa sempre
            System.out.println("\n--ex de finally--");
        }


        System.out.println("\nCpf: "+ps.getCpf());
        System.out.println("\nSal: "+ps.getSal());
    }

}
public class Ex1 extends Exercicio{

    public void resultadoFinal(){ //Polimorfismo sobreescrito
        float notaF = formaCalculo(getNota(), getNota());

        if(notaF<=7)
            System.out.println("\nReprovado");
        else
            System.out.println("\nAprovado");
            
    }

    Exercicio ex10 = new Ex1(); //Polimorfismo coercivo
    
}
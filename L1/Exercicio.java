public abstract class Exercicio {
    private String enunciado;
    private String resposta;
    private float nota;
    protected int calcNota;


    public String getEnunciado(){
        return enunciado;
    }

    public String getResposta(){
        return resposta;
    }

    public float getNota(){
        return nota;
    }

    public int getCalcNota(){
        return calcNota;
    }

    public void setEnunciado(String enunciado){
        this.enunciado = enunciado;
    }

    public void setResposta(String resposta){
        this.resposta = resposta;
    }

    public void setNota(float nota){
        this.nota = nota;
    }

    public void setCalcNota(int calcNota){
        this.calcNota = calcNota;
    }

    public float formaCalculo(float n1, float n2){
        float resultado;
        resultado = (n1 + n2)/2;
        
        return resultado;
    }

    public float formaCalculo(float n1, float n2, float t1){ //Polimorfismo por sobrecarga
        float resultado;
        resultado = (n1 * 0,4) + (n2 * 0,4) + (t1 * 0,2);
        
        return resultado;
    }
    
    public void resultadoFinal(){
        float notaF = formaCalculo(getNota(), getNota());

        if(notaF<6)
            System.out.println("\nReprovado");
        else
            System.out.println("\nAprovado");
            
    }
}
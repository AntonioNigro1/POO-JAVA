import javax.lang.model.util.ElementScanner6;

public final class Desktop extends Computador implements Calc, Letra{

    private int placaV;
    private String cdRom;
    private int gzPross;

    public int getPlacaV(){
        return placaV;
    }

    public String getCdRom(){
        return cdRom;
    }

    public int getGzPross(){
        return gzPross;
    }

    public void setPlacaV(int placaV){
        this.placaV = placaV;
    }

    public void setCdRom(String cdRom){
        this.cdRom = cdRom;
    }
    
    public void setGzPross(int gzPross){
        this.gzPross = gzPross;
    }
    
    public void impDados(){
        super.impDados();
    }
    
    public void mult(){
        
        System.out.println("\n valor vale: " +valor);
    }

    public void mostraLetra(){
        System.out.println("conteudo da string: " +frase);
    }

    public int calcFC(){ //polimorfismo por sobreescrição 
        int fc;
        if(getGzPross() > 2)
        fc = getGzPross() * 2;
        else
        fc = getGzPross();

        return fc;
    }

    public int calcFC(int placaV){ //polimorfismo por sobrecarga
        int fc;
        fc = getGzPross() * 2 + placaV;

        return fc;
    }
}
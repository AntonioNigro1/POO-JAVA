public class TstComp{

    public static void main(String arg[]){

        Desktop desk = new Desktop();

        Netbook net = new Netbook();

        EntDados e = new EntDados();

        Computador poli = new Desktop(); //polimorfismo por coerção

        

        System.out.println("\nNetbook");
        net.setArmazen(e.inData("\nDigite o tipo de amarzenamento: "));
        net.setMarca(e.inData("\nDigite a marca: "));
        net.setPeso(Integer.parseInt(e.inData("\nDigite o peso: ")));
        net.setProces(e.inData("\nDigite o processador: "));
        net.setTam(Integer.parseInt(e.inData("\nDigite o tamanho: ")));
        net.getVen().setLocal(e.inData("\nDigite o local de compra: "));
        net.getVen().setPreco(Integer.parseInt(e.inData("\nDigite o preco: ")));
        net.getVen().getFab().setData(Integer.parseInt(e.inData("\nDigite a data(sem barras) de compra: ")));
        net.getVen().getFab().setLote(Integer.parseInt(e.inData("\nDigite o lote: ")));


        System.out.println("\nDesktop");
        desk.setArmazen(e.inData("\nDigite o tipo de armazenamento: "));
        desk.setCdRom(e.inData("\nPossui cdrom?: "));
        desk.setMarca(e.inData("\nDigite a marca: "));
        desk.setPlacaV(Integer.parseInt(e.inData("\nDigite a potencia da placa de video: ")));
        desk.setProces(e.inData("\nDigite o processador: "));
        desk.getVen().setLocal(e.inData("\nDigite o local de compra: "));
        desk.getVen().setPreco(Integer.parseInt(e.inData("\nDigite o preco: ")));
        desk.getVen().getFab().setData(Integer.parseInt(e.inData("\nDigite a data(sem barras) de compra: ")));
        desk.getVen().getFab().setLote(Integer.parseInt(e.inData("\nDigite o lote: ")));

        desk.mult();
        
        System.out.println("\nArmazenamento: "+net.getArmazen());
        System.out.println("\nMarca: "+net.getArmazen());
        System.out.println("\nPeso: "+net.getPeso());
        System.out.println("\nProcessador: "+net.getProces());
        System.out.println("\nTamanho: "+net.getTam());
        System.out.println("\nLocal de venda: "+net.getVen().getLocal());
        System.out.println("\nPreco: "+net.getVen().getPreco());
        System.out.println("\nData: "+net.getVen().getFab().getData());
        System.out.println("\nLote: "+net.getVen().getFab().getLote());

        System.out.println("\n-----------------------------------");

        System.out.println("\nArmazenamento: "+desk.getArmazen());
        System.out.println("\nMarca: "+desk.getArmazen());
        System.out.println("\nCdrom: "+desk.getCdRom());
        System.out.println("\nProcessador: "+desk.getProces());
        System.out.println("\nPlaca e video: "+desk.getPlacaV());
        System.out.println("\nLocal de venda: "+desk.getVen().getLocal());
        System.out.println("\nPreco: "+desk.getVen().getPreco());
        System.out.println("\nData: "+desk.getVen().getFab().getData());
        System.out.println("\nLote: "+desk.getVen().getFab().getLote());
        System.out.println("\nSo: "+desk.getSo());
    }
}
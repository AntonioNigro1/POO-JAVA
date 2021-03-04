import java.util.ArrayList;
import java.io.*;

public class Teste{
    
    public static void main(String args[]) {
    Leitura le = new Leitura();
    BDVeiculos bdv = new BDVeiculos();
    Lista<Passeio> LstPas = new ArrayList<Passeio>();
    Lista<Carga> LstCarg = new ArrayList<Carga>();
    int x;
    while(z != 9){
        System.out.println("\nSistema de Gestao de Veiculos - Menu inicial");
        System.out.println("\n1-_ Cadastrar Veiculo de Passeio");
        System.out.println("\n2-_ Cadastrar Veiculo de Carga");
        System.out.println("\n3-_ Imprimir Todos os Veiculos de Passeio");
        System.out.println("\n4-_ Imprimir Todos os Veiculos de Carga");
        System.out.println("\n5-_ Imprimir Veiculo de Passeio pela Placa");
        System.out.println("\n6-_ Imprimir Veiculo de Carga pela Placa");
        System.out.println("\n7-_ Alterar dados do Veiculo de Passeio pela Placa");
        System.out.println("\n8-_ Alterar dados do Veiculo de Carga pela Placa");
        System.out.println("\n9-_ Sair do Sistema");
        z= Integer.parseInt(le.entraDados("\nDigite a operacao desejada: "));
        x = 0;
        switch(z){
            case 1:
                    x=1;r=0;
                while(x != 2){
                    Passeio ps = new Passeio();
                    int r;
                    System.out.println("\nVEICULO DE PASSEIO ------------");
                    ps.setPlaca(Integer.parseInt(le.entraDados("\nDigite a placa: ")));
                    try{int indc = bdv.buscPlacaPas(ps.getPlaca(), LstPas);
                    }
                    catch(VeicExistException vee){
                    int n= Integer.parseInt(le.entraDados("\nPlaca ja cadastrada, deseja sobreescrever o veiculo?(1 para sim, 2 para nao): "));
                        if(n==1){
                    ps.setMarca(le.entraDados("\nDigite a marca: "));
                    ps.setModelo(le.entraDados("\nDigite o modelo: "));
                    ps.setCor(le.entraDados("\nDigite a cor: "));
                    ps.setQtdRodas(Integer.parseInt(le.entraDados("\nDigite a quantidade de rodas: ")));
                    ps.setQtdePassageiro(Integer.parseInt(le.entraDados("\nDigite a quantidade de passageiros: ")));
                    ps.setVelocMax(Integer.parseInt(le.entraDados("\nDigite a velocidade maxima em Km/h: "))); 
                    r=1;
                    vee.sobreesPas(indc, LstPas, ps);
                        }
                    }
                    if(r != 1){
                        ps.setMarca(le.entraDados("\nDigite a marca: "));
                        ps.setModelo(le.entraDados("\nDigite o modelo: "));
                        ps.setCor(le.entraDados("\nDigite a cor: "));
                        ps.setQtdRodas(Integer.parseInt(le.entraDados("\nDigite a quantidade de rodas: ")));
                        ps.setQtdePassageiro(Integer.parseInt(le.entraDados("\nDigite a quantidade de passageiros: ")));
                        ps.setVelocMax(Integer.parseInt(le.entraDados("\nDigite a velocidade maxima em Km/h: ")));
                    }
                    x = Integer.parseInt(le.entraDados("\n 1-_Cadastrar outro veiculo de Passeio | 2-_Voltar ao menu principal: "));
                }
            break;

            case 2:
                    x=1;r=0;
                while(x != 2){
                    Carga cg = new Carga();
                    int r;
                    System.out.println("\nVEICULO DE CARGA ------------");
                    cg.setPlaca(Integer.parseInt(le.entraDados("\nDigite a placa")));
                    try{int indc = bdv.buscPlacaPas(cg.getPlaca(), LstCarg);
                    }
                    catch(VeicExistException vee){
                    int n= Integer.parseInt(le.entraDados("\nPlaca ja cadastrada, deseja sobreescrever o veiculo?(1 para sim, 2 para nao): "));
                        if(n==1){
                    cg.setMarca(le.entraDados("\nDigite a marca: "));
                    cg.setModelo(le.entraDados("\nDigite o modelo: "));
                    cg.setCor(le.entraDados("\nDigite a cor: "));
                    cg.setQtdRodas(Integer.parseInt(le.entraDados("\nDigite a quantidade de rodas: ")));
                    cg.setTara(Integer.parseInt(le.entraDados("\nDigite a tara: ")));
                    cg.setCargaMax(Integer.parseInt(le.entraDados("\nDigite a carga maxima: ")));
                    cg.setVelocMax(Integer.parseInt(le.entraDados("\nDigite a velocidade maxima em Km/h: "))); 
                    r=1;
                    vee.sobreesCarg(indc, LstCarg, cg);
                        }
                    }
                    if(r != 1){
                        cg.setMarca(le.entraDados("\nDigite a marca: "));
                        cg.setModelo(le.entraDados("\nDigite o modelo: "));
                        cg.setCor(le.entraDados("\nDigite a cor: "));
                        cg.setQtdRodas(Integer.parseInt(le.entraDados("\nDigite a quantidade de rodas: ")));
                        cg.setTara(Integer.parseInt(le.entraDados("\nDigite a tara: ")));
                        cg.setCargaMax(Integer.parseInt(le.entraDados("\nDigite a carga maxima: ")));
                        cg.setVelocMax(Integer.parseInt(le.entraDados("\nDigite a velocidade maxima em Km/h: ")));
                    }
                    x = Integer.parseInt(le.entraDados("\n 1-_Cadastrar outro veiculo de Carga | 2-_Voltar ao menu principal: ")); 
                }
            break;

        case 3:
                System.out.println("\nImprimindo todos os veiculos de passeio");
                for(i=0;i<=LstPas.size();i++){
                    System.out.prinln("\nModelo: "+LstPas.get(i).getModelo());
                    System.out.prinln("\nMarca: "+LstPas.get(i).getMarca());
                    System.out.prinln("\nCor "+LstPas.get(i).getCor());
                    System.out.prinln("\nQuantidade de rodas: "+LstPas.get(i).getQtdRodas());
                    System.out.prinln("\nQuantidade de passageiros: "+LstPas.get(i).getQtdePassageiro());
                    int vel = ps.calcVel(LstPas.get(i).getVelocMax());
                    System.out.prinln("\nVelocidade maxima em m/h: "+vel);
                    System.out.prinln("\n-----------------------------");
                }
            break;
        
        case 4:
            System.out.println("\nImprimindo todos os veiculos de carga");
            for(i=0;i<=LstCarg.size();i++){
                System.out.prinln("\nModelo: "+LstCarg.get(i).getModelo());
                System.out.prinln("\nMarca: "+LstCarg.get(i).getMarca());
                System.out.prinln("\nCor "+LstCarg.get(i).getCor());
                System.out.prinln("\nQuantidade de rodas: "+LstCarg.get(i).getQtdRodas());
                System.out.prinln("\nCarga maxima: "+LstCarg.get(i).getCargaMax());
                System.out.prinln("\nTara maxima: "+LstCarg.get(i).getTara());
                int vel = cg.calcVel(LsCarg.get(i).getVelocMax());
                System.out.prinln("\nVelocidade maxima em cm/h: "+vel);
                System.out.prinln("\n-----------------------------");
            }
            break;

        case 5:
            System.out.println("\nImprimindo veiculo de passeio baseado na Placa");
            String pSch = " ";
            while(pSch.length()!=8){
               pSch = le.entraDados("\nDigite a Placa ( APENAS 8 digitos): "); 
            }
            for(i=0;LstPas.get(i).getPlaca() != pSch; i++){}
            
            System.out.prinln("\nModelo: "+LstPas.get(i).getModelo());
            System.out.prinln("\nMarca: "+LstPas.get(i).getMarca());
            System.out.prinln("\nCor "+LstPas.get(i).getCor());
            System.out.prinln("\nQuantidade de rodas: "+LstPas.get(i).getQtdRodas());
            System.out.prinln("\nQuantidade de passageiros: "+LstPas.get(i).getQtdePassageiro());
            int vel = ps.calcVel(LstPas.get(i).getVelocMax());
            System.out.prinln("\nVelocidade maxima em m/h: "+vel);
            System.out.prinln("\n-----------------------------");
            
            break;

        case 6:
            System.out.println("\nImprimindo veiculo de carga baseado na Placa");
            String cSch = " ";
            while(cSch.length()!=8){
            cSch = le.entraDados("\nDigite a Placa ( APENAS 8 digitos): "); 
            }
            for(i=0;LstCarg.get(i).getPlaca() != pSch; i++){}
            System.out.prinln("\nModelo: "+LstCarg.get(i).getModelo());
            System.out.prinln("\nMarca: "+LstCarg.get(i).getMarca());
            System.out.prinln("\nCor "+LstCarg.get(i).getCor());
            System.out.prinln("\nQuantidade de rodas: "+LstCarg.get(i).getQtdRodas());
            System.out.prinln("\nCarga maxima: "+LstCarg.get(i).getCargaMax());
            System.out.prinln("\nTara maxima: "+LstCarg.get(i).getTara());
            int vel2 = cg.calcVel(LsCarg.get(i).getVelocMax());
            System.out.prinln("\nVelocidade maxima em cm/h: "+vel2);
            System.out.prinln("\n-----------------------------");

            break;

        case 7:
            System.out.println("\nAlterar dados de veiculo de passeio baseado na placa");
            String pSA = " ";
            while(pSA.length()!=8){
            pSA= le.entraDados("\nDigite a Placa ( APENAS 8 digitos): "); 
            }
            for(i=0;LstPas.get(i).getPlaca() != pSA; i++){}
            Passeio ps = new Passeio();
            ps.setMarca(le.entraDados("\nDigite a marca: "));
            ps.setModelo(le.entraDados("\nDigite o modelo: "));
            ps.setCor(le.entraDados("\nDigite a cor: "));
            ps.setQtdRodas(Integer.parseInt(le.entraDados("\nDigite a quantidade de rodas: ")));
            ps.setQtdePassageiro(Integer.parseInt(le.entraDados("\nDigite a quantidade de passageiros: ")));
            ps.setVelocMax(Integer.parseInt(le.entraDados("\nDigite a velocidade maxima em Km/h: ")));
            ps.setPlaca(pSA);
            bdv.altBDPs(ps, LstPas, i);
            break;

        case 8:
            System.out.println("\nAlterar dados de veiculo de passeio baseado na placa");
            String cSA = " ";
            while(cSA.length()!=8){
            cSA= le.entraDados("\nDigite a Placa ( APENAS 8 digitos): "); 
            }
            for(i=0;LstCarg.get(i).getPlaca() != cSA; i++){}
            Carga cg = new Carga();
            cg.setMarca(le.entraDados("\nDigite a marca: "));
            cg.setModelo(le.entraDados("\nDigite o modelo: "));
            cg.setCor(le.entraDados("\nDigite a cor: "));
            cg.setQtdRodas(Integer.parseInt(le.entraDados("\nDigite a quantidade de rodas: ")));
            cg.setTara(Integer.parseInt(le.entraDados("\nDigite a tara: ")));
            cg.setCargaMax(Integer.parseInt(le.entraDados("\nDigite a carga maxima: ")));
            cg.setVelocMax(Integer.parseInt(le.entraDados("\nDigite a velocidade maxima em Km/h: ")));
            cg.setPlaca(cSA);
            bdv.altBDCg(cg, LstCarg, i);
            break;

        case 9:
            System.out.println("\nVoce escolheu sair, fechando sistema");
            z= 9;
            break;
        }
    }
    }
}
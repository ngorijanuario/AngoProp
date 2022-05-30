package angoprop;
import java.util.*;
//@author Ngori Januário
public class AngoProp {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Propriedades a = new Propriedades();
        int [] dadosId = new int[5];
        String [] dadosApelido= new String[5];
        String [] dadosTipoDePropiedade = new String[5];
        double [] dadosTamanhoDaPropiedade = new double[5];
        int ArrayDisplayId[] = new int[5];
        String ArrayDisplayApelido[] = new String[5];
        String ArrayDisplayTipoDePropiedade[] = new String[5];
        double ArrayDisplayTamanhoDaPropiedade[] = new double[5];
        boolean estado = true;
        int opcao, id, n=0;
        double tamanhodapropiedade=0.0;
        String apelido, tipodepropiedade;
        do{
            System.out.println(" -------- Menu -------");
            System.out.printf("1 - Adicionar Imovel\n2 - Procurar Imovel\n3 - Calcular Preço\n4 - Mostrar mais Cara\n5 - Mostrar todos Imoveis\n6 - Organiza Imovel\n");
            System.out.println("----------------------");
            System.out.printf("Resposta: ");
            opcao = entrada.nextInt();
            switch(opcao){
                case 1:
                    //Esta opcção pede ao usuário pelos detalhes da Propriedades a adicionar no array de Objectos
                    System.out.println("1 - Adicionar Imovel");
                    
                    while(n<5){
                        int contador = 1;
                        System.out.printf("--- Dados da %dª Propiedade ---\n", contador++);
                        
                        System.out.printf("ID da propiedade: ");
                        id = entrada.nextInt();
                        a.setIdProp(id);
                        dadosId[n] = a.getIdProp();
                        ArrayDisplayId[n] = id;
                        
                        System.out.printf("Apelido Da Propiedade: ");
                        apelido = entrada.next();
                        a.setApelidoProp(apelido);
                        dadosApelido[n] = a.getApelidoProp();
                        ArrayDisplayApelido[n] = apelido;
                        
                        System.out.printf("Tipo De Propiedade: ");
                        tipodepropiedade = entrada.next();
                        a.setTipoDePropriedade(tipodepropiedade);
                        dadosTipoDePropiedade[n] = a.getTipoDePropiedade();
                        ArrayDisplayTipoDePropiedade[n] = tipodepropiedade;
                        
                        System.out.printf("Tamanho Da Propiedade: ");
                        tamanhodapropiedade = entrada.nextDouble();
                        a.setTamanhoDaPropriedade(tamanhodapropiedade);
                        dadosTamanhoDaPropiedade[n] = a.getTamanhoDaPropiedade();
                        ArrayDisplayTamanhoDaPropiedade[n] = tamanhodapropiedade;
                        
                        System.out.print("Digite 'S' pra continuar e 'N' para terminar\nResposta: ");
                        String cont;
                        cont=entrada.next();
                        switch(cont){
                            case "S":
                                n++;
                            break;
                            case "N":
                                n =6;
                            break;
                            default:
                                n=6;
                            break;
                        }
                    }
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.println("3 - Calcular Preço");
                    break;
                case 4:
                    System.out.println("4 - Mostrar mais Cara");
                    break;
                case 5:
                    System.out.println("5 - Mostrar todos Imoveis");
                    for(int nv=1;nv<=5;nv++){
                        System.out.printf("--- Dados da %dª Propiedade ---\n", nv);
                        System.out.println("ID da Prpopiedade: "+ArrayDisplayId[nv]);
                        System.out.println("Apelido da Propiedade: "+ArrayDisplayApelido[nv]);
                        System.out.println("Tipo de Propiedade: "+ArrayDisplayTipoDePropiedade[nv]);
                        System.out.println("Tamanho da Propiedade: "+ArrayDisplayTamanhoDaPropiedade[nv]);
                    }
                    break;
                case 6:
                    System.out.println("6 - Organiza Imovel");
                    break;
                default:
                    System.out.println("O programa será terminado.");
                    break;
            }
            
            System.out.print("Digite 'S' pra continuar e 'N' para terminar\nResposta: ");
            String cont;
            cont=entrada.next();
            switch(cont){
                case "S":
                    estado = false;
                break;
                case "N":
                    estado = true;
                break;
                default:
                    estado = true;
                break;
            }
        }while(estado!=true);
        
    }
}

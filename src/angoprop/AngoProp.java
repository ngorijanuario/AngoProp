package angoprop;
import java.util.*;
//@author Ngori Januário
public class AngoProp {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        //Criação uma instância de Array por referencias
        Propriedades[] dadosEmArray = new Propriedades[2];
        //Criação de uma instância de um array do tipo primitivo para inicializar as variaveis
        Propriedades dadosPrimitivos = new Propriedades();
        
        //Declaração de variaveis
        String opcao;
        int n=0;
        int id = dadosPrimitivos.getIdProp();
        String apelido = dadosPrimitivos.getApelidoProp();
        String tipo = dadosPrimitivos.getTipoDePropiedade();
        double tamanho = dadosPrimitivos.getTamanhoDaPropiedade();
        boolean estado=true, controle = true;
        double[] precos = new double[2];
        do{
            //Criando variaveis locais
            boolean conversaoID = true,conversaoTamanho = true;
            String identidadeDApropriedade,tamanhodaPropriedade;
            //Criação de um menu dinamico
            System.out.println("--------- Menu --------");
            System.out.printf("1 - Adicionar Imovel\n2 - Procurar Imovel\n3 - Calcular Preço\n4 - Mostrar mais Cara\n5 - Mostrar todos Imoveis\n6 - Organiza Imovel\n");
            System.out.println("----------------------");
            System.out.printf("Escolhe uma das opções para continuar\nResposta: ");
            opcao = entrada.next();
            switch(opcao){
                case "1":
                    System.out.println("1 - Adicionar Imovel");
                    if(controle != false){
                        for(int a = 0; a< dadosEmArray.length; a++){
                            System.out.printf("---- Dados do %dº Imovel ----\n",(a+1));
                            System.out.printf("ID da Propiedade: ");
                            id = entrada.nextInt();
                            System.out.printf("Apelido da Propiedade: ");
                            apelido = entrada.next();
                            System.out.printf("Tipo da Propiedade: %s \n",dadosPrimitivos.propiedades());
                            tipo = dadosPrimitivos.propiedades();
                            System.out.printf("Tamanho da Propiedade: ");
                            tamanho = entrada.nextDouble();
                            dadosEmArray[a] = new Propriedades(id,apelido,tipo,tamanho);
                        }
                        controle = false;
                    }else{
                        System.out.println("OBS: Atingiu o limite de registros de Imoveis");
                    }
                    break;
            case "2":
                System.out.println("2 - Procura Imovel");
                System.out.println("----------------------");
                System.out.printf("Digite o ID: ");
                id = entrada.nextInt();
                for (int a = 0; a< dadosEmArray.length; a++) {
                    if(id == dadosEmArray[a].getIdProp()){
                        System.out.println("Dados encontrados");
                        System.out.println("ID: "+dadosEmArray[a].getIdProp()+", Apelido: "+dadosEmArray[a].getApelidoProp()+ ", Tipo: "+dadosEmArray[a].getTipoDePropiedade()+", Tamanho: "+dadosEmArray[a].getTamanhoDaPropiedade());
                        break;
                    }else{
                        System.out.println("ALERTA: Nenhum dado encontrado");
                    }
                }
                break;
            case "3":
                System.out.println("3 - Calcular Preço");
                if(controle == true){
                    System.out.println("ALERTA: Aindão não foram adicionados imoveis");
                }else{
                    System.out.printf("Digite o ID do imovel: ");
                    identidadeDApropriedade = entrada.next();
                    while(conversaoID){
                        try{
                            id = Integer.parseInt(identidadeDApropriedade);
                            conversaoID = false;
                        }catch(Exception e){
                            System.out.printf("\nALERTA: Digite um ID valido");
                            System.out.printf("\nID da Propiedade: ");
                            id = entrada.nextInt();
                            break;
                        }
                    }
                    for (int a = 0; a< dadosEmArray.length; a++) {
                        if(id == dadosEmArray[a].getIdProp()){
                            System.out.printf("A Propriedade esta avaliada em: %.2f AOA \n",dadosPrimitivos.calcularPreco(dadosEmArray[a].getTipoDePropiedade(), dadosEmArray[a].getTamanhoDaPropiedade()));
                            break;
                        }
                        else{
                            System.out.println("ALERTA: Nenhum dado encontrado");
                        }
                    }
                }
                break;
            case "4":
                System.out.println("4 - Mostrar mais Cara");
                if(controle == true){
                    System.out.println("ALERTA: Aindão não foram adicionados imoveis");
                }else{
                    double maior = Integer.MIN_VALUE;
                    for (int a = 0; a< dadosEmArray.length; a++) {
                        precos[a] = dadosPrimitivos.calcularPreco(dadosEmArray[a].getTipoDePropiedade(), dadosEmArray[a].getTamanhoDaPropiedade());
                            if(precos[a] > maior){
                                maior = precos[a];
                                id = dadosEmArray[a].getIdProp();
                                apelido = dadosEmArray[a].getApelidoProp();
                                tipo = dadosEmArray[a].getTipoDePropiedade();
                                tamanho = dadosEmArray[a].getTamanhoDaPropiedade();
                        }
                    }
                    System.out.printf("ID: %d, Apelido: %s, Tipo: %s, Tamanho: %f, Preço: %.2f \n",id,apelido,tipo,tamanho,maior);
                }
                break;
                case "5":
                    System.out.println("5 - Mostrar todos Imoveis");
                        for (int a = 0; a< dadosEmArray.length; a++) {
                            System.out.println("ID: "+dadosEmArray[a].getIdProp()+", Apelido: "+dadosEmArray[a].getApelidoProp()+ ", Tipo: "+dadosEmArray[a].getTipoDePropiedade()+", Tamanho: "+dadosEmArray[a].getTamanhoDaPropiedade());
                        }
                    break;
            case "6":
                System.out.println("6 - Organiza Imovel");
                if(controle == true){
                   System.out.println("ALERTA: Aindão não foram adicionados imoveis");
                }else{
                    System.out.println("Organização por ID");
                    Arrays.sort(dadosEmArray);
                }
                break;
            default:
                System.out.println("ALERTA: Opção invalida, o programa será terminado.");
                System.exit(0);
                break;
            }
        
            System.out.printf("----------------------\nDesejas continuar?\n1 - Voltar ao Menu\n2 - Terminar o programa\nDecisão: ");
            String cont;
            cont=entrada.next();
            switch(cont){
                case "1":
                    estado = true;
                break;
                case "2":
                    System.out.println("ALERTA: O programa será terminado.");
                    estado = false;
                break;
                default:
                    System.out.println("ALERTA: Opção invalida, o programa será terminado.");
                    estado = false;
                break;
            }
        }while(estado!=false);
    }
}

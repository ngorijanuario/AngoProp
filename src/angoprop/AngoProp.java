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
        int identidade = dadosPrimitivos.getIdProp();
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
                            identidadeDApropriedade = entrada.next();
                            //Convertendo o valor para inteiro
                            if(!identidadeDApropriedade.substring(1).matches("[0-9]*")){
                                System.out.printf("\nALERTA: Caso voltar digitar ID que não seja um inteiro o programa será terminado.");
                                System.out.printf("\nID da Propiedade: ");
                                identidadeDApropriedade = entrada.next();
                                if(!identidadeDApropriedade.substring(1).matches("[0-9]*")){System.exit(0);
                                }else{identidade = Integer.parseInt(identidadeDApropriedade);if(identidade<0){identidade = identidade*-1;
                                System.out.printf("ALERTA: Os IDs não podem ser negativos, convertemos ID para positivo.\n assim ao pesquisar o ID digite apenas o número.\n");}
                                }
                            }else{
                                identidade = Integer.parseInt(identidadeDApropriedade);if(identidade<0){identidade = identidade*-1;
                                System.out.printf("ALERTA: Os IDs não podem ser negativos, convertemos ID para positivo.\n assim ao pesquisar o ID digite apenas o número.\n");
                                }
                            }
                            //Fim da conversão
                            System.out.printf("Apelido da Propiedade: ");
                            apelido = entrada.next();
                            System.out.printf("Tipo da Propiedade: %s \n",dadosPrimitivos.propiedades());
                            tipo = dadosPrimitivos.propiedades();
                            System.out.printf("Tamanho da Propiedade: ");
                            tamanhodaPropriedade = entrada.next();
                            while(conversaoTamanho){
                                try{
                                    tamanho = Integer.parseInt(identidadeDApropriedade);
                                    conversaoTamanho = false;
                                }catch(Exception e){
                                    System.out.printf("\nALERTA: Digite um tamanho valido");
                                    System.out.printf("\nTamanho da Propiedade: ");
                                    tamanho = entrada.nextInt();
                                    break;
                                }
                            }
                            dadosEmArray[a] = new Propriedades(identidade,apelido,tipo,tamanho);
                        }
                        controle = false;
                    }else{
                        System.out.println("OBS: Atingiu o limite de registros de Imoveis");
                    }
                    break;
            case "2":
                System.out.println("2 - Procura Imovel");
                if(controle == true){
                    System.out.println("ALERTA: Aindão não foram adicionados imoveis");
                }else{
                    System.out.println("----------------------");
                    System.out.printf("Digite o ID: ");
                    identidadeDApropriedade = entrada.next();
                    //Convertendo o valor para inteiro
                    if(!identidadeDApropriedade.substring(1).matches("[0-9]*")){
                        System.out.printf("\nALERTA: Caso voltar digitar ID que não seja um inteiro o programa será terminado.");
                        System.out.printf("\nID da Propiedade: ");
                        identidadeDApropriedade = entrada.next();
                        if(!identidadeDApropriedade.substring(1).matches("[0-9]*")){System.exit(0);
                        }else{identidade = Integer.parseInt(identidadeDApropriedade);if(identidade<0){identidade = identidade*-1;}
                        }
                    }else{
                        identidade = Integer.parseInt(identidadeDApropriedade);if(identidade<0){identidade = identidade*-1;}
                    }
                    //Fim da conversão
                    for ( int i = 0; i < dadosEmArray.length; i++) {
                        if (dadosEmArray[i].getIdProp() == identidade) {
                            System.out.println("Dados encontrados");
                            System.out.println("ID: "+dadosEmArray[i].getIdProp()+", Apelido: "+dadosEmArray[i].getApelidoProp()+ ", Tipo "+dadosEmArray[i].getTipoDePropiedade()+", Tamanho: "+dadosEmArray[i].getTamanhoDaPropiedade());
                        }
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
                    //Convertendo o valor para inteiro
                    if(!identidadeDApropriedade.substring(1).matches("[0-9]*")){
                        System.out.printf("\nALERTA: Caso voltar digitar ID que não seja um inteiro o programa será terminado.");
                        System.out.printf("\nID da Propiedade: ");
                        identidadeDApropriedade = entrada.next();
                        if(!identidadeDApropriedade.substring(1).matches("[0-9]*")){System.exit(0);
                        }else{identidade = Integer.parseInt(identidadeDApropriedade);if(identidade<0){identidade = identidade*-1;}
                        }
                    }else{
                        identidade = Integer.parseInt(identidadeDApropriedade);if(identidade<0){identidade = identidade*-1;}
                    }
                    //Fim da conversão
                    for (int a = 0; a< dadosEmArray.length; a++) {
                        if(identidade == dadosEmArray[a].getIdProp()){
                            System.out.printf("A Propriedade esta avaliada em: %.2f AOA \n",dadosPrimitivos.calcularPreco(dadosEmArray[a].getTipoDePropiedade(), dadosEmArray[a].getTamanhoDaPropiedade()));
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
                                identidade = dadosEmArray[a].getIdProp();
                                apelido = dadosEmArray[a].getApelidoProp();
                                tipo = dadosEmArray[a].getTipoDePropiedade();
                                tamanho = dadosEmArray[a].getTamanhoDaPropiedade();
                        }
                    }
                    System.out.println("----------------------");
                    System.out.printf("ID: %d, Apelido: %s, Tipo: %s, Tamanho: %f, Preço: %.2f \n",identidade,apelido,tipo,tamanho,maior);
                }
                break;
                case "5":
                    System.out.println("5 - Mostrar todos Imoveis");
                    System.out.println("----------------------");
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
                    //Organizando os dados pelos IDs
                    Arrays.sort(dadosEmArray, (first, second) -> (first.getIdProp()!= second.getIdProp()) ?
                                        (first.getIdProp()- second.getIdProp()) :
                                        (first.getApelidoProp().compareTo(second.getApelidoProp())));
                    for (int a = 0; a< dadosEmArray.length; a++) {
                        System.out.println("ID: "+dadosEmArray[a].getIdProp()+", Apelido: "+dadosEmArray[a].getApelidoProp()+ ", Tipo: "+dadosEmArray[a].getTipoDePropiedade()+", Tamanho: "+dadosEmArray[a].getTamanhoDaPropiedade());
                    }
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

package angoprop;
import java.util.*;
//@author Ngori Januário
public class AngoProp {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        //Criação de Array
        List<Propriedades> dados = new ArrayList<Propriedades>();
        Propriedades a = new Propriedades();
        //Declaração de variaveis
        String opcao;
        int identidade = a.getIdProp();
        String apelido = a.getApelidoProp();
        String tipo = a.getTipoDePropiedade();
        double tamanho = a.getTamanhoDaPropiedade();
        boolean estado = true;
        double[] precos = new double[20];
        int in=0;
        
 
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
                System.out.printf("ID da Propiedade: ");
                identidadeDApropriedade = entrada.next();
                while(conversaoID){
                    try{
                        identidade = Integer.parseInt(identidadeDApropriedade);
                        conversaoID = false;
                    }catch(Exception e){
                        System.out.printf("\nALERTA: Digite um ID valido");
                        System.out.printf("\nID da Propiedade: ");
                        identidade = entrada.nextInt();
                        break;
                    }
                }
                System.out.printf("Apelido da Propiedade: ");
                apelido = entrada.next();
                System.out.printf("Tipo da Propiedade: "+a.propiedades());
                tipo = a.propiedades();
                System.out.printf("\nTamanho da Propiedade: ");
                tamanhodaPropriedade = entrada.next();
                while(conversaoTamanho){
                    try{
                        tamanho = Integer.parseInt(tamanhodaPropriedade);
                        conversaoTamanho = false;
                    }catch(Exception e){
                        System.out.printf("\nALERTA: Digite um tamanho valido");
                        System.out.printf("\nTamanho da Propiedade: ");
                        tamanho = entrada.nextDouble();
                        break;
                    }
                }
                dados.add(new Propriedades(identidade, apelido, tipo,tamanho));
                precos[in] = a.calcularPreco(tipo, tamanho);
                in++;
                break;
            case "2":
                System.out.println("2 - Procura Imovel");
                if(dados.isEmpty()){
                    System.out.println("ALERTA: Aindão não foram adicionados imoveis");
                }else{
                    System.out.println("----------------------");
                    System.out.printf("Digite o ID: ");
                    identidadeDApropriedade = entrada.next();
                    while(conversaoID){
                        try{
                            identidade = Integer.parseInt(identidadeDApropriedade);
                            conversaoID = false;
                        }catch(Exception e){
                            System.out.printf("\nALERTA: Digite um ID valido");
                            System.out.printf("\nID da Propiedade: ");
                            identidade = entrada.nextInt();
                            break;
                        }
                    }
                    for (Propriedades propriedades: dados) {
                       if(identidade == propriedades.getIdProp()){
                            System.out.println("Dados encontrados");
                            System.out.println("ID: "+propriedades.getIdProp()+", Apelido: "+propriedades.getApelidoProp()+ ", Tipo "+propriedades.getTipoDePropiedade()+", Tamanho: "+propriedades.getTamanhoDaPropiedade());
                            break;
                            }
                        else{
                            System.out.println("ALERTA: Nenhum dado encontrado");
                        }
                    }
                }
                
                break;
            case "3":
                System.out.println("3 - Calcular Preço");
                if(dados.isEmpty()){
                    System.out.println("ALERTA: Aindão não foram adicionados imoveis");
                }else{
                    System.out.printf("Digite o ID do imovel: ");
                    identidadeDApropriedade = entrada.next();
                    while(conversaoID){
                        try{
                            identidade = Integer.parseInt(identidadeDApropriedade);
                            conversaoID = false;
                        }catch(Exception e){
                            System.out.printf("\nALERTA: Digite um ID valido");
                            System.out.printf("\nID da Propiedade: ");
                            identidade = entrada.nextInt();
                            break;
                        }
                    }
                    for (Propriedades propriedades: dados) {
                        if(identidade == propriedades.getIdProp()){
                            System.out.printf("A Propriedade esta avaliada em: %.2f AOA \n",a.calcularPreco(propriedades.getTipoDePropiedade(), propriedades.getTamanhoDaPropiedade()));
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
                if(dados.isEmpty()){
                    System.out.println("ALERTA: Aindão não foram adicionados imoveis");
                }else{
                    double maior = Integer.MIN_VALUE;
                    for (Propriedades propriedades: dados) {
                        for(int i = 0; i< precos.length; i++){
                            if(precos[i] > maior){
                                maior = precos[i];
                                identidade = dados.get(i).getIdProp();
                                apelido = dados.get(i).getApelidoProp();
                                tipo = dados.get(i).getTipoDePropiedade();
                                tamanho = dados.get(i).getTamanhoDaPropiedade();
                            }
                        }
                    }
                    System.out.println("ID: "+identidade+", Apelido: "+apelido+ ", Tipo "+tipo+", Tamanho: "+tamanho);
                }
                
                
                break;
            case "5":
                System.out.println("5 - Mostrar todos Imoveis");
                if(dados.isEmpty()){
                    System.out.println("ALERTA: Aindão não foram adicionados imoveis");
                }else{
                    for (Propriedades propriedades: dados) {
                    System.out.println("ID: "+propriedades.getIdProp()+", Apelido: "+propriedades.getApelidoProp()+ ", Tipo "+propriedades.getTipoDePropiedade()+", Tamanho: "+propriedades.getTamanhoDaPropiedade());
                }
                }
                
                break;
            case "6":
                System.out.println("6 - Organiza Imovel");
                Iterator<Propriedades> organiza = dados.iterator();
                if(dados.isEmpty()){
                   System.out.println("ALERTA: Aindão não foram adicionados imoveis");
                }else{
                    System.out.println("Organização decrescente dos ID");
                    while(organiza.hasNext()){
                    System.out.println("ID: "+organiza.next().getIdProp());
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
                    estado = false;
                break;
                case "2":
                    System.out.println("ALERTA: O programa será terminado.");
                    estado = true;
                break;
                default:
                    System.out.println("ALERTA: Opção invalida, o programa será terminado.");
                    estado = true;
                break;
            }
        }while(estado!=true);
    }
}

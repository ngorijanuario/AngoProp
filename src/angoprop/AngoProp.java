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
        int identidade;
        String apelido;
        String tipo;
        double tamanho;
        boolean estado = true;
 
        do{
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
                identidade = entrada.nextInt();
                System.out.printf("Apelido da Propiedade: ");
                apelido = entrada.next();
                System.out.printf("Tipo da Propiedade: "+a.propiedades());
                tipo = a.propiedades();
                System.out.printf("\nTamanho da Propiedade: ");
                tamanho = entrada.nextDouble();
                dados.add(new Propriedades(identidade, apelido, tipo,tamanho));
                break;
            case "2":
                System.out.println("2 - Procura Imovel");
                System.out.println("----------------------");
                System.out.printf("Digite o ID: ");
                identidade = entrada.nextInt();
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
                
                break;
            case "3":
                System.out.println("3 - Calcular Preço");
                System.out.printf("Digite o ID do imovel: ");
                identidade = entrada.nextInt();
                for (Propriedades propriedades: dados) {
                    if(identidade == propriedades.getIdProp()){
                        a.calcularPreco(propriedades.getTipoDePropiedade(), propriedades.getTamanhoDaPropiedade());
                        break;
                    }
                    else{
                        System.out.println("ALERTA: Nenhum dado encontrado");
                    }
                }
                break;
            case "4":
                System.out.println("4 - Mostrar mais Cara");
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
                
                break;
            default:
                System.out.println("ALERTA: Opção invalida, o programa será terminado.");
                System.exit(0);
                break;
            }
            System.out.printf("'S' para abrir o Menu e 'N' para terminar o programa\nResposta: ");
            String cont;
            cont=entrada.next();
            switch(cont){
                case "S":
                    estado = false;
                break;
                case "N":
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

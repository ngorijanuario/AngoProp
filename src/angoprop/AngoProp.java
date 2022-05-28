package angoprop;
import java.util.*;
//@author Ngori Januário
public class AngoProp {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Propriedades a = new Propriedades();
        int opcao, identidade;
        double tamanhodapropiedade=0.0;
        String apelido, tipodepropiedade;
        System.out.println(" -------- Menu -------");
        System.out.printf("1 - Adicionar Imovel\n2 - Procurar Imovel\n3 - Calcular Preço\n4 - Mostrar mais Cara\n5 - Mostrar todos Imoveis\n6 - Organiza Imovel\n");
        System.out.println("----------------------");
        System.out.printf("Resposta: ");
        opcao = entrada.nextInt();
        switch(opcao){
            case 1:
                //Esta opcção pede ao usuário pelos detalhes da Propriedades a adicionar no array de Objectos
                System.out.println("1 - Adicionar Imovel");
                System.out.printf("ID da propiedade: ");
                identidade = entrada.nextInt();
                a.setIdProp(identidade);
                
                System.out.printf("Apelido da propiedade: ");
                apelido = entrada.next();
                a.setApelidoProp(apelido);
                
                System.out.printf("Tipo de propiedade: ");
                tipodepropiedade = entrada.next();
                a.setTipoDePropriedade(tipodepropiedade);
                
                System.out.printf("Tamanho da propiedade: ");
                tamanhodapropiedade = entrada.nextDouble();
                a.setTamanhoDaPropriedade(tamanhodapropiedade);
                
                System.out.println("Dados Adicionados com sucesso.");
                a.Display();
                break;
            case 2:
                System.out.println("2 - Procurar Imovel");
                System.out.println("ID da propiedade: ");
                identidade = entrada.nextInt();
                a.setIdProp(identidade);
                break;
            case 3:
                System.out.println("3 - Calcular Preço");
                break;
            case 4:
                System.out.println("4 - Mostrar mais Cara");
                break;
            case 5:
                System.out.println("5 - Mostrar todos Imoveis");
                break;
            case 6:
                System.out.println("6 - Organiza Imovel");
                break;
            default:
                System.out.println("O programa será terminado.");
                break;
        }
        
    }
    
}

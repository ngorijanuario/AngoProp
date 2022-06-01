package angoprop;
import java.util.*;
//@author Ngori Januário
public class Propriedades {
    private int IdPrpop;
    private String apelidoProp;
    private String tipoDePropiedade;
    private Double tamanhoDaPropiedade;
    
    Propriedades(){
        this.IdPrpop = 0;
        this.apelidoProp = "VAZIO";
        this.tipoDePropiedade = "VAZIO";
        this.tamanhoDaPropiedade = 0.0;
    }
    Propriedades(int id, String apelido, String tipo, double tamanho){
        this.IdPrpop = id;
        this.apelidoProp = apelido;
        this.tipoDePropiedade = tipo;
        this.tamanhoDaPropiedade = tamanho;
    }
    public String propiedades(){
        Random tipodepropiedades  = new Random();        
        String elemento[] = {"Comercial","Residencial","Industrial"}; 
        int x = 3, c = 0, p = -1;        
        String escolhas[] = new String[x];
        while (c < x)
        {
            p = tipodepropiedades.nextInt(((x-c)));
            escolhas[c] = elemento[p];
            if(p != ((x-c)-1))
            {
                elemento[p] = elemento[(x-c)-1];
		elemento[(x-c)-1] = null;
            }
            else{
                elemento[(x-c)-1] = null;
            }
            c++;
        }        
        for(String d: escolhas)
        {
            this.tipoDePropiedade = d;
            break;
        }
        return tipoDePropiedade;
    }
    // Set
    public void setIdProp(int id){
        this.IdPrpop = id;
    }
    public void setApelidoProp(String apelido){
        this.apelidoProp = apelido;
    }
    public void setTipoDePropriedade(String tipo){
        this.tipoDePropiedade = tipo;
    }
    public void setTamanhoDaPropriedade(Double tamanho){
        this.tamanhoDaPropiedade = tamanho;
    }
    // Get
    public int getIdProp(){
        return this.IdPrpop;
    }
    public String getApelidoProp(){
        return this.apelidoProp;
    }
    public String getTipoDePropiedade(){
        return this.tipoDePropiedade;
    }
    public double getTamanhoDaPropiedade(){
        return this.tamanhoDaPropiedade;
    }
    public void calcularPreco(String x, double y){
        double residencial, comercial,industrial;
        if(x == "Residencial"){
            residencial = Math.cbrt(y/2.5)*120;
            System.out.printf("O preço da propriedade é: %.2f AOA \n",residencial);
        }
        else if(x == "Comercial"){
            comercial = Math.cbrt(y/1.9)*135;
            System.out.printf("O preço da propriedade é: %.2f AOA \n",comercial);
        }else if(x == "Industrial"){
            industrial = Math.cbrt(y/1.5)*145;
            System.out.printf("O preço da propriedade é: %.2f AOA\n",industrial);
        }
    }
    public void Display(){
        System.out.println("Detalhes da Propiedade");
        System.out.println("ID da propiedade: "+this.IdPrpop);
        System.out.println("Apelido da propiedade: "+ this.apelidoProp);
        System.out.println("Tipo de propiedade: "+ this.tipoDePropiedade);
        System.out.println("Tamanho da propiedade: "+ this.tamanhoDaPropiedade);
    }
}

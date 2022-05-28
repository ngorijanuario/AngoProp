package angoprop;
import java.util.*;
//@author Ngori Januário
public class Propriedades {
    private int IdPrpop = 0;
    private String apelidoProp = "VAZIO";
    private String tipoDePropiedade = "VAZIO";
    private Double tamanhoDaPropiedade = 0.0;
    
    Propriedades(){
        
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
    public double calcularPreco( double x){
        double residencial, comercial,industrial;
        residencial = Math.cbrt(this.tamanhoDaPropiedade/2.5)*120;
        comercial = Math.cbrt(this.tamanhoDaPropiedade/1.9)*135;
        industrial = Math.cbrt(this.tamanhoDaPropiedade/1.5)*145;
        return x;
    }
    public void Display(){
        System.out.println("Dwralhes da Propiedade");
        System.out.println("ID da propiedade: "+ this.IdPrpop);
        System.out.println("Apelido da propiedade: "+ this.apelidoProp);
        System.out.println("Tipo de propiedade: "+ this.tipoDePropiedade);
        System.out.println("Tamanho da propiedade: "+ this.tamanhoDaPropiedade);
    }
}

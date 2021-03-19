
package Exercício11;

public class Mosca {
    public int qtdMoscas;
    
    public String quantidadeMoscas(){
        if(qtdMoscas > 200){
           System.out.println("Tem um moscaquero, chame ajuda!!");
        }else{
            System.out.println("Não tem tanta mosca assim");
        }
        return null;
    } 
}

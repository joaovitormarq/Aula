
package Exercício11;


public class Cachorro {
    public String corPelo;
    public String raca;
    public int idade;
     
    
    public String PrecoCachoro(){
        if(idade < 1){
            System.out.println("Este animal tem menos de 1 ano, ele custa 100 reais");
        }else{
            System.out.println("Este animal tem mais de um ano, ele está para doação");
        }               
        return null;
        
    }
    
}

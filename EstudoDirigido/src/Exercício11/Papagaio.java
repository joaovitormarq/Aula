
package Exercício11;


public class Papagaio {
    public String corPena, corBico;
    public int idade;
    
    public String idadePapagaio(){
        if(idade < 45){
            System.out.println("Seu papagaio é jovem");
        }else{
            System.out.println("Seu papagaio é velho");
        }
        return null;
    }
}

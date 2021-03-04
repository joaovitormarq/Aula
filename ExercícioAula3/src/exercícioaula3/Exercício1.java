
package exercícioaula3;


import java.util.Scanner;

public class Exercício1 {
     
    int num1;
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Digite um número: ");
        int num1 = ler.nextInt();
        
        
        
        if( num1 > 0 ){
            System.out.println("Este número é positivo");
        }else{
            System.out.println("Este número é negativo");
        }
            
    }
    
}
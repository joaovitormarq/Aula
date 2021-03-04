
package exercícioaula3;

import java.util.Scanner;


public class Exercício3 {
    
    int num; 
    
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
           
        System.out.println("Digite um número: ");
        int num = ler.nextInt();
    
        
        if((num % 2) == 0){
            System.out.println("Este número é par");
        }else{
            System.out.println("Este número é impar");
        }
        
    }  
    
}

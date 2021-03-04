
package exercícioaula3;

import java.util.Scanner;

public class Exercício2 {
     
    int num1, num2;

    static Scanner ler = new Scanner(System.in);
   
    public static void main(String[] args) {
        
        System.out.println("Digite um número: ");
        int num1 = ler.nextInt();
        
        System.out.println("Digite um número: ");
        int num2 = ler.nextInt();
        
        if(num1 == num2){
            System.out.println("Estes números são iguais");
        }else{
            System.out.println("Estes números são diferentes");
        }
    }
    
}

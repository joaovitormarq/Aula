
package Exercícios;
import java.util.Scanner;
import java.util.ArrayList;


public class Exercício2 {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int num = 0, impares = 0, pares = 0, i = 0;
        
        
        ArrayList<Integer> lista = new ArrayList<>(20);               
        
        System.out.println("Arraylist de 20 posições");
        
        while ( lista.size() < 20){
        System.out.println("Digite um valor: ");
        num = ler.nextInt();
        lista.add(num);
        }
        
        
        if(num % 2 == 0){
            pares++;
        }
        else{
            impares++;
        }
        
        System.out.println("Número de Pares: " + pares);
        System.out.println("Número de Ímpares: " + impares);
        
        
        
        
    }
    
}

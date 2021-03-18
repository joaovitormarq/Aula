
package Exercícios;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercício1 {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int num, x, i, contar = 0, soma = 0;
        
        ArrayList<Integer> lista = new ArrayList();
        
        System.out.println("Qual a quantidade de números você quer digitar: ");
        i = ler.nextInt();
        
        do{
            System.out.println("Digite um número: ");
            num = ler.nextInt();
            lista.add(num);           
        }while(lista.size() < i);
        
        System.out.println("Escolha um número para saber quantas vezes ele foi digitado: ");
        x = ler.nextInt();
        
        for (int numero : lista){
            if(numero == x){
                contar++;
            }
        } 
        
        for(int numero : lista){
            soma += numero;
        }
        
        System.out.println("A lista dos números digitados: " + lista);
        System.out.println("A soma dos números digitados: " + soma);
        System.out.println("A quantidade de números digitados é: " + lista.size());
        System.out.println("A quantidade de vezes que o número escolhido apareceu foi: " + contar);
        
    }
    
}

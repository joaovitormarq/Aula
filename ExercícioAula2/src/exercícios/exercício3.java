
package exercícios;
import java.util.Scanner;

public class exercício3 {
    
    double numero;
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Digite um número: ");
        double numero = ler.nextDouble();
        
        System.out.println("O dobro do seu número é: " + (numero * 2));
        
        System.out.println("O triplo do seu número é: " + (numero * 3));
        
        System.out.println("A metade do triplo do seu número é: " + (numero * 3) /2 );
        
        System.out.println("O quadrado do seu número é: " + (numero * numero));
        
        System.out.println("A quinta parte do dobre do seu número é: " + (numero * 2) / 5);
    }
    
}


package exercícios;
import java.util.Scanner;

public class exercício2 {

    double num;
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Digite o valor do raio da de uma circuferência: ");
        double num = ler.nextDouble();
        
        System.out.println("O valor do diâmetro é: " + (num * 2));
        
        System.out.println("Um quadrante desta circuferência é: " + (num * num) /4 );
        
        
        
    }
    
}

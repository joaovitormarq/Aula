
package exercícios;
import java.util.Scanner;

public class exercício1 {
    String nome;
    double nota, nota1, nota2;
   
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();
        
        System.out.println("Digite a nota da n1: ");
        double nota = ler.nextDouble();
        
        System.out.println("Digite a nota da n2 ");
        double nota1 = ler.nextDouble();
        
        System.out.println("Digite a nota da n3: ");
        double nota2 = ler.nextDouble();
        
        System.out.println("Sua média aritmética é: " + (nota + nota1 + nota2) / 3);
        
    }
    
}

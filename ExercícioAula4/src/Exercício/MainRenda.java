
package Exercício;
import java.util.Scanner;

public class MainRenda {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Renda r1 = new Renda();
        
        System.out.println("Digite seu nome: ");
        r1.setNome(ler.nextLine());
        
        System.out.println("Digite sua idade: ");
        r1.setIdade(ler.nextInt());
        
        System.out.println("DIgite sua renda: ");
        r1.setRenda(ler.nextDouble());
        
        System.out.println(r1.classificarIdade());
        System.out.println(r1.classificarRenda());
        
    }
    
}

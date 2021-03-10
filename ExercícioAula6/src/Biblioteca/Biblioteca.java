
package Biblioteca;
import java.util.Scanner;

public class Biblioteca {

    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Livro l1 = new Livro();
        Cliente c1 = new Cliente();
        
        System.out.println("Digite o seu nome: ");
        c1.setNome(ler.nextLine());
        
        System.out.println("Digite a sua idade: ");
        c1.setIdade(ler.nextInt());
        
        System.out.println("Digite o titulo do livro: ");
        l1.setTitulo(ler.nextLine());
        
        System.out.println("Digite o ano do livro: ");
        l1.setAno(ler.nextInt());
        
        System.out.println("Digite o preço do livro: ");
        l1.setPreco(ler.nextDouble());
        
        System.out.println(l1);          
        System.out.println( c1.verificarIdade() + " e " + "o preço da compra fica: " + l1.descontoLivro());

                
              
     
        
        
    }
    
}


package Exercício11;
import java.io.PrintStream;
import java.util.Scanner;

public class Animal {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cachorro c1 = new Cachorro();
        Papagaio p1 = new Papagaio();
        Mosca m1 = new Mosca();
         
        System.out.println("Que tipo de dog você esta procurando...");
        System.out.println("Qual a raça: ");
        c1.raca = ler.nextLine();
        System.out.println("Qual a cor do pelo: ");
        c1.corPelo = ler.nextLine();
        System.out.println("Qual a idade: ");
        c1.idade = ler.nextInt();               
        System.out.println(c1.PrecoCachoro());
         
        System.out.println("Vamos saber se seu papagaio é jovem...");
        System.out.println("Qual a cor da pena de seu papagaio?");
        p1.corPena = ler.nextLine();
        System.out.println("Qual a cor do bico do seu papagaio?");
        p1.corBico = ler.nextLine();
        System.out.println("Qual a idade do seu papagaio?");
        p1.idade = ler.nextInt();
        System.out.println(p1.idadePapagaio());
        
        System.out.println("Vamos ver se tem muitas moscas em sua casa...");
        System.out.println("Qual a quantidade de moscas que tem na sua casa?");
        m1.qtdMoscas = ler.nextInt();
        System.out.println(m1.quantidadeMoscas());
       
    }
    
}


package Biblioteca;

public class Livro {
    private String titulo;
    private int ano;
    private double preco;

    public String gettitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double descontoLivro() {       
    if(this.preco >= 80){ 
        preco = (preco - (preco * 0.1));
    }else{
        preco = preco;
    }
    return preco;  
    }
    
    
    @Override
    public String toString() {
        return "Dados do Livro" + "\n" 
                + "O título do Livro: " + this.titulo + "\n"                
                + "O ano do Livro: " + this.ano + "\n"
                + "O preço do Livro: " + this.preco;
    }
    
    
    }    
    
        


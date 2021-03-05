
package Exercício;


public class Renda {
    private String nome;
    private int idade;
    private double renda;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    
    public String classificarIdade() {
        String Ridade;
    
        if(this.idade >= 18){
            Ridade = "O cliente é maior de idade";
        }else{
            Ridade = "O cliente é menor de idade";
        }
        return Ridade;
    }
    
    public String classificarRenda() {
        String Rrenda;
        
        if(this.renda >= 15000) {
            Rrenda = "O cliente é rico";
        }else{
            Rrenda = "O cliente não é rico";
        }
        return Rrenda;
    }
    
}

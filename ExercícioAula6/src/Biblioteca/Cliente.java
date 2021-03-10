
package Biblioteca;


public class Cliente {
    private String nome;
    private int idade;

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
    
    public int verificarIdade(){
        if(idade >= 18){
            System.out.println("O cliente é maior de idade");
        }else{
            System.out.println("O cliente é menor de idade");
        }
        return idade; 
    }
    
    @Override
    public String toString() {
        return "Dados do Cliente" + "\n" 
                + "O nome do cliente: " + this.nome + "\n"                
                + "A idade do cliente: " + this.idade;
                
    }
    
}

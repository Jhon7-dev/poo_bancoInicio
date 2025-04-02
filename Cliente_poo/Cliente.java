public class Cliente {
      
     private String cpf;
     private String nome;
     private int idade;
     
     public void setCpf(String cpf) {
          this.cpf = cpf;
     }
     
     public String getCpf() {
          return cpf;
     }
     public void setNome(String nome) {
          this.nome = nome;
     }
     public String getNome() {
          return nome;
     }
     public void setIdade(int idade) {
          this.idade = idade;
     }
     public int getIdade() {
          return idade;
     }
     public void Exibir() {
          System.out.println("CPF: " + cpf);
          System.out.println("Nome: " + nome);
          System.out.println("Idade: " + idade);
     }
}

public class Main_Cliente {
     public static void main(String[] args) {
          
         Cliente cliente = new Cliente();

         cliente.setCpf("197.907.507-73");
         cliente.setNome("JHONNY VICTOR GOMES DE SOUZA");
         cliente.setIdade(21);

         System.out.println(" CPF: " + cliente.getCpf());
         System.out.println(" Nome: " + cliente.getNome());
         System.out.println(" Idade: " + cliente.getIdade());

         cliente.Exibir ();
     }
    }
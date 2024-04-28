package reservarestaurante;

public class Cliente {
    
    private String nome;
    private double CPF;
    private double Telefone;
    private String Email;
    
   public void setnome(String nomecli){
    nome = nomecli;
   }
   public void setCPF(double cpf){
       CPF = cpf;
   }
   public void setTelefone(double tel){
       Telefone = tel;
   }
   public void setEmail(String email){
       Email = email;
   }
}

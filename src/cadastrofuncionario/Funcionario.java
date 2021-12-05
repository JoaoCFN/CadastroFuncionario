package cadastrofuncionario;

public class Funcionario {
   private int matricula;
   private String nome;
   private String endereco;
   private String telefone;
   private String estado;
   private String sexo;
   
   // Getters
   public int getMatricula(){
       return this.matricula;
   }
   
   public String getNome(){
       return this.nome;
   }
   
   public String getEndereco(){
       return this.endereco;
   }
   
   public String getTelefone(){
       return this.telefone;
   }
   
   public String getEstado(){
       return this.estado;
   }
   
   public String getSexo(){
       return this.sexo;
   }
   
   // Setters
   public void setMatricula(int matricula){
       this.matricula = matricula;
   }
   
   public void setNome(String nome){
       this.nome = nome;
   }
   
   public void setEndereco(String endereco){
       this.endereco = endereco;
   }
   
   public void setTelefone(String telefone){
       this.telefone = telefone;
   }
   
   public void setEstado(String estado){
       this.estado = estado;
   }
   
   public void setSexo(String sexo){
       this.sexo = sexo;
   }
}

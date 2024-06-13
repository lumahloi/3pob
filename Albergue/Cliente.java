public class Cliente {
  private int id;
  private String cpf;
  private String endereco;
  private String email;
  private String telefone;

  public void setId(int id){
    this.id = id;
  }

  public void setCpf(String cpf){
    this.cpf = cpf;
  }

  public void setEndereco(String endereco){
    this.endereco = endereco;
  }

  public void setEmail(String email){
    this.email = email;
  }

  public void setTelefone(String telefone){
    this.telefone = telefone;
  }

  public int getId(){
    return this.id;
  }

  public String getCpf(){
    return this.cpf;
  }

  public String getEndereco(){
    return this.endereco;
  }

  public String getEmail(){
    return this.email;
  }

  public String getTelefone(){
    return this.telefone;
  }
}
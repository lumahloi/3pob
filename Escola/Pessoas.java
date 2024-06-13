public class Pessoas {
  private int matricula;
  private String nome;
  private String cpf;

  public void setMatricula (int matricula){
    this.matricula = matricula;
  }

  public void setNome (String nome){
    this.nome = nome;
  }

  public void setCpf (String cpf){
    this.cpf = cpf;
  }

  public int getMatricula (){
    return matricula;
  }

  public String getCpf() {
    return cpf;
  }

  public String getNome (){
    return nome;
  }
}
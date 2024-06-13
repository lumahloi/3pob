public abstract class Animal {
  private String nome;
  private String tipo;
  private double peso;
  private int idade;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo){
    this.tipo = tipo;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso){
    this.peso = peso;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade){
    this.idade = idade;
  }

  public String SomAnimal() {
    return "";
  }
  
}
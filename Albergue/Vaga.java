public class Vaga {
  private int id;
  private int idQuarto;
  private String status;
  private String posicao;
  private String tipo;

  public void setId(int id){
    this.id = id;
  }

  public void setIdQuarto(int idQuarto){
    this.idQuarto = idQuarto;
  }

  public void setStatus(String status){
    this.status = status;
  }

  public void setPosicao(String posicao){
    this.posicao = posicao;
  }

  public void setTipo(String tipo){
    this.tipo = tipo;
  }

  public int getId(){
    return this.id;
  }

  public int getIdQuarto(){
    return this.idQuarto;
  }

  public String getStatus(){
    return this.status;
  }

  public String getPosicao(){
    return this.posicao;
  }

  public String getTipo(){
    return this.tipo;
  }
}
public class Reserva {
  private int id;
  private int idCliente;
  private int idVaga;
  private String dtInicio;
  private String dtFim;

  public void setId(int id){
    this.id = id;
  }

  public void setIdCliente(int idCliente){
    this.idCliente = idCliente;
  }

  public void setIdVaga(int idVaga){
    this.idVaga = idVaga;
  }

  public void setDtInicio(String dtInicio){
    this.dtInicio = dtInicio;
  }

  public void setDtFim(String dtFim){
    this.dtFim = dtFim;
  }

  public int getId(){
    return this.id;
  }

  public int getIdCliente(){
    return this.idCliente;
  }

  public int getIdVaga(){
    return this.idVaga;
  }

  public String getDtInicio(){
    return this.dtInicio;
  }

  public String getDtFim(){
    return this.dtFim;
  }
}
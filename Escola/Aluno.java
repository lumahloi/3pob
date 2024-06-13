public class Aluno extends Pessoas {
  private double cr;
  private String mesAnoIngresso;

  public void setCr(double cr) {
    this.cr = cr;
  }

  public void setmesAnoIngresso (String mesAnoIngresso){
    this.mesAnoIngresso = mesAnoIngresso;
  }

  public double getCr (){
    return cr;
  }

  public String getmesAnoIngresso() {
    return mesAnoIngresso;
  }

  public void printObject (){
    System.out.println(getNome());
    System.out.println(getMatricula());
    System.out.println(getCpf());
    System.out.println(getmesAnoIngresso());
    System.out.println(getCr());
  }
}


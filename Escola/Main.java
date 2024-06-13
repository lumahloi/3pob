public class Main {
  public static void main(String[] args) {
    Aluno aluno = new Aluno();
    aluno.setCr(8.4);
    aluno.setmesAnoIngresso("012024");
    aluno.setNome("João");
    aluno.setMatricula(123456);
    aluno.setCpf("123.456.789-00");

    System.out.println(aluno.toString());
    aluno.printObject();
    
  }
}
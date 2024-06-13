public class Calculadora {
  public void Soma(double x, double y){
   System.out.println("Resultado: " + (x+y));
  }
  
  public void Subtracao(double x, double y){
   System.out.println("Resultado: " + (x-y));
  }

  public void Multiplicacao(double x, double y){
   System.out.println("Resultado: " + (x*y));
  }

  public void Divisao(double x, double y){
   System.out.println("Resultado: " + (x/y));
  }

  public void Raiz(double x, double y){
   System.out.println("Resultado: " + Math.sqrt(x) + " e " + Math.sqrt(y));
  }

  public void Potencia(double x, double y){
   System.out.println("Resultado: " + Math.pow(x, y));
  }
}
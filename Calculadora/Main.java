import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Calculadora calc = new Calculadora();
    int op = 0;

    while(op != 7){
      System.out.println("Digite a primeira variável: ");
      double var1 = sc.nextDouble();

      System.out.println("Digite a segunda variável: ");
      double var2 = sc.nextDouble();

      System.out.println("\nEscolha uma opcao:\n1. Soma\n2. Subtracao\n3. Multiplicacao\n4.Divisao\n5. Raiz\n6. Potencia\n7. Sair");
      
      op = sc.nextInt();

      switch(op){
        case 1:
          calc.Soma(var1, var2);
          break;
        case 2:
          calc.Subtracao(var1, var2);
          break;
        case 3:
          calc.Multiplicacao(var1, var2);
          break;
        case 4:
          calc.Divisao(var1, var2);
          break;
        case 5:
          calc.Raiz(var1, var2);
          break;
        case 6:
          calc.Potencia(var1, var2);
          break;
        case 7:
          return;
      } 
    }
  }
}
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Produto> produtos = new ArrayList();
    private Carrinho carrinho = new Carrinho();
    private ArrayList<ItensCarrinho> itens = new ArrayList();
    private ArrayList<Frete> fretes = new ArrayList();
    public void Processamento() {
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        char resposta = 'S';
        Produto prod = new Produto("shampoo", "456789","sdfrg456","p/ cabelo",12.34, 0.500);
        produtos.add(prod);
        prod = new Produto("condicionador", "55555","ajj555","p/ cabelo",12.45, 0.500);
        produtos.add(prod);

        Carrinho car = new Carrinho();
        car.setId(1);

        ItensCarrinho item = new ItensCarrinho(1,1, "456789",12.34, 2);
        itens.add(item);
        item = new ItensCarrinho(2,1, "55555",12.45, 3);
        itens.add(item);

        Frete frete = new Frete(1,20000,29999,10.00);
        fretes.add(frete);
        frete = new Frete(1,10000,19999,11.00);
        fretes.add(frete);

        do {
            System.out.println("Digite a opção:");
            System.out.println("1- Incluir Produto: ");
            System.out.println("2- Alterar Produto: ");
            System.out.println("3- Excluir Produto: ");
            System.out.println("4- Listar Produtos: ");
            System.out.println("5- Buscar Produto: ");
            System.out.println("6- Calcular Frete: ");
            System.out.println("7- Sair ");

            opcao = sc.nextInt();

            System.out.println("opção é: " + opcao);
//Math.
            switch(opcao)
            {
                case 1:
//					ProdutoApplication prodApp = new ProdutoApplication();
//					prodApp.IncluirProduto();
         //           IncluirProduto();
                    break;
                case 2:
//					AlterarProduto();
                    break;
                case 3:
//					ExcluirProduto();
                    break;

                case 4:
//					ListarProduto();
                    break;

                case 5:
//					BuscarProduto();
                    break;

                case 6:
					CalcularFrete();
                    break;

                case 7:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }


        } while (opcao != 6);


    }
    public Boolean CalcularFrete() {
        int cepEntrega = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o cep da entrega ");
        cepEntrega = sc.nextInt();
        System.out.println("o cep digitado é: " + cepEntrega);
        System.out.println("Digite UPC do produto (somente os numeros): ");
                System.out.println("valor de valor: " );
        double pesoTotal = 0.0;
        for (ItensCarrinho it : itens) {
            System.out.println(it.getUpc());
            String upcIt = it.getUpc();
            double pesoProd = 0.0;
            for (Produto pr : produtos) {
                if (pr.getUpc() == upcIt) {
                    pesoProd = pr.getPeso();
                }
            }
            pesoTotal += pesoProd;
        }





        return true;
    }
}

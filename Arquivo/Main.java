public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*
        FileAppService fileAppService = new FileAppService();
        fileAppService.Processamento();

        EscreverArquivo escrever = new EscreverArquivo();
        escrever.EscreverNoArquivo("arquivoTeste.txt", "Estou escrevendo no arquivo!");
        */

        Frete frete = new Frete(1, "10000-000", "20000-000", 10.0);

        // Chama a função calcularFrete
        double valorFrete = frete.calcularFrete("10000-000;10.0");

        // Imprime o valor do frete
        System.out.println("O valor do frete é: " + valorFrete);
        
    }
}

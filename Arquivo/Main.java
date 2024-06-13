public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        FileAppService fileAppService = new FileAppService();
        fileAppService.Processamento();

        EscreverArquivo escrever = new EscreverArquivo();
        escrever.EscreverNoArquivo("arquivoTeste.txt", "Estou escrevendo no arquivo!");
    }
}

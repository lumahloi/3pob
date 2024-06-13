import java.io.FileWriter;
import java.io.IOException;

public class FileAppService {
    public void Processamento() {
        String nomeArq = "arquivoTeste.txt";
        CreateFile createFile = new CreateFile();
        if (!createFile.CriarArquivoNovo(nomeArq)) {
            System.out.println("PROBLEMA DE CRIAÇÃO DE ARQUIVO!");
        } else {
            try {
                FileWriter arquivo = new FileWriter("arquivoTeste.txt");
                arquivo.write("Arquivo novo criado em Java.");
                arquivo.close();
            } catch (IOException e) {
                System.out.println("Erro na escrita do arquivo" + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
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
        try { 
            LeituraArquivo(nomeArq);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void LeituraArquivo(String nomeArquivo) throws FileNotFoundException {
        try {
            File arq = new File(nomeArquivo);
            Scanner leitor = new Scanner(arq);
            while(leitor.hasNextLine()){
                String linha = leitor.nextLine();
                System.out.println("Linha do arquivo" + linha);
            }
            leitor.close();
        } catch (FileNotFoundException e){
            System.out.println("Erro na leitura do arquivo" + e.getMessage());
        }
    }
}

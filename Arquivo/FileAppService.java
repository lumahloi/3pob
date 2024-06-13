import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileAppService {
    public void Processamento() {
        String nomeArq = "arquivoTeste.txt";
        CreateFile createFile = new CreateFile();
        if (!createFile.CriarArquivoNovo(nomeArq)) {
            System.out.println("PROBLEMA DE CRIAÇÃO DE ARQUIVO!");
        } else {
            try {
                FileWriter arquivo = new FileWriter("arquivoTeste.txt");
                for(int i=0; i < 5; i++){
                    arquivo.write("Linha " + i + "\n");
                }
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
            System.out.println("Vou ler o arquivo: " + nomeArquivo);
            while(leitor.hasNextLine()){
                String linha = leitor.nextLine();
                System.out.println("Linha do arquivo" + linha);
            }
            leitor.close();
        } catch (FileNotFoundException e){
            System.out.println("Erro na leitura do arquivo" + e.getMessage());
            e.printStackTrace();
        }
    }
}

import java.io.FileWriter;
import java.io.IOException;

public class EscreverArquivo {
    public void EscreverNoArquivo(String filename, String texto) {
        try {
            FileWriter arquivo = new FileWriter(filename, true);
            arquivo.write(texto);
            arquivo.close();
            System.out.println("Dados escritos com sucesso!!");
        } catch (IOException e) {
            System.out.println("Erro na escrita do arquivo" + e.getMessage());
            e.printStackTrace();
        }
    }
}

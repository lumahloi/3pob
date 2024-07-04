package av2pob;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Arquivo {
    public static void ler(String nomeArq) throws FileNotFoundException {
        try {
            File arquivo = new File(nomeArq);
            Scanner leitor = new Scanner(arquivo);

            if (leitor.hasNextLine()) {
                leitor.nextLine();
            }

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] campos = linha.split(";");

                if (campos.length == 5) {
                    String nome = campos[0];
                    String cpf = campos[1];
                    String email = campos[2];
                    String endereco = campos[3];
                    String cep = campos[4];

                    Cliente.incluirArquivo(nome, cpf, email, endereco, cep);
                }
            }

            leitor.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

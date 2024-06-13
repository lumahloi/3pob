// arquivo frete.java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Frete {
    private int id;
    private String cepInicial;
    private String cepFinal;
    private double valorPorKilo;

    //construtor
    public Frete(int id, String cepInicial, String cepFinal, double valorPorKilo){
        this.id = id;
        this.cepInicial = cepInicial;
        this.cepFinal = cepFinal;
        this.valorPorKilo = valorPorKilo;
    }

    //getters e setters
    public void setId(int id){
        this.id = id;
    }

    public void setcepInicial(String cepInicial){
        this.cepInicial = cepInicial;
    }

    public void setcepFinal(String cepFinal){
        this.cepFinal = cepFinal;
    }

    public void setValorPorKilo(double valorPorKilo){
        this.valorPorKilo = valorPorKilo;
    }

    public int getId(){
        return id;
    }

    public String getcepInicial(){
        return cepInicial;
    }

    public String getcepFinal(){
        return cepFinal;
    }

    public double getvalorPorKilo(){
        return valorPorKilo;
    }
        
    // Função para calcular o frete
    public double calcularFrete(String linha) {
        String[] dados = linha.split(";");
        String cep = dados[0];
        double peso = Double.parseDouble(dados[1]);
    
        try {
            File arq = new File("arquivoTeste.txt");
            Scanner leitor = new Scanner(arq);
            while(leitor.hasNextLine()){
                String linhaFrete = leitor.nextLine();
                String[] dadosFrete = linhaFrete.split(";");
                if(Integer.parseInt(cep) >= Integer.parseInt(dadosFrete[0].replace("-", "")) && Integer.parseInt(cep) <= Integer.parseInt(dadosFrete[1].replace("-", ""))){
                    return peso * Double.parseDouble(dadosFrete[2]);
                }
            }
            leitor.close();
        } catch (FileNotFoundException e){
            System.out.println("Erro na leitura do arquivo" + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("CEP não encontrado no arquivo: " + cep);
        return 0;
    }
}

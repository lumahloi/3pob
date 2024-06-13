public class Frete {
    private int id;
    private int cepInicial;
    private int cepFinal;
    private double valorPorKilo;

    public Frete(int id, String string, String string2, double valorPorKilo) {
        this.id = id;
        this.cepInicial = string;
        this.cepFinal = string2;
        this.valorPorKilo = valorPorKilo;
    }

    public double calcularFrete(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularFrete'");
    }
}

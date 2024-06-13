public class Main {
  public static void main(String[] args) {
    Vaga vaga1 = new Vaga();

    vaga1.setId(1);
    vaga1.setIdQuarto(1);
    vaga1.setStatus("Disponível");
    vaga1.setPosicao("Janela");
    vaga1.setTipo("Solteiro Normal");

    Cliente cliente1 = new Cliente();
    cliente1.setId(1);
    cliente1.setCpf("12345678901");
    cliente1.setEndereco("Rua A, 123");
    cliente1.setEmail("tzirw@example.com");
    cliente1.setTelefone("123456789");

    Reserva reserva1 = new Reserva();
    reserva1.setId(1);
    reserva1.setIdCliente(cliente1.getId());
    
    if(vaga1.getStatus().equals("Disponível")){
      reserva1.setIdVaga(vaga1.getId());
      reserva1.setDtInicio("2023-01-01");
      reserva1.setDtFim("2023-03-03");
      vaga1.setStatus("Indisponível");
    }

    System.out.println("Id cliente: " + reserva1.getIdCliente() + "\nId vaga: " + reserva1.getIdVaga() + "\nDt inicio da reserva: " + reserva1.getDtInicio() + "\nDt fim da reserva: " + reserva1.getDtFim());
  }
}
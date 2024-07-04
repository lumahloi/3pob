package av2pob;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Cliente {
	private static Connection conectar() {
		Conexao conexao = new Conexao();
		Connection con = conexao.obterConexao();
		return con;
	}
	
	private static Scanner scanner() {
		Scanner sc = new Scanner(System.in);
		return sc;
	}
	
	private static boolean comandar(String sql) {
		Connection con = conectar();
		PreparedStatement ps;
		boolean rs;
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.execute();
			return rs;
			
		} catch (SQLException e) {
			System.out.println("Erro: " + e);
			return false;
		}
	}
	
	private static ResultSet retornar(String sql, String cpf) {
		Connection con = conectar();
		PreparedStatement stmt;
		
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, cpf);
			ResultSet rs = stmt.executeQuery();
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void incluirArquivo(String nome, String cpf, String email, String endereco, String cep) {
		
		String sql = String.format("INSERT INTO clientela.clientes (nome, cpf, email, endereco, cep) values ('%s', '%s', '%s', '%s', '%s')", nome, cpf, email, endereco, cep);
		
		comandar(sql);
	}
	
	public static void incluir() {		
		System.out.println("\n\n==== Incluir novo cliente ====");
		
		System.out.println("\n- Nome: ");
		String cliNome = scanner().nextLine();

		System.out.println("\n- CPF: ");
		String cliCpf = scanner().nextLine();

		System.out.println("\n- E-mail: ");
		String cliEmail = scanner().nextLine();

		System.out.println("\n- Endereco: ");
		String cliEndereco = scanner().nextLine();
		
		System.out.println("\n- CEP: ");
		String cliCep = scanner().nextLine();
		
		String sql = String.format("INSERT INTO clientela.clientes (nome, cpf, email, endereco, cep) values ('%s', '%s', '%s', '%s', '%s')", cliNome, cliCpf, cliEmail, cliEndereco, cliCep);
		
		comandar(sql);
	}
	
	public static void alterar() {
		System.out.println("\n\n==== Qual o CPF do cliente que deseja alterar? ====\nDigite: ");
		String cliCpf = scanner().nextLine();
		
		String sql = String.format("SELECT * FROM clientela.clientes WHERE cpf = '%s'", cliCpf);
		
		if(comandar(sql) == true) {
			int opcao = 0;
			
			while(opcao != 5) {
				System.out.println("\n\nO que deseja alterar?\n[1] Nome\n[2] E-mail\n[3] Endereco\n[4] Cep\n[5] Sair\n");
				opcao = scanner().nextInt();
				
				switch(opcao) {
					case 1:
						System.out.println("\n- Nome: ");
						String cliNome = scanner().nextLine();
						sql = String.format("UPDATE clientela.clientes SET nome = '%s' where cpf = '%s'", cliNome, cliCpf);
						comandar(sql);
						break;
					case 2:
						System.out.println("\n- E-mail: ");
						String cliEmail = scanner().nextLine();
						sql = String.format("UPDATE clientela.clientes SET email = '%s' where cpf = '%s'", cliEmail, cliCpf);
						comandar(sql);
						break;
					case 3:
						System.out.println("\n- Endereco: ");
						String cliEndereco = scanner().nextLine();
						sql = String.format("UPDATE clientela.clientes SET endereco = '%s' where cpf = '%s'", cliEndereco, cliCpf);
						comandar(sql);
						break;
					case 4: 
						System.out.println("\n- CEP: ");
						String cliCep = scanner().nextLine();
						sql = String.format("UPDATE clientela.clientes SET cep = '%s' where cpf = '%s'", cliCep, cliCpf);
						comandar(sql);
						break;
					case 5:
						return;
					default:
						System.out.println("\n\nDigite uma opcao valida!");
				}
			}
		} else {
			System.out.println("\nNao existe cliente com esse CPF! Tente novamente.");
		}
	}
	
	public static void excluir() {
		System.out.println("\n\n==== Qual o CPF do cliente que deseja excluir? ====\nDigite: ");
		String cliCpf = scanner().nextLine();
		
		String sql = String.format("SELECT * FROM clientela.clientes WHERE cpf = '%s'", cliCpf);
		
		if(comandar(sql) == true) {
			sql = String.format("DELETE FROM clientela.clientes where cpf = '%s'", cliCpf);
			comandar(sql);
			
		} else {
			System.out.println("\nNao existe cliente com esse CPF! Tente novamente.");
		}
	}
	
	public static void listar() {
		System.out.println("\n\n==== Qual o CPF do cliente que deseja listar? ====\nDigite: ");
		String cliCpf = scanner().nextLine();
		String sql = "SELECT nome, email, endereco, cep FROM clientes WHERE cpf = ?";
		ResultSet rs = retornar(sql, cliCpf);
		
		
		if(rs != null){
			try {
				if(rs.next()){
					String nome = rs.getString("nome");
				    String email = rs.getString("email");
				    String endereco = rs.getString("endereco");
				    String cep = rs.getString("cep");

				    System.out.println("\nInformações do cliente:");
				    System.out.println("Nome: " + nome);
				    System.out.println("CPF: " + cliCpf);
				    System.out.println("E-mail: " + email);
				    System.out.println("Endereço: " + endereco);
				    System.out.println("CEP: " + cep);
				} else {
	                System.out.println("\nNão existe cliente com esse CPF! Tente novamente.");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    } else {
	        System.out.println("\nErro ao executar a consulta. Verifique a conexão com o banco de dados.");
	    }
	}
	
	public static void arquivo(String nome) {
		try {
			Arquivo.ler(nome);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

public class Escola {
	public static void main(String[] args){
		Disciplina disciplina = new Disciplina("120", "Programação Orientada a Objetos", "3POB", "3");

		System.out.println("Dados da Disciplina :");
		System.out.println(disciplina.getCargaHoraria());
		System.out.println(disciplina.getNome());
		System.out.println(disciplina.getSigla());
		System.out.println(disciplina.getSemestre());
		
	}

	public static class Disciplina {
		private String cargaHoraria;
		private String nome;
		private String sigla;
		private String semestre;

		// Construtor
		public Disciplina(String cargaHoraria, String nome, String sigla, String semestre) {
			this.cargaHoraria = cargaHoraria;
			this.nome = nome;
			this.sigla = sigla;
			this.semestre = semestre;
		}

		public String getCargaHoraria(){
			return cargaHoraria;
		}
		
		public String getNome(){
			return nome;
		}

		public String getSigla(){
			return sigla;
		}

		public String getSemestre(){
			return semestre;
		}
	}

	public static class Aluno {
		private String nome;
		private String matricula;
		private String email;
		private int idade;

		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getMatricula(){
			return matricula;
		}
		
		public String getNome(){
			return nome;
		}

		public String getEmail(){
			return email;
		}

		public int getIdade(){
			return idade;
		}
	}
}

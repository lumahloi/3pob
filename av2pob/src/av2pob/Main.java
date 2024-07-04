package av2pob;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcao = 0;
		try (Scanner sc = new Scanner(System.in)) {
			while(opcao != 5) {
				System.out.println("\n\nBem-vindo(a)! Escolha uma opcao:\n[1] Incluir cliente\n[2] Alterar cliente\n[3] Excluir cliente\n[4] Listar cliente\n[5] Sair");
				opcao = sc.nextInt();
				
				switch(opcao) {
					case 1:
						System.out.println("\nSelecione a forma de inclusao: \n[1] Texto\n[2] Arquivo");
						int forma = sc.nextInt();
						
						if(forma == 1) {
							Cliente.incluir();							
						} else {
							Cliente.arquivo("clientesAv2");
						}
						
						break;
					case 2:
						Cliente.alterar();
						break;
					case 3: 
						Cliente.excluir();
						break;
					case 4:
						Cliente.listar();
						break;
					case 5:
						return;
					default:
						System.out.println("\nPor favor, escolha uma opcao valida.");		
				}
			}
		}
	}
}

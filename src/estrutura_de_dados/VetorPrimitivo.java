package estrutura_de_dados;

import java.util.Scanner;

//Um Vetor primitivo ele é a base de qualquer estrutura de dados, Ex: o ArrayList é formado por um vetor primitivo
public class VetorPrimitivo {
	
	static Integer tamanhoReal = 0; // variavel de controle
	
	static ChavePix[] chavesPix = new ChavePix[5]; // Instancia de um Vetor
	
	public static void main(String[] args) {
		
		menu();
		
	}
	
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("O que vc gostaria de Fazer: \n 1 - Cadastrar \n 2 - Visualizar \n 3 - Deletar \n 4 - Atualizar");
		Integer entrada = sc.nextInt();
		
		
		switch (entrada) {
		case 1:
			cadastrarChavePix();
			menu(); // Recursividade - chamar o proprio metodo dentro dele mesmo
			break;
			
		case 2:
			visualizarChavePix();
			break;
			
		case 3:
			deletarChavePix();
			break;
			
		case 4:
			//atualizarChavePix();
			break;
			
		default:
			break;
		}
		
	}
	
	
	private static void deletarChavePix() {
		
		Scanner sc = new Scanner(System.in);
		visualizarChavePix();
		
		System.out.println("Qual chave pix voce quer excluir: ");
		String chave = sc.next();
		
//		for (ChavePix chavePix : chavesPix) {
//			if (chavePix.getChave().equals(chave)) {
//				chavesPix[]
//			}
//		}
		
		for (int i = 0; i < chavesPix.length; i++) { // cada posição do vetor é formado de uma instancia da classe 'chave pix'
			ChavePix chavePix = chavesPix[i]; // vetor de chaves pix, armazenamos em uma variavel
			if (chavePix.getChave().equals(chave)) { // verificamos se a chave inserida se encontra no vetor para encontrar a posição dela
				// como esvaziar essa posição
				chavesPix[i] = 
			}
		}
		
		//chavesPix[chave]
		
	}

	private static void visualizarChavePix() {
		
		for (ChavePix chavePix : chavesPix) {
			if (chavePix != null) {
				System.out.println("Chave: " + chavePix.getChave() + "Tipo:" + chavePix.getTipo());
			}
			
		}
		System.out.println("Encerrando...");
	}

	public static void cadastrarChavePix() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual tipo de chave vc gostaria de cadastrar: \n 1 - CPF \n 2 - Numero \n 3 - Email ");
	
		Integer entrada = sc.nextInt();
		
		System.out.println("Qual é a chave que deseja cadastrar: ");
		String chave = sc.next();
		
		chavesPix[tamanhoReal] = new ChavePix(entrada, chave);
		//visualizarChavePix();
		tamanhoReal++; // Vai incrementar (+1) - o valor dele é 1 agora
		
	}

}

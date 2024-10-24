package estrutura_de_dados;

import java.util.Scanner;

//Um Vetor primitivo ele é a base de qualquer estrutura de dados, Ex: o ArrayList é formado por um vetor primitivo
public class VetorPrimitivo {
	
	static Integer tamanhoReal = 0; // variavel de controle para armazenar a quantidade de posições que estao sendo ocupadas + 1 (proxima)
	
	static ChavePix[] chavesPix = new ChavePix[5]; // Instancia de um Vetor
	
	public static void main(String[] args) {
		
		menu();
		
	}
	
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("O que vc gostaria de Fazer: \n 1 - Cadastrar \n 2 - Visualizar \n 3 - Deletar \n 4 - Atualizar \n 5 - Ordenação");
		Integer entrada = sc.nextInt();
		
		
		switch (entrada) {
		case 1:
			cadastrarChavePix();
			menu(); // Recursividade - chamar o proprio metodo dentro dele mesmo
			break;
			
		case 2:
			visualizarChavePix();
			menu();
			break;
			
		case 3:
			deletarChavePix();
			menu();
			break;
			
		case 4:
			atualizarChavePix();
			menu();
			break;
			
		case 5:
			ordenarVetor();
			menu();
			break;
			
		default:
			break;
		}
		
	}
	
	
	private static void atualizarChavePix() {
		Scanner sc = new Scanner(System.in);
		
		visualizarChavePix();
		
		System.out.println("Qual tipo de chave vc Gostaria de Atualizar: \n 1 - CPF \n 2 - Numero \n 3 - Email ");
		
		Integer entrada = sc.nextInt();

		System.out.println(" Digite a Chave Antiga para Atualizar: "); // Vamos precisar da posição da chave antiga
		String chaveAntiga = sc.next();
		
		Boolean chaveEncontrada = false;
		
		for (int i = 0; i < tamanhoReal; i++) { 
			ChavePix chavePix = chavesPix[i]; 
			if (chavePix != null) { // verificando se é diferente de nulo
				if (chavePix.getChave().equals(chaveAntiga)) { 
					System.out.println(" Digite a Chave Nova Para Substituir:  ");
					String chaveNova = sc.next();
			
					chavesPix[i] = new ChavePix(entrada, chaveNova);
					
					System.out.println(" Chave Nova Substituida com Sucesso!! " + "Chave Antiga: " + chaveAntiga + "\n Chave Nova: " + chavesPix[i].getChave());
					//System.out.println(" Chave Nova Substituida com Sucesso!! " + "Chave Antiga: " + chaveAntiga + "\n Chave Nova: " + chaveNova));
					chaveEncontrada = true;
				}
			}		
		} if (!chaveEncontrada) { //  se a chave nao for encontrada
				System.out.println(" ** Chave Pix nao Encontrada ** ");
			}
	}

	private static void deletarChavePix() {
		
		int posicao = 1;
		
		Scanner sc = new Scanner(System.in);
		visualizarChavePix();
		
		System.out.println("Qual chave pix voce quer excluir: ");
		String chave = sc.next();
		
		/* Usando o ForEach */
//		for (ChavePix chavePix : chavesPix) {
//			if (chavePix.getChave().equals(chave)) {
//				chavesPix[]
//			}
//		}
		
		/* Usando o While */
//		for (int i = 0; i < chavesPix.length; i++) { // cada posição do vetor é formado de uma instancia da classe 'chave pix'
//			ChavePix chavePix = chavesPix[i]; // vetor de chaves pix, armazenamos em uma variavel
//			while (chavePix != null) {
//				if (chavePix.getChave().equals(chave)) { // verificamos se a chave inserida se encontra no vetor para encontrar a posição dela
//					// como esvaziar essa posição
//					chavesPix[i] = null; // ela sendo encontrada, nós simplesmente atribuimos que aque chave pix inserida seja nula
//					System.out.println("Chave Pix Deletada");
//				}
//				break;
//			}
//		}
		
		/* Deslocando a posicao subsequente para a posicao a esquerda, a partir da posicao encontrada (a posicao encontrada é a posicao que o ussuario quer deletar) */
		for (int i = 0; i < tamanhoReal; i++) { // Substiuimos a chavePix.length pelo o tamanho real (variavel global) para melhorar a performace
			ChavePix chavePix = chavesPix[i]; // vetor de chaves pix, armazenamos em uma variavel
			if (chavePix != null) {
				if (chavePix.getChave().equals(chave)) { // verificamos se a chave inserida se encontra no vetor para encontrar a posição dela
					for (int j = i; j < tamanhoReal - 1; j++) { // o segundo for serve para deslocamento e o primeiro serve apenas para percorrer e encontrar qual sera a chave deletada
//						chavesPix[i] = null; // ela sendo encontrada, nós simplesmente atribuimos que aque chave pix inserida seja nula
						chavesPix[j] = chavesPix[j + 1]; // substituindo posição deletada pela a sequencia (i + 1) - vai me entregar a proxima posição encontrada
						
						
						//chavesPix[j + 1] = chavesPix[j - 1];
						
						//chavesPix[j + 1] = chavesPix[j + 2];
//						chavesPix[j + 2] = null;
						
					}
					chavesPix[tamanhoReal - 1] = null;
					tamanhoReal = tamanhoReal - 1; // Decrementando a posição 
					System.out.println("Chave Pix Deletada");
					//chavesPix[i + posicao] = chavesPix[i + 1];
//					chavesPix[i + 2] = null;
//					chavesPix[i + 2] = chavesPix[i + 3];
//					chavesPix[i + 3] = null;
//					chavesPix[i + 3] = chavesPix[i + 4];
//					chavesPix[i + 4] = null;
					
				}
			}
		}
		
		
	}

	private static void visualizarChavePix() {
		
		for (int i = 0; i < tamanhoReal; i++) {
				System.out.println("\nChave: " + chavesPix[i].getChave() + "\nTipo:" + chavesPix[i].getTipo());
			}
		}
		
		

	public static void cadastrarChavePix() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual tipo de chave vc gostaria de cadastrar: \n 1 - CPF \n 2 - Numero \n 3 - Email ");
	
		Integer entrada = sc.nextInt();
		
		System.out.println("Qual é a chave que deseja cadastrar: ");
		String chave = sc.next();
		
		chavesPix[tamanhoReal] = new ChavePix(entrada, chave); // primeiro cadastro na posição tamanho real que esta valendo 0
		//visualizarChavePix();
		tamanhoReal++; // (tamanhoReal = tamanhoReal + 1) Vai incrementar (+1) - o valor dele é 1 agora
		
	}
	
	public static void ordenarVetor() { // colocar o vetor em alguma ordem
		
		System.out.println("Lista Ordenada");
		
		for (int i = 0; i < tamanhoReal - 1; i++) {
			if (chavesPix[i].getTipo() != null) {
				if (chavesPix[i].getTipo() > chavesPix[i + 1].getTipo()) { // se o tipo da primeira posição for maior que a segunda posicao
					
					// Variavel Auxiliar
					ChavePix posicao = chavesPix[i];
					chavesPix[i] = chavesPix[i + 1]; // primeira posicao esta recebendo a segunda
					chavesPix[i + 1] = chavesPix[chavesPix - posicao];
					
				}
			}
				
		}
		
	}

}

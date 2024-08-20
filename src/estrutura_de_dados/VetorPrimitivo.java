package estrutura_de_dados;

import java.util.Scanner;

//Um Vetor primitivo ele é a base de qualquer estrutura de dados, Ex: o ArrayList é formado por um vetor primitivo
public class VetorPrimitivo {
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("O que vc gostaria de Fazer: \n 1 - Cadastrar \n 2 - Visualizar \n 3 - Deletar \n 4 - Atualizar");
		Integer entrada = sc.nextInt();
		
		
		switch (entrada) {
		case 1:
			cadastrarChavePix();
			break;
			
		case 2:
			//visualizarChavePix();
			break;
			
		case 3:
			//deletarChavePix();
			break;
			
		case 4:
			//atualizarChavePix();
			break;
			
		default:
			break;
		}
		
	}
	
	
	public void cadastrarChavePix() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual tipo de chave vc gostaria de cadastrar: \n 1 - CPF \n 2 - Numero \n 3 - Email ");
	
		Integer entrada = sc.nextInt();
		
		System.out.println("Qual é a chave que deseja cadastrar: ");
		String chave = sc.next();
		
		Integer tamanhoReal = 0;
		
		ChavePix[] chavePix = new ChavePix[5];
		chavePix[tamanhoReal] = new ChavePix(entrada, chave);
		tamanhoReal++; // Vai incrementar (+1) - o valor dele é 1 agora
	}

}

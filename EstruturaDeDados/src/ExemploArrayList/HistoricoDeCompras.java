package ExemploArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class HistoricoDeCompras {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		ArrayList<String> carrinhoDeCompras = new ArrayList<>();
		
		while(true) {
			System.out.println("\n Escolha uma opcao:");
			System.out.println("1. Adicionar item ao carrionho");
			System.out.println("2. Visualizar items adicionados");
			System.out.println("3. Imprimir historico de compras");
			System.out.println("4. Sair");
			
			int opcao = scanner.nextInt();
			
			switch(opcao) {
			case 1:
				adicionarItemCarrinho(scanner, carrinhoDeCompras);
				break;
			case 2:
				visualizarItems(carrinhoDeCompras);
				break;
			case 3:
				imprimirHistorioCompras(carrinhoDeCompras);
			case 4:
				System.out.println("Obrigado por usar o historico de compras");
				System.exit(0);
				break;
				default:
					System.out.println("Opcao invalida. Tente novamente.");
			}
		}
	}


	private static void adicionarItemCarrinho(Scanner scanner , ArrayList<String> carrinhoDeCompras) {
		System.out.println("Digite o nome do produto:");
		String item = scanner.next();
		carrinhoDeCompras.add(item);
		System.out.println(item + "  Adicionado ao carrinho");
	}

	private static void visualizarItems(ArrayList<String> carrinhoDeCompras) {
		System.out.println("\nItems adiconados: ");
		int index = 1;
		for(String item : carrinhoDeCompras) {
			System.out.println(index + " - " + item);
			index++;
		}
	}

	private static void imprimirHistorioCompras(ArrayList<String> carrinhoDeCompras) {
		System.out.println("\nHistorico de Compras:");
		
		for(String item : carrinhoDeCompras) {
			System.out.println("- " + item);
		}
		System.out.println();
	}	

}

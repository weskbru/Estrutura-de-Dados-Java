package matrizArray;

import javax.swing.JOptionPane;

public class ResevaDeAssentosVoo {
	// Criando uma instância da classe Assentos para manipular os assentos do avião
	public static MatrizAssentos assentos = new MatrizAssentos();
	
	public static void main(String[] args) {
		
		int opcao;
		
		do {
			// Exibir o menu
			String escolha = JOptionPane.showInputDialog("Selecione uma opção:\n" +
                    "1. Cadastrar Passageiro\n" +
                    "2. Escolher Assento\n" +
                    "3. Exibir Mapa de Assentos\n" +
                    "4. Sair");
			
			// Converte a escolha para um número escolhido
			opcao = Integer.parseInt(escolha);
			
			// Realiza a ação com base na escolha do usuário
			switch (opcao) {
			case 1:
				cadastrarPassageiro();
				break;
			case 2:
				escolherAssentos();
				break;
			case 3: 
				ExibirMapaDeAssentos();
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Obrigado por usar nossos servico. Ate logo!");
				break;
				default: 
					JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
			}
		} while (opcao != 4);
		
	}
	
	
	private static void ExibirMapaDeAssentos() {
		System.out.println("Exibindo assentos");
		
	}


	private static void escolherAssentos() {
		System.out.println("Escolhendo assento");
		
	}


	private static void cadastrarPassageiro() {
		 String nomePassageiro = JOptionPane.showInputDialog("Digite seu nome: ");
		 JOptionPane.showInternalMessageDialog(null, "Passageiro " + nomePassageiro + " Cadastrado com sucesso");
		
	}


	
}


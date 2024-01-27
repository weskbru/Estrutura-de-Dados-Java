package matrizArray;

import javax.swing.JOptionPane;

public class ResevaDeAssentosVoo {
	// Criando uma instância da classe MatrizAssentos para manipular os assentos do avião
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
                    exibirMapaDeAssentos();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Obrigado por usar nossos serviços. Até logo!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

    }

    private static void exibirMapaDeAssentos() {
        StringBuilder mapa = new StringBuilder("Mapa de Assentos:\n");

        boolean[][] assentosArray = assentos.getAssentos();
        String[][] nomesPassageiros = assentos.getNomesPassageiros();

        for (int i = 0; i < assentosArray.length; i++) {
            for (int j = 0; j < assentosArray[i].length; j++) {
                if (assentosArray[i][j]) {
                    mapa.append("X ").append(nomesPassageiros[i][j]).append(" | "); // Assento ocupado
                } else {
                    mapa.append("O ").append(" | "); // Assento disponível
                }
            }
            mapa.append("\n");
        }

        JOptionPane.showMessageDialog(null, mapa.toString());
    }

    private static void escolherAssentos() {
        // Lógica para escolher um assento
        int fileiraEscolhida = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da fileira"));
        int assentoEscolhido = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do assento"));

        // Verifica se o assento está disponível
        if (assentos.verificarDisponibilidade(fileiraEscolhida, assentoEscolhido)) {
            String nomePassageiro = JOptionPane.showInputDialog("Digite seu nome");
            assentos.reservaAssento(fileiraEscolhida, assentoEscolhido, nomePassageiro);
            JOptionPane.showMessageDialog(null, "Assento reservado com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Assento ocupado. Escolha outro assento.");
        }
    }

    private static void cadastrarPassageiro() {
        String nomePassageiro = JOptionPane.showInputDialog("Digite seu nome: ");
        JOptionPane.showMessageDialog(null, "Passageiro " + nomePassageiro + " cadastrado com sucesso");
    }


	
}


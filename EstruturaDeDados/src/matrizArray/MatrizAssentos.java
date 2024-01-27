package matrizArray;

public class MatrizAssentos {
	private static final int NUMERO_FILEIRAS = 4;
    private static final int ASSENTOS_POR_FILEIRAS = 2;
    private boolean[][] assentos = new boolean[NUMERO_FILEIRAS][ASSENTOS_POR_FILEIRAS];
    private String[][] nomePassageiro = new String[NUMERO_FILEIRAS][ASSENTOS_POR_FILEIRAS];

    public boolean verificarDisponibilidade(int fileira, int assento) {
        // Verifica se o assento está dentro dos limites da matriz
        if (fileira >= 0 && fileira < NUMERO_FILEIRAS && assento >= 0 && assento < ASSENTOS_POR_FILEIRAS) {
            // Verifica se o assento está disponível
            return !assentos[fileira][assento];
        }
        return false;
    }

    public void reservaAssento(int fileira, int assento, String nomePassageiro) {
        // Verifica se o assento está dentro dos limites da matriz
        if (fileira >= 0 && fileira < NUMERO_FILEIRAS && assento >= 0 && assento < ASSENTOS_POR_FILEIRAS) {
            // Reserva o assento
            assentos[fileira][assento] = true;
            this.nomePassageiro[fileira][assento] = nomePassageiro;
        }
    }

    public String[][] getNomesPassageiros() {
        return nomePassageiro;
    }

    public boolean[][] getAssentos() {
        return assentos;
    }
}

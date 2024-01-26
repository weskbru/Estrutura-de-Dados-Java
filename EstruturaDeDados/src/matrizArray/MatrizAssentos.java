package matrizArray;

public class MatrizAssentos {
	private static final int NUMERO_FILEIRAS = 4;
	private static final int ASSENTOS_POR_FILEIRAS = 2;
	private boolean[][] assentos = new boolean[NUMERO_FILEIRAS][ASSENTOS_POR_FILEIRAS];
	
	public boolean[][] getAssentos() {
		return assentos;
	}
}

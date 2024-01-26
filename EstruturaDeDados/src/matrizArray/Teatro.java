package matrizArray;

public class Teatro {

	public static void main(String[] args) {
		// Definindo as dimesões do teatro (matriz de assentos)
		int numeroFileiras = 3;
		int assentosPorFileiras = 10;

		// Criando a matriz para representar os assentos do teatro
		boolean[][] assentos = new boolean[numeroFileiras][assentosPorFileiras];

		// Inicializando alguns assentos como ocupados para exemplo
		assentos[0][1] = true;
		assentos[1][2] = true;
		assentos[2][5] = true;
	
		// Exibindo o mapa do teatro
		System.out.println("Mapa do Teatro");

		for (int i = 0; i < numeroFileiras; i++) {
			for (int j = 0; j < assentosPorFileiras; j++) {
				if (assentos[i][j]) {
					System.out.println("X"); // Representa assento ocupado

				} else {
					System.out.println("0"); // Representa assento vazio
				}
			}
			System.out.println();
		}
	}
}

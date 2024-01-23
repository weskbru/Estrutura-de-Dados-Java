package ExemploArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVetor {
	public static void main(String[] args) {

		double[] notas = new double[4];

		notas[0] = 10.0;
		notas[1] = 4.0;
		notas[2] = 9.4;
		notas[3] = 3.4;

		double total = notas[1];
		System.out.println(total);

		// outra forma de fazer uma array de notas

		// criando um array de notas
		double[] notasAluno = { 10.0, 8.5, 9.4, 2.0 };

		// criando um for-each para mostra todas as notas
		for (double notasDiciplina : notasAluno) {
			System.out.println("Diciplina: " + notasDiciplina);
		}

		// fazendo um array de diciplinas com o metodo java ArrayList
		String[] diciplinas = { "matematica", "Fisica", "Geografia", "Portugues" };

		System.out.println("Diciplinas do aluno: " + Arrays.toString(diciplinas));
		for (String di : diciplinas) {
			System.out.println(di.toUpperCase());
		}
	}
}

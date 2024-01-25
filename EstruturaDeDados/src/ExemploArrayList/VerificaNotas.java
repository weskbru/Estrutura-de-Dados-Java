package ExemploArrayList;

import java.util.Scanner;

public class VerificaNotas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bem vindos ao sistema de verificacao de Notas");
		
		System.out.println("Digite o numero de materias que esta cursando ");
		
		int numeroMaterias = scanner.nextInt();
		
		double somaNotas = 0;
		
		for(int i = 0; i < numeroMaterias; i++) {
			System.out.println("Digite o nome da materia " + (i + 1) + ": ");
			String materia = scanner.next();
			
			System.out.println("Digite a nota para " + materia + ": ");
			double nota = scanner.nextDouble();
			
			somaNotas += nota;
		}
		
		scanner.close();
		
		
		double mediaNotas = somaNotas / numeroMaterias;
		System.out.println("A media de suas notas e: " + mediaNotas);
		
		if(mediaNotas >= 7 ) {
			System.out.println("Parabens voce foi aprovado");
		}else {
			System.out.println("Infelizmente voce nao passou de ano");
		}
	}

}

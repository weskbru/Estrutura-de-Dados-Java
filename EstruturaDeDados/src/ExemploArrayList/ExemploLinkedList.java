package ExemploArrayList;

import java.util.LinkedList;

public class ExemploLinkedList {

	public static void main(String[] args) {
		
		// Criar uma LinkedLista de Strings
		LinkedList<String> listaMarcas = new LinkedList<>();

		// Adicionar elementos a lista 
		listaMarcas.add("Fiat");
		listaMarcas.add("Ford");
		listaMarcas.add("Hyundai");
		listaMarcas.add("Toyota");
		
		// Adicionar um elemento marca no inicio da lista 
		listaMarcas.addFirst("Byd");
		listaMarcas.addLast("Honda");
		
		// Verifica os items da lista marcas 
		for(String elementos : listaMarcas) {
			System.out.println(elementos);
		}
		
		
		
	}

}

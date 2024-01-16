package ExemploArrayList;

import java.util.ArrayList;

public class FrutasTeste {

	public static void main(String[] args) {
		
		//Criar um ArrayList de String
		ArrayList<String> lista = new ArrayList<>();
		
		// Adicionar elementos a lista
		lista.add("Banana");
		lista.add("jaca");
		lista.add("uva");
		lista.add("caju");
		
		//Acessar elementos da lista
		System.out.println("Elemento na posicao 1 " + lista.get(1));
		
		// Iterar sobre os elementos da lista
		System.out.println("Elementos da lista");
		for(String elemento : lista) {
			System.err.println(elemento);
		}
		
		// Verificar o tamanho da lista 
		System.out.println("Tamanho da lista e : " + lista.size() + " Elementos");
		
		// Verifica se a lista contem algum elementos em especifico
		System.out.println("A lista contem banana? " + lista.contains("Banana"));
		
		// Removendo um elemento da lista
		lista.remove(1);
		
		// Verificar o tamanho da lista 
		System.out.println("Tamanho da lista e : " + lista.size() + " Elementos");
		
		// Verifica os elementos da lista apos a remocao
		for(String frutas : lista) {
			System.err.println(frutas);
		}
	}

}

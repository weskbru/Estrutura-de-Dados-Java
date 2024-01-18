package ExemploArrayList;

import java.nio.channels.InterruptedByTimeoutException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class toDoList {

	public static void main(String[] args) {
		
		ArrayList<String> listaDeTarefas = new ArrayList<>();
		
		int opcao;
		
		do {
			String menu = "=== To-Do List ===\n"
					+ "1. Adicionar Tarefa\n"
					+ "2. Remover Tarefa\n"
					+ "3.Exibir Tarefas\n"
					+ "4. Sair";
			try {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
				
				switch(opcao) {
				case 1:
					String novaTarefa = JOptionPane.showInputDialog("Digite a nova tarefa:");
					listaDeTarefas.add(novaTarefa);
					JOptionPane.showInternalMessageDialog(null, "Tarefa adicionada coom sucesso!");
					break;
				case 2:
					if(listaDeTarefas.isEmpty()) {
						JOptionPane.showConfirmDialog(null, "A lista de tarefas esta vazia.");
						
					}else {
						StringBuilder tarefas = new StringBuilder("=== Tarefas ===\n");
						for(int i = 0; i < listaDeTarefas.size(); i++) {
							tarefas.append((i + 1)).append(" . ").append(listaDeTarefas.get(i)).append("\n");
						}
						
						int indiceTarefa = Integer.parseInt(JOptionPane.showInputDialog(tarefas.toString() + "Digite o numero da tarefa a ser removida"));
						
						if( indiceTarefa >= 1 && indiceTarefa <= listaDeTarefas.size()) {
							listaDeTarefas.remove(indiceTarefa - 1);
							JOptionPane.showMessageDialog(null, "Tarefa removida com sucesso!");
						} else {
							JOptionPane.showConfirmDialog(null, "Numero da tarefa invalido");
						}
						
					}
					break;
					
				case 3:
					if(listaDeTarefas.isEmpty()) {
						JOptionPane.showInternalMessageDialog(null, "A lita de vazia.");
					} else {
						StringBuilder tarefas = new StringBuilder("=== Tarefas ===\n");
						for(int i = 0; i < listaDeTarefas.size(); i++) {
							tarefas.append((i + 1)).append(". ").append(listaDeTarefas.get(i)).append("\n");
						}
						JOptionPane.showMessageDialog(null, tarefas.toString());
					}
				break;
				case 4:
					JOptionPane.showMessageDialog(null, "Saindo do programa. Ate mais!");
					break;
					
					default:
					JOptionPane.showMessageDialog(null, "Opcao invalida. Tente novamente.");
				break;
				}
				
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Por favor, Digite um numero valido");
				opcao = 0;
			}
			
		}while (opcao != 4);

	}

}

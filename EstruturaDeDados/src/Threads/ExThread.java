package Threads;

import javax.swing.JOptionPane;

public class ExThread {
	public static void main(String[] args) throws InterruptedException {
		
		// Thread processando em paralelo
		new Thread() {
			public void run() {
				
				/*Rotina em paralelo */
				for(int i = 0; i < 5; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} //Coloca a thread atual em espera por 1000 milissegundos 
					System.out.println("Enviando email");
				}
				// FIM DO CODIGO EM PARALELO 
				
			}
		}.start(); 
		
		
		
		// Continuacao do fluxo de trabalho
		System.out.println("Chegou ao fim da thread");
		JOptionPane.showMessageDialog(null, "CONTUNA O SISTEMA PARA O USUARIO");
	}
	
}
package Threads;


import javax.swing.JOptionPane;

public class DesafioThreads {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, " As tarefas estao sendo executadas em paralelo");
		
		// Uma Thread criada para Enviar mensagens de texto
		new Thread() {
			public void run() {
				for(int i = 0; i < 4; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Enviando mensagens de texto");
				}
			}
		}.start();
		/*FIM DA THREAD*/
		
		
		// Uma Thread para baixar arquivos da internet 
		new Thread() {
			public void run() {
				for(int i = 0; i < 3; i++) {
					try {
						Thread.sleep(2000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("baixar arquivos da internet");
				}
			}
		}.start();
		/*FIM DA THREAD*/
	
		
		// Um Thread que soma dois numeros
		new Thread() {
			public void run() {
				for(int i = 0; i < 1; i++) {
					
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					int valo1 = 1;
					int valo2 = 2;
					int total = valo1 + valo2;
					System.out.println("A soma do numero " +valo1 + " e " + valo2 + " o seu total e " + total );
				
				}
			}
		}.start();
		/*FIM DA THREAD*/

		JOptionPane.showInternalMessageDialog(null,"As threads estao sendo executada em segundo plano.");
	}
	
	
}

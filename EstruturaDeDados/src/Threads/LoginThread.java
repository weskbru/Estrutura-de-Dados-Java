package Threads;

// uma classe que extends uma Thread para vira um Thread
public class LoginThread extends Thread {
	
	private String username;
	private String password;
	
	
	public LoginThread(String username, String password) {
		this.username = username;
		this.password = password;
	}

	
	// Logica da thread 
	 @Override
	public void run() {
		// Simula o processamento da solicitação de login
		if(autenticacaoUsuario(username , password)) {
			System.out.println("Usuario " + username + " autenticado com sucesso!");
		} else {
			System.out.println("Falha na autenticação para o usuario " + username);
		}
	}
	
	// Método de autenticação de usuário 
	private boolean autenticacaoUsuario(String username, String password) {
		return username.equals("admin") && password.equals("admin");
	}
	
	
	public static void main(String[] args) {
		// Cria uma nova instância de LoginThread para processar a solicitação de login
		LoginThread logiThread = new LoginThread("admin", "admin");
		
		// Inicia a thread para processar a solicitação de login
		logiThread.start();
	}

}

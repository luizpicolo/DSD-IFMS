import java.io.ObjectInputStream;
import java.net.Socket;
import java.sql.Date;

public class Cliente {
	public static void main(String[] args) {
		try {
			Socket cliente = new Socket("localhost", 8888);
			ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
			String data_atual = (String) entrada.readObject();
			System.out.println("Data recebida do servidor:" + data_atual);
			entrada.close();
			System.out.println("Conexão encerrada");
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
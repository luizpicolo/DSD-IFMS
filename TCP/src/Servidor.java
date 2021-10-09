import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Date;

public class Servidor {
	public static void main(String[] args) {
		try {
			ServerSocket servidor = new ServerSocket(8888);
			System.out.println("Servidor ouvindo a porta 8888");
			while (true) {
				// o método accept() bloqueia a execução até que
				// o servidor receba um pedido de conexão
				Socket socket = servidor.accept();
				System.out.println("Cliente conectado: " + socket.getInetAddress().getHostAddress());
				ObjectOutputStream saida = new ObjectOutputStream(socket.getOutputStream());
				saida.flush();
				saida.writeObject(new DataAtual().getData());
				//saida.writeObject(new Date(0));
				saida.close();
				socket.close();
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
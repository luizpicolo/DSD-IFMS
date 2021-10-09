
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {
    
	public static void main(String[] args) {
        try {
			// cria um objeto para se tornar acessível via rede
        	IsEvenImpl x = new IsEvenImpl();
            String objName = "rmi://localhost/server";
			
            System.out.println("Registrando o objeto no RMIRegistry...");
			LocateRegistry.createRegistry(1099);
            Naming.rebind(objName, x);
			
            System.out.println("Aguardando Clientes!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}
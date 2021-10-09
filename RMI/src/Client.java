import java.rmi.Naming;
import java.rmi.RemoteException;

public class Client {
	public static void main(String[] args) throws Exception {
		String objName = "rmi://localhost:1099/server";
		IsEvenInterface x = (IsEvenInterface) Naming.lookup(objName);
		System.out.println("2 é par?: " + x.is_even(2));
	}
}
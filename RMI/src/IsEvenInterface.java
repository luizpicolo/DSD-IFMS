import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IsEvenInterface extends Remote{
	boolean is_even(int x)  throws RemoteException;
}
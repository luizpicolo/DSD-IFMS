
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class IsEvenImpl extends UnicastRemoteObject implements IsEvenInterface {

    public IsEvenImpl() throws RemoteException { 
		//super() is allways called!
    }

	@Override
	public boolean is_even(int x) throws RemoteException {
		if((x & 1) == 0) {
			return true;
		} else {
			return false;
		}	
	}
}
package bai2RMI;

import java.rmi.RemoteException;

public interface Bai2_TimBook {
	
	bai2_book timbook(String ma) throws RemoteException;

}

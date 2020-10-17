package bai2RMI;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import bai5RMI.NhapChuoimpl;

public class Bai2_ServerBook {
	public static void main(String[] args) throws AlreadyBoundException {
		try {
			Registry reg= LocateRegistry.createRegistry(9999);
			Bai2_TimBookmpl pl=new Bai2_TimBookmpl();
			reg.bind("RMItb",pl);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

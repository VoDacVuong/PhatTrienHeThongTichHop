package bai2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class bai2Client {
	public static void main(String[] args) {
		try {
			Socket socket =new Socket("localhost",2001);
			DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
			DataInputStream dataInputStream =new DataInputStream(socket.getInputStream());
			System.out.println("Nhap chuoi len server:");
			Scanner scan= new Scanner(System.in); 
			String str=scan.nextLine();
			dataOutputStream.writeUTF(str);
			dataOutputStream.flush();
			String str2 =dataInputStream.readUTF();
			System.out.println("server :"+str2);
			dataInputStream.close();
			dataOutputStream.close();
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
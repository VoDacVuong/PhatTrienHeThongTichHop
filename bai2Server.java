  
package bai2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class bai2Server {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket =new ServerSocket(2001);
		System.out.println("server da duoc khoi tao");
		Socket socket =serverSocket.accept();
		DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
		DataInputStream dataInputStream =new DataInputStream(socket.getInputStream());
		Scanner scan= new Scanner(System.in); 
		String str = dataInputStream.readUTF();
		System.out.println("Nhap chuoi tra ve client");
		String str2=scan.nextLine();
		dataOutputStream.writeUTF(str2);
		dataOutputStream.flush();
		serverSocket.close();
		dataInputStream.close();
		dataOutputStream.close();
		socket.close();
	}
}
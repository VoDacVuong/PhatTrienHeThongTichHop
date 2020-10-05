package IPAddress;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class AllHeaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i <= args.length; i++) {
			 try {
			 URL u = new URL("https://www.facebook.com/");
			 URLConnection uc = u.openConnection( );
			 for (int j = 1; ; j++) {
			 String header = uc.getHeaderField(j);
			 if (header == null) break;
			 System.out.println(uc.getHeaderFieldKey(j) + ": " + header);
			 }
			 }
			 catch (MalformedURLException ex) {
			 System.err.println("https://www.facebook.com/" + " is not a URL I understand.");
			 }
			 catch (IOException ex) {
			 System.err.println(ex);
			 }
			 System.out.println( );
			 }
	}

}

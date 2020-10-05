package IPAddress;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Date;

public class HeaderViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i < 10; i++) {
			 try {
			 URL u = new URL("http://www.sun.com/index.html");
			 URLConnection uc = u.openConnection( );
			 System.out.println("Content-type: " + uc.getContentType( ));
			 System.out.println("Contentencoding: " + uc.getContentEncoding( ));
			 System.out.println("Date: " + new Date(uc.getDate( )));
			 System.out.println("Last modified: " + new Date(uc.getLastModified(
			)));
			 System.out.println("Expiration date: " + new Date(uc.getExpiration(
			)));
			 System.out.println("Content-length: " + uc.getContentLength( ));
			 }

			 catch (MalformedURLException ex) {
			 System.err.println("http://www.sun.com/index.html" + " is not a URL I understand");
			 }
			 catch (IOException ex) {
			 System.err.println(ex);
			 }
			 System.out.println( );
			 } 
	}

}

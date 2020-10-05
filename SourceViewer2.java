package IPAddress;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class SourceViewer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length > 0) {
			 try {
			 //Open the URLConnection for reading
			 URL u = new URL("localhost");
			 URLConnection uc = u.openConnection( );
			 InputStream raw = uc.getInputStream( );
			 InputStream buffer = new BufferedInputStream(raw);
			 // chain the InputStream to a Reader
			 Reader r = new InputStreamReader(buffer);
			 int c;
			 while ((c = r.read( )) != -1) {
			 System.out.print((char) c);
			 }
			 }
			 catch (MalformedURLException ex) {
			 System.err.println(args[0] + " is not a parseable URL");
			 }
			 catch (IOException ex) {
			 System.err.println(ex);
			 }
			 }
	}

}

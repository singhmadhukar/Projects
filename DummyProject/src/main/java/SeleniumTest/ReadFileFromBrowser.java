package SeleniumTest;

import java.net.*;
import java.io.*;

public class ReadFileFromBrowser {
	
	
	public static boolean isFileFound( String filePath) throws Exception {
		
		URL url = new URL(filePath);
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		if (reader.readLine() != null) {
			return true;
		} else {
			return false;
		}	
		
	}
}

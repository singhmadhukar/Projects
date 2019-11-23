package SeleniumTest;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile implements ClipboardOwner{



	/*Read */
	public static String getFile(String fileName) throws IOException{
		String content = new String(Files.readAllBytes(Paths.get(fileName)));
		return content;
	}

	public static void setClipboardContents(String fileContent){
		//
		Toolkit tl = Toolkit.getDefaultToolkit();
		Clipboard clipboard = tl.getSystemClipboard();
		StringSelection stringSelection = new StringSelection(fileContent);
		clipboard.setContents(stringSelection, null);
	}


	public void lostOwnership(Clipboard clipboard, Transferable contents) {
		// TODO Auto-generated method stub

	}


}

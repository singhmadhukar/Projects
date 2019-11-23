package SeleniumTest;
import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.pdfbox.*;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.apache.pdfbox.util.PDFTextStripperByArea;


public class ReadPDFWord {

    public static void main(String[] args) throws IOException 
    {    	
      
        	PDDocument pdfDocument = PDDocument.load(new File("C:\\Users\\MADHUKAR\\Downloads\\output.pdf")) ;
       
            pdfDocument.getClass();
 
            if (!pdfDocument.isEncrypted()) {
             
                PDFTextStripperByArea pdfTextStripperByArea = new PDFTextStripperByArea();
                pdfTextStripperByArea.setSortByPosition(Boolean.TRUE);
 
                PDFTextStripper pdfTextStripper = new PDFTextStripper();
 
                String pdfFileInText = pdfTextStripper.getText(pdfDocument);
             /*   \\r?\\n*/
               
                String lines[] = pdfFileInText.split("             ");
                for (String line : lines) {
                    System.out.println(line);
                }

}
  
    }
}
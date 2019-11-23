package SeleniumTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

import com.itextpdf.text.pdf.PdfReader;

public class ExtractData1
{
	static String filepath="C:\\Users\\MADHUKAR\\Downloads\\output.pdf";
	public static void main(String[]args) throws IOException 
	{
		
		PdfReader pdf=new PdfReader(readcontentfrompdf(filepath));
	}
	public static String  readcontentfrompdf(String filepathforpdf) throws FileNotFoundException 
	{
		File file=new File(filepathforpdf);
		
		FileInputStream fis=new FileInputStream(file);
		PDDocument doc=null;
		
		try
		{
		doc=PDDocument.load(fis);
		
		String output=new PDFTextStripper().getText(doc);
		
		System.out.println(output);
		
		String[] strar=output.split(" "); 
		
		//System.out.println(strar[1000]);
		
		
		//for(int i=0;i<strar.length;i++)
	// {
		//   if() 
		//   {
			   
		//   }
			
			
	//	}
			
			
		
		
		//if(strar.toString().contains("Last Name")) {
			
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return filepathforpdf;
		
	}
}
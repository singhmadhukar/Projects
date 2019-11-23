package SeleniumTest;

import java.io.IOException;

import com.itextpdf.awt.geom.Rectangle;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.FilteredTextRenderListener;
import com.itextpdf.text.pdf.parser.LocationTextExtractionStrategy;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import com.itextpdf.text.pdf.parser.RegionTextRenderFilter;
import com.itextpdf.text.pdf.parser.RenderFilter;
import com.itextpdf.text.pdf.parser.TextExtractionStrategy;
import com.itextpdf.text.pdf.parser.TextRenderInfo;

public class ExtractData {
	
	
	
	
	
	public static void main(String []args) throws IOException
	{
		String data="F:\\output.pdf";
		
		//PdfReader reader = new PdfReader(data);
		
		parse(data);
	}
	
	

	public static void parse(String filename) throws IOException  {
	    PdfReader reader = new PdfReader(filename);
	    Rectangle rect = new Rectangle(33,668,100,10);
	    RenderFilter regionFilter = new RegionTextRenderFilter(rect);
	    FontRenderFilter fontFilter = new FontRenderFilter();
	    TextExtractionStrategy strategy = new FilteredTextRenderListener(
	            new LocationTextExtractionStrategy(), regionFilter,fontFilter);
	   String str = PdfTextExtractor.getTextFromPage(reader, 1, strategy);
	   
	   String arr[] = str.split(" ");
	   
	  for (String string : arr) {
		 System.err.println(string);
	}
	    
	    reader.close();
	}

}
class FontRenderFilter extends RenderFilter {
    public boolean allowText(TextRenderInfo renderInfo) {
        String font = renderInfo.getFont().getPostscriptFontName();
        return font.endsWith("Bold") || font.endsWith("");
    }
}




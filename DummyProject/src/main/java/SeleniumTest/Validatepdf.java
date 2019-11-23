package SeleniumTest;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.annotations.VisibleForTesting;

public class Validatepdf {
	
	public static WebDriver wbd;
	public static void main(String[] args) throws InterruptedException {		
		
		wbd = new ChromeDriver();
		
		wbd.get("https://www.tutorialspoint.com/java/java_tutorial.pdf");
		
		
		try {
			if(ReadFileFromBrowser.isFileFound("https://www.tutorialspoint.com/java/java_tutorial.pdf")) {
				System.out.println("File found !!");
			}else {System.out.println("File does not exist");}
		} catch (Exception e) {
			System.out.println("Either file not available or some error occured");
		}
		
		
	//	WebElement wb=wbd.findElement(By.xpath("//*[@id=\"plugin\"]"));
		String wb=wbd.getTitle();
		//String st=wb.getText();
		
		Thread.sleep(2000);
		
		//if(st!=null)
	//	{
			System.out.println(wb);
	//	}
	//	else
		//{
	//		System.out.println("Document not found");
	//	}
		
		
		
		
		
	}

}

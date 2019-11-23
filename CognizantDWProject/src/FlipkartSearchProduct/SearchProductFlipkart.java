package FlipkartSearchProduct;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Listeners.CaptureScreenshotUsingRobot;

public class SearchProductFlipkart {
	
		
		   String chrome_path;
		   public static XSSFWorkbook workbook;
		   public static XSSFSheet worksheet;
		   public static DataFormatter formatter= new DataFormatter();
		   public static String file_location = "C:\\Users\\MADHUKAR\\eclipse-workspace\\CognizantDWProject\\TestData\\Book1.xlsx";
		   public  String Res;
		public   static WebDriver driver;
		 static String SheetName= "Sheet1";

	@DataProvider
	   public static Object[][] ReadExcel() throws IOException
	   {
	   FileInputStream fileInputStream= new FileInputStream(file_location); 
	       workbook = new XSSFWorkbook (fileInputStream); 
	       worksheet=workbook.getSheet(SheetName);
	       XSSFRow Row=worksheet.getRow(0);     
	    
	       int RowNum = worksheet.getPhysicalNumberOfRows();
	       int ColNum= Row.getLastCellNum(); 
	        
	       Object Data[][]= new Object[RowNum-1][ColNum]; 
	        
	           for(int i=0; i<RowNum-1; i++) 
	           {  
	               XSSFRow row= worksheet.getRow(i+1);
	                
	               for (int j=0; j<ColNum; j++) 
	               {
	                   if(row==null)
	                       Data[i][j]= "";
	                   else
	                   {
	                       XSSFCell cell= row.getCell(j);
	                       if(cell==null)
	                           Data[i][j]= ""; 
	                       else
	                       {
	                           String value=formatter.formatCellValue(cell);
	                           Data[i][j]=value; 
	                       }
	                   }
	               }
	           }

	       return Data;
	   }

		  


	/**
	* Below I mentioned  program for  getting data from excel sheet.
	* */

	@Test 
	(dataProvider="ReadExcel") //It get values from ReadVariant function method

	//Here my all parameters from excel sheet are mentioned.
	public void AddVariants(String TestData) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MADHUKAR\\eclipse-workspace\\CognizantDWProject\\Driver\\chromedriver.exe");
		driver=new  ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/Electronic-Deals/b?ie=UTF8&node=4192584031");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(TestData,Keys.ENTER);
		Thread.sleep(5000);
		CaptureScreenshotUsingRobot.CaptureScreenShotWithTestStepNameUsingRobotClass(TestData);
		Thread.sleep(2000);
		driver.close();
		
      

	
		
		
		
	}
	
	
	

}

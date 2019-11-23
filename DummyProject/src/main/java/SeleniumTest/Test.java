package SeleniumTest;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.*;

public class Test {
	public static WebDriver driver;
	
	
	
	public static void main(String[] args) throws IOException {
		 
	//	System.setProperty("webdriver.chrome.driver", "‪F:\\chromedriver.exe");
		driver=new ChromeDriver();
		
	//	waitClass wClass=PageFactory.initElements(driver, waitClass.class);
		actiTimeTest act=PageFactory.initElements(driver,actiTimeTest.class);
		
		
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		act.read();
		act.ssubmit();
	
	    
		
		
		
		
		//actiTimeTest act=PageFactory.initElements(driver,actiTimeTest.class);
	/*	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("fgrhhj@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		driver.findElement(By.xpath("//*[@id='id_gender2']")).click();*/
		
		//*[@id="id_gender2"]
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//act.us.sendKeys("admin");
		//act.psw.sendKeys("manager");
	 //  boolean b = wClass.explicitlyWait(driver, 20, act.search);
	   
	//   System.out.println(b);
	//	act.log.click();
	 
	        
	   //  WebDriverWait wait = new WebDriverWait(driver,20);
      //  wait.until(ExpectedConditions.visibilityOfElementLocated((By) act.search));
	/*    
	 //    Actions act=new Actions(driver)
	    		 
	    		 
		driver.findElement(By.xpath("(//img[contains(@height,'98')])[4]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/div/table/tbody/tr/td[6]/nobr/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"customersProjectsForm\"]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/input[1]")).click();
		
		ReadFile.setClipboardContents(ReadFile.getFile("F:\\TestData.txt"));
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/form/table/tbody/tr[3]/td/table/tbody/tr[5]/td[2]/table/tbody/tr[2]/td[3]/textarea")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
	*/
	}

}

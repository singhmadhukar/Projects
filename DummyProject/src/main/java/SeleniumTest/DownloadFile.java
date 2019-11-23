package SeleniumTest;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DownloadFile {
	
	public static WebDriver driver;
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver", "‪C:\\Users\\MADHUKAR\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/java/java_tutorial.pdf");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//WebElement wb=driver.findElement(By.xpath("//*[@id=\"plugin\"]"));
		
		driver.findElement(By.xpath("//*[@id=\"plugin\"]")).sendKeys(Keys.chord(Keys.CONTROL, "s"));
	//	Actions act=new Actions(driver);
		
	//	act.contextClick().build().perform();
		
		
		
		// We user robot to set the location for the windows Popedup Destination folder
		Robot robot = new Robot();
		Thread.sleep(3000);

		//setting up the location to download the image D:\Jars\(filename)
	robot.keyPress(KeyEvent.VK_G);

		//example of KeyRelease
		//robot.keyPress(KeyEvent.VK_COLON);

		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_SEMICOLON);
		robot.keyRelease(KeyEvent.VK_SHIFT);

		robot.keyPress(KeyEvent.VK_BACK_SLASH);

		// writing the folder name jars
		robot.keyPress(KeyEvent.VK_J);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_S);

		robot.keyPress(KeyEvent.VK_BACK_SLASH);

		//Filename
		robot.keyPress(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_A);

		// Took screenshot to verify – It will not take screenshot of window dialog box as it only takes screenshot for webpages
	//	File scrfile = (((TakesScreenshot)driver)).getScreenshotAs(OutputType.FILE);
	//	FileUtils.copyFile(scrfile, new File(“D://YoBro.jpg”));

		// pressing Enter to save the location
		robot.keyPress(KeyEvent.VK_ENTER);
			
		

}
}
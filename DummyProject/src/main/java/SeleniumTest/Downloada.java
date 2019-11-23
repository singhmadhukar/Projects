package SeleniumTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Downloada{

	public static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement element = driver.findElement(By.xpath("(//input[contains(@type,'submit')])[3]"));
		String str = element.getAttribute("value");
		System.out.println(str);
		/*Actions action = new Actions(driver);
		 * Sys

		action.moveToElement(element).build().perform();

		driver.findElement(By.linkText("1")).click();*/

	}

}
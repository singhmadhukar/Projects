package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actiTimeTest {
	public static WebDriver driver;

	@FindBy(name="username")
	public WebElement us;

	@FindBy(name="pwd")
	public WebElement psw;


	@FindBy(id="loginButton")
	public WebElement log;

	@FindBy(xpath="//*[@id=\"container\"]/div/header/div[1]/div/div[2]/form/div/div[1]/div/input")
	public WebElement search;


	@FindBy(xpath="//*[@id=\"email_create\"]")
	public WebElement data;

	@FindBy(xpath="//*[@id=\"SubmitCreate\"]/span")
	public WebElement submit;


	waitClass wClass= new waitClass();//PageFactory.initElements(driver, waitClass.class);

	public void read()
	{
		try {

			

			wClass.implicitlyWait(driver, 20);
			data.sendKeys("data@gmail.com");

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void ssubmit()
	{
		try
		{
			

			wClass.implicitlyWait(driver, 20);	
			submit.click();
		}
		catch (Exception e) {
			e.printStackTrace();
		}



	}

}


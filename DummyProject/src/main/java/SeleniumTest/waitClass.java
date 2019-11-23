package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class waitClass {
	
    public void implicitlyWait(WebDriver driver, int time) {
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public boolean ExplicitlyWait(WebDriver driver, Integer time, WebElement element) {
        if (driver == null && time == null && element == null)
            return false;
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOf(element));
        return true;
    }
    public boolean explicitlyWait(WebDriver driver, Integer time, By locator) {
        if (driver == null && time == null && locator == null)
            return false;
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return true;
        
    }
}
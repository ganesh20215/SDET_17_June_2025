package selenium.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.manage().window().maximize();

        driver.findElement(By.id("reveal")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement e = driver.findElement(By.id("revealed"));

        wait.until(ExpectedConditions.elementToBeClickable(e)).click();

       e.sendKeys("Test Data");

        //driver.close();
    }
}

package selenium.actionsexample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.flipkart.com/");
        driver.manage().window().maximize();

        WebElement nameLocator = driver.findElement(By.name("q"));

        Actions a = new Actions(driver);
        a.moveToElement(nameLocator)
                .click(nameLocator)
                .keyDown(Keys.SHIFT)
                .pause(3000)
                .sendKeys("t shirt")
                .pause(3000)
                .keyUp(Keys.SHIFT)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();
    }
}

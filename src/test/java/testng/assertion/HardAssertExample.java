package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

    @Test
    public void verifyLoginWithValidCredentials() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/inventory.html");

        Thread.sleep(2000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Thread.sleep(2000);
        WebElement productElement = driver.findElement(By.xpath("//span[text()='Products']"));
        WebElement swagElement = driver.findElement(By.xpath("//div[text()='Swag Labs']"));

        Assert.assertFalse(productElement.isDisplayed(), "Product Element should be displayed");
        Assert.assertEquals(swagElement.getText(), "Swag Labs", "Product Element should be displayed");
        Thread.sleep(2000);
        driver.close();

    }
}

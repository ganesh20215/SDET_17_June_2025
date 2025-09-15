package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test
    public void verifySauceDemoHomePage() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/inventory.html");

        Thread.sleep(2000);
        WebElement userNameTextBox = driver.findElement(By.id("user-name"));
        WebElement passwordTextBox = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));

        //text box validations
        SoftAssert sf = new SoftAssert();
        sf.assertFalse(userNameTextBox.isDisplayed(), "username textbox should be display");
        sf.assertTrue(passwordTextBox.isDisplayed(), "passwordTextBox should be display");
        sf.assertFalse(loginBtn.isDisplayed(), "loginBtn should be display");

        userNameTextBox.sendKeys("standard_user");
        passwordTextBox.sendKeys("secret_sauce");
        loginBtn.click();

        Thread.sleep(2000);
        WebElement productElement = driver.findElement(By.xpath("//span[text()='Products']"));
        WebElement swagElement = driver.findElement(By.xpath("//div[text()='Swag Labs']"));

        sf.assertTrue(productElement.isDisplayed(), "Product Element should be displayed");
        sf.assertEquals(swagElement.getText(), "swag Labs", "Product Element should be displayed");
        Thread.sleep(2000);

        sf.assertAll();

        driver.close();
    }
}

package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NormalDataProviderWithExample {

    @DataProvider(name = "test-data")
    public Object[][] dataProviderFun(){
        return new Object[][]{
                {"standard_user", "secret_sauce"},  {"standard_user", "test"}, {"user", "test"},
        };
    }

    @Test(dataProvider = "test-data")
    public void verifySauceDemoWithValidData(String username, String password) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/inventory.html");
        WebElement userNameTextBox = driver.findElement(By.id("user-name"));
        WebElement passwordTextBox = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        userNameTextBox.sendKeys(username);
        Thread.sleep(2000);
        passwordTextBox.sendKeys(password);
        Thread.sleep(2000);
        loginBtn.click();
        Thread.sleep(2000);
        driver.close();
    }
}

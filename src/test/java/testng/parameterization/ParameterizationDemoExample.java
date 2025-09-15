package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationDemoExample {

    public static WebDriver driver;

    @Parameters({"browserName"})
    @BeforeMethod
    public void preDemo(String browserName) {
        if (browserName.equals("chome")) {
            driver = new ChromeDriver();
            driver.navigate().to("https://www.saucedemo.com/inventory.html");
        } else if (browserName.equals("firefox")) {
            driver = new FirefoxDriver();
            driver.navigate().to("https://www.saucedemo.com/inventory.html");
        } else if (browserName.equals("edge")) {
            driver = new EdgeDriver();
            driver.navigate().to("https://www.saucedemo.com/inventory.html");
        } else {
            throw new RuntimeException("Please select correct browser name");
        }
    }


    @Parameters({"username", "password"})
    @Test
    public void verifySauceDemoWithValidData(String username, String password) throws InterruptedException {
        WebElement userNameTextBox = driver.findElement(By.id("user-name"));
        WebElement passwordTextBox = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        userNameTextBox.sendKeys(username);
        passwordTextBox.sendKeys(password);
        loginBtn.click();
        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDownDemo() {
        driver.close();
    }
}

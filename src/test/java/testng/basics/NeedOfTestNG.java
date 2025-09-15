package testng.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NeedOfTestNG {

    @Test
    public void myFirstTestNGScript1() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.in");
        Assert.assertTrue(false);
        driver.close();
    }

    @Test(dependsOnMethods = {"myFirstTestNGScript1"})
    public void myFirstTestNGScript2() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        driver.close();
    }

    @Test
    public void testCheck() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.edso.in");
        driver.close();
    }
}

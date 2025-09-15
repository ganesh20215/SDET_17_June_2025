package testng.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsHierarchyExample {

    public static WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void postActions(){
        driver.close();
    }

    @Test(groups = {"smoke"})
    public void annotation1() {
        driver.navigate().to("https://www.amazon.in");
    }

    @Test
    public void annotation2() {
        driver.navigate().to("https://www.facebook.com");
    }
}

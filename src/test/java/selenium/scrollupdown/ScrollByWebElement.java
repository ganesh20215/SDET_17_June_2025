package selenium.scrollupdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByWebElement {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        WebElement e = driver.findElement(By.xpath("//a[text()='Disclaimer']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;    //Down casting
        js.executeScript("arguments[0].scrollIntoView();", e);
    }
}

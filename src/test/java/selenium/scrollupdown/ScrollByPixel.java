package selenium.scrollupdown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByPixel {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;    //Down casting
        js.executeScript("window.scrollBy(0, 2000)");

        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0, -2000)");
    }
}

package selenium.cookies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcceptCookieExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.tcs.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }
}

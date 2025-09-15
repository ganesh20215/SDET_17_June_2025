package selenium.windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        driver.findElement(By.id("openwindow")).click();
        Thread.sleep(3000);

        System.out.println(driver.getTitle());

        String parentWindowId = driver.getWindowHandle();
        System.out.println("parent window id " + parentWindowId);

        Set<String> allWindowId = driver.getWindowHandles();
        System.out.println("all window id " + allWindowId);

        for (String s : allWindowId) {
            if (!s.contentEquals(parentWindowId)) {
                driver.switchTo().window(s);
                driver.findElement(By.linkText("BLOG")).click();
                Thread.sleep(3000);
                System.out.println(driver.getTitle());
                driver.close();
            }
        }
        Thread.sleep(3000);
        driver.switchTo().window(parentWindowId);
        driver.findElement(By.id("bmwcheck")).click();
        Thread.sleep(3000);
        driver.close();
    }
}

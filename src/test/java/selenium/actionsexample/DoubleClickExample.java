package selenium.actionsexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://selenium08.blogspot.com/2019/11/double-click.html");
        driver.manage().window().maximize();

        WebElement elementA = driver.findElement(By.xpath("//button[text()='Double-Click me to see Alert message']"));

        Actions a = new Actions(driver);
        a.doubleClick(elementA)
                .perform();
    }
}

package selenium.seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FIndElementsExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        List<WebElement> allElements = driver.findElements(By.tagName("test"));
        System.out.println(allElements.size());

        for (WebElement e : allElements){
            System.out.println(e);
        }
    }
}

package selenium.seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement e = driver.findElement(By.id("bmwradio"));
        System.out.println(e.isSelected()); //false
        e.click();
        System.out.println(e.isSelected()); //true

        driver.close();
    }
}

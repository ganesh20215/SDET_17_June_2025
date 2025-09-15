package selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOptionSelection {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement dropDownElement = driver.findElement(By.id("carselect"));
        Select s = new Select(dropDownElement);

        Thread.sleep(2000);
        //selectByIndex
        s.selectByIndex(2);

        Thread.sleep(2000);
        //selectByValue
        s.selectByValue("benz");

        Thread.sleep(2000);
        //selectByVisibleText
        s.selectByVisibleText("BMW");

    }
}

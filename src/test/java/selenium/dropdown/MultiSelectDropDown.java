package selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement dropDownElement = driver.findElement(By.id("multiple-select-example"));
        Select s = new Select(dropDownElement);

        //Thread.sleep(2000);
        //selectByIndex
        s.selectByIndex(2);

        //Thread.sleep(2000);
        //selectByValue
        s.selectByValue("orange");

        //Thread.sleep(2000);
        //selectByVisibleText
        s.selectByVisibleText("Apple");

/*        Thread.sleep(2000);
        //deselectByIndex
        s.deselectByIndex(2);

        Thread.sleep(2000);
        //deselectByValue
        s.deselectByValue("orange");

        Thread.sleep(2000);
        //deselectByVisibleText
        s.deselectByVisibleText("Apple");*/

        s.deselectAll();
    }
}

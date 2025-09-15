package selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FetchAllOptions {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement dropDownElement = driver.findElement(By.id("carselect"));
        Select s = new Select(dropDownElement);

        //getOptions
        //List<WebElement> allElements = s.getOptions();

        //getAllSelectedOptions()
        /*List<WebElement> allElements = s.getAllSelectedOptions();
        for (WebElement e : allElements){
            System.out.println(e.getText());
        }*/


        driver.close();
    }
}

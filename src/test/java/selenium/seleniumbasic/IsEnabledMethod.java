package selenium.seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement textBox = driver.findElement(By.id("enabled-example-input"));
        WebElement disableBtn = driver.findElement(By.id("disabled-button"));
        WebElement enableBtn = driver.findElement(By.id("enabled-button"));

        System.out.println(textBox.isEnabled());    //true
        disableBtn.click();
        System.out.println(textBox.isEnabled());    //false
        enableBtn.click();
        System.out.println(textBox.isEnabled());    //true
        driver.close();
    }
}

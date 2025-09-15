package selenium.handlealert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        //alert handle
        //driver.switchTo().alert().accept();

        //dismiss
        //driver.switchTo().alert().dismiss();

        //getText of alert
/*        Alert a = driver.switchTo().alert();
        System.out.println(a.getText());
        a.accept();*/

        //sendKey Text
        driver.findElement(By.name("enter-name")).sendKeys("Test Data");
        driver.findElement(By.id("alertbtn")).click();
        Alert a = driver.switchTo().alert();
        System.out.println(a.getText());
        //a.accept();

        //driver.close();
    }
}

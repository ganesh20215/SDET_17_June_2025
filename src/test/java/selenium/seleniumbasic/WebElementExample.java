package selenium.seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        //sendKeys()
        WebElement element = driver.findElement(By.id("login1"));
        //element.sendKeys("Ganesh Jadhav");

        //clear()
        //element.clear();

        //click()
        //driver.findElement(By.className("signin-btn")).click();

        //submit()
        //driver.findElement(By.className("signin-btn")).submit();

        //getText()
        //WebElement e = driver.findElement(By.xpath("//a[text()='Forgot password?']"));
        //System.out.println(e.getText());

        //getTagName()
        //System.out.println(e.getTagName());

    }
}

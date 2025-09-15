package selenium.seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Locators {

    //Scripting Language [tags]
    //HTML : Static Pages
    //CSS : For styling
    //Javascript : Dynamic web pages

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        //Id locator
        //driver.findElement(By.id("login1")).sendKeys("Ganesh");

        //class name locator
        //driver.findElement(By.className("email-input")).sendKeys("Ganesh");

        //name locator
        //driver.findElement(By.name("login")).sendKeys("Ganesh");

        //link text locator
        //driver.findElement(By.linkText("Forgot password?")).click();

        //partial text locator
        //driver.findElement(By.partialLinkText("password?")).click();

        //tag name locator
        /*List<WebElement> allTags = driver.findElements(By.tagName("input"));
        System.out.println(allTags.size());*/

        //css selector
        //driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("Emtiyaz");
        //driver.findElement(By.cssSelector("input#login1")).sendKeys("Emtiyaz");
        //driver.findElement(By.cssSelector("input[class='email-input']")).sendKeys("Emtiyaz");
        //driver.findElement(By.cssSelector("input.email-input")).sendKeys("Emtiyaz");

        //xpath
        //driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/form/div[1]/div/input")).sendKeys("Ganesh");
        //driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Ganesh");;
        //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Ganesh");
        //driver.findElement(By.xpath("//span[text()='Login']")).click();
        //driver.findElement(By.xpath("//input[@id='login1' and @name='login']")).sendKeys("Ganesh");
        //driver.findElement(By.xpath("//input[@id='login1' or @name='logi']")).sendKeys("Ganesh");

        //start-with()
        //driver.findElement(By.xpath("//a[starts-with(text(),'Forgot')]")).click();
        //driver.findElement(By.xpath("//input[starts-with(@id,'pass')]")).sendKeys("Ganesh");

        //contains()
        //driver.findElement(By.xpath("//a[contains(text(),'word')]")).click();
        //driver.findElement(By.xpath("//input[contains(@class,'input')]")).sendKeys("Ganesh");

        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//span[text()='Login']"))).perform();


        //following xpath axes
        List<WebElement> allElements = driver.findElements(By.xpath("//span[text()='Login']//following::li"));
        for (WebElement e : allElements){
            System.out.println(e.getText());
        }
    }
}

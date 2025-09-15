package selenium.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePickerExample {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

        driver.findElement(By.id("selenium/datepicker")).click();
        WebElement monthElement;
        WebElement yearElement;
        List<WebElement> allDates;

        for (int i = 0; i < 24; i++) {
            monthElement = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
            yearElement = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
            if (monthElement.getText().equals("August") && yearElement.getText().equals("2024")) {
                break;
            } else {
                driver.findElement(By.xpath("//a[@data-handler='prev']")).click();
                Thread.sleep(1000);
            }
        }
        allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//child::td/a"));
        for (WebElement e : allDates) {
            if (e.getText().equals("25")) {
                Thread.sleep(1000);
                e.click();
                break;
            }
        }
    }
}
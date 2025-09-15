package selenium.iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class IFrameExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/frames");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

/*        List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
        System.out.println(allFrames.size());*/

        JavascriptExecutor js = (JavascriptExecutor) driver;    //Down casting
        js.executeScript("window.scrollBy(0, 500)");

        //driver.switchTo().frame("frame1");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));
        //driver.switchTo().frame(0);

        WebElement e = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
        System.out.println(e.getText());

        driver.switchTo().parentFrame();

        WebElement e2 = driver.findElement(By.xpath("//h1[text()='Frames']"));
        System.out.println(e2.getText());

        driver.close();
    }
}

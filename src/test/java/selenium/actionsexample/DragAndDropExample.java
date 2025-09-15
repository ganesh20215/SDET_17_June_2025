package selenium.actionsexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://selenium08.blogspot.com/2020/01/drag-drop.html");
        driver.manage().window().maximize();

        WebElement elementA = driver.findElement(By.id("draggable"));
        WebElement elementB = driver.findElement(By.id("droppable"));

        Actions a = new Actions(driver);
        a.dragAndDrop(elementA, elementB)
                .perform();
    }
}

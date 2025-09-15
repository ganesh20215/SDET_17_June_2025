package selenium.uploadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        //upload file
        WebElement uploadFileElement = driver.findElement(By.id("file-upload"));
        uploadFileElement.sendKeys("D:\\classes\\Edso\\AutomationTesting\\sdsdff.xlsx");

        Thread.sleep(3000);
        //click on the upload button
        driver.findElement(By.id("file-submit")).click();

        //verify file uploaded or not
        WebElement fileUploadMessage = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));

        if (fileUploadMessage.isDisplayed()){
            System.out.println("File Upload sucessfully..");
        }else {
            System.out.println("File isn't uploaded..");
        }
    }
}

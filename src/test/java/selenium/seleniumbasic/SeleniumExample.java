package selenium.seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();        //Upcasting
        //WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new EdgeDriver();

        //ChromeDriver driver = new ChromeDriver();

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        //driver.close();
    }

}

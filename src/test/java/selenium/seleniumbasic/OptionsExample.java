package selenium.seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OptionsExample {

    public static void main(String[] args) {

        ChromeOptions option = new ChromeOptions();
        //option.setBinary("D:\\classes\\Edso\\AutomationTesting\\Selenium\\WebDriver_Version\\chrome-win64\\chrome-win64\\chrome.exe");
         //option.addArguments("--incognito");
         option.addArguments("--headless");
         option.setAcceptInsecureCerts(true);

        WebDriver driver = new ChromeDriver(option);
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    }
}

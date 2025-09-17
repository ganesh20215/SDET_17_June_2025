package selenium.cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookiesHandleExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.tcs.com/");

        //Add Own cookie
        Cookie ac = new Cookie("Name", "Riddhi");
        driver.manage().addCookie(ac);

        //Get All Cookies
        System.out.println("Fetch all cookies from application....");
        Set<Cookie> allCookies = driver.manage().getCookies();
        for (Cookie c : allCookies){
            System.out.println(c);
        }

        //System.out.println(driver.manage().getCookieNamed("Name"));

        driver.manage().deleteCookieNamed("Name");
        System.out.println();
        System.out.println("************ After Delete cookies from application.... ************");
        Set<Cookie> allCookies2 = driver.manage().getCookies();
        for (Cookie c : allCookies2){
            System.out.println(c);
        }

        //delete all cookies
        driver.manage().deleteAllCookies();
        System.out.println();
        System.out.println("%%%%%%%%% After Delete cookies from application.... %%%%%%%");
        Set<Cookie> allCookies3 = driver.manage().getCookies();
        for (Cookie c : allCookies3){
            System.out.println(c);
        }

        driver.close();
    }
}


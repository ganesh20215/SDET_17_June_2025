package testng.parameterization;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderWithExcel {


    @DataProvider(name = "test-data")
    public Object[][] dataProviderFun() throws IOException {
        Object[][] arrayObject = getExcelData("D:\\classes\\TestNGDemoForMorningBatch.xlsx", "TestCases");

        return arrayObject;
    }


    public Object[][] getExcelData(String filePath, String sheetName) throws IOException, IOException {
        FileInputStream fis = new FileInputStream(filePath);
        Workbook wb = new XSSFWorkbook(fis);
        Sheet sh = wb.getSheet(sheetName);

        int row = sh.getPhysicalNumberOfRows();
        int cols = sh.getRow(0).getLastCellNum();

        Object[][] data = new Object[row - 1][cols];

        for (int i = 1; i < row; i++) {
            Row r = sh.getRow(i);
            for (int j = 0; j < cols; j++) {
                Cell c = r.getCell(j);
                data[i - 1][j] = c.toString();
            }
        }

        return data;
    }

    @Test(dataProvider = "test-data")
    public void verifySauceDemoWithValidData(String username, String password) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/inventory.html");
        WebElement userNameTextBox = driver.findElement(By.id("user-name"));
        WebElement passwordTextBox = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        userNameTextBox.sendKeys(username);
        Thread.sleep(2000);
        passwordTextBox.sendKeys(password);
        Thread.sleep(2000);
        loginBtn.click();
        Thread.sleep(2000);
        driver.close();
    }
}


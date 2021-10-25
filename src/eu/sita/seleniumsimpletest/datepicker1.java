package eu.sita.seleniumsimpletest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker1
{

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sunee\\Desktop\\intellij-selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");
       // driver.findElement(By.id("onward_cal")).sendKeys("31-Aug-2021");
        Thread.sleep(5000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("document.getElementById('onward_cal').value='31-Aug-2021'");
        Thread.sleep(3000);
        driver.quit();

    }
}

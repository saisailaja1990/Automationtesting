package eu.sita.seleniumsimpletest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class nextpage
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunee\\Desktop\\intellij-selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");


        WebElement category = driver.findElement(By.id("searchDropdownBox"));
        category.click();
        Select s = new Select(category);
        s.selectByVisibleText("Electronics");
        Thread.sleep(5000);

        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("mobile");
        Thread.sleep(5000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.history.forward()");

        System.out.println("hi");
        driver.quit();




    }
}

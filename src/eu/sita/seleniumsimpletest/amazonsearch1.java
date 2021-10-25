package eu.sita.seleniumsimpletest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazonsearch1
{
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunee\\Desktop\\intellij-selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(5000);

        WebElement category = driver.findElement(By.id("searchDropdownBox"));
        category.click();
        Select s = new Select(category);
        s.selectByVisibleText("Electronics");
        Thread.sleep(5000);

        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("mobile");
        Thread.sleep(5000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("history.go(0)");// refresh
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

        JavascriptExecutor js1 = (JavascriptExecutor)driver;
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");// scroll webpage to the bottom

        //WebElement mobile1=driver.findElement(By.xpath("//span[text()='Samsung Galaxy Z Fold3 5G (Phantom Black, 12GB RAM, 256GB Storage) with No Cost EMI/Additional Exchange Offers']"));
        //mobile1.click();

    }


}

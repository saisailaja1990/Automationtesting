package eu.sita.seleniumsimpletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class excwait
{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunee\\Desktop\\intellij-selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Loader.html");
        driver.findElement(By.id("loader")).click();
        WebElement modelpopup=driver.findElement(By.cssSelector("#myModal p"));
        WebDriverWait wait=new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.visibilityOf(modelpopup));
        String text= modelpopup.getText();
        System.out.println("paragraph"+text);

        driver.quit();
    }
}

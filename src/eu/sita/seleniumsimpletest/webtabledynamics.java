package eu.sita.seleniumsimpletest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class webtabledynamics
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunee\\Desktop\\intellij-selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://editor.datatables.net/");

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)","");//scroll down
        Thread.sleep(5000);

        int tr=0;
        //List<WebElement> names=driver.findElements(By.xpath("//table[@id='example']/tbody/tr[0]/td[2]"));
        List<WebElement> names=driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[2]"));//Employee names in first columns
        for(WebElement name:names)
        {
            tr++;
            if(name.getText().equals("Bruno Nash"))
            {
                break;
            }
        }

        String salary=driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+tr+"]/td[6]")).getText();
        System.out.println("Emp name::"+names);
        System.out.println("salary"+salary);



    }
}

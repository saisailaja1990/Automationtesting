package eu.sita.seleniumsimpletest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable
{
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunee\\Desktop\\intellij-selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://editor.datatables.net/");

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)","");//scroll down
        Thread.sleep(5000);



        String salary=driver.findElement(By.xpath("//table[@id='example']/tbody/tr[3]/td[6]")).getText();
        System.out.println("salary of 3th person is :"+salary);
        Thread.sleep(5000);

        WebElement nextbtn=driver.findElement(By.id("example_next"));
        nextbtn.click();

        String salary1=driver.findElement(By.xpath("//table[@id='example']/tbody/tr[5]/td[6]")).getText();
        System.out.println("salary of 15th person is :"+salary1);
        Thread.sleep(5000);


        WebElement previsebtn=driver.findElement(By.id("example_previous"));
        previsebtn.click();


    }
}

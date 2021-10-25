package eu.sita.seleniumsimpletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sunee\\Desktop\\intellij-selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Frames.html");
        Thread.sleep(3000);
        driver.findElement(By.linkText("Iframe with in an Iframe")).click();
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Total Frames --" + size);
        WebElement parentframe=driver.findElement(By.cssSelector("iframe[src$='Frames.html']"));
        driver.switchTo().frame(parentframe);
        System.out.println("Hello switching to parent frame");
        WebElement childframe=driver.findElement(By.cssSelector("iframe[src$='Frame.html']"));
        driver.switchTo().frame(childframe);
        System.out.println("HI welcome to child frame");
        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("success");
    }
}

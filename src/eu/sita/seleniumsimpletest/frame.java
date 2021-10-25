package eu.sita.seleniumsimpletest;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sunee\\Desktop\\intellij-selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Frames.html");
        Thread.sleep(3000);
        driver.findElement(By.linkText("Iframe with in an Iframe")).click();
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Total Frames --" + size);

       // WebElement parentframe=driver.findElement(By.xpath(".//iframe[@src='http://demo.automationtesting.in/MultipleFrames.html']"));
        driver.switchTo().parentFrame();
        System.out.println("hello");
        Thread.sleep(3000);
        System.out.println("hi");
        WebElement childframe=driver.findElement(By.xpath(".//iframe[@src='http://demo.automationtesting.in/SingleFrame.html']"));
        driver.switchTo().frame(childframe);


        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("java");
        System.out.println("program sucess");




    }
}

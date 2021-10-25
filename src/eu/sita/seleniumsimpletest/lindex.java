package eu.sita.seleniumsimpletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lindex
{
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lindex.com/se");
       // WebElement link= driver.findElement(By.xpath("//a[@title='BARNKLÄDER']/following::a[1]"));
       // link.click();
       // driver.findElement(By.xpath("//a[@title='BARNKLÄDER']/following::a[1]")).click();


       // WebElement link=driver.findElement(By.xpath("//a[@title='BABYKLÄDER']/preceding::a[1]"));
       // Thread.sleep(3000);

       // link.click();

        //WebElement link= driver.findElement(By.xpath("//a[@title='ACCESSOARER BARN']"));


       // WebElement link= driver.findElement(By.xpath("//a[@title='ACCESSOARER BARN']/following::a[1]"));

        WebElement link= driver.findElement(By.xpath("//a[@title='ACCESSOARER BARN']/following::a[2]"));

      // WebElement link= driver.findElement(By.xpath("//a[@title='ACCESSOARER BARN']/following::a[3]"));

       // WebElement link= driver.findElement(By.xpath("//a[@title='ACCESSOARER BARN']/following::a[4]"));

       // WebElement link= driver.findElement(By.xpath("//a[@title='GÅ TILL LIVE SHOPPING']/preceding::a[1]"));

        link.click();

    }
}

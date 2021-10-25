package eu.sita.seleniumsimpletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtest
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.Amazon.com/");
        driver.manage().window().maximize();

        WebElement todaydeals = driver.findElement(By.linkText("Today's Deals"));
        todaydeals.click();
        WebElement checkbox=driver.findElement(By.xpath("//body/div[@id='a-page']/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[7]"));
         checkbox.click();
    }
}

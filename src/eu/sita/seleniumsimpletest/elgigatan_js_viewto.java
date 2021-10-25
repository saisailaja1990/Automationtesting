package eu.sita.seleniumsimpletest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class elgigatan_js_viewto
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sunee\\Desktop\\intellij-selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.elgiganten.se/");
        WebDriverWait wait=new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"coiPage-1\"]/div[2]/button[2]"))));
        driver.findElement(By.xpath("//*[@id=\"coiPage-1\"]/div[2]/button[2]"));
/*
        Set<Cookie> cookies=driver.manage().getCookies();
        System.out.println(cookies);
        driver.manage().deleteAllCookies();
*/

        driver.findElement(By.id("main-search")).sendKeys("mobile");
        //Actions action=new Actions(driver);
       // action.click();




        driver.findElement(By.cssSelector("svg[class='search-icon-svg']")).click();




        //WebElement cookies=driver.findElement(By.id("coiPage-1"));

       // wait.until(ExpectedConditions.visibilityOf(cookies));
      /*  WebElement but=driver.findElement(By.xpath("//*[@id=\"coiPage-1\"]/div[2]/button[2]"));
        wait.until(ExpectedConditions.elementToBeClickable(but));
        but.click();


        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)","");//scroll down
       // driver.quit();*/


    }
}

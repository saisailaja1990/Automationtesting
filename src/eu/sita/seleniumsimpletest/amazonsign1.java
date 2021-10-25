package eu.sita.seleniumsimpletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonsign1
{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunee\\Desktop\\intellij-selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

        WebElement signbutton=driver.findElement(By.id("nav-link-accountList"));
        signbutton.click();

        WebElement emailId=driver.findElement(By.id("ap_email"));
        emailId.sendKeys("+46727743015");

        WebElement continuebutton=driver.findElement(By.id("continue"));
        continuebutton.click();

        WebElement password=driver.findElement(By.id("ap_password"));
        password.sendKeys("ajith@143");

        WebElement submit=driver.findElement(By.id("signInSubmit"));
        submit.click();
        Actions actions=new Actions(driver);
        WebElement customer=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        actions.moveToElement(customer).contextClick().build().perform();

        WebElement signoutbtn=driver.findElement(By.xpath("//span[text()='Sign Out']"));
        signoutbtn.click();
    }
}

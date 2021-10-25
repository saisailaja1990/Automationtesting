package eu.sita.seleniumsimpletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazonsginin
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunee\\Desktop\\intellij-selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

        WebElement signbutton=driver.findElement(By.id("nav-link-accountList"));
        signbutton.click();
        WebElement createaccountbtn=driver.findElement(By.id("createAccountSubmit"));
        createaccountbtn.click();

        WebElement customername= driver.findElement(By.id("ap_customer_name"));
        customername.sendKeys("Ajith");


        System.out.println("test");

        WebElement countrycode=driver.findElement(By.xpath("//*[@id='auth-country-picker']")); //*[@id="auth-country-picker"]
      //  countrycode.click();


        Select country=new Select(countrycode);
        System.out.println(country.getOptions().size());
        System.out.println(country.getOptions().get(12).getText());
     //  System.out.println(country.getFirstSelectedOption());
     //  country.getOptions();
     //  country.selectByValue("
        //
        //          AM +374
        //        ");
      //  country.selectByIndex(14);
        country.selectByVisibleText("SE +46");

        WebElement mobilenumber=driver.findElement(By.id("ap_phone_number"));
        mobilenumber.sendKeys("727743015");


        WebElement emailbox=driver.findElement(By.id("ap_email"));
        emailbox.sendKeys("ajithkamiseety2017@gmail.com");

        WebElement passwordfeild=driver.findElement(By.id("ap_password"));
        passwordfeild.sendKeys("ajith@143");
        WebElement continuebtn= driver.findElement(By.id("continue"));
        continuebtn.click();






    }
}



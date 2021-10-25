package eu.sita.seleniumsimpletest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class practice
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunee\\Desktop\\intellij-selenium\\chromedriver_win32\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        //Scrolls down
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,5000)");
        //Clicks the country popup
        driver.findElement(By.xpath("//span[text()='United States']")).click();

        //Switches control to the new window
        Set<String> eachwin = driver.getWindowHandles();
        for (String win : eachwin) {

            driver.switchTo().window(win);

            //session id of the current window
            System.out.println(win);
        }

        //Selecting value from country dropdown
        WebElement ele = driver.findElement(By.className("a-native-dropdown"));
        Select dropdown = new Select(ele);
        dropdown.selectByVisibleText("India");

        driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]")).click();

        //Switches to the new window with country selected
        Set<String> eachwin2 = driver.getWindowHandles();
        for(String win2 : eachwin2)
        {
            driver.switchTo().window(win2);

            //session id of the current window
            System.out.println(win2);
        }

    }
}

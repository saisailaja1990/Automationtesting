package eu.sita.seleniumsimpletest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Amazonsearch {
    public static void main(String[] args) throws InterruptedException {
       // WebDriverManager.Chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunee\\Desktop\\java_test\\chromedriver_win32 (1)\\chromedriver.exe");
      //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunee\\Desktop\\intellij-selenium\\chromedriver_win32\\chromedriver.exe");
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


        WebElement category = driver.findElement(By.id("searchDropdownBox"));
        category.click();
        Select s = new Select(category);
        s.selectByVisibleText("Baby");
        Thread.sleep(5000);

        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("diaper pants");
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

        /*List<WebElement> diaper=driver.findElements(By.xpath("//div[@class='a-section aok-relative s-image-square-aspect']"));
        Thread.sleep(3000);
        int size = diaper.size();
        System.out.println("Size of list = " + size);
        diaper.get(32).click();*/

        Thread.sleep(5000);
        System.out.println("item selected");

        WebElement product = driver.findElement(By.xpath("//img[@alt='Sponsored Ad - Huggies Wonder Pants, Large (L) Size Baby Diaper Pants, 9 - 14 kg, Combo Pack of 2, 42 count Per Pack, 84 c...']"));
        product.click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iter = windows.iterator();
        String mainwindowID = iter.next();
        String subwindowID = iter.next();
        driver.switchTo().window(subwindowID);
        driver.findElement(By.id("add-to-cart-button")).click();
        driver.switchTo().window(mainwindowID);

        Thread.sleep(5000);

        WebElement product1 = driver.findElement(By.xpath("//img[@alt='Supples Baby Pants Diapers, Medium (7-12 kg), 72 Count']"));
        product1.click();
        Thread.sleep(5000);

        driver.switchTo().window(subwindowID);
        driver.findElement(By.xpath("//button[@title='Add to Shopping Cart']")).click();
        System.out.println("2nd item selected");


    }
}
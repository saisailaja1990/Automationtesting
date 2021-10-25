package eu.sita.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;


import java.util.Iterator;
import java.util.Set;

public class Amazonwebsite
{
    public WebDriver driver;

    @BeforeClass
    public void common_code()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunee\\Desktop\\java_test\\chromedriver_win32 (1)\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

    }
@Test(priority=1)
    public void signin() {

    WebElement signbutton = driver.findElement(By.id("nav-link-accountList"));
    signbutton.click();

    WebElement emailId = driver.findElement(By.id("ap_email"));
    emailId.sendKeys("+46727743015");

    WebElement continuebutton = driver.findElement(By.id("continue"));
    continuebutton.click();

    WebElement password = driver.findElement(By.id("ap_password"));
    password.sendKeys("ajith@143");

    WebElement submit = driver.findElement(By.id("signInSubmit"));

    submit.click();
}
@Test(priority=2)
public void product_search() throws InterruptedException {

    WebElement category = driver.findElement(By.id("searchDropdownBox"));
    category.click();
    Select s = new Select(category);
    s.selectByVisibleText("Baby");

    WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
    search.sendKeys("diapers");
    WebDriverWait waits=new WebDriverWait(driver,60);
    waits.until(ExpectedConditions.visibilityOf(search));

    WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
    searchButton.click(); System.out.println("item selected");

          /*  WebElement product = driver.findElement(By.xpath("//img[@alt='Sponsored Ad - Huggies Wonder Pants, Large (L) Size Baby Diaper Pants, 9 - 14 kg, Combo Pack of 2, 42 count Per Pack, 84 c...']"));
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
            System.out.println("2nd item selected");*/

        }
        /*
@Test (priority=3)
    public void cart()
    {
        WebElement cart=driver.findElement(By.id("nav-cart-count"));
        cart.click();
        WebElement giftbox=driver.findElement(By.id("sc-buy-box-gift-checkbox"));
        giftbox.click();
        WebElement proceed_to_Buy=driver.findElement(By.id("sc-buy-box-ptc-button"));
        proceed_to_Buy.click();

    }*/
@Test(priority=4)
        public void signout()
{
    Actions actions=new Actions(driver);
    WebElement customer=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
    actions.moveToElement(customer).contextClick().build().perform();

    WebElement signoutbtn=driver.findElement(By.xpath("//span[text()='Sign Out']"));
    signoutbtn.click();
}


@AfterClass
    public void terminate_code()
{
    driver.quit();

}
}

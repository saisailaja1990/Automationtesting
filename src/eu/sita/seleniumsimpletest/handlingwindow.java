package eu.sita.seleniumsimpletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class handlingwindow
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sunee\\Desktop\\intellij-selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/s?k=skirts+for+women+stylish&i=apparel&ref=nb_sb_noss");



        List<WebElement> skirt=driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        Thread.sleep(3000);
        int size = skirt.size();
        System.out.println("Size of list = " + size);
        skirt.get(0).click();
        Thread.sleep(5000);
        System.out.println("item selected");


        String mainwindow= driver.getTitle();
        System.out.println("Title of the main window:: is" +mainwindow);
        Set<String> windows=driver.getWindowHandles();
        Iterator<String> iter =windows.iterator();
        String mainwindowID=iter.next();
        String subwindowID=iter.next();

        System.out.println("MainwindowID is==="+mainwindowID);

        System.out.println("subwindowID is==="+subwindowID);
        driver.switchTo().window(subwindowID);
        System.out.println("Title of subwindow is=="+driver.getTitle());

       /* Set<String> winIds=driver.getWindowHandles();
        for(String ID:winIds)
        {
            driver.switchTo().window(ID );
            System.out.println("ID is=="+ID);
            System.out.println("Title is=="+driver.getTitle());
        }*/

/*
        String subwindowID=iter.next();
        driver.switchTo().window(subwindowID);*/



        //System.out.println("subwindowID is==="+subwindowID);


    }
}

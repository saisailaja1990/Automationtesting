package eu.sita.seleniumsimpletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class webtabledynamicsearch
{
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the company name to select the country:");
    String comp=sc.nextLine();

    Boolean isExist=false;
    String country=null;
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunee\\Desktop\\intellij-selenium\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

    List<WebElement> rows= driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));

		for(int i=2;i<=rows.size();i++)
    {
        WebElement webcom=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+ i +"]/td[1]"));
        if(webcom.getText().equalsIgnoreCase(comp))
        {
            isExist =true;

            country=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+ i +"]/td[3]")).getText();
            break;

        }

    }
		if(isExist=true)
    {
        System.out.println("'" +comp + "company is available in the country"+country );

    }
		else
                System.out.println("'"+comp+"given company is not available in the country");

		driver.close();

}

}


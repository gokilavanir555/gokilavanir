package StepDef;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.cs.Ale;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class GooglePageStepDef 
{
    static Properties prop;
	WebDriver driver;
	
@Given("^User Login$")
public void User_Login() throws Throwable 
{
	String title;
	System.out.println("User login Line1");
   System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Downloads\\chromedriver_win32\\chromedriver.exe");
   driver=new ChromeDriver();
   System.out.println("User login Line2");
  	//throw new PendingException();
   driver.get("C:\\Users\\ELCOT\\Downloads\\login.html");
   System.out.println("User login Line3");
   //driver.findElement(By.xpath("//@name='Hotel Booking Application'/div/div/h1"));
   //System.out.println(driver.findElement(By.xpath("//*[@id='mainCnt']/div/div/h1")));
     // System.out.println("success");
   // System.out.println(driver.getTitle());
    //html/body/div/div/form/table/tbody/tr[2]/td[2]/input
    
    driver.findElement(By.className("btn")).click();
    driver.findElement(By.name("userName")).sendKeys("admin");
    driver.findElement(By.className("btn")).click();
    driver.findElement(By.name("userPwd")).sendKeys("admin");
    driver.findElement(By.className("btn")).click();


     title = "Hotel Booking";
   // System.out.println(driver.getTitle());
    if(driver.getTitle().equalsIgnoreCase(title))
{
	System.out.println("Title succes");
}
    
    driver.findElement(By.className("btn")).click();
    Alert alert = driver.switchTo().alert();
    System.out.println("Alert msg:" +alert.getText());
    Thread.sleep(100);
    alert.accept();	
    driver.findElement(By.id("txtFirstName")).sendKeys("CustName");
    
    
    driver.findElement(By.className("btn")).click();
    Alert alert1 = driver.switchTo().alert();
    System.out.println("Alert msg:" +alert1.getText());
    Thread.sleep(100);
    alert1.accept();
    driver.findElement(By.id("txtLastName")).sendKeys("lastName");
    
    driver.findElement(By.className("btn")).click();
    Alert alert2 = driver.switchTo().alert();
    System.out.println("Alert msg:" +alert2.getText());
    Thread.sleep(100);
    alert2.accept();
    driver.findElement(By.id("txtEmail")).sendKeys("aaa");
    
    driver.findElement(By.className("btn")).click();
    Alert alert3 = driver.switchTo().alert();
    System.out.println("Alert msg:" +alert3.getText());
    Thread.sleep(100);
    alert3.accept();
    driver.findElement(By.id("txtEmail")).sendKeys("aaa@gmail.com");
    
    driver.findElement(By.className("btn")).click();
    Alert alert4 = driver.switchTo().alert();
    System.out.println("Alert msg:" +alert4.getText());
    Thread.sleep(100);
    alert4.accept();
    driver.findElement(By.id("txtPhone")).sendKeys("7123456779");
    
    driver.findElement(By.cssSelector("body > div > div > form > table > tbody > tr:nth-child(6) > td:nth-child(2) > textarea")).sendKeys("abc street");
   
    WebElement element = driver.findElement(By.name("city"));
    Select drpCity=new Select(element);
    drpCity.selectByVisibleText("Hyderabad");
    driver.findElement(By.className("btn")).click();
    Alert alert5 = driver.switchTo().alert();
    Thread.sleep(100);
    alert5.accept();  
    
     element = driver.findElement(By.name("state"));
    Select drpState=new Select(element);
    drpState.selectByIndex(4);
    driver.findElement(By.className("btn")).click();
    Alert alert9 = driver.switchTo().alert();
    Thread.sleep(100);
    alert9.accept();
    
    element = driver.findElement(By.name("persons"));
    Select drpPerson=new Select(element);
    drpPerson.selectByIndex(4);
    driver.findElement(By.className("btn")).click();
     alert9 = driver.switchTo().alert();
    Thread.sleep(100);
    alert9.accept();
    
    driver.findElement(By.id("txtCardholderName")).sendKeys("Hello");
    driver.findElement(By.className("btn")).click();
    alert9 = driver.switchTo().alert();
    Thread.sleep(100);
    alert9.accept();
    
    driver.findElement(By.id("txtDebit")).sendKeys("12312345678");
    driver.findElement(By.className("btn")).click();
    alert9 = driver.switchTo().alert();
    Thread.sleep(100);
    alert9.accept();
    
    driver.findElement(By.id("txtCvv")).sendKeys("123");
    driver.findElement(By.className("btn")).click();
    alert9 = driver.switchTo().alert();
    Thread.sleep(100);
    alert9.accept();
    
    driver.findElement(By.id("txtMonth")).sendKeys("12");
    driver.findElement(By.className("btn")).click();
    alert9 = driver.switchTo().alert();
    Thread.sleep(100);
    alert9.accept();
    
    driver.findElement(By.id("txtYear")).sendKeys("2024");
    driver.findElement(By.className("btn")).click();
        driver.quit();
  }


}	
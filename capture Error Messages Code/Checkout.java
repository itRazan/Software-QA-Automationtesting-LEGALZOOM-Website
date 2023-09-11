package BeltExam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Checkout {
	public WebDriver driver;
	 
	 @Test
	 public void chromepage() throws InterruptedException  
	 {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\Desktop\\selinum\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.navigate().to("https://www.legalzoom.com/LZWeb/Checkout/CustomizePackage.aspx?iQ=637&iP=67&iDiscount=&TIMESTRING=SBLWXdJV03%2bVjbTUPzoZWw%3d%3d");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  WebElement contin =driver.findElement(By.xpath("//img[@src='/assets/images/customize-package/buttonContinue.jpg']"));
	  contin.click();
	  Thread.sleep(2000);
	  WebElement fname =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_txt_ContactInfo_FName']"));
	  fname.sendKeys("tester");
	  Thread.sleep(2000);
	  WebElement lname =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_txt_ContactInfo_LName']"));
	  lname.sendKeys("auto");
	  Thread.sleep(2000);
	  WebElement email =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_txt_ContactInfo_EmailAddress']"));
	  email.sendKeys("testerlo@gmail.com");
	  Thread.sleep(2000);
	  WebElement phono =driver.findElement(By.xpath("//input[@name='ctl00$cphMainContent$txt_ContactInfo_PhoneNumber']"));
      phono.click();
      phono.sendKeys("4567898888");
      Thread.sleep(2000);
	  WebElement al1 =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_txt_ContactInfo_Street1']"));
	  al1.sendKeys("tester");
	  Thread.sleep(2000);
	  WebElement zcode =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_txt_ContactInfo_ZipCode']"));
	  zcode.sendKeys("97020");
	  Thread.sleep(2000);
	  WebElement city =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_txt_ContactInfo_City']"));
	  city.sendKeys("Ws");
	  Thread.sleep(2000);
	  Select state = new Select(driver.findElement(By.xpath("//select[@id='ctl00_cphMainContent_ddl_ContactInfo_State']")));  
      List<WebElement> options = state.getOptions();
      Thread.sleep(5000);
      WebElement firstSelectedOption = state.getFirstSelectedOption();
      Thread.sleep(5000); 
      // Select the option by index
      state.selectByIndex(2);
      Thread.sleep(5000);
      
      //Payment
      WebElement fnname =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_txt_PaymentInfo_FName']"));
	  fnname.sendKeys("tester");
	  Thread.sleep(2000);
	  WebElement llname =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_txt_PaymentInfo_LName']"));
	  llname.sendKeys("auto");
	  Thread.sleep(2000);
	  WebElement cardno =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_txt_CC_Number']"));
	  cardno.sendKeys("76893653a");
	  Thread.sleep(2000);
	  Select exnonth = new Select(driver.findElement(By.xpath("//select[@id='ctl00_cphMainContent_ddl_CC_ExpirationMonth']")));  
      List<WebElement> optionss = exnonth.getOptions();
      Thread.sleep(5000);
      WebElement firstSelectedOptions = exnonth.getFirstSelectedOption();
      Thread.sleep(5000); 
      // Select the option by index
      exnonth.selectByIndex(2);
      Thread.sleep(5000);
      Select expyear = new Select(driver.findElement(By.xpath("//select[@id='ctl00_cphMainContent_ddl_CC_ExpirationYear']")));  
      List<WebElement> optionss1 = expyear.getOptions();
      Thread.sleep(5000);
      WebElement firstSelectedOptions1 = expyear.getFirstSelectedOption();
      Thread.sleep(5000); 
      // Select the option by index
      expyear.selectByIndex(2);
      Thread.sleep(5000);
      WebElement bzcode =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_txt_CC_ZipCode']"));
      bzcode.sendKeys("76776");
	  Thread.sleep(2000);
	  WebElement cvv =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_txt_CC_SecurityCode']"));
      cvv.sendKeys("767");
	  Thread.sleep(2000);
	  WebElement check =driver.findElement(By.xpath("//label[@for='ctl00_cphMainContent_ChkEPBundle']"));
	  check.click();
	  WebElement agree =driver.findElement(By.xpath("//span[@class='button-center']"));
	  agree.click();
	  
	  WebElement error = driver.findElement(By.id("ctl00_cphMainContent_cv_txt_CC_Number"));
	  boolean d = error.isDisplayed();
	  System.out.print("error message"+d);
	  String e=error.getText();
	  System.out.print("error message"+e);
	  Assert.assertEquals(e,"Invalid Credit Card Number");
}
      }	


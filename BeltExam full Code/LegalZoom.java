package BeltExam;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LegalZoom {
	public WebDriver driver;
	 
	 @Test
	 public void chromepage() throws InterruptedException  
	 {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\Desktop\\selinum\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.navigate().to("https://www.legalzoom.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  WebElement personal =driver.findElement(By.xpath("//a[@id='nav-heading-personal']"));
	  personal.click();
	  Thread.sleep(2000);
	  WebElement livingtrust =driver.findElement(By.xpath("//a[@id='nav-personal-item-3']"));
	  livingtrust.click();
	  Thread.sleep(2000);
	  
	  WebElement startmylivingtrust =driver.findElement(By.xpath("//a[@id='hero915-cta-button']"));
	  startmylivingtrust.click();
	  Thread.sleep(1000);
	  
	  WebElement getstarted =driver.findElement(By.xpath("(//a[@class='btn btn-action w-100 w-md-auto w-lg-100 '])[4]"));
	  getstarted.click();
	  Thread.sleep(1000);
	  //Personal info
	  WebElement saveandcontinue1 =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_btnContinue2']"));
	  saveandcontinue1.click();
	  Thread.sleep(1000);
	  
	  WebElement meonly=driver.findElement(By.xpath("//input[@id='chkctlgrantor_selfonly_CB']"));
	  meonly.click();
	  
	  WebElement saveandcontinue2 =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_btnContinue2']"));
	  saveandcontinue2.click();
	  Thread.sleep(1000);
	  
	  WebElement firstname=driver.findElement(By.xpath("//input[@id='grantor_first']"));
	  firstname.sendKeys("Tester");
	  Thread.sleep(2000);
	  WebElement middletname=driver.findElement(By.xpath("//input[@id='grantor_middle']"));
	  middletname.sendKeys("Test");
	  Thread.sleep(2000);
	  WebElement lastname=driver.findElement(By.xpath("//input[@id='grantor_last']"));
	  lastname.sendKeys("auto");
	  Thread.sleep(2000);
 
	  // Select an option yes.
	  WebElement status = driver.findElement(By.xpath("//select[@id='grantor_married_MC']")); 
	  Select select = new Select(status); 
      select.selectByValue("Yes|~|428850"); 
      Thread.sleep(2000);
      // Select an option no.
      WebElement children = driver.findElement(By.xpath("//select[@id='grantor_children_MC']"));
      Select select2 = new Select(children); 
      select2.selectByValue("No|~|428854"); 
      Thread.sleep(2000);
      // Select an option yes.
      WebElement pets = driver.findElement(By.xpath("//select[@id='PetOwner']")); 
      Select select3 = new Select(pets); 
      select3.selectByValue("Yes|~|444692"); 
      Thread.sleep(2000);

	  WebElement saveandcontinue3 =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_btnContinue2']"));
	  saveandcontinue3.click();
	  
	  WebElement firstnameII=driver.findElement(By.xpath("//input[@id='grantor_spouse_first']"));
	  firstnameII.sendKeys("Tester");
	  Thread.sleep(2000);
	  WebElement middletnameII=driver.findElement(By.xpath("//input[@id='grantor_spouse_middle']"));
	  middletnameII.sendKeys("Test");
	  Thread.sleep(2000);
	  WebElement lastnameII=driver.findElement(By.xpath("//input[@id='grantor_spouse_last']"));
	  lastnameII.sendKeys("auto");
	  Thread.sleep(2000);
	  
	  WebElement saveandcontinue4 =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_btnContinue2']"));
	  saveandcontinue4.click();
	  
	  WebElement saveandcontinue5 =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_btnContinue2']"));
	  saveandcontinue5.click();
	  //Where do you live?
	  WebElement State = driver.findElement(By.id("grantor_state")); 
	  Select option = new Select(State); 
	  option.selectByValue("New York|~|428890");
      Thread.sleep(2000);

	  WebElement saveandcontinue6 =driver.findElement(By.id("ctl00_cphMainContent_btnContinue2"));
	  saveandcontinue6.click();
	  Thread.sleep(2000);
	  
	  //Property
	  WebElement saveandcontinue7=driver.findElement(By.xpath("//input[@src='/img/buttonContinueFat.gif']"));
	  saveandcontinue7.click();
	  
	  WebElement personalproperty=driver.findElement(By.xpath("//input[@id='chkctlproperty_personal_CB']"));
	  personalproperty.click();
	  Thread.sleep(2000);
	  
	  WebElement saveandcontinue8 =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_btnContinue2']"));
	  saveandcontinue8.click();
	  Thread.sleep(2000);
	  
	  WebElement trust = driver.findElement(By.xpath("//select[@id='property_personal_MC']")); 
	  Select option3 = new Select(trust); 
	  option3.selectByValue("No, do not include personal property in the trust|~|428971");
      Thread.sleep(2000);
      
      WebElement saveandcontinue9 =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_btnContinue2']"));
	  saveandcontinue9.click();
	  
	  //Gift
	  WebElement saveandcontinue10 =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_btnContinue2']"));
	  saveandcontinue10.click();
	  
	  WebElement gift = driver.findElement(By.xpath("//select[@id='all_to_spouse_MC']")); 
	  Select option2 = new Select(gift); 
	  option2.selectByValue("No|~|428979");
      Thread.sleep(2000);

	  WebElement saveandcontinue11 =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_btnContinue2']"));
	  saveandcontinue11.click();
	  
	  WebElement percentage=driver.findElement(By.xpath("//input[@id='grantor_heir_info_percent_1']"));
	  percentage.sendKeys("100%");
	  Thread.sleep(2000);
	  WebElement to=driver.findElement(By.xpath("//input[@id='grantor_heir_info_name_1']"));
	  to.sendKeys("nini");
	  
	  WebElement saveandcontinue12 =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_btnContinue2']"));
	  saveandcontinue12.click();
	  
	  WebElement saveandcontinue13 =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_btnContinue2']"));
	  saveandcontinue13.click();
	
	  WebElement subtrust = driver.findElement(By.xpath("//select[@id='subtrust_MC']")); 
	  Select option2i = new Select(subtrust); 
	  option2i.selectByValue("No, not at this time|~|429011");
      Thread.sleep(2000);
      
      WebElement saveandcontinue14 =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_btnContinue2']"));
	  saveandcontinue14.click();
	  
	  WebElement pettrust = driver.findElement(By.xpath("//select[@id='PetTrust_Indicator']")); 
	  Select optioni = new Select(pettrust); 
	  optioni.selectByValue("No|~|444694");
      Thread.sleep(2000);
      
      WebElement saveandcontinue15 =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_btnContinue2']"));
	  saveandcontinue15.click();
	  
	  //Representatives
	  WebElement pourover = driver.findElement(By.xpath("//select[@id='pow_MC']")); 
	  Select optionii = new Select(pourover); 
	  optionii.selectByValue("No|~|428973");
      Thread.sleep(2000);
      
      WebElement saveandcontinue16 =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_btnContinue2']"));
	  saveandcontinue16.click();
    
	  //p50
	  WebElement saveandcontinue17 =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_btnContinue2']"));
	  saveandcontinue17.click();
	  
	  WebElement cotrustee = driver.findElement(By.xpath("//select[@id='cotrustee_MC']")); 
	  Select optioniii = new Select(cotrustee); 
	  optioniii.selectByValue("No|~|429015");
      Thread.sleep(2000);
      
      WebElement saveandcontinue18 =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_btnContinue2']"));
	  saveandcontinue18.click();
	  
	  WebElement strustee=driver.findElement(By.xpath("//input[@id='first_successor_trustee']"));
	  strustee.sendKeys("nini");
	  
      WebElement saveandcontinue19 =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_btnContinue2']"));
	  saveandcontinue19.click();
	  
	  //Additional	  
	  WebElement adtrustee = driver.findElement(By.xpath("//select[@name='trustee_instructions_MC|290451']")); 
	  Select optionII = new Select(adtrustee); 
	  optionII.selectByValue("No|~|429021");
      WebElement saveandcontinue20 =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_btnContinue2']"));
	  saveandcontinue20.click();

	  WebElement nametrust = driver.findElement(By.xpath("//select[@id='trust_newname_MC']")); 
	  Select optionIII = new Select(nametrust); 
	  optionIII.selectByValue("No|~|429033");
      Thread.sleep(2000);
      
      WebElement saveandcontinue22 =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_btnContinue2']"));
	  saveandcontinue22.click();
	  
      WebElement saveandcontinue23 =driver.findElement(By.xpath("//input[@id='ctl00_cphMainContent_btnContinue2']"));
	  saveandcontinue23.click();
	  
	  
	}
}

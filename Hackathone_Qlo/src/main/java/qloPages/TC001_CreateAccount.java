package qloPages;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import qloDataProvider.QloConfigReader;
import qloUtils.QloExcelReader;


public class TC001_CreateAccount {
	
	   WebDriver driver;
	   Properties prop;
	   QloConfigReader configfile;
	   
	   public TC001_CreateAccount(WebDriver driver) {
		   this.driver=driver;
	   }

	   public void Accountcreation(String Email,  String Password) {
		   
		   configfile = new QloConfigReader();
	       prop = configfile.init_prop();
	       driver.findElement(By.xpath(prop.getProperty("Email_id"))).clear();
	       driver.findElement(By.xpath(prop.getProperty("Email_id"))).sendKeys(Email);	    
	       driver.findElement(By.xpath(prop.getProperty("Password"))).clear();
	       driver.findElement(By.xpath(prop.getProperty("Password"))).sendKeys(Password);
	       
	       
	   }
	   
	   public void ClickCreateAccount() {
			configfile = new QloConfigReader();
		       prop = configfile.init_prop();
		       driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			  
	       driver.findElement(By.xpath(prop.getProperty("LogIn"))).click();
	      
	      
	   }
}

package qloPages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import qloDataProvider.QloConfigReader;

public class LoginPage {
	
	WebDriver driver;
	   Properties prop;
	   QloConfigReader configfile;
	   
	   public LoginPage(WebDriver driver) {
		   this.driver=driver;
	   }
	   
	   public void Signin() throws InterruptedException {
			
		   configfile = new QloConfigReader();
		   prop = configfile.init_prop();
		   Thread.sleep(1000);
			
			Actions actions = new Actions(driver);
				
			WebElement Account = driver.findElement(By.xpath(prop.getProperty("Account")));
			actions.moveToElement(Account).click().build().perform();
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			WebElement SignIn = driver.findElement(By.xpath(prop.getProperty("SignIn")));
			actions.moveToElement(SignIn).click().build().perform();

			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
		}
	   
	   public void enterlogindetails(String EmailUsername, String Password) throws InterruptedException{
			
			
		   configfile = new QloConfigReader();
		   prop = configfile.init_prop();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   
			  driver.findElement(By.xpath(prop.getProperty("Username"))).sendKeys(EmailUsername);
			   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			  driver.findElement(By.xpath(prop.getProperty("Password"))).sendKeys(Password);
			  
			  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			  
			   
		}

	   public void clicklogin() throws InterruptedException {
		   configfile = new QloConfigReader();
		   prop = configfile.init_prop();
		   driver.findElement(By.xpath(prop.getProperty("LogIn"))).click();
}

}

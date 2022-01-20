package QloStepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import qloDataFactory.QloDataFactory;
import qloDataProvider.QloConfigReader;
import qloPages.LoginPage;
import qloPages.TC001_CreateAccount;
import qloUtils.QloExcelReader;
public class QloStepdefinition {

	WebDriver driver;

	QloConfigReader configfile;
	Properties prop;
	QloDataFactory DriverFactory;
	//QloScreenshortUtility Screenshort;

	@Before(order = 0)
	public void getProperty() {
		configfile = new QloConfigReader();
		prop = configfile.init_prop();
	}

	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		DriverFactory = new QloDataFactory();
		driver = DriverFactory.init_driver(browserName);

	}
	 // ------------------------- TC001 Login -----------------------
	@Given("^user should open link$")
	public void user_should_open_link() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		Thread.sleep(4000);
	}

	@Then("^click on account and enter credentials \"([^\"]*)\" and (\\d+)$")
	public void click_on_accountand_enter_credentials_and(String SheetName, int RowNumber) throws Throwable {
		driver.findElement(By.xpath(prop.getProperty("SignIn"))).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		QloExcelReader reader = new QloExcelReader();
		TC001_CreateAccount create = new TC001_CreateAccount(driver);
		List<Map<String, String>> testData = reader.getData(System.getProperty("user.dir")+"\\ExcelTestdata\\qlotestdata.xlsx", SheetName);
		String emailaddress = testData.get(RowNumber).get("Email");

		String password = testData.get(RowNumber).get("Password");

		create.Accountcreation( emailaddress, password);
	}

	@Then("^click on submit$")
	public void click_on_submit() throws Throwable {

		TC001_CreateAccount click = new TC001_CreateAccount(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		click.ClickCreateAccount();
		
	}


	  @And("^Click on your personal Information$") 
	  public void click_on_your_personal_Information() throws Throwable{
	  
		  JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)");
			
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  Thread.sleep(5000);
	  driver.findElement(By.xpath(prop.getProperty("Information"))).click();
	 
	  }
	
	      @Then("^Modify your \"([^\"]*)\" and DOB$")
		  public void modify_your_and_DOB(String name) throws Throwable {
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  Thread.sleep(5000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,300)");
		  
		  driver.findElement(By.xpath(prop.getProperty("First_name"))).clear();
		  driver.findElement(By.xpath(prop.getProperty("First_name"))).sendKeys(prop.getProperty("Name"));
		
		  Thread.sleep(5000);
		  driver.findElement(By.xpath(prop.getProperty("day"))).click();
		  }
		  
	      @Then("^Enter \"([^\"]*)\"$") 
		  public void enter_Current_Password_with(String Current_Password) throws Throwable{
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  Thread.sleep(5000);
		  driver.findElement(By.xpath(prop.getProperty("old_passwd"))).sendKeys(Current_Password);
		  
		  }
		  
		  @And("^Click on Save$") 
		  public void click_on_Save() {
		  driver.findElement(By.xpath(prop.getProperty("Save_Button"))).click();
		  }
		  
		  @And("^I am logging out$") 
		  public void i_am_logging_out() {
			  
		  driver.findElement(By.xpath(prop.getProperty("account_user"))).click();
		  driver.findElement(By.xpath(prop.getProperty("Logout"))).click();
		  }
		  
		 // ------------------------- TC002 Contact Us -----------------------
		  
		  @Given("^User enters the URL$") 
		  public void user_enters_the_URL() {
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().deleteAllCookies();
				driver.get(prop.getProperty("url"));				
		  }		  
		  @Then("^User Click on the Menu$") 
		  public void user_Click_on_the_Menu() {
			  driver.findElement(By.xpath(prop.getProperty("Menu"))).click();
		  }		  
		  @And("^Click on Contact$") 
		  public void click_on_Contact() {
			  driver.findElement(By.xpath(prop.getProperty("Contact"))).click();
		  }
		  
		  @Then("^Select the Subject as Customer Service$") 
		  public void select_the_Subject_as_Customer_Service() {
			  driver.findElement(By.xpath(prop.getProperty("Subject"))).click();
			  driver.findElement(By.xpath(prop.getProperty("Customer_Service"))).click();
		  }
		  
		  @And("^Enter the valid \"([^\"]*)\"$") 
		  public void enter_the_valid(String Email) {
			  driver.findElement(By.xpath(prop.getProperty("Email_id"))).sendKeys(Email);
		  }
		  
		  @And("^Enter the Message$") 
		  public void enter_the_Message() {
			  driver.findElement(By.xpath(prop.getProperty("Message"))).sendKeys(prop.getProperty("Write_Message"));
		  }
		  
		  @And("^Click on Send Message button$") 
		  public void click_on_Send_Message_button() throws Throwable {
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,400)");
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			  Thread.sleep(5000);
		  driver.findElement(By.xpath(prop.getProperty("Send_Message"))).click();
		  }
			
		  // ------------------------- TC003 Remove from Cart -----------------------
				
		  @Given("^User able to launch chrome browser sucessfully$")
		  public void user_able_to_launch_chrome_browser_sucessfully() throws Throwable {
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().deleteAllCookies();
				driver.get(prop.getProperty("url"));	    
		  }

		  @Then("^Search for room based on location type and dates$")
		  public void search_for_room_based_on_location_type_and_dates() throws Throwable {
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,400)");	  
		  driver.findElement(By.xpath(prop.getProperty("Select_Location"))).sendKeys(prop.getProperty("Location")); 
		  }		
		  @And("^Select Hotel as The Hotel Prime$")
		  public void select_Hotel_as_The_Hotel_Prime() throws Throwable {
			  driver.findElement(By.xpath(prop.getProperty("Select_Hotel"))).click();
			  driver.findElement(By.xpath(prop.getProperty("Prime"))).click();		     
		  }

		  @And("^Select Check In Date as (\\d+)th June From Calendar$")
		  public void select_Check_In_Date_as_th_June_From_Calendar(int arg1) throws Throwable {
			  driver.findElement(By.xpath(prop.getProperty("Checkin"))).click();
			  driver.findElement(By.xpath(prop.getProperty("Checkin_Date"))).click();    
		  }

		  @And("^Select Check Out Date as (\\d+)th June From Calendar$")
		  public void select_Check_Out_Date_as_th_June_From_Calendar(int arg1) throws Throwable {
			  driver.findElement(By.xpath(prop.getProperty("Checkout"))).click();
			  driver.findElement(By.xpath(prop.getProperty("Checkout_Date"))).click();   
		  }

		  @And("^Click on Search Now$")
		  public void click_on_Search_Now() throws Throwable {
			  driver.findElement(By.xpath(prop.getProperty("Search_Now"))).click();   
		  }

		  @And("^Go to Executive Rooms and click on Book Now$")
		  public void go_to_Executive_Rooms_and_click_on_Book_Now() throws Throwable {
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,800)");
			  driver.findElement(By.xpath(prop.getProperty("Book_Now"))).click();    
		  }

		  @And("^Click on Proceed to checkout on pop up window$")
		  public void click_on_Proceed_to_checkout_on_pop_up_window() throws Throwable {
			  driver.findElement(By.xpath(prop.getProperty("Proceed"))).click();   
		  }

		  @And("^Mouse over the order basket from the top and click to remove the product from my cart button$")
		  public void mouse_over_the_order_basket_from_the_top_and_click_to_remove_the_product_from_my_cart_button() throws Throwable {
			  driver.findElement(By.xpath(prop.getProperty("Remove"))).click();  
		  }

		  @And("^Make sure you cart is empty$")
		  public void make_sure_you_cart_is_empty() throws Throwable {
			  WebElement logo = driver.findElement(By.xpath(prop.getProperty("Success_Message")));
				Assert.assertTrue(logo.isDisplayed(), "Cart empty not displayed"); 			
		  }

		  @And("^Take a screenshot of the  YOUR BOOKING CART page with the success message Till now you did not added any room in your cart$")
		  public void take_a_screenshot_of_the_YOUR_BOOKING_CART_page_with_the_success_message_Till_now_you_did_not_added_any_room_in_your_cart() throws Throwable {
				
				  TakesScreenshot ts = (TakesScreenshot) driver; 
				  File src =ts.getScreenshotAs(OutputType.FILE); 
				  String path =System.getProperty("user.dir")+"/test-output/"+System.currentTimeMillis()+".png"; 
				  File dest = new File(path); 
				  try {
					  FileUtils.copyFile(src, dest);
					  }
				  catch (Exception e) { 
					  System.out.println("Capture Failed "+e.getMessage());
					  }				   
		 }
		  @Given("^Visit http://newtours/demoaut\\.com$")
		  public void visit_http_newtours_demoaut_com() throws Throwable {
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().deleteAllCookies();
				driver.get(prop.getProperty("url2"));   
		  }

		  @Then("^Validate sign-on link is working\\?$")
		  public void validate_sign_on_link_is_working() throws Throwable {
			  driver.findElement(By.xpath(prop.getProperty("Signon"))).click();
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			  //int totalframes = driver.findElements(By.tagName("iframe")).size();
			  //System.out.println(totalframes);
			  WebElement my_frame=driver.findElement(By.xpath("//iframe[@title='3rd party ad content']"));
			  driver.switchTo().frame(my_frame);
			  WebElement my_frame2=driver.findElement(By.xpath("//iframe[@title='Advertisement']"));
			  driver.switchTo().frame(my_frame2);
			  driver.findElement(By.xpath(prop.getProperty("dismissButton"))).click();
			  driver.switchTo().defaultContent();
			 // driver.findElement(By.xpath(prop.getProperty("dismissButton"))).click();
			  WebElement logo = driver.findElement(By.xpath(prop.getProperty("Validate_Signon")));
				Assert.assertTrue(logo.isDisplayed(), "Signon not displayed"); 
		  }

		  @And("^Validate register link is working\\?$")
		  public void validate_register_link_is_working() throws Throwable {
			  driver.findElement(By.xpath(prop.getProperty("Register"))).click();
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			  WebElement logo = driver.findElement(By.xpath(prop.getProperty("Validate_Register")));
				Assert.assertTrue(logo.isDisplayed(), "Register not displayed");   
		  }

			
			  @And("^Validate support link is working\\?$") 
			  public void validate_support_link_is_working() throws Throwable {
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 // Thread.sleep(5000);
			  driver.findElement(By.xpath(prop.getProperty("Support"))).click();
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			  WebElement logo = driver.findElement(By.xpath(prop.getProperty("Validate_Support")));
			  Assert.assertTrue(logo.isDisplayed(), "Support not displayed");
			  }
			 

		  @And("^Validate contact link is working\\?$")
		  public void validate_contact_link_is_working() throws Throwable {
			  driver.findElement(By.xpath(prop.getProperty("contact"))).click();
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			  WebElement logo = driver.findElement(By.xpath(prop.getProperty("Validate_contact")));
				Assert.assertTrue(logo.isDisplayed(), "contact not displayed");    
		  }

		  @And("^Validate title check after login and search flight$")
		  public void validate_title_check_after_login_and_search_flight() throws Throwable {
			  driver.findElement(By.xpath(prop.getProperty("Home"))).click();
			  WebElement logo = driver.findElement(By.xpath(prop.getProperty("Signin")));
				Assert.assertTrue(logo.isDisplayed(), "Signin not displayed");
				//driver.findElement(By.xpath(prop.getProperty("Flight"))).click();
				WebElement logo1 = driver.findElement(By.xpath(prop.getProperty("Flight")));
				Assert.assertTrue(logo.isDisplayed(), "Flight not displayed");
		  }

		  @And("^Validate sign-in feature is working\\?$")
		  public void validate_sign_in_feature_is_working() throws Throwable {	
			 // driver.findElement(By.xpath(prop.getProperty("Home"))).click();
			  driver.findElement(By.xpath(prop.getProperty("UserName"))).sendKeys(prop.getProperty("UserName1")); 
			  driver.findElement(By.xpath(prop.getProperty("Password1"))).sendKeys(prop.getProperty("Password2"));
			  driver.findElement(By.xpath(prop.getProperty("Submit"))).click();
			 // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				  Thread.sleep(5000);
			  WebElement logo = driver.findElement(By.xpath(prop.getProperty("Login_Success")));
				Assert.assertTrue(logo.isDisplayed(), "Login_Success not displayed");     
		  }

		  @And("^Validate sign-in, searching, buying ticket flow is working\\?$")
		  public void validate_sign_in_searching_buying_ticket_flow_is_working() throws Throwable {
			  driver.findElement(By.xpath(prop.getProperty("Flight"))).click();
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);				
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,800)");
			  driver.findElement(By.xpath(prop.getProperty("Continue"))).click();
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			  WebElement logo = driver.findElement(By.xpath(prop.getProperty("Seats")));
				Assert.assertTrue(logo.isDisplayed(), "Seats not displayed");   
		  }

		  @And("^perform sign-in and logout testcase, login-searching and logout, login searching, book a flight and logout in one test case with different valid usernames and valid passwords\\. Just think how can we use store command\\?\\?\\?$")
		  public void perform_sign_in_and_logout_testcase_login_searching_and_logout_login_searching_book_a_flight_and_logout_in_one_test_case_with_different_valid_usernames_and_valid_passwords_Just_think_how_can_we_use_store_command() throws Throwable {
			  driver.findElement(By.xpath(prop.getProperty("Signoff"))).click(); 
			  
		  }			 
			 
	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}

	@After(order = 1)
	public void embedScreenshot(Scenario scenario) throws Exception {
		if (scenario.isFailed()) {
			try {
				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				String testName = scenario.getName();
				scenario.embed(screenshot, "image/png");
				scenario.write(testName);
			} catch (WebDriverException wde) {
				System.err.println(wde.getMessage());
			} catch (ClassCastException cce) {
				cce.printStackTrace();
			}
		}
	}
}

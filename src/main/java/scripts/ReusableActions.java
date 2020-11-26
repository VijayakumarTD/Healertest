package scripts;

import org.openqa.selenium.WebDriver;

import commonMethods.Keywords;

public class ReusableActions extends Keywords {
	
	
	//wait(driver,"1");
	
	public boolean loginMethod(WebDriver driver,String emailId,String password) {
		
		try {
			waitForElement(driver, loginMain);
			click(driver, loginMain);
			wait(driver,"1");
			sendKeys(driver, emailAddress, emailId);
			sendKeys(driver,passWord, password);
			wait(driver,"1");
			scrollUsingElement(driver, loginSubmit);
			wait(driver,"1");
			click(driver, loginSubmit);
			wait(driver,"2");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return false;
		}
	
	}
	
	
	public boolean adminLogin(WebDriver driver,String adminemail,String adminpassword) {
		try {
			
			waitForElement(driver,adminEmailID);
			sendKeys(driver, adminEmailID,adminemail);
			wait(driver,"1");
			sendKeys(driver,passWord, adminpassword);
			wait(driver,"1");
			click(driver, adminLogIn);
			wait(driver,"2");
			return true;
							
		} catch (Exception e) {
			return false;
			
		}
	}

	
	public boolean healerLogout(WebDriver driver) {
		try {
			
			waitForElement(driver, settings);
			scrollUsingElement(driver, settings);
			click(driver, settings);
			wait(driver,"2");
			waitForElement(driver, logOut);
			click(driver, logOut);
			wait(driver,"2");
			
			
			
			
			return true;
			
		} catch (Exception e) {
			return false;
			
		}
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
}

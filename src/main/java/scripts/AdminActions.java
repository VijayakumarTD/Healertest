package scripts;

import org.openqa.selenium.WebDriver;

import commonMethods.Keywords;
import commonMethods.Utils;

public class AdminActions extends Keywords {

	
	private ReusableActions reusableActions = new ReusableActions();
	
	
	public void healerAccountVerify(WebDriver driver,String URL) {
		
		String	emailId = Utils.getDataFromTestData("Healer_Login","EmailId");
		String	adminemail = Utils.getDataFromTestData("Admin_Credentials","AdminEmail");
		String adminpassword = Utils.getDataFromTestData("Admin_Credentials","AdminPassword");
		
		
		
		navigateUrl(driver, URL);
		acceptAlert(driver);
		
		//admin login
		
		boolean admin = reusableActions.adminLogin(driver, adminemail, adminpassword);
		wait(driver,"4");
					
		waitForElement(driver, usersTab);
		click(driver, usersTab);
		wait(driver,"2");
		waitForElement(driver, pendingHealers);
		click(driver, pendingHealers);
		wait(driver,"4");
		sendKeys(driver, userSearch, emailId);
		wait(driver,"4");
		enter(driver);
		wait(driver,"2");
		
		if (isDisplayed(driver,idVerify)) {
			
			click(driver, idVerify);
			wait(driver,"4");
			
			waitForElement(driver, closeButton);
			click(driver, closeButton);
			wait(driver,"3");
			
		}else if (isDisplayed(driver, idNotVerified)) {
			
			click(driver, idNotVerified);
			wait(driver,"4");
			waitForElement(driver,verifyMatch);
			click(driver, verifyMatch);
			wait(driver,"3");
			waitForElement(driver, okButton);
			click(driver, okButton);
			wait(driver,"3");
			
			waitForElement(driver, closeButton);
			click(driver, closeButton);
			wait(driver,"4");
		}
		
		
		waitForElement(driver, userProfile);
		click(driver, userProfile);
		wait(driver,"3");
		
		waitForElement(driver, adminLogout);
		click(driver, adminLogout);
		wait(driver,"3");
		
	}

	
	
}

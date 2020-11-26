package scripts;

import org.openqa.selenium.WebDriver;

import commonMethods.Keywords;
import commonMethods.Utils;

public class AdminActions extends Keywords {

	
	private ReusableActions reusableActions = new ReusableActions();
	
	
	public void healerAccountVerify(WebDriver driver,String URL) {
		
		String	emailId = Utils.getDataFromTestData("HA002","EmailId");
		String	adminemail = Utils.getDataFromTestData("HA002","AdminEmail");
		String adminpassword = Utils.getDataFromTestData("HA002","AdminPassword");
		
		
		navigateUrl(driver, URL);
		//admin login
		
		boolean admin = reusableActions.adminLogin(driver, adminemail, adminpassword);
		wait(driver,"1");
		
		waitForElement(driver, usersTab);
		click(driver, usersTab);
		waitForElement(driver, pendingHealers);
		click(driver, pendingHealers);
		wait(driver,"1");
		sendKeys(driver, userSearch, emailId);
		wait(driver,"2");
		click(driver, idVerify);
		wait(driver,"1");
		waitForElement(driver,verifyMatch);
		click(driver, verifyMatch);
		wait(driver,"1");
		waitForElement(driver, okButton);
		click(driver, okButton);
		wait(driver,"1");
		
		waitForElement(driver, closeButton);
		click(driver, closeButton);
		wait(driver,"1");
		
		waitForElement(driver, userProfile);
		click(driver, userProfile);
		wait(driver,"1");
		
		waitForElement(driver, adminLogout);
		click(driver, adminLogout);
		wait(driver,"1");
		
	}

	
	
}

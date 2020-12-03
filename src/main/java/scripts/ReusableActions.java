package scripts;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import commonMethods.Keywords;

public class ReusableActions extends Keywords {
	
	
	//wait(driver,"1");
	
	public boolean loginMethod(WebDriver driver,String emailId,String password) {
		
		try {
			
			acceptAlert(driver);
			wait(driver,"1");
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

	
	public boolean Logout(WebDriver driver) {
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
	
	public boolean durationTimeVerification(WebDriver driver,String DurationService) {
		
		try {
			if ("30" == DurationService) {
				waitForElement(driver, value30);
				click(driver, value30);
				wait(driver,"2");
			}else if ("45" == DurationService) {
				waitForElement(driver, value45);
				click(driver, value45);
				wait(driver,"2");
			}else if ("50" == DurationService) {
				waitForElement(driver, value50);
				click(driver, value50);
				wait(driver,"2");
			
			}else if ("60" == DurationService) {
				waitForElement(driver, value60);
				click(driver, value60);
				wait(driver,"2");
			}else if ("90" == DurationService) {
				waitForElement(driver, value90);
				click(driver, value90);
				wait(driver,"2");
			}else if ("120" == DurationService) {
				waitForElement(driver, value120);
				click(driver, value120);
				wait(driver,"2");
			}else if ("150" == DurationService) {
				waitForElement(driver, value150);
				click(driver, value150);
				wait(driver,"2");
				
			
			}
			
			return true;
		} catch (Exception e) {
			
			return false;
		}

	}
	
	
	
	
	
	public boolean startTimeDuration(WebDriver driver,String StartDuration,String EndDuration) {
		
		try {
			String duration = StartDuration;
			String durationEnd = EndDuration;
		
			String[] a1 = duration.split("-");
			
			String str1 = a1[0];
			String str2 = a1[1];
			
			String str3 = a1[2];
		
			System.out.println(a1[0]);
			System.out.println(a1[1]);
			System.out.println(a1[2]);
		
		
			
			selectByValue(driver,fromHours,str1);
			wait(driver,"2");
			
			selectByValue(driver, fromMins,str2);
			wait(driver,"2");
			
			selectByValue(driver,fromTime,str3);
			wait(driver,"2");
			
			
			 
		 	String[] a2 = durationEnd.split("-");
		 	
		 	String str4 = a2[0];
			String str5 = a2[1];
			
			String str6 = a2[2];
		 
			selectByValue(driver,toHours,str4);
			wait(driver,"2");
			
			selectByValue(driver, toMins,str5);
			wait(driver,"2");
			
			selectByValue(driver,toTime,str6);
			wait(driver,"2");
			
		 			
		return true;
		
		} catch (Exception e) {
			return false;
		}
		
	}
	
	

	
	
	
}

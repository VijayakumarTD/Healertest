package scripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import atu.testng.reports.logging.LogAs;
import commonMethods.Keywords;
import commonMethods.Utils;
import net.bytebuddy.asm.Advice.Enter;

public class CustomerActions extends Keywords {

	private ReusableActions reusableActions = new ReusableActions();

	
	//First customer login and add the yoga sessions through search button
	
	

	public void first_Customer(WebDriver driver,String URL) {
		
		String	emailId = Utils.getDataFromTestData("First_Customer","EmailId");
		String password = Utils.getDataFromTestData("First_Customer","Password");
		
		String notesprovider = Utils.getDataFromTestData("First_Customer","YogaNotes");
		String HealerLocation = Utils.getDataFromTestData("First_Customer", "HealerLocation");
		
		String secondnotes = Utils.getDataFromTestData("First_Customer","PersonalyogaNotes");
		
		String CardName = Utils.getDataFromTestData("PaymentCardDetails","CardName");
		String CardNumber = Utils.getDataFromTestData("PaymentCardDetails","CardNumber");
		String EnterMonth = Utils.getDataFromTestData("PaymentCardDetails","EnterMonth");
		String EnterYear = Utils.getDataFromTestData("PaymentCardDetails","EnterYear");
		String EnterCVC = Utils.getDataFromTestData("PaymentCardDetails","EnterCVC");
		
		
		String address1 = Utils.getDataFromTestData("First_Location","Address1");
		
		navigateUrl(driver, URL);
		deleteAllCookies(driver);		
		acceptAlert(driver);
		
		wait(driver, "5");
		if (isDisplayed(driver, settings)) {
			
			boolean logout = reusableActions.Logout(driver);
			wait(driver,"2");
			
			boolean login = reusableActions.loginMethod(driver, emailId, password);
			wait(driver,"2");
			
			
		}else {
			
			boolean login = reusableActions.loginMethod(driver, emailId, password);
			wait(driver,"2");
			
		}
		
		
	//	waitForElement(driver, noBooking);
	//	wait(driver,"2");
		
		
			
		waitForElement(driver, iHealerLogo);
		click(driver, iHealerLogo);
		wait(driver,"2");
		
		waitForElement(driver, healerLocation);
		click(driver, healerLocation);
		wait(driver,"2");
		
		waitForElement(driver,mapLocation);
		clearAndType(driver, mapLocation, HealerLocation);
		wait(driver,"2");
		
		enter(driver);
		wait(driver,"2");
		
		
		waitForElement(driver, setLocation);
		click(driver, setLocation);
		wait(driver,"2");
		
		waitForElement(driver, whatService);
		wait(driver,"4");
		
		scrollUsingElement(driver,whatService);
		wait(driver,"2");
		
		waitForElement(driver, whatService);
		click(driver, whatService);
		wait(driver,"2");
		
		waitForElement(driver, whatYoga);
		click(driver, whatYoga);
		wait(driver,"2");
		
		waitForElement(driver, todayCheck);
		click(driver, todayCheck);
		wait(driver,"2");
		
		waitForElement(driver, searchNow);
		click(driver, searchNow);
		wait(driver,"4");
		
		waitForElement(driver, min30);
		verifyElementIsPresent(driver, chooseService);
		click(driver, chooseService);
		wait(driver,"2");
		
		waitForElement(driver, serviceYoga);
		click(driver, serviceYoga);
		wait(driver,"2");
		
		waitForElement(driver, min30);
		click(driver, min30);
		wait(driver,"2");
		
		waitForElement(driver, searchButton);
		click(driver, searchButton);
		wait(driver,"2");
		
		waitForElement(driver, availableHealers);
		verifyElementIsPresent(driver, availableHealers);
		wait(driver,"5");
		
		waitForElement(driver, timeButton);
		click(driver, timeButton);
		wait(driver,"2");
		
		
		//Confirm order
		
		waitForElement(driver, aboutSession);
		click(driver, aboutSession);
		wait(driver,"2");
		
		waitForElement(driver, serviceMyself);
		click(driver, serviceMyself);
		wait(driver,"2");
		
		scrollUsingElement(driver,noteToProvide);	
		wait(driver,"2");
		
		waitForElement(driver, providerNotes);
		sendKeys(driver, providerNotes, notesprovider);
		wait(driver,"2");
		
		scrollUsingElement(driver, paymentTab);
		wait(driver,"2");
		
		waitForElement(driver, finalPayment);
		getText(driver, finalPayment);
		wait(driver,"2");
		
		scrollUsingElement(driver, cardInformation);
		wait(driver,"2");
		
		waitForElement(driver, cardName);
		sendKeys(driver, cardName, CardName);
		wait(driver,"2");
		
		waitForElement(driver, cardNumber);
		sendKeys(driver, cardNumber, CardNumber);
		wait(driver,"2");
		
		waitForElement(driver, selectMonth);
		click(driver, selectMonth);
		sendKeys(driver,month,EnterMonth);
		wait(driver,"2");
		
		waitForElement(driver, selectYear);
		click(driver, selectYear);
		sendKeys(driver,Year,EnterYear);
		wait(driver,"2");
		
		waitForElement(driver, selectCVC);
		click(driver, selectCVC);
		sendKeys(driver,enterCVC,EnterCVC);
		wait(driver,"2");
		
		scrollUsingElement(driver, confirmBooking);
		wait(driver,"2");
		
		waitForElement(driver, confirmBooking);
		click(driver, confirmBooking);
		wait(driver,"2");
		
		waitForElement(driver, thankBooking);
		verifyElementIsPresent(driver, thankBooking);
		
		waitForElement(driver, bookingId);
		getText(driver,bookingId);
		wait(driver,"2");
		
	
		

	

		//adding second service
		
		waitForElement(driver, iHealerLogo);
		click(driver, iHealerLogo);
		wait(driver,"2");
		
		
		waitForElement(driver, healerLocation);
		click(driver, healerLocation);
		wait(driver,"2");
		
		waitForElement(driver,mapLocation);
		clearAndType(driver, mapLocation, HealerLocation);
		wait(driver,"2");
		
		enter(driver);
		wait(driver,"2");
		
		
		waitForElement(driver, setLocation);
		click(driver, setLocation);
		wait(driver,"2");
		
		waitForElement(driver, whatService);
		wait(driver,"4");
		
		
		
		scrollUsingElement(driver, whatService);
		wait(driver,"2");
		
		waitForElement(driver, whatService);
		click(driver, whatService);
		wait(driver,"2");
				
		waitForElement(driver, whatYoga);
		click(driver, whatYoga);
		wait(driver,"2");
		
		waitForElement(driver, todayCheck);
		click(driver, todayCheck);
		wait(driver,"2");
		
		waitForElement(driver, searchNow);
		click(driver, searchNow);
		wait(driver,"2");
		
		waitForElement(driver, min30);
		verifyElementIsPresent(driver, chooseService);
		click(driver, chooseService);
		wait(driver,"2");
		
		waitForElement(driver, servicePersonal);
		click(driver, servicePersonal);
		wait(driver,"2");
		
		waitForElement(driver, min30);
		click(driver, min30);
		wait(driver,"2");
		
		waitForElement(driver, searchButton);
		click(driver, searchButton);
		wait(driver,"2");
		
		waitForElement(driver, availableHealers);
		verifyElementIsPresent(driver, availableHealers);
		
		waitForElement(driver, timeButton);
		click(driver, timeButton);
		wait(driver,"2");
		
		//Confirm order
		
		waitForElement(driver, aboutSession);
		click(driver, aboutSession);
		wait(driver,"2");
		
		waitForElement(driver, serviceMyself);
		click(driver, serviceMyself);
		wait(driver,"2");
		
		scrollUsingElement(driver,noteToProvide);	
		wait(driver,"2");
		
		waitForElement(driver, providerNotes);
		sendKeys(driver, providerNotes, secondnotes);
		wait(driver,"2");
		
		scrollUsingElement(driver, paymentTab);
		wait(driver,"2");
		
		waitForElement(driver, finalPayment);
		getText(driver, finalPayment);
		wait(driver,"2");
		
		scrollUsingElement(driver, cardInformation);
		wait(driver,"2");
		
		waitForElement(driver, cardName);
		sendKeys(driver, cardName, CardName);
		wait(driver,"2");
		
		waitForElement(driver, cardNumber);
		sendKeys(driver, cardNumber, CardNumber);
		wait(driver,"2");
		
		waitForElement(driver, selectMonth);
		click(driver, selectMonth);
		sendKeys(driver,month,EnterMonth);
		wait(driver,"2");
		
		waitForElement(driver, selectYear);
		click(driver, selectYear);
		sendKeys(driver,Year,EnterYear);
		wait(driver,"2");
		
		waitForElement(driver, selectCVC);
		click(driver, selectCVC);
		sendKeys(driver,enterCVC,EnterCVC);
		wait(driver,"2");
		
		scrollUsingElement(driver, confirmBooking);
		wait(driver,"2");
		
		waitForElement(driver, confirmBooking);
		click(driver, confirmBooking);
		wait(driver,"2");
		
		waitForElement(driver, thankBooking);
		verifyElementIsPresent(driver, thankBooking);
		
		waitForElement(driver, bookingId);
		getText(driver,bookingId);
		wait(driver,"4");
		
	
		
	/*	
		//Retreat Service
		wait(driver,"2");
		driver.navigate().refresh();
		wait(driver,"2");
		acceptAlert(driver);
		wait(driver,"2");
		
		*/
		
		waitForElement(driver, iHealerLogo);
		click(driver, iHealerLogo);
		wait(driver,"3");
		
		waitForElement(driver, retreatLocation);
		click(driver, retreatLocation);
		wait(driver,"4");
		
		waitForElement(driver,retreatMapLocation);
		clearAndType(driver, retreatMapLocation, HealerLocation);
		wait(driver,"4");
		
		enter(driver);
		wait(driver,"2");
		
		
		waitForElement(driver, setLocation);
		click(driver, setLocation);
		wait(driver,"4");
	
		
		
		waitForElement(driver, whatService);
		wait(driver,"2");
		scrollUsingElement(driver, whatService);
		wait(driver,"2");
		
				
		waitForElement(driver, whatService);
		click(driver, whatService);
		wait(driver,"2");
		
		
		waitForElement(driver, yogaAndTraining);
		click(driver, yogaAndTraining);
		wait(driver,"2");
		
		scrollUsingElement(driver,todayCheck);
		wait(driver,"2");
		
		
		waitForElement(driver, dateCustomer);
		click(driver, dateCustomer);
		wait(driver,"2");
		
		if (isDisplayed(driver, notPresentDate)) {
			
			waitForElement(driver,todayDate);
			click(driver, todayDate);
			wait(driver,"2");
		}else {

			waitForElement(driver, nextMonth);
			click(driver, nextMonth);
			wait(driver,"2");
			click(driver,nextDay);
			wait(driver,"2");
		}
		
		waitForElement(driver, searchNow);
		click(driver, searchNow);
		wait(driver,"2");
		
		
		waitForElement(driver, holisticCheckbox);
		click(driver, holisticCheckbox);
		wait(driver,"2");
		
		waitForElement(driver, continueButton);
		click(driver, continueButton);
		wait(driver,"2");
		
		
		waitForElement(driver, userAccount);
		getText(driver, userAccount);
		wait(driver,"2");
		
		click(driver, userAccount);
		wait(driver,"2");
		
		waitForElement(driver,scrollServices);
		wait(driver,"2");
		
		scrollUsingElement(driver,scrollServices);
		wait(driver,"2");
		
		scrollUsingElement(driver,serviceRetreat);
		wait(driver,"2");
		
		
		waitForElement(driver, serviceRetreat);
		click(driver, serviceRetreat);
		wait(driver,"2");
		
		waitForElement(driver, viewPackages);
		wait(driver,"2");
		click(driver, viewPackages);
		wait(driver,"2");
		
		
		waitForElement(driver, bookPackages);
		click(driver,bookPackages);
		wait(driver,"2");
		
		scrollUsingElement(driver,cardInformation);
		wait(driver,"2");
		
		
		waitForElement(driver, cardName);
		sendKeys(driver, cardName, CardName);
		wait(driver,"2");
		
		waitForElement(driver, cardNumber);
		sendKeys(driver, cardNumber, CardNumber);
		wait(driver,"2");
		
		waitForElement(driver, selectMonth);
		click(driver, selectMonth);
		sendKeys(driver,month,EnterMonth);
		wait(driver,"2");
		
		waitForElement(driver, selectYear);
		click(driver, selectYear);
		sendKeys(driver,Year,EnterYear);
		wait(driver,"2");
		
		waitForElement(driver, selectCVC);
		click(driver, selectCVC);
		sendKeys(driver,enterCVC,EnterCVC);
		wait(driver,"2");
		
		scrollUsingElement(driver, confirmBooking);
		wait(driver,"2");
		
		waitForElement(driver, confirmBooking);
		click(driver, confirmBooking);
		wait(driver,"3");
		
		waitForElement(driver, thankBooking);
		verifyElementIsPresent(driver, thankBooking);
		wait(driver,"4");
		
		
		waitForElement(driver, bookingsHeader);
		click(driver, bookingsHeader);
		wait(driver,"5");
		
		wait(driver,"2");
		
		
		
		
		boolean logout = reusableActions.Logout(driver);	

	}
	
	
	
	
	public void second_Customer(WebDriver driver,String URL) {
		
		
		String	emailId = Utils.getDataFromTestData("Second_Customer","EmailId");
		String password = Utils.getDataFromTestData("Second_Customer","Password");
		
		String notesprovider = Utils.getDataFromTestData("Second_Customer","AbhyangaNotes");
		String HealerLocation = Utils.getDataFromTestData("Second_Customer", "HealerLocation");
		
		String secondnotes = Utils.getDataFromTestData("Second_Customer","UrdvartanaNotes");
		String thirdnotes = Utils.getDataFromTestData("Second_Customer","JanuvastiNotes");
		
		String CardName = Utils.getDataFromTestData("PaymentCardDetails","CardName");
		String CardNumber = Utils.getDataFromTestData("PaymentCardDetails","CardNumber");
		String EnterMonth = Utils.getDataFromTestData("PaymentCardDetails","EnterMonth");
		String EnterYear = Utils.getDataFromTestData("PaymentCardDetails","EnterYear");
		String EnterCVC = Utils.getDataFromTestData("PaymentCardDetails","EnterCVC");
		
		String CardSave = Utils.getDataFromTestData("PaymentCardDetails","EnterCVC");
		
		
		String address1 = Utils.getDataFromTestData("First_Location","Address1");
		String saveCard = Utils.getDataFromTestData("PaymentCardDetails", "SavedCardName");
		String GuestName = Utils.getDataFromTestData("Second_Customer", "Guestname");
		
		
	
		
		navigateUrl(driver, URL);
		deleteAllCookies(driver);		
		acceptAlert(driver);
		
	
		wait(driver, "5");
		if (isDisplayed(driver, settings)) {
			
			boolean logout = reusableActions.Logout(driver);
			wait(driver,"2");
			
			boolean login = reusableActions.loginMethod(driver, emailId, password);
			wait(driver,"2");
			
		}else {
			
			boolean login = reusableActions.loginMethod(driver, emailId, password);
			wait(driver,"2");
			
		}
		
		
		
		waitForElement(driver, iHealerLogo);
		click(driver, iHealerLogo);
		wait(driver,"3");
		
		waitForElement(driver, healerLocation);
		click(driver, healerLocation);
		wait(driver,"2");
		
		waitForElement(driver,mapLocation);
		clearAndType(driver, mapLocation, HealerLocation);
		wait(driver,"2");
		
		enter(driver);
		wait(driver,"2");
		
		
		
		waitForElement(driver, setLocation);
		click(driver, setLocation);
		wait(driver,"2");
		
		waitForElement(driver, whatService);
		wait(driver,"2");
		
		scrollUsingElement(driver,whatService);	
		wait(driver,"2");
		
		waitForElement(driver, whatService);
		click(driver, whatService);
		wait(driver,"2");
		
		waitForElement(driver, whatAyurveda);
		click(driver, whatAyurveda);
		wait(driver,"2");
		
		waitForElement(driver, todayCheck);
		click(driver, todayCheck);
		wait(driver,"2");
		
		waitForElement(driver, searchNow);
		click(driver, searchNow);
		wait(driver,"2");
		
		waitForElement(driver, min30);
		verifyElementIsPresent(driver, chooseService);
		click(driver, chooseService);
		wait(driver,"2");
		
		waitForElement(driver, serviceAbhyanga);
		click(driver, serviceAbhyanga);
		wait(driver,"2");
		
		waitForElement(driver, min30);
		click(driver, min30);
		wait(driver,"2");
		
		waitForElement(driver, searchButton);
		click(driver, searchButton);
		wait(driver,"2");
		
		waitForElement(driver, availableHealers);
		verifyElementIsPresent(driver, availableHealers);
		
		waitForElement(driver, timeButton);
		click(driver, timeButton);
		wait(driver,"2");
		
		
		
		//Confirm order
		
		waitForElement(driver, aboutSession);
		click(driver, aboutSession);
		wait(driver,"2");
		
		waitForElement(driver, serviceMyself);
		click(driver, serviceMyself);
		wait(driver,"2");
		
		scrollUsingElement(driver,noteToProvide);	
		wait(driver,"2");
		
		waitForElement(driver, providerNotes);
		sendKeys(driver, providerNotes, notesprovider);
		wait(driver,"2");
		
		scrollUsingElement(driver, paymentTab);
		wait(driver,"2");
		
		waitForElement(driver, finalPayment);
		getText(driver, finalPayment);
		wait(driver,"2");
		
		scrollUsingElement(driver, cardInformation);
		wait(driver,"2");
		
		waitForElement(driver, cardName);
		sendKeys(driver, cardName, CardName);
		wait(driver,"2");
		
		waitForElement(driver, cardNumber);
		sendKeys(driver, cardNumber, CardNumber);
		wait(driver,"2");
		
		waitForElement(driver, selectMonth);
		click(driver, selectMonth);
		sendKeys(driver,month,EnterMonth);
		wait(driver,"2");
		
		waitForElement(driver, selectYear);
		click(driver, selectYear);
		sendKeys(driver,Year,EnterYear);
		wait(driver,"2");
		
		waitForElement(driver, selectCVC);
		click(driver, selectCVC);
		sendKeys(driver,enterCVC,EnterCVC);
		wait(driver,"2");
		
		waitForElement(driver, saveCardDetails);
		click(driver, saveCardDetails);
		wait(driver,"2");
		
		waitForElement(driver, saveCardName);
		sendKeys(driver, saveCardName,saveCard);
		wait(driver,"2");
		
		scrollUsingElement(driver, confirmBooking);
		wait(driver,"2");
		
		waitForElement(driver, confirmBooking);
		click(driver, confirmBooking);
		wait(driver,"2");
		
		waitForElement(driver, thankBooking);
		verifyElementIsPresent(driver, thankBooking);
		
		waitForElement(driver, bookingId);
		getText(driver,bookingId);
		wait(driver,"4");
		
			
		
		//adding second service
		
		
		
		waitForElement(driver, iHealerLogo);
		click(driver, iHealerLogo);
		wait(driver,"2");
		
		/*
		waitForElement(driver, healerLocation);
		click(driver, healerLocation);
		wait(driver,"2");
		
		waitForElement(driver,mapLocation);
		clearAndType(driver, mapLocation, HealerLocation);
		wait(driver,"2");
		
		enter(driver);
		wait(driver,"2");
		
		
		waitForElement(driver, setLocation);
		click(driver, setLocation);
		wait(driver,"2");
		*/
		
		waitForElement(driver, whatService);
		wait(driver,"2");
		
		scrollUsingElement(driver, whatService);	
		wait(driver,"2");
		
		waitForElement(driver, whatService);
		click(driver, whatService);
		wait(driver,"2");
		
		waitForElement(driver, whatAyurveda);
		click(driver, whatAyurveda);
		wait(driver,"2");
		
		waitForElement(driver, todayCheck);
		click(driver, todayCheck);
		wait(driver,"2");
		
		waitForElement(driver, searchNow);
		click(driver, searchNow);
		wait(driver,"2");
		
		waitForElement(driver, min30);
		verifyElementIsPresent(driver, chooseService);
		click(driver, chooseService);
		wait(driver,"2");
		
		waitForElement(driver, serviceUrdvartana);
		click(driver, serviceUrdvartana);
		wait(driver,"2");
		
		waitForElement(driver, min30);
		click(driver, min30);
		wait(driver,"2");
		
		waitForElement(driver, searchButton);
		click(driver, searchButton);
		wait(driver,"2");
		
		waitForElement(driver, availableHealers);
		verifyElementIsPresent(driver, availableHealers);
		wait(driver,"3");
		
		waitForElement(driver, timeButton);
		click(driver, timeButton);
		wait(driver,"3");
		
		//Confirm order
		
		waitForElement(driver, aboutSession);
		click(driver, aboutSession);
		wait(driver,"3");
		
		waitForElement(driver, serviceGuest);
		click(driver, serviceGuest);
		wait(driver,"3");
		
		waitForElement(driver, guestTextbox);
		sendKeys(driver, guestTextbox, GuestName);
		wait(driver,"3");
		
		waitForElement(driver, noteToProvide);
		wait(driver,"2");
		
		scrollUsingElement(driver,noteToProvide);	
		wait(driver,"2");
		
		waitForElement(driver, providerNotes);
		sendKeys(driver, providerNotes, secondnotes);
		wait(driver,"2");
		
		scrollUsingElement(driver, paymentTab);
		wait(driver,"2");
		
		waitForElement(driver, finalPayment);
		getText(driver, finalPayment);
		wait(driver,"2");
		
		scrollUsingElement(driver, cardInformation);
		wait(driver,"2");
		
		
		waitForElement(driver, selectSavedCard);
		click(driver, selectSavedCard);
		wait(driver,"2");
		
		waitForElement(driver, visaSaved);
		click(driver, visaSaved);
		wait(driver,"2");
		
				
		scrollUsingElement(driver, confirmBooking);
		wait(driver,"2");
		
		waitForElement(driver, confirmBooking);
		click(driver, confirmBooking);
		wait(driver,"2");
		
		waitForElement(driver, thankBooking);
		verifyElementIsPresent(driver, thankBooking);
		
		waitForElement(driver, bookingId);
		getText(driver,bookingId);
		wait(driver,"4");
		

		
		
		
	
		waitForElement(driver, iHealerLogo);
		click(driver, iHealerLogo);
		wait(driver,"3");
		
		/*
		
		waitForElement(driver, healerLocation);
		click(driver, healerLocation);
		wait(driver,"2");
		
		waitForElement(driver,mapLocation);
		clearAndType(driver, mapLocation, HealerLocation);
		wait(driver,"2");
		
		enter(driver);
		wait(driver,"2");
		
		
		waitForElement(driver, setLocation);
		click(driver, setLocation);
		wait(driver,"2");
		
		*/
		
		
		waitForElement(driver, whatService);
		click(driver, whatService);
		wait(driver,"2");
		
		waitForElement(driver, whatAyurveda);
		click(driver, whatAyurveda);
		wait(driver,"2");
		
		waitForElement(driver, todayCheck);
		click(driver, todayCheck);
		wait(driver,"2");
		
		waitForElement(driver, searchNow);
		click(driver, searchNow);
		wait(driver,"2");
		
		waitForElement(driver, min30);
		verifyElementIsPresent(driver, chooseService);
		click(driver, chooseService);
		wait(driver,"2");
		
		waitForElement(driver, serviceJanuvasti);
		click(driver, serviceJanuvasti);
		wait(driver,"2");
		
		waitForElement(driver, min30);
		click(driver, min30);
		wait(driver,"2");
		
		waitForElement(driver, searchButton);
		click(driver, searchButton);
		wait(driver,"2");
		
		waitForElement(driver, availableHealers);
		verifyElementIsPresent(driver, availableHealers);
		wait(driver,"3");
		
		waitForElement(driver, timeButton);
		click(driver, timeButton);
		wait(driver,"4");
		
		
		
		
		waitForElement(driver, aboutSession);
		click(driver, aboutSession);
		wait(driver,"2");
		
		
		waitForElement(driver, savedguests);
		click(driver, savedguests);
		wait(driver,"2");
		
		selectByValue(driver, guestSelection, GuestName);
		wait(driver,"2");
		
		scrollUsingElement(driver,noteToProvide);	
		wait(driver,"2");
		
		waitForElement(driver, providerNotes);
		sendKeys(driver, providerNotes, thirdnotes);
		wait(driver,"2");
		
		scrollUsingElement(driver, paymentTab);
		wait(driver,"2");
		
		waitForElement(driver, finalPayment);
		getText(driver, finalPayment);
		wait(driver,"2");
		
		
		scrollUsingElement(driver,cardInformation);
		wait(driver,"2");
		
		waitForElement(driver, selectSavedCard);
		click(driver, selectSavedCard);
		wait(driver,"2");
		
		waitForElement(driver, visaSaved);
		click(driver, visaSaved);
		wait(driver,"2");
		
		
		
		scrollUsingElement(driver, confirmBooking);
		wait(driver,"2");
		
		waitForElement(driver, confirmBooking);
		click(driver, confirmBooking);
		wait(driver,"2");
		
		waitForElement(driver, thankBooking);
		verifyElementIsPresent(driver, thankBooking);
		wait(driver,"2");
		
		waitForElement(driver, bookingsHeader);
		click(driver, bookingsHeader);
		wait(driver,"5");
		
		
		waitForElement(driver, currentBooking1);
		wait(driver,"2");
		
	//	verifyElementIsPresent(driver, currentBooking1);
	//	verifyElementIsPresent(driver, currentBooking2);
	//	verifyElementIsPresent(driver, currentBooking3);
		
		
		
		boolean logout = reusableActions.Logout(driver);	

		

	}
	
	
	
	
	
	public void firstCancellation2(WebDriver driver,String URL) {
		
		String	emailId = Utils.getDataFromTestData("First_Cancellation","EmailId");
		String password = Utils.getDataFromTestData("First_Cancellation","Password");
		String DescribeSituation= Utils.getDataFromTestData("First_Cancellation","DescribeSituation");
		
		
		
		navigateUrl(driver, URL);
		deleteAllCookies(driver);		
		acceptAlert(driver);
		
		wait(driver, "5");
		if (isDisplayed(driver, settings)) {
			
			boolean logout = reusableActions.Logout(driver);
			wait(driver,"2");
			
			boolean login = reusableActions.loginMethod(driver, emailId, password);
			wait(driver,"2");
			
		}else {
			
			boolean login = reusableActions.loginMethod(driver, emailId, password);
			wait(driver,"2");
			
		}
		
		
		
		
		
		wait(driver,"2");
		scrollUsingElement(driver, cancelYogaClass);
		wait(driver,"2");
		
		waitForElement(driver, cancelYogaClass);
		click(driver, cancelYogaClass);
		wait(driver,"2");
		
		waitForElement(driver, cancellationReason);
		click(driver, cancellationReason);
		wait(driver,"2");
		
		waitForElement(driver, cancellation1);
		click(driver, cancellation1);
		wait(driver,"2");
		
		waitForElement(driver, describeSituation);
		sendKeys(driver, describeSituation, DescribeSituation);
		wait(driver,"2");
		
		waitForElement(driver, policyType);
		String policy = getText(driver, policyType);
		wait(driver,"2");
		
		
		
		//paid amount
		
		waitForElement(driver,paidAmount);
		String paid = getText(driver,paidAmount);
		wait(driver,"2");
		
		String strNew = paid.replace("$", "");
		System.out.println(strNew);
		
		
	
		double verifypaid = Double.valueOf(strNew);
		System.out.println(verifypaid);
		
	
		//Refund Percentage
		
		waitForElement(driver,refundPerAmount);
		String refundPercentage = getText(driver,refundPerAmount);
		wait(driver,"2");
		
		String strNew1 = refundPercentage.replace("%", "");
		System.out.println(strNew1);
	
		double verifyPercent = Double.valueOf(strNew1);
		System.out.println(verifyPercent);
		
		
		//Refund Amount
		
		waitForElement(driver,refundAmount);
		String refund = getText(driver,refundAmount);
		wait(driver,"2");
		
		String strNew2 = refund.replace("$", "");
		System.out.println(strNew2);
	
		double VerifyRefund = Double.valueOf(strNew2);
		System.out.println(VerifyRefund);
		
		
		
		if (100.0==verifyPercent) {
			
			
			assertEquals(VerifyRefund, verifypaid,0);
			add(driver, "Percentage "+ refundPercentage +" Policy Type "+ policy, LogAs.PASSED, true,policy);
			
		}else if (50.0==verifyPercent) {
			
			double five = verifypaid/2;
			
			assertEquals(VerifyRefund,five,0);
			add(driver, " Percentage "+ refundPercentage +" Policy Type "+ policy, LogAs.PASSED, true,policy);
			
		}else if (75.0 == verifyPercent) {
			double five1 = verifypaid * 0.75;
			
			assertEquals(VerifyRefund,five1,0);
			add(driver, "Percentage "+ refundPercentage +" Policy Type "+ policy, LogAs.PASSED, true,policy);
			
		}
		
	
		
		
		waitForElement(driver, cancelBookCan);
        click(driver, cancelBookCan);
		wait(driver,"3");
		
		waitForElement(driver, closePopup);
		click(driver, closePopup);
		wait(driver,"3");
			
		
		waitForElement(driver, retreatCancel);
		wait(driver,"2");
		
		scrollUsingElement(driver, retreatCancel);
		wait(driver,"2");
		
		waitForElement(driver, retreatCancel);
		click(driver, retreatCancel);
		wait(driver,"2");
		
		
		
	
		
		waitForElement(driver, cancellationReason);
		click(driver, cancellationReason);
		wait(driver,"2");
		
		waitForElement(driver,cancellation1);
		click(driver, cancellation1);
		wait(driver,"3");
		
		waitForElement(driver, describeSituation1);
		sendKeys(driver, describeSituation1, DescribeSituation);
		wait(driver,"2");
		
		waitForElement(driver, policyType);
		String policy1 = getText(driver, policyType);
		wait(driver,"2");
		
		
		
		//paid amount
		
		waitForElement(driver,paidAmount);
		String paid1 = getText(driver,paidAmount);
		wait(driver,"2");
		
		String strNew111 = paid1.replace("$", "");
		System.out.println(strNew111);
		
		
	
		double verifypaid1 = Double.valueOf(strNew111);
		System.out.println(verifypaid1);
		
	
		//Refund Percentage
		
		waitForElement(driver,refundPerAmount);
		String refundPercentage1 = getText(driver,refundPerAmount);
		wait(driver,"2");
		
		String strNew222 = refundPercentage1.replace("%", "");
		System.out.println(strNew222);
	
		double verifyPercent1 = Double.valueOf(strNew222);
		System.out.println(verifyPercent1);
		
		
		//Refund Amount
		
		waitForElement(driver,refundAmount);
		String refund111 = getText(driver,refundAmount);
		wait(driver,"2");
		
		String strNew333 = refund111.replace("$", "");
		System.out.println(strNew333);
	
		double VerifyRefund1111 = Double.valueOf(strNew333);
		System.out.println(VerifyRefund1111);
		
		
		
		if (100.0==verifyPercent1) {
			
			
			assertEquals(VerifyRefund1111, verifypaid1,0);
			add(driver, "Percentage "+ refundPercentage1 +"Policy Type"+ policy1, LogAs.PASSED, true,policy1);
			
		}else if (50.0==verifyPercent1) {
			
			double five = verifypaid1/2;
			
			assertEquals(VerifyRefund1111,five,0);
			add(driver, "Percentage "+ refundPercentage1 +"Policy Type"+ policy1, LogAs.PASSED, true,policy1);
			
		}else if (75.0 == verifyPercent1) {
			double five1 = verifypaid1 * 0.75;
			
			assertEquals(VerifyRefund1111,five1,0);
			add(driver, "Percentage "+ refundPercentage1 +"Policy Type"+ policy1, LogAs.PASSED, true,policy1);
			
		}
			
		
		
		waitForElement(driver, cancelBookCan);
        click(driver, cancelBookCan);
		wait(driver,"3");
		
		waitForElement(driver, closePopup);
		click(driver, closePopup);
		wait(driver,"4");
		
		
		
		boolean logout = reusableActions.Logout(driver);	
		wait(driver,"4");
	
		
		
		
	}
	
	
	
	
	public void secondCancellation2(WebDriver driver,String URL) {
		
		String	emailId = Utils.getDataFromTestData("Second_Cancellation","EmailId");
		String password = Utils.getDataFromTestData("Second_Cancellation","Password");
		
		String DescribeSituation= Utils.getDataFromTestData("Second_Cancellation","DescribeSituation");
		
		navigateUrl(driver, URL);
		deleteAllCookies(driver);		
		acceptAlert(driver);
		
		wait(driver, "5");
		if (isDisplayed(driver, settings)) {
			
			boolean logout = reusableActions.Logout(driver);
			wait(driver,"2");
			
			boolean login = reusableActions.loginMethod(driver, emailId, password);
			wait(driver,"2");
			
		}else {
			
			boolean login = reusableActions.loginMethod(driver, emailId, password);
			wait(driver,"2");
			
		}
		
		
		
		
		wait(driver,"2");
		scrollUsingElement(driver, cancelUrdavartana);
		wait(driver,"2");
		
		waitForElement(driver, cancelUrdavartana);
		click(driver, cancelUrdavartana);
		wait(driver,"2");
		
		waitForElement(driver, cancellationReason);
		click(driver, cancellationReason);
		wait(driver,"2");
		
		waitForElement(driver, cancellation1);
		click(driver, cancellation1);
		wait(driver,"5");
		
		waitForElement(driver, describeSituation);
		sendKeys(driver, describeSituation, DescribeSituation);
		wait(driver,"3");
		
		waitForElement(driver, policyType);
		String policy = getText(driver, policyType);
		wait(driver,"2");
		
		waitForElement(driver,paidAmount);
		String paid = getText(driver,paidAmount);
		wait(driver,"2");
		
		String strNew = paid.replace("$", "");
		System.out.println(strNew);
		
		
	
		double verifypaid = Double.valueOf(strNew);
		System.out.println(verifypaid);
		
	
		//Refund Percentage
		
		waitForElement(driver,refundPerAmount);
		String refundPercentage = getText(driver,refundPerAmount);
		wait(driver,"2");
		
		String strNew1 = refundPercentage.replace("%", "");
		System.out.println(strNew1);
	
		double verifyPercent = Double.valueOf(strNew1);
		System.out.println(verifyPercent);
		
		
		//Refund Amount
		
		waitForElement(driver,refundAmount);
		String refund = getText(driver,refundAmount);
		wait(driver,"2");
		
		String strNew2 = refund.replace("$", "");
		System.out.println(strNew2);
	
		double VerifyRefund = Double.valueOf(strNew2);
		System.out.println(VerifyRefund);
		
		
		
		if (100.0==verifyPercent) {
			
			
			assertEquals(VerifyRefund, verifypaid,0);
			add(driver, "Percentage "+ refundPercentage +" Policy Type "+ policy, LogAs.PASSED, true,policy);
			
		}else if (50.0==verifyPercent) {
			
			double five = verifypaid/2;
			
			assertEquals(VerifyRefund,five,0);
			add(driver, " Percentage "+ refundPercentage +" Policy Type "+ policy, LogAs.PASSED, true,policy);
			
		}else if (75.0 == verifyPercent) {
			double five1 = verifypaid * 0.75;
			
			assertEquals(VerifyRefund,five1,0);
			add(driver, "Percentage "+ refundPercentage +" Policy Type "+ policy, LogAs.PASSED, true,policy);
			
		}
		
	
		
		
		waitForElement(driver, cancelBookCan);
        click(driver, cancelBookCan);
		wait(driver,"4");
		
		waitForElement(driver, closePopup);
		click(driver, closePopup);
		wait(driver,"4");
		
	

			
		wait(driver,"4");
		scrollUsingElement(driver, cancelJanuVasti);
		wait(driver,"2");
		waitForElement(driver, cancelJanuVasti);
		click(driver, cancelJanuVasti);
		wait(driver,"2");
		
		waitForElement(driver, cancellationReason);
		click(driver, cancellationReason);
		wait(driver,"3");
		
		waitForElement(driver, cancellation1);
		click(driver,cancellation1);
		wait(driver,"2");
	
		
		waitForElement(driver, describeSituation1);
		sendKeys(driver, describeSituation1, DescribeSituation);
		wait(driver,"2");
		
		waitForElement(driver, policyType);
		String policy1 = getText(driver, policyType);
		wait(driver,"2");
		
		
		
		//paid amount
		
		waitForElement(driver,paidAmount);
		String paid1 = getText(driver,paidAmount);
		wait(driver,"2");
		
		String strNew21 = paid1.replace("$", "");
		System.out.println(strNew21);
		
		
	
		double verifypaid1 = Double.valueOf(strNew21);
		System.out.println(verifypaid1);
		
	
		//Refund Percentage
		
		waitForElement(driver,refundPerAmount);
		String refundPercentage1 = getText(driver,refundPerAmount);
		wait(driver,"2");
		
		String strNew11 = refundPercentage1.replace("%", "");
		System.out.println(strNew11);
	
		double verifyPercent1 = Double.valueOf(strNew11);
		System.out.println(verifyPercent1);
		
		
		//Refund Amount
		
		waitForElement(driver,refundAmount);
		String refund1 = getText(driver,refundAmount);
		wait(driver,"2");
		
		String strNew22= refund1.replace("$", "");
		System.out.println(strNew22);
	
		double VerifyRefund1 = Double.valueOf(strNew22);
		System.out.println(VerifyRefund1);
		
		
		
		if (100.0==verifyPercent1) {
			
			
			assertEquals(VerifyRefund1, verifypaid1,0);
			add(driver, "Percentage "+ refundPercentage1 +"Policy Type"+ policy1, LogAs.PASSED, true,policy1);
			
		}else if (50.0==verifyPercent1) {
			
			double five = verifypaid1/2;
			
			assertEquals(VerifyRefund1,five,0);
			add(driver, "Percentage "+ refundPercentage1 +"Policy Type"+ policy1, LogAs.PASSED, true,policy1);
			
		}else if (75.0 == verifyPercent1) {
			double five1 = verifypaid1 * 0.75;
			
			assertEquals(VerifyRefund1,five1,0);
			add(driver, "Percentage "+ refundPercentage1 +"Policy Type"+ policy1, LogAs.PASSED, true,policy1);
			
		}
	
		waitForElement(driver, cancelBookCan);
        click(driver, cancelBookCan);
		wait(driver,"3");
		
		waitForElement(driver, closePopup);
		click(driver, closePopup);
		wait(driver,"4");
		
		
		
		boolean logout22 = reusableActions.Logout(driver);	
	
		
		
		
		
		
		
	}
	
	//+30
	
	public void first_RequestRefund(WebDriver driver,String URL) {
		
		String	emailId = Utils.getDataFromTestData("First_Cancellation","EmailId");
		String password = Utils.getDataFromTestData("First_Cancellation","Password");
		String ProvideDetails = Utils.getDataFromTestData("First_Cancellation","ProvideDetails");
		
		
		
		navigateUrl(driver, URL);
		deleteAllCookies(driver);		
		acceptAlert(driver);
		
		wait(driver, "5");
		if (isDisplayed(driver, settings)) {
			
			boolean logout = reusableActions.Logout(driver);
			wait(driver,"2");
			
			boolean login = reusableActions.loginMethod(driver, emailId, password);
			wait(driver,"2");
			
		}else {
			
			boolean login = reusableActions.loginMethod(driver, emailId, password);
			wait(driver,"2");
			
		}
		
		
		if (isDisplayed(driver, requestRefund)) {
			
		
		scrollUsingElement(driver,requestRefund);
		wait(driver,"2");
		
		
		waitForElement(driver, requestRefund);
		click(driver, requestRefund);
		wait(driver,"3");
		
		waitForElement(driver, requestOption);
		click(driver, requestOption);
		wait(driver,"2");
		
		waitForElement(driver, unableAppoint);
		click(driver, unableAppoint);
		wait(driver,"3");
		
		waitForElement(driver, provideDetails);
		sendKeys(driver, provideDetails, ProvideDetails);
		wait(driver,"2");
		
		waitForElement(driver, refundRequest);
		click(driver, refundRequest);
		wait(driver,"4");
		
		waitForElement(driver, requestedRefund);
		verifyElementIsPresent(driver,requestedRefund);	
		wait(driver,"2");
		
		}else {
			verifyElementIsNotPresent(driver, requestRefund);
		}
		
		boolean logout = reusableActions.Logout(driver);
		
		
		
		
		
	}
	
	public void Second_RequestRefund(WebDriver driver,String URL) {
		
		String	emailId = Utils.getDataFromTestData("Second_Cancellation","EmailId");
		String password = Utils.getDataFromTestData("Second_Cancellation","Password");
		String ProvideDetails = Utils.getDataFromTestData("Second_Cancellation","ProvideDetails");
		
		
		
		navigateUrl(driver, URL);
		deleteAllCookies(driver);		
		acceptAlert(driver);
		
		wait(driver, "5");
		if (isDisplayed(driver, settings)) {
			
			boolean logout = reusableActions.Logout(driver);
			wait(driver,"2");
			
			boolean login = reusableActions.loginMethod(driver, emailId, password);
			wait(driver,"2");
			
			
		}else {
			
			boolean login = reusableActions.loginMethod(driver, emailId, password);
			wait(driver,"2");
			
		}
		
		
		if (isDisplayed(driver, requestRefund)) {
		
		scrollUsingElement(driver,requestRefund);
		wait(driver,"2");
		
		
		waitForElement(driver, requestRefund);
		click(driver, requestRefund);
		wait(driver,"3");
		
		waitForElement(driver, requestOption);
		click(driver, requestOption);
		wait(driver,"2");
		
		waitForElement(driver, unableAppoint);
		click(driver, unableAppoint);
		wait(driver,"3");
		
		waitForElement(driver, provideDetails);
		sendKeys(driver, provideDetails, ProvideDetails);
		wait(driver,"2");
		
		waitForElement(driver, refundRequest);
		click(driver, refundRequest);
		wait(driver,"4");
		
		waitForElement(driver, requestedRefund);
		verifyElementIsPresent(driver,requestedRefund);	
		wait(driver,"2");
		
		
		}else {
			verifyElementIsNotPresent(driver, requestRefund);
		}
		
		
		boolean logout = reusableActions.Logout(driver);
		
		
		
	}
	
	
	
	
	public void firstcancellation(WebDriver driver,String URL) {
		
		
		String	emailId = Utils.getDataFromTestData("First_Cancellation","EmailId");
		String password = Utils.getDataFromTestData("First_Cancellation","Password");
		String DescribeSituation= Utils.getDataFromTestData("First_Cancellation","DescribeSituation");
		String	HealeremailId = Utils.getDataFromTestData("First_Cancellation","HealerEmailId");
		String Healerpassword = Utils.getDataFromTestData("First_Cancellation","HealerPassword");
		
		navigateUrl(driver, URL);
		deleteAllCookies(driver);		
		acceptAlert(driver);
		
		
		
		boolean login = reusableActions.loginMethod(driver, emailId, password);
		
		
		wait(driver,"2");
		scrollUsingElement(driver, cancelYogaClass);
		wait(driver,"2");
		
		waitForElement(driver, cancelYogaClass);
		click(driver, cancelYogaClass);
		wait(driver,"2");
		
		waitForElement(driver, cancellationReason);
		click(driver, cancellationReason);
		wait(driver,"2");
		
		waitForElement(driver, cancellation1);
		click(driver, cancellation1);
		wait(driver,"2");
		
		waitForElement(driver, describeSituation);
		sendKeys(driver, describeSituation, DescribeSituation);
		wait(driver,"2");
		
		waitForElement(driver, policyType);
		String policy = getText(driver, policyType);
		wait(driver,"2");
		
		
		
		//paid amount
		
		waitForElement(driver,paidAmount);
		String paid = getText(driver,paidAmount);
		wait(driver,"2");
		
		String strNew = paid.replace("$", "");
		System.out.println(strNew);
		
		
	
		double verifypaid = Double.valueOf(strNew);
		System.out.println(verifypaid);
		
	
		//Refund Percentage
		
		waitForElement(driver,refundPerAmount);
		String refundPercentage = getText(driver,refundPerAmount);
		wait(driver,"2");
		
		String strNew1 = refundPercentage.replace("%", "");
		System.out.println(strNew1);
	
		double verifyPercent = Double.valueOf(strNew1);
		System.out.println(verifyPercent);
		
		
		//Refund Amount
		
		waitForElement(driver,refundAmount);
		String refund = getText(driver,refundAmount);
		wait(driver,"2");
		
		String strNew2 = refund.replace("$", "");
		System.out.println(strNew2);
	
		double VerifyRefund = Double.valueOf(strNew2);
		System.out.println(VerifyRefund);
		
		
		
		if (100.0==verifyPercent) {
			
			
			assertEquals(VerifyRefund, verifypaid,0);
			add(driver, "Percentage "+ refundPercentage +" Policy Type "+ policy, LogAs.PASSED, true,policy);
			
		}else if (50.0==verifyPercent) {
			
			double five = verifypaid/2;
			
			assertEquals(VerifyRefund,five,0);
			add(driver, " Percentage "+ refundPercentage +" Policy Type "+ policy, LogAs.PASSED, true,policy);
			
		}else if (75.0 == verifyPercent) {
			double five1 = verifypaid * 0.75;
			
			assertEquals(VerifyRefund,five1,0);
			add(driver, "Percentage "+ refundPercentage +" Policy Type "+ policy, LogAs.PASSED, true,policy);
			
		}
		
	
		
		
		waitForElement(driver, cancelBookCan);
        click(driver, cancelBookCan);
		wait(driver,"4");
		
	
		
		wait(driver,"4");
		verifyElementIsPresent(driver, currentBooking1);
		verifyElementIsPresent(driver, currentBooking2);
		wait(driver,"4");
		
		scrollUsingElement(driver,receiptYoga);
		waitForElement(driver, receiptYoga);
		click(driver, receiptYoga);
		wait(driver,"4");
		
		
		String getrefund = getText(driver, receiptRefund);
		
		String refund1 = getrefund.replace("-$", "");
		System.out.println(strNew2);
	
		double VerifyRefund11 = Double.valueOf(strNew2);
		System.out.println(VerifyRefund11);
		
		
		assertEquals(VerifyRefund, VerifyRefund11, 0);
		
		
		waitForElement(driver, bookingsHeader);
		click(driver, bookingsHeader);
		wait(driver,"4");
		
		verifyElementIsPresent(driver, currentBooking1);
		verifyElementIsPresent(driver, currentBooking2);
		wait(driver,"4");
		
		boolean logout = reusableActions.Logout(driver);	
		wait(driver,"4");
		
		navigateUrl(driver, URL);
		deleteAllCookies(driver);		
		acceptAlert(driver);

		
		boolean login1 = reusableActions.loginMethod(driver, HealeremailId, Healerpassword);
		wait(driver,"4");
		
		waitForElement(driver, notificationtab);
		click(driver, notificationtab);
		wait(driver,"4");		
		
		
		scrollUsingElement(driver, personalDetails);	
		wait(driver,"2");
		
		waitForElement(driver, personalDetails);
		click(driver, personalDetails);
		wait(driver,"2");
		
		scrollUsingElement(driver, changeTime);	
		wait(driver,"2");
		
		waitForElement(driver, changeTime);
		click(driver, changeTime);
		wait(driver,"2");
		
		waitForElement(driver, changeTimePop);
		click(driver, changeTimePop);
		wait(driver,"4");
		
		
		verifyElementIsPresent(driver, alertTIme);
		wait(driver,"2");
		
		scrollUsingElement(driver, backButton);	
		wait(driver,"2");
		
		waitForElement(driver, backButton);
		click(driver, backButton);
		wait(driver,"3");
		
		
		boolean logout2 = reusableActions.Logout(driver);	
		wait(driver,"3");
		
		navigateUrl(driver, URL);
		deleteAllCookies(driver);		
		acceptAlert(driver);
		
		
		//Customer
		
		boolean login2 = reusableActions.loginMethod(driver, emailId, password);
		wait(driver,"2");
		
		
		
		waitForElement(driver, notificationtab);
		click(driver, notificationtab);
		wait(driver,"4");
		
		waitForElement(driver, HealerRequest);
		click(driver, HealerRequest);
		wait(driver,"2");
		
		waitForElement(driver, rejectCancel);
		wait(driver,"2");
		scrollUsingElement(driver, rejectCancel);	
		wait(driver,"2");
		waitForElement(driver, rejectCancel);
		click(driver, rejectCancel);
		wait(driver,"2");
		
		
		waitForElement(driver, yesPopup);
		click(driver, yesPopup);
		wait(driver,"4");
		
		
		waitForElement(driver, receiptRefund);
		wait(driver,"4");
		
		scrollUsingElement(driver, receiptRefund);	
		wait(driver,"2");
		
		String getrefund22 = getText(driver, receiptRefund);
		
		String refund22 = getrefund22.replace("-$", "");
		System.out.println(refund22);
		
		
		waitForElement(driver,bookingsHeader);
		wait(driver,"2");
		
		
		scrollUsingElement(driver, bookingsHeader);	
		wait(driver,"2");
		
		
		
		waitForElement(driver,bookingsHeader);
		click(driver, bookingsHeader);
		wait(driver,"2");
		
		
		
		waitForElement(driver, retreatCancel);
		click(driver, retreatCancel);
		wait(driver,"2");
		
		
		waitForElement(driver, cancellationReason);
		click(driver, cancellationReason);
		wait(driver,"2");
		
		waitForElement(driver, cancellation1);
		click(driver, cancellation1);
		wait(driver,"2");
		
		waitForElement(driver, describeSituation);
		sendKeys(driver, describeSituation, DescribeSituation);
		wait(driver,"2");
		
		waitForElement(driver, policyType);
		String policy1 = getText(driver, policyType);
		wait(driver,"2");
		
		
		
		//paid amount
		
		waitForElement(driver,paidAmount);
		String paid1 = getText(driver,paidAmount);
		wait(driver,"2");
		
		String strNew111 = paid1.replace("$", "");
		System.out.println(strNew111);
		
		
	
		double verifypaid1 = Double.valueOf(strNew111);
		System.out.println(verifypaid1);
		
	
		//Refund Percentage
		
		waitForElement(driver,refundPerAmount);
		String refundPercentage1 = getText(driver,refundPerAmount);
		wait(driver,"2");
		
		String strNew222 = refundPercentage1.replace("%", "");
		System.out.println(strNew222);
	
		double verifyPercent1 = Double.valueOf(strNew222);
		System.out.println(verifyPercent1);
		
		
		//Refund Amount
		
		waitForElement(driver,refundAmount);
		String refund111 = getText(driver,refundAmount);
		wait(driver,"2");
		
		String strNew333 = refund111.replace("$", "");
		System.out.println(strNew333);
	
		double VerifyRefund1111 = Double.valueOf(strNew333);
		System.out.println(VerifyRefund1111);
		
		
		
		if (100.0==verifyPercent1) {
			
			
			assertEquals(VerifyRefund1111, verifypaid1,0);
			add(driver, "Percentage "+ refundPercentage1 +"Policy Type"+ policy1, LogAs.PASSED, true,policy1);
			
		}else if (50.0==verifyPercent1) {
			
			double five = verifypaid1/2;
			
			assertEquals(VerifyRefund1111,five,0);
			add(driver, "Percentage "+ refundPercentage1 +"Policy Type"+ policy1, LogAs.PASSED, true,policy1);
			
		}else if (75.0 == verifyPercent1) {
			double five1 = verifypaid1 * 0.75;
			
			assertEquals(VerifyRefund1111,five1,0);
			add(driver, "Percentage "+ refundPercentage1 +"Policy Type"+ policy1, LogAs.PASSED, true,policy1);
			
		}
			
		
		
		waitForElement(driver, cancelBookCan);
        click(driver, cancelBookCan);
		wait(driver,"4");
	
		
		verifyElementIsPresent(driver, pastBooking);
		wait(driver,"4");
		
		
		boolean logout3 = reusableActions.Logout(driver);	
		wait(driver,"4");
		
		
	}
	
	
	
	public void secondCancellation(WebDriver driver,String URL) {
		
		String	emailId = Utils.getDataFromTestData("Second_Cancellation","EmailId");
		String password = Utils.getDataFromTestData("Second_Cancellation","Password");
		String	HealeremailId = Utils.getDataFromTestData("Second_Cancellation","HealerEmailId");
		String Healerpassword = Utils.getDataFromTestData("Second_Cancellation","HealerPassword");
		String DescribeSituation= Utils.getDataFromTestData("Second_Cancellation","DescribeSituation");

	
		
		navigateUrl(driver, URL);
		deleteAllCookies(driver);		
		acceptAlert(driver);
		
		
		wait(driver, "5");
		if (isDisplayed(driver, settings)) {
			
			boolean logout = reusableActions.Logout(driver);
			wait(driver,"2");
			
			
		}else {
			
			boolean login = reusableActions.loginMethod(driver, HealeremailId, Healerpassword);
			wait(driver,"2");
			
		}
		
		
	
		
		waitForElement(driver, notificationtab);
		click(driver, notificationtab);
		wait(driver,"2");
		
		scrollUsingElement(driver, abhyangaviewDetail);	
		wait(driver,"2");
		
		waitForElement(driver, abhyangaviewDetail);
		click(driver, abhyangaviewDetail);
		wait(driver,"2");
		
		
		waitForElement(driver, backButton);
		wait(driver,"3");
		
		scrollUsingElement(driver, healerCancel);	
		wait(driver,"2");
		
		waitForElement(driver, healerCancel);
		click(driver, healerCancel);
		wait(driver,"2");
		
		waitForElement(driver, cancellationReasons);
		click(driver, cancellationReasons);
		wait(driver,"2");
		
		waitForElement(driver, cancellation1);
		click(driver, cancellation1);
		wait(driver,"2");
		
		waitForElement(driver, describeSituation);
		sendKeys(driver, describeSituation, DescribeSituation);
		wait(driver,"2");
		
		
		waitForElement(driver, cancelBookCan);
        click(driver, cancelBookCan);
		wait(driver,"5");
		
		waitForElement(driver,verifyCancel);
		verifyElementIsPresent(driver, verifyCancel);
		wait(driver,"2");
		
		scrollUsingElement(driver, backButton);	
		wait(driver,"2");
		
		waitForElement(driver, backButton);
        click(driver, backButton);
		wait(driver,"5");
		
		//urdavartnaa
		
		scrollUsingElement(driver, urdavartanaviewDetail);	
		wait(driver,"2");
		
		waitForElement(driver, urdavartanaviewDetail);
		click(driver, urdavartanaviewDetail);
		wait(driver,"2");
		
		
		waitForElement(driver, backButton);
		wait(driver,"2");
		
		
		scrollUsingElement(driver, changeTime);	
		wait(driver,"2");
		
		waitForElement(driver, changeTime);
		click(driver, changeTime);
		wait(driver,"2");
		
		waitForElement(driver, changeTimePop);
		click(driver, changeTimePop);
		wait(driver,"4");
		
		
		verifyElementIsPresent(driver, alertTIme);
		wait(driver,"2");
		
		scrollUsingElement(driver, backButton);	
		wait(driver,"2");
		
		waitForElement(driver, backButton);
		click(driver, backButton);
		wait(driver,"3");
		
		
		boolean logout2 = reusableActions.Logout(driver);	
		
	
		navigateUrl(driver, URL);
		deleteAllCookies(driver);		
		acceptAlert(driver);
		
		//customer
		
		boolean login22 = reusableActions.loginMethod(driver, emailId, password);
		wait(driver,"4");
		
		
		waitForElement(driver, notificationtab);
		click(driver, notificationtab);
		wait(driver,"2");
		
		waitForElement(driver, HealerRequest);
		click(driver, HealerRequest);
		wait(driver,"2");
		
		waitForElement(driver, rejectCancel);
		wait(driver,"2");
		scrollUsingElement(driver, rejectCancel);	
		wait(driver,"2");
		waitForElement(driver, rejectCancel);
		click(driver, rejectCancel);
		wait(driver,"2");
		
		
		waitForElement(driver, yesPopup);
		click(driver, yesPopup);
		wait(driver,"2");
		
		scrollUsingElement(driver, totalAmount);
		wait(driver,"2");
		
		String getrefund22 = getText(driver, totalAmount);
		
		String refund22 = getrefund22.replace("$", "");
		System.out.println(refund22);
		
		
		scrollUsingElement(driver, bookingsHeader);	
		wait(driver,"2");
		
		
		waitForElement(driver,bookingsHeader);
		click(driver, bookingsHeader);
		wait(driver,"2");
		
		
		waitForElement(driver, cancelButton);
		click(driver, cancelButton);
		wait(driver,"2");
		
		waitForElement(driver, cancellationReason);
		click(driver, cancellationReason);
		wait(driver,"2");
		
		waitForElement(driver, cancellation1);
		click(driver, cancellation1);
		wait(driver,"2");
		
		waitForElement(driver, describeSituation);
		sendKeys(driver, describeSituation, DescribeSituation);
		wait(driver,"2");
		
		waitForElement(driver, policyType);
		String policy = getText(driver, policyType);
		wait(driver,"2");
		
		
		
		//paid amount
		
		waitForElement(driver,paidAmount);
		String paid = getText(driver,paidAmount);
		wait(driver,"2");
		
		String strNew = paid.replace("$", "");
		System.out.println(strNew);
		
		
	
		double verifypaid = Double.valueOf(strNew);
		System.out.println(verifypaid);
		
	
		//Refund Percentage
		
		waitForElement(driver,refundPerAmount);
		String refundPercentage = getText(driver,refundPerAmount);
		wait(driver,"2");
		
		String strNew1 = refundPercentage.replace("%", "");
		System.out.println(strNew1);
	
		double verifyPercent = Double.valueOf(strNew1);
		System.out.println(verifyPercent);
		
		
		//Refund Amount
		
		waitForElement(driver,refundAmount);
		String refund = getText(driver,refundAmount);
		wait(driver,"2");
		
		String strNew2 = refund.replace("$", "");
		System.out.println(strNew2);
	
		double VerifyRefund = Double.valueOf(strNew2);
		System.out.println(VerifyRefund);
		
		
		
		if (100.0==verifyPercent) {
			
			
			assertEquals(VerifyRefund, verifypaid,0);
			add(driver, "Percentage "+ refundPercentage +"Policy Type"+ policy, LogAs.PASSED, true,policy);
			
		}else if (50.0==verifyPercent) {
			
			double five = verifypaid/2;
			
			assertEquals(VerifyRefund,five,0);
			add(driver, "Percentage "+ refundPercentage +"Policy Type"+ policy, LogAs.PASSED, true,policy);
			
		}else if (75.0 == verifyPercent) {
			double five1 = verifypaid * 0.75;
			
			assertEquals(VerifyRefund,five1,0);
			add(driver, "Percentage "+ refundPercentage +"Policy Type"+ policy, LogAs.PASSED, true,policy);
			
		}
	
		waitForElement(driver, cancelBookCan);
        click(driver, cancelBookCan);
		wait(driver,"4");
		
		
		waitForElement(driver, pastBooking);
		verifyElementIsPresent(driver, pastBooking);
		wait(driver,"2");
		
		boolean logout22 = reusableActions.Logout(driver);	
		
	}
}

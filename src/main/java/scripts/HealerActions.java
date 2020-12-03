package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonMethods.Keywords;
import commonMethods.Utils;

public class HealerActions extends Keywords {
	
	private ReusableActions reusableActions = new ReusableActions();
	
	
	
	public void healerActions(WebDriver driver,String URL) {
		
		navigateUrl(driver, URL);
		deleteAllCookies(driver);		
		acceptAlert(driver);
		
		String	emailId = Utils.getDataFromTestData("Healer_Login","EmailId");
		String password = Utils.getDataFromTestData("Healer_Login","Password");
		
		
		boolean login = reusableActions.loginMethod(driver, emailId, password);	
		
		wait(driver,"2");
		
		firstLocation(driver);
		first_ClassService(driver);
		first_GeneralService(driver);
		first_HomeService(driver);
		first_RetreatService(driver);
		
		
		secondLocation(driver);
		second_HomeService(driver);
		second_GeneralService(driver);
		second_ClassService(driver);
		second_RetreatService(driver);
		
		boolean logout = reusableActions.Logout(driver);
		wait(driver,"2");
		
		
	}
	
	
	// Join as healer
	
	public void healerRegistration(WebDriver driver,String URL) {
		
		navigateUrl(driver, URL);
		deleteAllCookies(driver);
		
		
		String	firstname = Utils.getDataFromTestData("HA001","FirstName");
		String lastname = Utils.getDataFromTestData("HA001","LastName");
		String emailaddress = Utils.getDataFromTestData("HA001","Email");
		String passwordemail = Utils.getDataFromTestData("HA001","Password");
		String confirmpassword = Utils.getDataFromTestData("HA001","ConfirmPassword");
		String testmailURL	 = Utils.getDataFromTestData("HA001","YOPURL");
		
			
		waitForElement(driver, joinHealer);
		wait(driver, "2");
		click(driver, joinHealer);
		verifyElementIsPresent(driver, letStart);
		waitForElement(driver, firstName);
		sendKeys(driver,firstName, firstname);
		sendKeys(driver, lastName, lastname);
		sendKeys(driver, emailAddress,emailaddress);
		wait(driver, "2");
		sendKeys(driver, passWord,passwordemail);
		sendKeys(driver,confirmPassword,confirmpassword);
		wait(driver, "2");
		click(driver, iAccept);
		wait(driver, "1");
		click(driver, signUp);
		wait(driver, "1");
		verifyElementIsPresent(driver, thankYou);
		verifyElementIsPresent(driver, sentEmail);
		wait(driver, "2");
		
		//Mail Account verification
		navigateUrl(driver,testmailURL);
		wait(driver, "1");
		sendKeys(driver, mailId, emailaddress);
		waitForElement(driver, goButton);
		click(driver, goButton);
		verifyElementIsPresent(driver, accountConfirmation);
		click(driver, accountConfirmation);
		wait(driver, "1");
		click(driver, emailVerify);
		wait(driver, "2");
		
		switchtotab(driver, 1);
			
		wait(driver, "1");
		waitForElement(driver, verifyAccount);
		click(driver, verifyAccount);
		verifyElementIsPresent(driver, accountVerified);
		waitForElement(driver, loginVerified);
		
		boolean login = reusableActions.loginMethod(driver, emailaddress, passwordemail);	
		
		}
	
	
	//1st location and Service type
	
	public void firstLocation(WebDriver driver) {
				
		
		String LocationName = Utils.getDataFromTestData("First_Location","LocationName");
		String address1 = Utils.getDataFromTestData("First_Location","Address1");
		String ZipCode= Utils.getDataFromTestData("First_Location","ZipCode");
		
		verifyElementIsPresent(driver, mainLocation);
		
		wait(driver, "3");
		waitForElement(driver, locationName);
		sendKeys(driver, locationName, LocationName);
		wait(driver, "1");
		click(driver, locationCheckbox);
		wait(driver, "1");
		scrollUsingElement(driver,address1Main);
		sendKeys(driver, address1Main, address1);
		wait(driver, "1");
		verifyElementIsPresent(driver,autoSelect);
		click(driver,autoSelect);
		wait(driver, "2");
		scrollUsingElement(driver,india);
		wait(driver, "1");
		verifyElementIsPresent(driver, india);
		
		scrollBottom(driver);
				
		
		
		click(driver,stateDropDown);
		wait(driver, "1");
		click(driver, tamilNadu);
		wait(driver, "1");
		verifyElementIsPresent(driver, tamilNadu);
		click(driver,cityDropDown);
		wait(driver, "1");
		click(driver, kanchipuram);
		wait(driver, "1");
		verifyElementIsPresent(driver, kanchipuram);
		wait(driver, "1");
		
		sendKeys(driver,zipCode, ZipCode);
		scrollBottom(driver);
		wait(driver, "1");
		waitForElement(driver, businessCheckBox);
		click(driver, businessCheckBox);
		wait(driver, "2");
		click(driver, pictureLocation1);
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image1.jpg");
		wait(driver, "3");
		click(driver, crop);
		wait(driver, "2");
		click(driver, pictureLocation2);
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image2.jpg");
		wait(driver, "3");
		click(driver, crop);
		wait(driver, "1");
		verifyElementIsPresent(driver,back);
		verifyElementIsPresent(driver,saveAndContinue);
		
		
		waitForElement(driver, saveAndContinue);
		click(driver, saveAndContinue);
		wait(driver, "3");
		
		//Service Category
		
		waitForElement(driver, serviceCategory);
		click(driver, serviceCategory);
		waitForElement(driver, yoga);
		click(driver, yoga);
		wait(driver, "2");
		click(driver, yogaClass);
		wait(driver, "1");
		click(driver, personalYoga);
		wait(driver, "1");
		click(driver, yogaTherapy);
		wait(driver, "1");
		waitForElement(driver, select);
		click(driver, select);
		wait(driver, "2");
		waitForElement(driver, saveAndContinue);
		click(driver, saveAndContinue);
		wait(driver, "4");
		
		
				
	}
	
	
	
	// 1. Yoga class
	
	public void first_ClassService(WebDriver driver) {
		
		
		String ServiceName = Utils.getDataFromTestData("Yoga_Class","ServiceName");
		String ServiceDescription = Utils.getDataFromTestData("Yoga_Class","YogaService");
		String qualification1 = Utils.getDataFromTestData("Yoga_Class","Qualification");
		String clientPrice = Utils.getDataFromTestData("Yoga_Class","ClientPrice");
		String maximumregister = Utils.getDataFromTestData("Yoga_Class","MaximumRegister");
		String LevelExpertise = Utils.getDataFromTestData("Yoga_Class","levelofExpertise");
		String DurationService = Utils.getDataFromTestData("Yoga_Class","DurationService");
		String StartTime  = Utils.getDataFromTestData("Yoga_Class","StartTime");
		String EndTime  = Utils.getDataFromTestData("Yoga_Class","EndTime");

		
		
		
		wait(driver, "3");
		scrollUsingElement(driver,yogaClassDescription);	
		waitForElement(driver,yogaClassDescription);
		click(driver, yogaClassDescription);
		wait(driver, "2");

		
		waitForElement(driver, serviceName);
		clearAndType(driver, serviceName, ServiceName);
		wait(driver, "2");
				
		//service description
		scrollUsingElement(driver,serviceDescribe);
		wait(driver, "2");
		
		sendKeys(driver, serviceDescribe, ServiceDescription);
		wait(driver, "2");
		waitForElement(driver, selectLanguage);
		wait(driver, "2");
		click(driver, selectLanguage);
		wait(driver, "2");
		sendKeys(driver, selectEnglish,"English");
		enter(driver);
		wait(driver, "2");
			
		//service photo
		
	
		wait(driver, "2");
		click(driver, servicePhoto1);
		wait(driver, "1");
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image1.jpg");
		wait(driver, "3");
		click(driver, crop);
		wait(driver, "2");
		click(driver, servicePhoto2);
		wait(driver, "3");
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image2.jpg");
		wait(driver, "3");
		click(driver, crop);
		wait(driver, "2");
		click(driver, servicePhoto3);
		wait(driver, "3");
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image3.jpg");
		wait(driver, "2");
		click(driver, crop);
		wait(driver, "2");
		
		//Qualification
		scrollUsingElement(driver,qualification);
		wait(driver, "2");
		waitForElement(driver, qualification);
		sendKeys(driver, qualification, qualification1);	
		wait(driver, "2");
		click(driver, level1);
		wait(driver, "3");
		
		
		
		String text = "Not Certified";
		String text1 ="Certified";
		String text2 ="Expert";
		String text3 ="Master";
		
	
		
		if (LevelExpertise.equalsIgnoreCase("Not Certified")){
			
			waitForElement(driver, yogaNotCertified);
			click(driver, yogaNotCertified);
			wait(driver, "4");	
			
		}else if (LevelExpertise.equalsIgnoreCase("Certified")) {
			waitForElement(driver, yogaCertified);
			click(driver, yogaCertified);
			wait(driver, "4");	
			
		}else if (LevelExpertise.equalsIgnoreCase("Expert") ) {
			waitForElement(driver,threeYears);
			click(driver, threeYears);
			wait(driver, "4");
		}else if (LevelExpertise.equalsIgnoreCase("Master")) {
			waitForElement(driver,yogaMaster);
			click(driver, yogaMaster);
			wait(driver, "4");
			
		}	
		
		
		
		//pricing
		scrollUsingElement(driver, pricing);
		verifyElementIsPresent(driver, pricing);
		wait(driver,"2");
		click(driver, serviceDuration);
		wait(driver,"4");
		
		System.out.println(DurationService);
		
		int str = Integer.parseInt(DurationService);
		
		if (30 == str) {
			waitForElement(driver, value30);
			click(driver, value30);
			wait(driver,"2");
		}else if (45 == str) {
			waitForElement(driver, value45);
			click(driver, value45);
			wait(driver,"2");
		}else if (50 == str) {
			waitForElement(driver, value50);
			click(driver, value50);
			wait(driver,"2");
		
		}else if (60 == str) {
			waitForElement(driver, value60);
			click(driver, value60);
			wait(driver,"2");
		}else if (90 == str) {
			waitForElement(driver, value90);
			click(driver, value90);
			wait(driver,"2");
		}else if (120 == str) {
			waitForElement(driver, value120);
			click(driver, value120);
			wait(driver,"2");
		}else if (150 == str) {
			waitForElement(driver, value150);
			click(driver, value150);
			wait(driver,"2");
			
		
		}
		
		
		sendKeys(driver,perClientPrice,clientPrice);
		wait(driver,"1");
		sendKeys(driver, maximumRegister, maximumregister);
		wait(driver,"1");
		scrollUsingElement(driver,  strictCancellation);
		wait(driver,"2");
		verifyElementIsPresent(driver, strictCancellation);
		click(driver, strictCancellation);
		
		
		
		wait(driver,"2");
		scrollUsingElement(driver,saveAndContinue);
		waitForElement(driver, saveAndContinue);
		click(driver, saveAndContinue);
		wait(driver,"4");
		
		//Time slot
		
		waitForElement(driver,days);
		wait(driver,"1");
		click(driver, allCheckbox);
		
		wait(driver,"2");
		
		
		//from hours
		
		boolean timevalidation = reusableActions.startTimeDuration(driver, StartTime, EndTime);
		wait(driver,"2");
		
	    
	   
		scrollUsingElement(driver,saveAndContinue);	
		wait(driver,"2");
		
		click(driver, saveAndContinue);
		wait(driver,"3");
		
		verifyElementIsPresent(driver, yogaComplete);
		wait(driver,"5");
	
	}
	
	
	public void first_GeneralService(WebDriver driver) {
		
		String personalDescription = Utils.getDataFromTestData("Personal_Yoga","PersonalYoga");
		String qualification2 = Utils.getDataFromTestData("Personal_Yoga","Qualification");
		String EnterPrice = Utils.getDataFromTestData("Personal_Yoga","EnterPrice");
		String LevelExpertise = Utils.getDataFromTestData("Personal_Yoga","levelofExpertise");
		String DurationService = Utils.getDataFromTestData("Personal_Yoga","DurationService");
		String StartTime  = Utils.getDataFromTestData("Personal_Yoga","StartTime");
		String EndTime  = Utils.getDataFromTestData("Personal_Yoga","EndTime");
		String ServiceName = Utils.getDataFromTestData("Personal_Yoga","ServiceName");

	
		
		wait(driver, "4");
		scrollUsingElement(driver,personalYogaSession);	
		waitForElement(driver,personalYogaSession);
		click(driver, personalYogaSession);
		wait(driver, "2");
		
		
		waitForElement(driver, serviceName);
		clearAndType(driver, serviceName, ServiceName);
		wait(driver, "2");
		
		
		//service Description
		scrollUsingElement(driver,serviceDescribe);
		wait(driver, "2");
		
		sendKeys(driver, serviceDescribe, personalDescription);
		wait(driver, "2");
		waitForElement(driver, selectLanguage);
		wait(driver, "2");
		click(driver, selectLanguage);
		wait(driver, "2");
		sendKeys(driver, selectEnglish,"English");
		enter(driver);
		wait(driver, "2");
		
		wait(driver, "2");
		click(driver, servicePhoto1);
		wait(driver, "1");
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image1.jpg");
		wait(driver, "3");
		click(driver, crop);
		wait(driver, "2");
		click(driver, servicePhoto2);
		wait(driver, "3");
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image2.jpg");
		wait(driver, "3");
		click(driver, crop);
		wait(driver, "2");
		click(driver, servicePhoto3);
		wait(driver, "3");
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image3.jpg");
		wait(driver, "2");
		click(driver, crop);
		wait(driver, "2");
		
		//Qualification
		scrollUsingElement(driver,qualification);
		wait(driver, "2");
		waitForElement(driver, qualification);
		sendKeys(driver, qualification, qualification2);	
		wait(driver, "2");
		click(driver, level1);
		wait(driver, "3");
		
		String text = "Not Certified";
		String text1 ="Certified";
		String text2 ="Expert";
		String text3 ="Master";
		
	
		
		if (LevelExpertise.equalsIgnoreCase("Not Certified")){
			
			waitForElement(driver, yogaNotCertified);
			click(driver, yogaNotCertified);
			wait(driver, "4");	
			
		}else if (LevelExpertise.equalsIgnoreCase("Certified")) {
			waitForElement(driver, yogaCertified);
			click(driver, yogaCertified);
			wait(driver, "4");	
			
		}else if (LevelExpertise.equalsIgnoreCase("Expert") ) {
			waitForElement(driver,threeYears);
			click(driver, threeYears);
			wait(driver, "4");
		}else if (LevelExpertise.equalsIgnoreCase("Master")) {
			waitForElement(driver,yogaMaster);
			click(driver, yogaMaster);
			wait(driver, "4");
			
		}	
		
		
		
		//pricing
		scrollUsingElement(driver, pricing);
		verifyElementIsPresent(driver, pricing);
		wait(driver,"2");
		click(driver, serviceDuration);
		wait(driver,"1");
		
		
		
		int str = Integer.parseInt(DurationService);
		
		if (30 == str) {
			waitForElement(driver, value30);
			click(driver, value30);
			wait(driver,"2");
		}else if (45 == str) {
			waitForElement(driver, value45);
			click(driver, value45);
			wait(driver,"2");
		}else if (50 == str) {
			waitForElement(driver, value50);
			click(driver, value50);
			wait(driver,"2");
		
		}else if (60 == str) {
			waitForElement(driver, value60);
			click(driver, value60);
			wait(driver,"2");
		}else if (90 == str) {
			waitForElement(driver, value90);
			click(driver, value90);
			wait(driver,"2");
		}else if (120 == str) {
			waitForElement(driver, value120);
			click(driver, value120);
			wait(driver,"2");
		}else if (150 == str) {
			waitForElement(driver, value150);
			click(driver, value150);
			wait(driver,"2");
			
		
		}
		
		wait(driver,"2");
		sendKeys(driver, enterPrice, EnterPrice);
		wait(driver,"2");
		waitForElement(driver, priceAdd);
		click(driver, priceAdd);
		wait(driver,"2");
		scrollUsingElement(driver,  moderateCancellation);
		wait(driver,"2");
		verifyElementIsPresent(driver, moderateCancellation);
		click(driver, moderateCancellation);
		
		
		
		wait(driver,"2");
		scrollUsingElement(driver,saveAndContinue);
		waitForElement(driver, saveAndContinue);
		click(driver, saveAndContinue);
		wait(driver,"4");
		
		waitForElement(driver, days);
		wait(driver,"1");
		click(driver, allCheckbox);
		
		wait(driver,"2");
		
		boolean timevalidation = reusableActions.startTimeDuration(driver, StartTime, EndTime);
		wait(driver,"2");
	    
		
		scrollUsingElement(driver,saveAndContinue);	
		wait(driver,"2");
		
		click(driver, saveAndContinue);
		wait(driver,"4");
		
		waitForElement(driver, personalComplete);
		verifyElementIsPresent(driver, personalComplete);
		wait(driver,"5");
		
	}
	
				
	//3. yoga therapy
	
	public void first_HomeService(WebDriver driver) {
		
		String therapyDescription = Utils.getDataFromTestData("Yoga_Therapy","YogaTherapy");
		String qualification3 = Utils.getDataFromTestData("Yoga_Therapy","Qualification");
		String EnterPrice3 = Utils.getDataFromTestData("Yoga_Therapy","EnterPrice");
		String LevelExpertise = Utils.getDataFromTestData("Yoga_Therapy","levelofExpertise");
		String DurationService = Utils.getDataFromTestData("Yoga_Therapy","DurationService");
		String StartTime  = Utils.getDataFromTestData("Yoga_Therapy","StartTime");
		String EndTime  = Utils.getDataFromTestData("Yoga_Therapy","EndTime");
		String ServiceName = Utils.getDataFromTestData("Yoga_Therapy","ServiceName");

		
		

			
		wait(driver, "2");
		scrollUsingElement(driver,yogaTherapyDescr);	
		waitForElement(driver,yogaTherapyDescr);
		click(driver, yogaTherapyDescr);
		wait(driver, "2");
		
		
		waitForElement(driver, serviceName);
		clearAndType(driver, serviceName, ServiceName);
		wait(driver, "2");
		
		
		//service Description
		scrollUsingElement(driver,serviceDescribe);
		wait(driver, "2");
		
		sendKeys(driver, serviceDescribe, therapyDescription);
		wait(driver, "2");
		waitForElement(driver, selectLanguage);
		wait(driver, "2");
		click(driver, selectLanguage);
		wait(driver, "2");
		sendKeys(driver, selectEnglish,"English");
		enter(driver);
		wait(driver, "2");
		
		wait(driver, "2");
		click(driver, servicePhoto1);
		wait(driver, "1");
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image1.jpg");
		wait(driver, "3");
		click(driver, crop);
		wait(driver, "2");
		click(driver, servicePhoto2);
		wait(driver, "3");
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image2.jpg");
		wait(driver, "3");
		click(driver, crop);
		wait(driver, "2");
		click(driver, servicePhoto3);
		wait(driver, "3");
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image3.jpg");
		wait(driver, "2");
		click(driver, crop);
		wait(driver, "2");
		
		//Qualification
		scrollUsingElement(driver,qualification);
		wait(driver, "2");
		waitForElement(driver, qualification);
		sendKeys(driver, qualification, qualification3);	
		wait(driver, "2");
		click(driver, level1);
		wait(driver, "3");
		
		String text = "Not Certified";
		String text1 ="Certified";
		String text2 ="Expert";
		String text3 ="Master";
		
	
		
		if (LevelExpertise.equalsIgnoreCase("Not Certified")){
			
			waitForElement(driver, yogaNotCertified);
			click(driver, yogaNotCertified);
			wait(driver, "4");	
			
		}else if (LevelExpertise.equalsIgnoreCase("Certified")) {
			waitForElement(driver, yogaCertified);
			click(driver, yogaCertified);
			wait(driver, "4");	
			
		}else if (LevelExpertise.equalsIgnoreCase("Expert") ) {
			waitForElement(driver,threeYears);
			click(driver, threeYears);
			wait(driver, "4");
		}else if (LevelExpertise.equalsIgnoreCase("Master")) {
			waitForElement(driver,yogaMaster);
			click(driver, yogaMaster);
			wait(driver, "4");
			
		}
		
		//pricing
		scrollUsingElement(driver, pricing);
		verifyElementIsPresent(driver, pricing);
		wait(driver,"2");
		click(driver, serviceDuration);
		wait(driver,"1");
		
		
		
		int str = Integer.parseInt(DurationService);
		
		if (30 == str) {
			waitForElement(driver, value30);
			click(driver, value30);
			wait(driver,"2");
		}else if (45 == str) {
			waitForElement(driver, value45);
			click(driver, value45);
			wait(driver,"2");
		}else if (50 == str) {
			waitForElement(driver, value50);
			click(driver, value50);
			wait(driver,"2");
		
		}else if (60 == str) {
			waitForElement(driver, value60);
			click(driver, value60);
			wait(driver,"2");
		}else if (90 == str) {
			waitForElement(driver, value90);
			click(driver, value90);
			wait(driver,"2");
		}else if (120 == str) {
			waitForElement(driver, value120);
			click(driver, value120);
			wait(driver,"2");
		}else if (150 == str) {
			waitForElement(driver, value150);
			click(driver, value150);
			wait(driver,"2");
			
		
		}
		
		
		sendKeys(driver, enterPrice, EnterPrice3);
		wait(driver,"2");
		waitForElement(driver,priceAdd);
		click(driver, priceAdd);
		wait(driver,"2");
		scrollUsingElement(driver,  relaxedCancellation);
		wait(driver,"2");
		verifyElementIsPresent(driver, relaxedCancellation);
		click(driver, relaxedCancellation);
		
		
		
		wait(driver,"2");
		scrollUsingElement(driver,saveAndContinue);
		waitForElement(driver, saveAndContinue);
		click(driver, saveAndContinue);
		wait(driver,"4");
		
		waitForElement(driver, days);
		wait(driver,"1");
		click(driver, allCheckbox);
		
		wait(driver,"2");
		
		boolean timevalidation = reusableActions.startTimeDuration(driver, StartTime, EndTime);
		wait(driver,"2");
		
		scrollUsingElement(driver,saveAndContinue);	
		wait(driver,"2");
		
		click(driver, saveAndContinue);
		wait(driver,"3");
		
		waitForElement(driver, YogaTherapyComplete);
		verifyElementIsPresent(driver, YogaTherapyComplete);
		wait(driver,"5");
	
		
	}
	
	
	//Retreat Service
	
	public void first_RetreatService(WebDriver driver) {
		
		
		String RetreatName = Utils.getDataFromTestData("Retreat_Service","RetreatName");
		String RetreatDescription = Utils.getDataFromTestData("Retreat_Service","RetreatDescription");
		String DescribeYourself = Utils.getDataFromTestData("Retreat_Service","DescribeYourself");
		String MaximumNumber = Utils.getDataFromTestData("Retreat_Service","MaximumNumber");
		String PeopleNumber = Utils.getDataFromTestData("Retreat_Service","PeopleNumber");
		String PackageName = Utils.getDataFromTestData("Retreat_Service","PackageName");
		String PackageFeature = Utils.getDataFromTestData("Retreat_Service","PackageFeature");
		String OnePersonPrice = Utils.getDataFromTestData("Retreat_Service","OnePersonPrice");
		String Time = Utils.getDataFromTestData("Retreat_Service", "Time");
		String AgendaActivity= Utils.getDataFromTestData("Retreat_Service", "AgendaActivity");
		String AgendaWhere = Utils.getDataFromTestData("Retreat_Service", "AgendaWhere");
		String LevelExpertise = Utils.getDataFromTestData("Retreat_Service","levelofExpertise");
		
		

		
		
		wait(driver,"4");
		scrollUsingElement(driver,addRetreat);
		wait(driver,"2");
		waitForElement(driver, addRetreat);
		click(driver, addRetreat);
		wait(driver,"2");
		sendKeys(driver, retreatName, RetreatName);
		wait(driver,"2");
		waitForElement(driver, retreatCheckbox);
		click(driver, retreatCheckbox);
		wait(driver,"2");
		scrollUsingElement(driver,retreatCategory);
		wait(driver,"2");
		waitForElement(driver, retreatCategory);
		click(driver, retreatCategory);
		wait(driver,"2");
		click(driver, yogaTraining);
		wait(driver,"2");
		sendKeys(driver, retreatDescribe,RetreatDescription);
		wait(driver,"2");
		wait(driver, "2");
		click(driver, selectLanguage);
		wait(driver, "2");
		sendKeys(driver, selectEnglish,"English");
		enter(driver);
		wait(driver, "2");
		
		wait(driver, "2");
		click(driver, servicePhoto1);
		wait(driver, "1");
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image1.jpg");
		wait(driver, "3");
		click(driver, crop);
		wait(driver, "2");
		click(driver, servicePhoto2);
		wait(driver, "3");
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image2.jpg");
		wait(driver, "3");
		click(driver, crop);
		wait(driver, "2");
		click(driver, servicePhoto3);
		wait(driver, "3");
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image3.jpg");
		wait(driver, "2");
		click(driver, crop);
		wait(driver, "4");
		
		scrollUsingElement(driver, qualificationTab);
		waitForElement(driver, certificaiton);
		click(driver, certificaiton);
		wait(driver, "2");
		click(driver, yes);
		wait(driver, "2");
		
		wait(driver,"2");
		sendKeys(driver, describeYourself,DescribeYourself);
		wait(driver,"2");
		click(driver, level1);
		wait(driver, "2");
		
		if (LevelExpertise.equalsIgnoreCase("Not Certified") ) {
			
			waitForElement(driver, abhyangaNotCertified);
			click(driver, abhyangaNotCertified);
			wait(driver, "2");	
			
		}else if (LevelExpertise.equalsIgnoreCase("Certified")) {
			waitForElement(driver, abhyangaCertified);
			click(driver, abhyangaCertified);
			wait(driver, "2");	
			
		}else if (LevelExpertise.equalsIgnoreCase("Expert")) {
			waitForElement(driver,abhyangaExpert);
			click(driver, abhyangaExpert);
			wait(driver, "2");
		}else if (LevelExpertise.equalsIgnoreCase("Master")) {
			waitForElement(driver,abhyangaMaster);
			click(driver, abhyangaMaster);
			wait(driver, "2");
			
		}	
		
		
		scrollUsingElement(driver, fromDate);
		wait(driver,"2");
		
		click(driver, fromDate);
		wait(driver,"2");
		
		//verify the current next active day
		
		//it will not present click next month and add 1st active date
		
	
		
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
			
		click(driver, toDate);
		wait(driver,"2");
		
		if (isDisplayed(driver, notPresentDate)) {
			
			waitForElement(driver,notPresentDate);
			click(driver,notPresentDate);
			wait(driver,"2");
		}else {

			waitForElement(driver, nextMonth);
			click(driver, nextMonth);
			wait(driver,"2");
			click(driver,nextDay);
			wait(driver,"2");
		}
		
				
		waitForElement(driver, addAgenda);
		click(driver, addAgenda);
		wait(driver,"2");
		
		waitForElement(driver, timeAgenda);
		sendKeys(driver, timeAgenda, Time);
		wait(driver,"2");
		
		
		waitForElement(driver, activityAgenda);
		sendKeys(driver, activityAgenda, AgendaActivity);
		wait(driver,"2");
		
		waitForElement(driver, whereAgenda);
		sendKeys(driver, whereAgenda, AgendaWhere);
		wait(driver,"2");
		
	
	
		wait(driver,"2");
		scrollUsingElement(driver,saveAndContinue);
		waitForElement(driver, saveAndContinue);
		click(driver, saveAndContinue);
		wait(driver,"4");
		
		
		waitForElement(driver, numberPeople);
		clearAndType(driver, numberPeople, PeopleNumber);
		wait(driver,"2");
		
		waitForElement(driver, maximumNumber);
		clearAndType(driver, maximumNumber,MaximumNumber);
		wait(driver,"2");
		
		waitForElement(driver, optional);
		click(driver, optional);
		wait(driver,"2");
		
		click(driver, addPackage);
		wait(driver,"2");
		
		waitForElement(driver, packageName);
		sendKeys(driver,packageName, PackageName);
		wait(driver,"2");
		
		waitForElement(driver, packageFeature);
		sendKeys(driver,packageFeature,PackageFeature);
		wait(driver,"2");
		
		waitForElement(driver, onePersonPrice);
		sendKeys(driver,onePersonPrice, OnePersonPrice);
		wait(driver,"2");
		
		waitForElement(driver, savepackage);
		click(driver, savepackage);
		wait(driver,"4");
		
			
		scrollUsingElement(driver,  moderateRetreat);
		wait(driver,"2");
		verifyElementIsPresent(driver, moderateRetreat);
		click(driver, moderateRetreat);
			
		wait(driver,"2");
		scrollUsingElement(driver,saveAndContinue);
		waitForElement(driver, saveAndContinue);
		click(driver, saveAndContinue);
		wait(driver,"4");
		
		waitForElement(driver, firstRetreatComplete);
		verifyElementIsPresent(driver, firstRetreatComplete);
		wait(driver,"5");
		
	}
	
	//Second location(other)
	
	public void secondLocation(WebDriver driver) {
		
		String LocationName = Utils.getDataFromTestData("Second_Location","LocationName");
		String address1 = Utils.getDataFromTestData("Second_Location","address1");
		String ZipCode= Utils.getDataFromTestData("Second_Location","ZipCode");
		
		waitForElement(driver, secondLocation);
		scrollUsingElement(driver,secondLocation);
		wait(driver,"3");
		click(driver, secondLocation);
		wait(driver,"3");
		
		verifyElementIsPresent(driver, otherLocation);
		wait(driver,"2");
		
		waitForElement(driver, locationName);
		sendKeys(driver, locationName, LocationName);
		wait(driver, "1");
		click(driver, locationCheckbox);
		wait(driver, "1");
		scrollUsingElement(driver,address1Main);
		sendKeys(driver, address1Main, address1);
		wait(driver, "1");
		verifyElementIsPresent(driver,autoSelect);
		click(driver,autoSelect);
		wait(driver, "3");
		scrollUsingElement(driver,zipCode);
		wait(driver, "2");
		sendKeys(driver,zipCode, ZipCode);
		scrollBottom(driver);
		wait(driver, "1");
		waitForElement(driver, homeCheckBox);
		click(driver, homeCheckBox);
		wait(driver, "2");
		click(driver, pictureLocation1);
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image1.jpg");
		wait(driver, "3");
		click(driver, crop);
		wait(driver, "2");
		click(driver, pictureLocation2);
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image2.jpg");
		wait(driver, "3");
		click(driver, crop);
		wait(driver, "3");
		waitForElement(driver,back);
		waitForElement(driver,saveAndContinue);
		
		
		waitForElement(driver, saveAndContinue);
		click(driver, saveAndContinue);
		wait(driver, "3");
		
		//Service category
		//Make a general service  - Abhyanga
		//Make a class service  -Janu vasti

		
		waitForElement(driver, serviceCategory);
		click(driver, serviceCategory);
		waitForElement(driver, ayurveda);
		click(driver,ayurveda);
		wait(driver, "2");
		click(driver, abhyanga);
		wait(driver, "1");
		click(driver, Urdvartana);
		wait(driver, "1");
		click(driver, JanuVasti);
		wait(driver, "1");
		waitForElement(driver, select);
		click(driver, select);
		wait(driver, "2");
		waitForElement(driver, saveAndContinue);
		click(driver, saveAndContinue);
		wait(driver, "4");
		
			
		
	}
	
	
	//Abhyanga - homebased
	
	public void second_HomeService(WebDriver driver) {
		
		String personalDescription = Utils.getDataFromTestData("Abhyanga_Service","Abhyanga");
		String qualification2 = Utils.getDataFromTestData("Abhyanga_Service","Qualification");
		String EnterPrice = Utils.getDataFromTestData("Abhyanga_Service","EnterPrice");
		String LevelExpertise = Utils.getDataFromTestData("Abhyanga_Service","levelofExpertise");
		String Language = Utils.getDataFromTestData("Abhyanga_Service","Language");
		String DurationService = Utils.getDataFromTestData("Abhyanga_Service","DurationService");
		String StartTime  = Utils.getDataFromTestData("Abhyanga_Service","StartTime");
		String EndTime  = Utils.getDataFromTestData("Abhyanga_Service","EndTime");
		String ServiceName = Utils.getDataFromTestData("Abhyanga_Service","ServiceName");

		
		

		scrollUsingElement(driver,abhyangaService);	
		verifyElementIsPresent(driver,abhyangaService);
		click(driver, abhyangaService);
		wait(driver, "2");
		
		waitForElement(driver, serviceName);
		clearAndType(driver, serviceName, ServiceName);
		wait(driver, "4");
						
		//Tell about service
		scrollUsingElement(driver,serviceDescribe);
		wait(driver, "2");
		
		sendKeys(driver, serviceDescribe, personalDescription);
		wait(driver, "2");
		waitForElement(driver, selectLanguage);
		wait(driver, "2");
		click(driver, selectLanguage);
		wait(driver, "2");
		sendKeys(driver, selectEnglish,Language);
		enter(driver);
		wait(driver, "2");
		
		wait(driver, "2");
		click(driver, servicePhoto1);
		wait(driver, "1");
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image1.jpg");
		wait(driver, "3");
		click(driver, crop);
		wait(driver, "2");
		click(driver, servicePhoto2);
		wait(driver, "3");
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image2.jpg");
		wait(driver, "3");
		click(driver, crop);
		wait(driver, "2");
		click(driver, servicePhoto3);
		wait(driver, "3");
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image3.jpg");
		wait(driver, "2");
		click(driver, crop);
		wait(driver, "2");
		
		//Qualification
		scrollUsingElement(driver,qualification);
		wait(driver, "2");
		waitForElement(driver, qualification);
		sendKeys(driver, qualification, qualification2);	
		wait(driver, "2");
		click(driver, level1);
		wait(driver, "2");
		
		String text = "Not Certified";
		String text1 ="Certified";
		String text2 ="Expert";
		String text3 ="Master";
		
	
		
		if (LevelExpertise.equalsIgnoreCase("Not Certified") ) {
			
			waitForElement(driver, abhyangaNotCertified);
			click(driver, abhyangaNotCertified);
			wait(driver, "2");	
			
		}else if (LevelExpertise.equalsIgnoreCase("Certified")) {
			waitForElement(driver, abhyangaCertified);
			click(driver, abhyangaCertified);
			wait(driver, "2");	
			
		}else if (LevelExpertise.equalsIgnoreCase("Expert")) {
			waitForElement(driver,abhyangaExpert);
			click(driver, abhyangaExpert);
			wait(driver, "2");
		}else if (LevelExpertise.equalsIgnoreCase("Master")) {
			waitForElement(driver,abhyangaMaster);
			click(driver, abhyangaMaster);
			wait(driver, "2");
			
		}	
		
		//pricing
		scrollUsingElement(driver, pricing);
		verifyElementIsPresent(driver, pricing);
		wait(driver,"2");
		click(driver, serviceDuration);
		wait(driver,"1");
		
		int str = Integer.parseInt(DurationService);
		
		if (30 == str) {
			waitForElement(driver, value30);
			click(driver, value30);
			wait(driver,"2");
		}else if (45 == str) {
			waitForElement(driver, value45);
			click(driver, value45);
			wait(driver,"2");
		}else if (50 == str) {
			waitForElement(driver, value50);
			click(driver, value50);
			wait(driver,"2");
		
		}else if (60 == str) {
			waitForElement(driver, value60);
			click(driver, value60);
			wait(driver,"2");
		}else if (90 == str) {
			waitForElement(driver, value90);
			click(driver, value90);
			wait(driver,"2");
		}else if (120 == str) {
			waitForElement(driver, value120);
			click(driver, value120);
			wait(driver,"2");
		}else if (150 == str) {
			waitForElement(driver, value150);
			click(driver, value150);
			wait(driver,"2");
			
		
		}
		
		sendKeys(driver, enterPrice, EnterPrice);
		wait(driver,"2");
		waitForElement(driver, priceAdd);
		click(driver, priceAdd);
		wait(driver,"2");
		scrollUsingElement(driver,  strictCancellation);
		wait(driver,"2");
		verifyElementIsPresent(driver, strictCancellation);
		click(driver, strictCancellation);
		
		
		
		wait(driver,"2");
		scrollUsingElement(driver,saveAndContinue);
		waitForElement(driver, saveAndContinue);
		click(driver, saveAndContinue);
		wait(driver,"4");
		
		//Availability
		waitForElement(driver, days);
		wait(driver,"1");
		click(driver, allCheckbox);
		wait(driver,"2");
		
		boolean timevalidation = reusableActions.startTimeDuration(driver, StartTime, EndTime);
		wait(driver,"2");
	    
		
		scrollUsingElement(driver,saveAndContinue);	
		wait(driver,"2");
		
		click(driver, saveAndContinue);
		wait(driver,"3");
		
		verifyElementIsPresent(driver, abhyangaComplete);
		wait(driver,"3");
		
		
	}
	
	
	//class service - Janu vasti
	
	public void second_ClassService(WebDriver driver) {
		
		
		String ServiceDescription = Utils.getDataFromTestData("Januvasti_Service","Januvasti");
		String qualification2 = Utils.getDataFromTestData("Januvasti_Service","Qualification");
		String EnterPrice = Utils.getDataFromTestData("Januvasti_Service","EnterPrice");
		String Language = Utils.getDataFromTestData("Januvasti_Service","Language");
		String LevelExpertise = Utils.getDataFromTestData("Januvasti_Service","levelofExpertise");
		String DurationService = Utils.getDataFromTestData("Januvasti_Service","DurationService");
		String StartTime  = Utils.getDataFromTestData("Januvasti_Service","StartTime");
		String EndTime  = Utils.getDataFromTestData("Januvasti_Service","EndTime");
		String ServiceName = Utils.getDataFromTestData("Januvasti_Service","ServiceName");

		
		wait(driver, "4");
		scrollUsingElement(driver,JanuVastiService);	
		verifyElementIsPresent(driver,JanuVastiService);
		click(driver,JanuVastiService);
		wait(driver, "3");
		

		
		waitForElement(driver, serviceName);
		clearAndType(driver, serviceName, ServiceName);
		wait(driver, "4");
		
		
		
						
		//Tell about service
		scrollUsingElement(driver,serviceDescribe);
		wait(driver, "2");
		
		sendKeys(driver, serviceDescribe, ServiceDescription);
		wait(driver, "2");
		waitForElement(driver, selectLanguage);
		wait(driver, "2");
		click(driver, selectLanguage);
		wait(driver, "2");
		sendKeys(driver, selectEnglish,Language);
		enter(driver);
		wait(driver, "2");
		
		wait(driver, "2");
		click(driver, servicePhoto1);
		wait(driver, "1");
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image1.jpg");
		wait(driver, "3");
		click(driver, crop);
		wait(driver, "2");
		click(driver, servicePhoto2);
		wait(driver, "3");
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image2.jpg");
		wait(driver, "3");
		click(driver, crop);
		wait(driver, "2");
		click(driver, servicePhoto3);
		wait(driver, "3");
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image3.jpg");
		wait(driver, "2");
		click(driver, crop);
		wait(driver, "2");
		
		//Qualification
		scrollUsingElement(driver,qualification);
		wait(driver, "2");
		waitForElement(driver, qualification);
		sendKeys(driver, qualification, qualification2);	
		wait(driver, "2");
		click(driver, level1);
		wait(driver, "2");
		
		
		String text = "Not Certified";
		String text1 ="Certified";
		String text2 ="Expert";
		String text3 ="Master";

		
		if (LevelExpertise.equalsIgnoreCase("Not Certified") ) {
			
			waitForElement(driver, abhyangaNotCertified);
			click(driver, abhyangaNotCertified);
			wait(driver, "2");	
			
		}else if (LevelExpertise.equalsIgnoreCase("Certified")) {
			waitForElement(driver, abhyangaCertified);
			click(driver, abhyangaCertified);
			wait(driver, "2");	
			
		}else if (LevelExpertise.equalsIgnoreCase("Expert")) {
			waitForElement(driver,abhyangaExpert);
			click(driver, abhyangaExpert);
			wait(driver, "2");
		}else if (LevelExpertise.equalsIgnoreCase("Master")) {
			waitForElement(driver,abhyangaMaster);
			click(driver, abhyangaMaster);
			wait(driver, "2");
			
		}	
		
		
		
		
		
		//pricing
		scrollUsingElement(driver, pricing);
		verifyElementIsPresent(driver, pricing);
		wait(driver,"2");
		click(driver, serviceDuration);
		wait(driver,"1");
		
		int str = Integer.parseInt(DurationService);

		if (30 == str) {
			waitForElement(driver, value30);
			click(driver, value30);
			wait(driver,"2");
		}else if (45 == str) {
			waitForElement(driver, value45);
			click(driver, value45);
			wait(driver,"2");
		}else if (50 == str) {
			waitForElement(driver, value50);
			click(driver, value50);
			wait(driver,"2");
		
		}else if (60 == str) {
			waitForElement(driver, value60);
			click(driver, value60);
			wait(driver,"2");
		}else if (90 == str) {
			waitForElement(driver, value90);
			click(driver, value90);
			wait(driver,"2");
		}else if (120 == str) {
			waitForElement(driver, value120);
			click(driver, value120);
			wait(driver,"2");
		}else if (150 == str) {
			waitForElement(driver, value150);
			click(driver, value150);
			wait(driver,"2");
			
		
		}
		sendKeys(driver, enterPrice, EnterPrice);
		wait(driver,"2");
		waitForElement(driver, priceAdd);
		click(driver, priceAdd);
		wait(driver,"2");
		scrollUsingElement(driver,  moderateCancellation);
		wait(driver,"2");
		verifyElementIsPresent(driver, moderateCancellation);
		click(driver, moderateCancellation);
		
		
		
		wait(driver,"2");
		scrollUsingElement(driver,saveAndContinue);
		waitForElement(driver, saveAndContinue);
		click(driver, saveAndContinue);
		wait(driver,"4");
		
		//Availability
		waitForElement(driver, days);
		wait(driver,"1");
		click(driver, allCheckbox);
		wait(driver,"2");
		
		boolean timevalidation = reusableActions.startTimeDuration(driver, StartTime, EndTime);
		wait(driver,"2");
	    
		
		scrollUsingElement(driver,saveAndContinue);	
		wait(driver,"2");
		
		click(driver, saveAndContinue);
		wait(driver,"3");
		
		waitForElement(driver, januVastiComplete);
		verifyElementIsPresent(driver, januVastiComplete);
		wait(driver,"3");
	
			
		
		
	}
	
	
	
	//Urdvartana - General Based
	
	public void second_GeneralService(WebDriver driver) {
		
		String ServiceDescription = Utils.getDataFromTestData("Urdvartana_Service","Urdvartana");
		String qualification2 = Utils.getDataFromTestData("Urdvartana_Service","Qualification");
		String EnterPrice = Utils.getDataFromTestData("Urdvartana_Service","EnterPrice");
		String Language = Utils.getDataFromTestData("Urdvartana_Service","Language");
		String LevelExpertise = Utils.getDataFromTestData("Urdvartana_Service","levelofExpertise");
		String DurationService = Utils.getDataFromTestData("Urdvartana_Service","durationservice");
		String StartTime  = Utils.getDataFromTestData("Urdvartana_Service","StartTime");
		String EndTime  = Utils.getDataFromTestData("Urdvartana_Service","EndTime");
		String ServiceName = Utils.getDataFromTestData("Urdvartana_Service","ServiceName");

		
		String text ="30";
		String text1 ="45";
		String text2 ="50";
		String text3 ="60";
		String text4 ="90";
		String text5 ="120";
		String text6 ="150";
					
		System.out.println(text);
		System.out.println(DurationService);
		
		
		
		wait(driver, "4");
		scrollUsingElement(driver,urdvartanaService);	
		verifyElementIsPresent(driver,urdvartanaService);
		click(driver,urdvartanaService);
		wait(driver, "2");
		
		waitForElement(driver, serviceName);
		clearAndType(driver, serviceName, ServiceName);
		wait(driver, "2");

		
		
		scrollUsingElement(driver,serviceDescribe);
		wait(driver, "2");
		
		sendKeys(driver, serviceDescribe, ServiceDescription);
		wait(driver, "2");
		waitForElement(driver, selectLanguage);
		wait(driver, "2");
		click(driver, selectLanguage);
		wait(driver, "2");
		sendKeys(driver, selectEnglish,Language);
		enter(driver);
		wait(driver, "2");
		
		wait(driver, "2");
		click(driver, servicePhoto1);
		wait(driver, "1");
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image1.jpg");
		wait(driver, "3");
		click(driver, crop);
		wait(driver, "2");
		click(driver, servicePhoto2);
		wait(driver, "3");
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image2.jpg");
		wait(driver, "3");
		click(driver, crop);
		wait(driver, "2");
		click(driver, servicePhoto3);
		wait(driver, "3");
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image3.jpg");
		wait(driver, "2");
		click(driver, crop);
		wait(driver, "2");
		
		
		//Qualification
		
		scrollUsingElement(driver,qualification);
		wait(driver, "2");
		waitForElement(driver, qualification);
		sendKeys(driver, qualification, qualification2);	
		wait(driver, "2");
		click(driver, level1);
		wait(driver, "2");
		
		if (LevelExpertise.equalsIgnoreCase("Not Certified") ) {
			
			waitForElement(driver, abhyangaNotCertified);
			click(driver, abhyangaNotCertified);
			wait(driver, "2");	
			
		}else if (LevelExpertise.equalsIgnoreCase("Certified")) {
			waitForElement(driver, abhyangaCertified);
			click(driver, abhyangaCertified);
			wait(driver, "2");	
			
		}else if (LevelExpertise.equalsIgnoreCase("Expert")) {
			waitForElement(driver,abhyangaExpert);
			click(driver, abhyangaExpert);
			wait(driver, "2");
		}else if (LevelExpertise.equalsIgnoreCase("Master")) {
			waitForElement(driver,abhyangaMaster);
			click(driver, abhyangaMaster);
			wait(driver, "2");
			
		}	
		
		
		//Pricing
		scrollUsingElement(driver, pricing);
		verifyElementIsPresent(driver, pricing);
		wait(driver,"2");
		click(driver, serviceDuration);
		wait(driver,"4");
		waitForElement(driver, value30);
		click(driver, value30);
		wait(driver,"4");
		getText(driver, value30);
		
		int str = Integer.parseInt(DurationService);
		
		if (30 == str) {
			waitForElement(driver, value30);
			click(driver, value30);
			wait(driver,"2");
		}else if (45 == str) {
			waitForElement(driver, value45);
			click(driver, value45);
			wait(driver,"2");
		}else if (50 == str) {
			waitForElement(driver, value50);
			click(driver, value50);
			wait(driver,"2");
		
		}else if (60 == str) {
			waitForElement(driver, value60);
			click(driver, value60);
			wait(driver,"2");
		}else if (90 == str) {
			waitForElement(driver, value90);
			click(driver, value90);
			wait(driver,"2");
		}else if (120 == str) {
			waitForElement(driver, value120);
			click(driver, value120);
			wait(driver,"2");
		}else if (150 == str) {
			waitForElement(driver, value150);
			click(driver, value150);
			wait(driver,"2");
			
		
		}	
		
		sendKeys(driver, enterPrice, EnterPrice);
		wait(driver,"2");
		waitForElement(driver, priceAdd);
		click(driver, priceAdd);
		wait(driver,"2");
		scrollUsingElement(driver,  relaxedCancellation);
		wait(driver,"2");
		verifyElementIsPresent(driver, relaxedCancellation);
		click(driver, relaxedCancellation);
		
		wait(driver,"2");
		scrollUsingElement(driver,saveAndContinue);
		waitForElement(driver, saveAndContinue);
		click(driver, saveAndContinue);
		wait(driver,"4");
		
		//Availability
		waitForElement(driver, days);
		wait(driver,"1");
		click(driver, allCheckbox);
		wait(driver,"2");
		
		
		boolean timevalidation = reusableActions.startTimeDuration(driver, StartTime, EndTime);
		wait(driver,"2");
	    
		
		scrollUsingElement(driver,saveAndContinue);	
		wait(driver,"2");
		
		click(driver, saveAndContinue);
		wait(driver,"3");
		
		waitForElement(driver, urdvartanaComplete);
		verifyElementIsPresent(driver, urdvartanaComplete);
		wait(driver,"3");
		
		
		
	}
	
	
	//Second Retreat service 
	
	public void second_RetreatService(WebDriver driver) {
		
		
		String RetreatName = Utils.getDataFromTestData("Second_RetreatService","RetreatName");
		String RetreatDescription = Utils.getDataFromTestData("Second_RetreatService","RetreatDescription");
		String DescribeYourself = Utils.getDataFromTestData("Second_RetreatService","DescribeYourself");
		String MaximumNumber = Utils.getDataFromTestData("Second_RetreatService","MaximumNumber");
		String PeopleNumber = Utils.getDataFromTestData("Second_RetreatService","PeopleNumber");
		String PackageName = Utils.getDataFromTestData("Second_RetreatService","PackageName");
		String PackageFeature = Utils.getDataFromTestData("Second_RetreatService","PackageFeature");
		String OnePersonPrice = Utils.getDataFromTestData("Second_RetreatService","OnePersonPrice");
		String Time = Utils.getDataFromTestData("Second_RetreatService", "Time");
		String AgendaActivity= Utils.getDataFromTestData("Second_RetreatService", "AgendaActivity");
		String AgendaWhere = Utils.getDataFromTestData("Second_RetreatService", "AgendaWhere");
		String LevelExpertise = Utils.getDataFromTestData("Second_RetreatService","levelofExpertise");
		

		
		
		wait(driver,"4");
		scrollUsingElement(driver,addRetreat2);
		wait(driver,"2");
		waitForElement(driver, addRetreat2);
		click(driver, addRetreat2);
		wait(driver,"2");
		sendKeys(driver, retreatName, RetreatName);
		wait(driver,"2");
		waitForElement(driver, retreatCheckbox);
		click(driver, retreatCheckbox);
		wait(driver,"2");
		scrollUsingElement(driver,retreatCategory);
		wait(driver,"2");
		waitForElement(driver, retreatCategory);
		click(driver, retreatCategory);
		wait(driver,"2");
		click(driver, yogaTraining);
		wait(driver,"2");
		sendKeys(driver, retreatDescribe,RetreatDescription);
		wait(driver,"2");
		wait(driver, "2");
		click(driver, selectLanguage);
		wait(driver, "2");
		sendKeys(driver, selectEnglish,"English");
		enter(driver);
		wait(driver, "2");
		
		wait(driver, "2");
		click(driver, servicePhoto1);
		wait(driver, "1");
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image1.jpg");
		wait(driver, "3");
		click(driver, crop);
		wait(driver, "2");
		click(driver, servicePhoto2);
		wait(driver, "3");
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image2.jpg");
		wait(driver, "3");
		click(driver, crop);
		wait(driver, "2");
		click(driver, servicePhoto3);
		wait(driver, "3");
		uploadFileAutoIT(System.getProperty("user.dir") + "\\uploads\\image3.jpg");
		wait(driver, "2");
		click(driver, crop);
		wait(driver, "4");
		
		scrollUsingElement(driver, qualificationTab);
		waitForElement(driver, certificaiton);
		click(driver, certificaiton);
		wait(driver, "2");
		click(driver, yes);
		wait(driver, "2");
		
		wait(driver,"2");
		sendKeys(driver, describeYourself,DescribeYourself);
		wait(driver,"2");
		click(driver, level1);
		wait(driver, "2");
		
		if (LevelExpertise.equalsIgnoreCase("Not Certified") ) {
			
			waitForElement(driver, abhyangaNotCertified);
			click(driver, abhyangaNotCertified);
			wait(driver, "2");	
			
		}else if (LevelExpertise.equalsIgnoreCase("Certified")) {
			waitForElement(driver, abhyangaCertified);
			click(driver, abhyangaCertified);
			wait(driver, "2");	
			
		}else if (LevelExpertise.equalsIgnoreCase("Expert")) {
			waitForElement(driver,abhyangaExpert);
			click(driver, abhyangaExpert);
			wait(driver, "2");
		}else if (LevelExpertise.equalsIgnoreCase("Master")) {
			waitForElement(driver,abhyangaMaster);
			click(driver, abhyangaMaster);
			wait(driver, "2");
			
		}	
		
		scrollUsingElement(driver, fromDate);
		wait(driver,"2");
		
		click(driver, fromDate);
		wait(driver,"2");
		
		if (isDisplayed(driver, notPresentDate)) {
			
			waitForElement(driver,notPresentDate);
			click(driver,notPresentDate);
			wait(driver,"2");
		}else {

			waitForElement(driver, nextMonth);
			click(driver, nextMonth);
			wait(driver,"2");
			click(driver,nextDay);
			wait(driver,"2");
		}
			
		click(driver, toDate);
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
		
		waitForElement(driver, addAgenda);
		click(driver, addAgenda);
		wait(driver,"2");
		
		waitForElement(driver, timeAgenda);
		sendKeys(driver, timeAgenda, Time);
		wait(driver,"2");
		
		
		waitForElement(driver, activityAgenda);
		sendKeys(driver, activityAgenda, AgendaActivity);
		wait(driver,"2");
		
		waitForElement(driver, whereAgenda);
		sendKeys(driver, whereAgenda, AgendaWhere);
		wait(driver,"2");
		
	
	
		wait(driver,"2");
		scrollUsingElement(driver,saveAndContinue);
		waitForElement(driver, saveAndContinue);
		click(driver, saveAndContinue);
		wait(driver,"4");
		
		
		waitForElement(driver, numberPeople);
		clearAndType(driver, numberPeople, PeopleNumber);
		wait(driver,"2");
		
		waitForElement(driver, maximumNumber);
		clearAndType(driver, maximumNumber,MaximumNumber);
		wait(driver,"2");
		
		waitForElement(driver, optional);
		click(driver, optional);
		wait(driver,"2");
		
		click(driver, addPackage);
		wait(driver,"2");
		
		waitForElement(driver, packageName);
		sendKeys(driver,packageName, PackageName);
		wait(driver,"2");
		
		waitForElement(driver, packageFeature);
		sendKeys(driver,packageFeature,PackageFeature);
		wait(driver,"2");
		
		waitForElement(driver, onePersonPrice);
		sendKeys(driver,onePersonPrice, OnePersonPrice);
		wait(driver,"2");
		
		waitForElement(driver, savepackage);
		click(driver, savepackage);
		wait(driver,"4");
		
			
		scrollUsingElement(driver,  relaxedRetreat);
		wait(driver,"2");
		verifyElementIsPresent(driver, relaxedRetreat);
		click(driver, relaxedRetreat);
			
		wait(driver,"2");
		scrollUsingElement(driver,saveAndContinue);
		waitForElement(driver, saveAndContinue);
		click(driver, saveAndContinue);
		wait(driver,"4");
		
		waitForElement(driver, secondRetreatComplete);
		verifyElementIsPresent(driver, secondRetreatComplete);
		wait(driver,"4");
		
		
		
	}
	
 
	
	
	//service 
	
	public void healerIdVerify(WebDriver driver,String URL) {
		
		
		deleteAllCookies(driver);
		navigateUrl(driver, URL);
		
		
		
		String	emailId = Utils.getDataFromTestData("Healer_Login","EmailId");
		String password = Utils.getDataFromTestData("Healer_Login","Password");
		
		
		
		
		boolean login = reusableActions.loginMethod(driver, emailId, password);
		
		
		waitForElement(driver, yogaClassActive);
		verifyElementIsPresent(driver,yogaClassActive);
		verifyElementIsPresent(driver, personalYogaActive);
		wait(driver,"2");
		
		verifyElementIsPresent(driver,yogaTherapyActive);
		verifyElementIsPresent(driver, abhyangaActive);
		verifyElementIsPresent(driver, urdvartanaActive);
		verifyElementIsPresent(driver, januVastiComplete);
		wait(driver,"2");
		
		
		
		
		boolean logout = reusableActions.Logout(driver);
		wait(driver,"2");
		
		
		
	}
	
	
	

}

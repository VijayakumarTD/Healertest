package commonMethods;

import java.io.File;
import java.io.IOException;

import org.json.JSONException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import scripts.AdminActions;
import scripts.CustomerActions;
import scripts.HealerActions;
import atu.testng.reports.exceptions.ATUReporterException;
import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class, MethodListener.class })

public class Testcases extends Config {
	{
		System.setProperty("atu.reporter.config", System.getProperty("user.dir") + "/atu.properties");
	}
	public String adminURL;
	public String healerURL;
	public String clientURL;
	public String project_Name;
	public String environment;
	public String browser;
	public String browser_Version;
	public WebDriver driver;
	
	File f = new File(report_folder_create + "\\reports");

	
	HealerActions healtest = new HealerActions();
	AdminActions admintest = new AdminActions();
	CustomerActions customertest = new CustomerActions();
	

	@BeforeClass
	public void getDataFromConfig() throws ATUReporterException, IOException, InterruptedException {
		
		adminURL = Utils.getDataFromTestConfig("AdminURL");
		healerURL = Utils.getDataFromTestConfig("HealerURL");
		clientURL = Utils.getDataFromTestConfig("ClientURL"); 
		browser = Utils.getDataFromTestConfig("AppBrowser");
		browser_Version = Utils.getDataFromTestConfig("BrowserVersion");
		project_Name = Utils.getDataFromTestConfig("Project_Name");
		environment = Utils.getDataFromTestConfig("Environment");
		driver=getWebDriver(browser);
	}
	
	
	
	

	@Test
	public void TC001_HealerLogin() throws InterruptedException {
		
		healtest.healerLogin(driver, healerURL);
		
	
	}
	
	@Test
	public void TC002_FirstLocation() {
		healtest.firstLocation(driver);
	}
	
	@Test
	public void TC003_YogaService() {
		healtest.first_ClassService(driver);
	}
	
	@Test
	public void TC004_PersonalYoga() {
		healtest.first_GeneralService(driver);
	}
	
	@Test
	public void TC005_YogaTherapy() {
		healtest.first_HomeService(driver);
	}
	
	@Test
	public void TC006_RetreatService() {
		healtest.first_RetreatService(driver);
	}
	
	@Test
	public void TC007_SecondLocation() {
		healtest.secondLocation(driver);
	}
	
	
	
	
	@Test
	public void TC008_Abhayanga() {
		healtest.second_HomeService(driver);
	}
	
	@Test
	public void TC009_Urdvartana() {
		healtest.second_GeneralService(driver);
	}
	
	@Test
	public void TC010_JanuVasti() {
		healtest.second_ClassService(driver);
	}
	
	@Test
	public void TC011_RetreatService() {
		healtest.second_RetreatService(driver);
	}
	
	
	@Test
	public void TC012_HealerLogout() {
		healtest.Logout(driver);
	}
	
	
	@Test
	public void TC013_AdminPage() throws InterruptedException {
		admintest.healerAccountVerify(driver, adminURL);
	}
	
	
	@Test
	public void TC014_HealerVerification() throws InterruptedException {
		healtest.healerIdVerify(driver, healerURL);
	}
	
	
	
	
	@Test 
	public void TC015_FirstCustomer() throws InterruptedException {
	customertest.first_Customer(driver, clientURL);
	
	}
	
	
	@Test
	public void TC016_SecondCustomer() throws InterruptedException {
		customertest.second_Customer(driver, clientURL);	
	}
	


	
	@Test
	public void TC017_FirstCustomerCancellation() throws InterruptedException {
		customertest.firstCancellation2(driver, clientURL);	
	}
	
	
	
	@Test
	public void TC018_SecondCustomerCancellation() throws InterruptedException {
		customertest.secondCancellation2(driver, clientURL);	
	}

	
	@Test
	public void TC019_FirstRefund() throws InterruptedException {
		customertest.first_RequestRefund(driver, clientURL);	
	}
	
	
		
	@Test
	public void TC020_SecondRefund() throws InterruptedException {
		customertest.Second_RequestRefund(driver, clientURL);	
	}
	

	@AfterTest
	public void teardown() throws Exception {
		driver.quit();

	}

}

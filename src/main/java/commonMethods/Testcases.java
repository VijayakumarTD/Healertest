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
import scripts.ClientActions;
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
	ClientActions cilenttest = new ClientActions();
	

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
	public void TC001_HealerProcess() throws InterruptedException {
		healtest.firstLocation(driver, healerURL);
		healtest.first_ClassService(driver);
		healtest.first_GeneralService(driver);
		healtest.first_HomeService(driver);
		healtest.first_RetreatService(driver);
		healtest.secondLocation(driver);
		healtest.second_GeneralService(driver);
		healtest.second_ClassService(driver);
		healtest.second_RetreatService(driver);
		
	
	}
	
	
	@Test
	public void TC002_AdminPage() throws InterruptedException {
		admintest.healerAccountVerify(driver, adminURL);
	}
	
	
	
	@Test
	public void TC003_HealerVerification()throws InterruptedException {
		healtest.healerIdVerify(driver, healerURL);
	}
	
		

	@AfterTest
	public void teardown() throws Exception {
		driver.quit();

	}

}

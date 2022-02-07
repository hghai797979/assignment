package com.cucumber.baseSteps.steps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;
import com.cucumber.pages.AddBankAccountPage;
import com.cucumber.pages.AuthenticationPage;
import com.cucumber.pages.BankAccountDetailsPage;
import com.cucumber.pages.BankAccountPage;
import com.cucumber.pages.HomePage;
import com.cucumber.pages.LoginPage;
import com.cucumber.pages.SecurityQuestionsPage;
import com.cucumber.utilities.DriverFactory;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseSteps {
	public String browserName;
	public static String appURL;
	public static String emailAddr;
	public static String password;
	public static WebDriver driver;
	//public static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();
	public static ThreadLocal<ExtentTest> exTest = new ThreadLocal<ExtentTest>();
	public static ExtentTest test;
	public static String screenshotPath;
	public static String screenshotName;
	public FileInputStream fis;
	public Properties prop = new Properties();
	LoginPage loginPg = null;
	AuthenticationPage authenticationPg = null;
	SecurityQuestionsPage securityQuesPg = null;
	HomePage homePg = null;
	BankAccountPage bankAccPg = null;
	AddBankAccountPage addBankAccountPg = null;
	BankAccountDetailsPage bankAccDetpg = null;

	public void setUpFramework() {
		DriverFactory.setConfigPropertyFile(System.getProperty("user.dir") + "//src//test//resources//properties//configuration.properties");
		DriverFactory.setChromeDriverExePath(System.getProperty("user.dir") + "//Browser Exes//chromedriver.exe");
		DriverFactory.setGeckoDriverExePath(System.getProperty("user.dir") + "//Browser Exes//geckodriver.exe");
		try {
			fis = new FileInputStream(DriverFactory.getConfigPropertyFile());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fis);
			appURL = prop.getProperty("App_URL");
			emailAddr = prop.getProperty("EMAIL_ADDR");
			password = prop.getProperty("PASSWORD");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void openBrowser(String browserType) {
		{
			if (browserType.equalsIgnoreCase("chrome")) {
				System.out.println("Launching Chrome browser");
				System.setProperty("webdriver.chrome.driver", DriverFactory.getChromeDriverExePath());
				driver = new ChromeDriver();
			} else if (browserType.equalsIgnoreCase("firefox")) {
				System.out.println("Launching Firefox browser");
				FirefoxOptions firefox_options = new FirefoxOptions();
				firefox_options.setCapability("marionette", true);
				System.setProperty("webdriver.gecko.driver", DriverFactory.getGeckoDriverExePath());
				driver = new FirefoxDriver(firefox_options);
			}
		}
		driver.manage().window().maximize();
		loginPg = new LoginPage();
		PageFactory.initElements(driver, loginPg);
		authenticationPg = new AuthenticationPage();
		PageFactory.initElements(driver, authenticationPg);
		securityQuesPg = new SecurityQuestionsPage();
		PageFactory.initElements(driver, securityQuesPg);
		homePg = new HomePage();
		PageFactory.initElements(driver, homePg);
		bankAccPg = new BankAccountPage();
		PageFactory.initElements(driver, bankAccPg);
		addBankAccountPg = new AddBankAccountPage();
		PageFactory.initElements(driver, addBankAccountPg);
		bankAccDetpg = new BankAccountDetailsPage();
		PageFactory.initElements(driver, bankAccDetpg);
	}
	

//	public void openBrowser(String browserType) {
//		{
//			if (browserType.equalsIgnoreCase("chrome")) {
//				System.out.println("Launching Chrome browser");
//				System.setProperty("webdriver.chrome.driver", DriverFactory.getChromeDriverExePath());
//				driver = new ChromeDriver();
//			} else if (browserType.equalsIgnoreCase("firefox")) {
//				System.out.println("Launching Firefox browser");
//				FirefoxOptions firefox_options = new FirefoxOptions();
//				firefox_options.setCapability("marionette", true);
//				System.setProperty("webdriver.gecko.driver", DriverFactory.getGeckoDriverExePath());
//				driver = new FirefoxDriver(firefox_options);
//			}
//		}
//		setWebDriver(driver);
//		getDriver().manage().window().maximize();
//		loginPg = new LoginPage();
//		PageFactory.initElements(getDriver(), loginPg);
//		authenticationPg = new AuthenticationPage();
//		PageFactory.initElements(getDriver(), authenticationPg);
//		securityQuesPg = new SecurityQuestionsPage();
//		PageFactory.initElements(getDriver(), securityQuesPg);
//		homePg = new HomePage();
//		PageFactory.initElements(getDriver(), homePg);
//		bankAccPg = new BankAccountPage();
//		PageFactory.initElements(getDriver(), bankAccPg);
//		addBankAccountPg = new AddBankAccountPage();
//		PageFactory.initElements(getDriver(), addBankAccountPg);
//		bankAccDetpg = new BankAccountDetailsPage();
//		PageFactory.initElements(getDriver(), bankAccDetpg);
//	}

//
//	public static WebDriver getDriver() {
//		return dr.get();
//	}
//
//	public static void setWebDriver(WebDriver driver) {
//		dr.set(driver);
//	}

	public static ExtentTest getExtTest() {
		return exTest.get();
	}

	public void setExtentTest(ExtentTest et) {
		exTest.set(et);
	}

	public void captureScreenshot() {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
		try {
			FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "\\reports\\" + screenshotName));
		} catch (IOException e) {

		}
		getExtTest().log(LogStatus.INFO, " Screen shot--> "
				+ test.addScreenCapture(System.getProperty("user.dir") + "\\reports\\" + screenshotName));
	}

	public void quitWebDriver() {
		driver.quit();
	}
}

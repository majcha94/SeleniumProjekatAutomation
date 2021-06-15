package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Pages.MainNavigationPage;
import Pages.MyAccountPage;
import Pages.MyAddress;
import Pages.MyPersonalInfo;
import Pages.MyWishList;
import Pages.SignInPage;




public class BaseTest {
	WebDriver driver;
	String homeUrl;
	MainNavigationPage mainPage;
	SignInPage signInPage;
	ExcelReader citacIzExcela;
	MyAccountPage myAccountPage;
	MyAddress myAddress;
	MyPersonalInfo myPersonalInfo;
	MyWishList myWishList;
	
	int brojKolona;
	int brojReda;
	
	@BeforeClass
	public void preSvakogTesta() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		homeUrl = "http://automationpractice.com/";
		mainPage = new MainNavigationPage(driver);
		signInPage = new SignInPage(driver);
		myAccountPage = new MyAccountPage(driver);
		myAddress = new MyAddress(driver);
		myPersonalInfo = new MyPersonalInfo(driver);
		myWishList = new MyWishList(driver);
		citacIzExcela = new ExcelReader("data/Test_Plan_Projekat.xlsx");
		
	}
	@AfterClass
	public void posleSvakogTesta() {
		driver.close();
	}

}

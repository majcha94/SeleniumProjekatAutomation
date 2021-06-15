package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {
	WebDriver driver;
	WebElement succsuccessfulLoginLabel;
	WebElement signOutButton;
	WebElement myAddressesButton;
	WebElement myPersonalInfo;

	public MyAccountPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getSuccsuccessfulLoginLabel() {
		return driver.findElement(By.className("info-account"));
	}
	public String assertSuccsuccessfulLoginLabel() {
		return this.getSuccsuccessfulLoginLabel().getText();
		
	}

	public WebElement getSignOutButton() {
		return driver.findElement(By.linkText("Sign out"));
	}
	public void clickOnSingOutButton() {
		this.getSignOutButton().click();
	}

	public WebElement getMyAddressesButton() {
		return driver.findElement(By.linkText("My addresses"));
	}
	public void clickOnMyAddressesButton() {
		this.getMyAddressesButton().click();
	}

	public WebElement getMyPersonalInfo() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[5]/a"));
	}
	public void clickOnMyPersonalInfoButton() {
		this.getMyPersonalInfo().click();
	}
	
	
	
	

}
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyPersonalInfo {
	WebDriver driver;
	WebElement currentPassword;
	WebElement newPassword;
	WebElement confirmation;
	WebElement saveButton;

	public MyPersonalInfo(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getCurrentPassword() {
		return driver.findElement(By.id("old_passwd"));
	}
	public void enterCurrentPassword(String currPassword) {
		this.getCurrentPassword().sendKeys(currPassword);
	}

	public WebElement getNewPassword() {
		return driver.findElement(By.id("passwd"));
	}
	public void enterNewPassword(String newPassword) {
		this.getNewPassword().sendKeys(newPassword);
	}

	public WebElement getConfirmation() {
		return driver.findElement(By.id("confirmation"));
	}
	public void enterConfirmation(String confirmation) {
		this.getConfirmation().sendKeys(confirmation);
	}

	public WebElement getSaveButton() {
		return driver.findElement(By.name("submitIdentity"));
	}
	public void clickOnSaveButton() {
		this.getSaveButton().click();
	}
	
	
}

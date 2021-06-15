package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyWishList {
	WebDriver driver;
	WebElement nameInputField;
	WebElement saveButton;
	WebElement assertLabel;
	WebElement deleteButton;

	public MyWishList(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getNameInputField() {
		return driver.findElement(By.id("name"));
	}
	public void insertListName(String listName) {
		this.getNameInputField().sendKeys(listName);
	}

	public WebElement getSaveButton() {
		return driver.findElement(By.id("submitWishlist"));
	}
	public void clickSaveButton() {
		this.getSaveButton().click();
	}

	public WebElement getAssertLabel() {
		return driver.findElement(By.linkText("lista1"));
	}
	public String assertLabel() {
		return this.getAssertLabel().getText();
	}

	public WebElement getDeleteButton() {
		return driver.findElement(By.xpath("//*[@id=\"wishlist_35314\"]/td[6]/a"));
	}
	public void clickOnDeleteX() {
		this.getDeleteButton().click();
		driver.switchTo().alert().accept();
	}
	

}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAddress {
	WebDriver driver;
	WebElement updateButton;
	WebElement deletButton;
	WebElement addNewAddressButton;
	WebElement address;
	WebElement labelUpdateAddress;
	WebElement saveButton;
	//elements for adding new address
	WebElement city;
	WebElement zipPostalCode;
	WebElement chooseStateDropDown;
	WebElement chooseCountryDropDown;
	WebElement homePhone;
	WebElement mobilePhone;
	WebElement divDisplayed;
	WebElement assignAlias;
	WebElement deleteAddressButton;
	

	public MyAddress(WebDriver driver) {
		super();
		this.driver = driver;
	}


	public WebElement getUpdateButton() {
		return driver.findElement(By.linkText("Update"));
	}
	public void clickOnUpdateButton() {
		this.getUpdateButton().click();
		
	}


	public WebElement getDeletButton() {
		return driver.findElement(By.linkText("Delete"));
	}
	public void clickOnDeleteButton() {
		this.getDeletButton().click();
		
	}


	public WebElement getAddNewAddressButton() {
		return driver.findElement(By.linkText("Add a new address"));
	}
	public void clickAddNewAddressButton() {
		this.getAddNewAddressButton().click();
		
	}


	public WebElement getUAddress() {
		return driver.findElement(By.id("address1"));
	}
	public void enterAddress(String newAddress) {
		this.getUAddress().clear();
		this.getUAddress().sendKeys(newAddress);
		
	}
	
	public WebElement getSaveButton() {
		return driver.findElement(By.id("submitAddress"));
	}
	
	public void clickOnSaveButton() {
		this.getSaveButton().click();
	}

	public WebElement getLabelUpdateAddress() {
		return driver.findElement(By.className("address_address1"));
	}
	public String assertTextLabelUpdateAddress() {
		return this.getLabelUpdateAddress().getText();
	}


	public WebElement getCity() {
		return driver.findElement(By.id("city"));
	}
	public void enterCity(String city) {
		this.getCity().clear();
		this.getCity().sendKeys(city);
	}

	public WebElement getZipPostalCode() {
		return driver.findElement(By.id("postcode"));
	}
	public void enterZiPostalCode(String postalCode) {
		this.getZipPostalCode().clear();
		this.getZipPostalCode().sendKeys(postalCode);
	}

	public WebElement getChooseCountryDropDown() {
		return driver.findElement(By.id("id_country"));
	}

	public void enterCountry() {
		
		this.getChooseCountryDropDown().sendKeys("Unitet States", Keys.ENTER);
	}
	public WebElement getHomePhone() {
		return driver.findElement(By.id("phone"));
	}
	public void enterhomePhone(String homePhone) {
		this.getHomePhone().clear();
		this.getHomePhone().sendKeys(homePhone);
	}

	public WebElement getMobilePhone() {
		return driver.findElement(By.id("phone_mobile"));
	}
	public void enterMobilePhone(String mobilePhone) {
		this.getMobilePhone().clear();
		this.getMobilePhone().sendKeys(mobilePhone);
	}

	public WebElement getChooseStateDropDown() {
		return driver.findElement(By.id("id_state"));
	}
	public void selectState() {
		this.getChooseStateDropDown().sendKeys("Alabama", Keys.ENTER);
	}


	public WebElement getDivDisplayed() {
		return driver.findElement(By.cssSelector(" .alternate_item.box"));
	}


	public WebElement getAssignAlias() {
		return driver.findElement(By.id("alias"));
	}
	public void enterAlias(String alias) {
		this.getAssignAlias().clear();
		this.getAssignAlias().sendKeys(alias);
	}


	public WebElement getDeleteAddressButton() {
		return driver.findElement(By.linkText("Delete"));
	}
	public void clickDeleteButton() {
		this.getDeletButton().click();
		driver.switchTo().alert().accept();
	}

	
	
}

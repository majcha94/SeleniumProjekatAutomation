package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainNavigationPage {
	WebDriver driver;
	WebElement signInNavigationButton;
	WebElement myWishListButton;
	
	public MainNavigationPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getSignInNavigationButton() {
		return driver.findElement(By.linkText("Sign in"));
	}
	public void clickOnButtonSignIn() {
		this.getSignInNavigationButton().click();
	}
	public WebElement getMyWishListButton() {
		return driver.findElement(By.cssSelector(".lnk_wishlist"));
	}
	public void clickOnMyWishListButton() {
		this.getMyWishListButton().click();
	}
	
	
	
	

}
package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;



public class LogInTest extends BaseTest {
	@BeforeMethod
	public void preSvihTesova() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}
	@Test (priority = 0)
	public void logInWIthValidCredential() throws InterruptedException {
		String email = citacIzExcela.getStringData("LOGIN and LOG OUT", 9, 2);
		String password = citacIzExcela.getStringData("LOGIN and LOG OUT", 10, 2);
		logInFormFilling(email, password);
		String acutalText = myAccountPage.assertSuccsuccessfulLoginLabel();
		assertEquals(acutalText, "Welcome to your account. "
				+ "Here you can manage all of your personal information and orders.");
		
	}
	@Test (priority = 1)
	public void logInWithInvalidCredential() throws InterruptedException {
		brojKolona = 3;
		brojReda = 9;
		//int assertCount = 13;
		for (int i = 0; i < 2; i++) {
				String email = citacIzExcela.getStringData("LOGIN and LOG OUT", brojReda, brojKolona);
				Thread.sleep(1000);
				String password = citacIzExcela.getStringData("LOGIN and LOG OUT", brojReda+1, brojKolona);
				logInFormFilling(email, password);
				//String assertText = citacIzExcela.getStringData("LOGIN and LOG OUT", assertCount, brojKolona);
				//String actualText = signInPage.AssertWrongEmailMessage();
				//assertEquals(assertText, "Authentication failed.");
				brojKolona++;
				//assertCount++;
		}
		
	}
	@Test (priority = 2)
	public void logInWithEmtyEmail() throws InterruptedException {
		String email = citacIzExcela.getStringData("LOGIN and LOG OUT", 9, 5);
		String password = citacIzExcela.getStringData("LOGIN and LOG OUT", 10, 5);
		logInFormFilling(email, password);
		String acutalText = signInPage.AssertEmptyEmailMessage();
		String assertText = citacIzExcela.getStringData("LOGIN and LOG OUT", 15, 5);
		assertEquals(assertText,acutalText);
		
	}
	@Test (priority = 3)
	public void logInWithEmtyPassword() throws InterruptedException {
		String email = citacIzExcela.getStringData("LOGIN and LOG OUT", 9, 6);
		String password = citacIzExcela.getStringData("LOGIN and LOG OUT", 10, 6);
		logInFormFilling(email, password);
		String acutalText = signInPage.AssertEmptyPasswordMessage();
		String assertText = citacIzExcela.getStringData("LOGIN and LOG OUT", 15, 6);
		assertEquals(assertText,acutalText);
		
		
	}
	@Test (priority = 4)
	public void logInWithEmtyCredentials() throws InterruptedException {
		String email = citacIzExcela.getStringData("LOGIN and LOG OUT", 9, 7);
		String password = citacIzExcela.getStringData("LOGIN and LOG OUT", 10, 7);
		logInFormFilling(email, password);
		String acutalText = signInPage.EmptyCredentialMessage();
		String assertText = citacIzExcela.getStringData("LOGIN and LOG OUT", 15, 7);
		assertEquals(assertText,acutalText);
		
	}@Test (priority = 5)
	public void logOut() throws InterruptedException {
		logInWIthValidCredential();
		myAccountPage.clickOnSingOutButton();
		assertEquals(true,mainPage.getSignInNavigationButton().isDisplayed());
		
	}
	
	public void logInFormFilling(String email, String password) throws InterruptedException {
		mainPage.clickOnButtonSignIn();
		signInPage.insertEmailAddres(email);
		signInPage.insertPassword(password);
		Thread.sleep(1000);
		signInPage.clickOnSignInButton();
		
	}
	
	@AfterMethod
	public void posleSvihTestova() {		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}

}

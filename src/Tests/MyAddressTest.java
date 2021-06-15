package Tests;

import static org.testng.Assert.assertEquals;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class MyAddressTest extends LogInTest {

	@BeforeMethod
	public void preSvihTesova() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();

	}
	@Test (priority = 2)
	public void uppdateAddress() throws InterruptedException {
		this.logInWIthValidCredential();
		myAccountPage.clickOnMyAddressesButton();
		myAddress.clickOnUpdateButton();
		String address = citacIzExcela.getStringData("MyAddressTest",10, 2);
		String assertionText = citacIzExcela.getStringData("MyAddressTest",10, 2);
		myAddress.enterAddress(address);
		myAddress.clickOnSaveButton();
		String acutalText = myAddress.assertTextLabelUpdateAddress();
		assertEquals(assertionText, acutalText);
		
	}
	@Test (priority = 1)
	public void addAddress() throws InterruptedException {
		
		this.logInWIthValidCredential();
		myAccountPage.clickOnMyAddressesButton();
		myAddress.clickAddNewAddressButton();
		String address = citacIzExcela.getStringData("MyAddressTest",22, 2);
		myAddress.enterAddress(address);
		String city = citacIzExcela.getStringData("MyAddressTest",23, 2);
		myAddress.enterCity(city);
		myAddress.selectState();
		String postalCode = citacIzExcela.getStringData("MyAddressTest",25, 2);
		myAddress.enterZiPostalCode(postalCode);
		myAddress.enterCountry();
		String homePhone = citacIzExcela.getStringData("MyAddressTest",27, 2);
		myAddress.enterhomePhone(homePhone);
		String mobilePhone = citacIzExcela.getStringData("MyAddressTest",28, 2);
		myAddress.enterhomePhone(mobilePhone);
		String alias = citacIzExcela.getStringData("MyAddressTest",29, 2);
		myAddress.enterAlias(alias);
		myAddress.clickOnSaveButton();
		assertEquals(true, myAddress.getDivDisplayed().isDisplayed());
		
	}
	@Test (priority = 0)
	public void deleteAddress() throws InterruptedException {
		this.logInWIthValidCredential();
		myAccountPage.clickOnMyAddressesButton();
		myAddress.clickDeleteButton();	
		assertEquals(false, myAddress.getDivDisplayed().isDisplayed());
	}
	

	

}

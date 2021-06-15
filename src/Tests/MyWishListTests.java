package Tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyWishListTests extends LogInTest{
	@BeforeMethod
	public void preSvihTesova() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}
	@Test (priority = 5)
	public void addWishList() throws InterruptedException {
		this.logInWIthValidCredential();
		String listName = citacIzExcela.getStringData("My_Wishlist", 9, 2);
		myWishList.insertListName(listName);
		myWishList.clickSaveButton();
		String assertLabel = myWishList.assertLabel();
		assertEquals(listName, assertLabel);
		
	}
	@Test (priority = 0)
	public void addingMultipleWishLists() throws InterruptedException {
		this.logInWIthValidCredential();
		brojKolona = 2;

		for (int i = 0; i < 4; i++) {
			String listName = citacIzExcela.getStringData("My_Wishlist", 26, brojKolona);
				myWishList.insertListName(listName);
				Thread.sleep(500);
				myWishList.clickSaveButton();
				brojKolona++;

		}
		
	}
	
	@AfterMethod
	public void posleSvihTestova() {		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}

}

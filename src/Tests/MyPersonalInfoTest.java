package Tests;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyPersonalInfoTest extends LogInTest{

	@BeforeMethod
	public void preSvihTesova() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();

	}
	@Test (priority = 0)
	public void editMyPersonalInformation() throws InterruptedException {
		this.logInWIthValidCredential();
		myAccountPage.clickOnMyPersonalInfoButton();

		String currentPassword = citacIzExcela.getStringData("My_Personal_Info",9, 2);
		myPersonalInfo.enterCurrentPassword(currentPassword);
		String newPassword = citacIzExcela.getStringData("My_Personal_Info",10, 2);
		myPersonalInfo.enterNewPassword(newPassword);
		String confirmNewPassword = citacIzExcela.getStringData("My_Personal_Info",11, 2);
		myPersonalInfo.enterConfirmation(confirmNewPassword);
		myPersonalInfo.clickOnSaveButton();
		
	}
	
	
	
}

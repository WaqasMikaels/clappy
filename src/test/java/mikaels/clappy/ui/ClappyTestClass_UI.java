package mikaels.clappy.ui;

import junit.framework.Assert;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;
import java.util.TreeMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import org.testng.internal.Yaml;

import mikaels.clappy.baseclass.BaseUi;

public class ClappyTestClass_UI extends BaseUi {
	WebDriver driver;
	

	public ClappyTestClass_UI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(css = "[id = 'email']")
	private WebElement txtEmail;
	
	@FindBy(css = "[id = 'password']")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//html/body/div/div/div/div/form/div[4]/button")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//*[@id=\"left-col\"]/ul/a[2]/li")
	private WebElement menuAdminManagement;
	
	@FindBy(xpath = "//*[@id=\"left-col\"]/ul/a[3]/li")
	private WebElement menuClientManagement;
	
	@FindBy(xpath = "//*[@id=\"left-col\"]/ul/a[4]/li")
	private WebElement menuModulesManagement;
	
	@FindBy(xpath = "//*[@id=\"left-col\"]/ul/a[5]/li")
	private WebElement menuSystemSettings;
	
	@FindBy(css = "[id = 'newAdminBtn']")
	private WebElement btnNewAdmin;
	
	@FindBy(xpath = "//*[@id=\"right-col\"]/table/thead/tr/th[1]")
	private WebElement colIdAM;
	
	@FindBy(xpath = "//*[@id=\"right-col\"]/table/thead/tr/th[2]")
	private WebElement colFullNameAM;
	
	@FindBy(xpath = "//*[@id=\"right-col\"]/table/thead/tr/th[3]")
	private WebElement colEmailAddressAM;
	
	@FindBy(xpath = "//*[@id=\"right-col\"]/table/thead/tr/th[4]")
	private WebElement colStateAM;
	
	@FindBy(css = "[class = 'admin_checkbox']")
	private WebElement chkbxStateAM;
	
	@FindBy(xpath = "//*[@id=\"append-users-here\"]/tr[1]/td[5]/a/button")
	private WebElement btnEditAdminAM;
	
	@FindBy(xpath = "//*[@id=\"append-users-here\"]/tr[1]/td[5]/button")
	private WebElement btnDeleteAdminAM;
	
	@FindBy(css = "[id = 'fullName']")
	private WebElement txtAdminFullNameAM;
	
	@FindBy(css = "[id = 'email']")
	private WebElement txtAdminEmailAM;
	
	@FindBy(css = "[id = 'pwd']")
	private WebElement txtAdminPwdAM;
	
	@FindBy(xpath = "//*[@id=\"right-col\"]/div/div/form/button")
	private WebElement btnCreateAdmin;
	
	@FindBy(css = "[class = 'alert alert-success']")
	private WebElement msgCreateAdminSuccess;
	
	@FindBy(css = "[id = 'newAdminBtn']")
	private WebElement btnNewClient;
	
	@FindBy(xpath = "//*[@id=\"right-col\"]/table/thead/tr/th[1]")
	private WebElement colIdCM;
	
	@FindBy(xpath = "//*[@id=\"right-col\"]/table/thead/tr/th[2]")
	private WebElement colFullNameCM;
	
	@FindBy(xpath = "//*[@id=\"right-col\"]/table/thead/tr/th[3]")
	private WebElement colEmailAddressCM;
	
	@FindBy(xpath = "//*[@id=\"right-col\"]/table/thead/tr/th[4]")
	private WebElement colSubDomainCM;
	
	@FindBy(xpath = "//*[@id=\"right-col\"]/table/thead/tr/th[5]")
	private WebElement colStateCM;
	
	@FindBy(css = "[class = 'client_checkbox']")
	private WebElement chkbxStateCM;
	
	@FindBy(xpath = "//*[@id=\"append-users-here\"]/tr[1]/td[6]/a[1]/button")
	private WebElement btnLoginCM;
	
	@FindBy(xpath = "//*[@id=\"append-users-here\"]/tr[1]/td[6]/a[2]/button")
	private WebElement btnEditClientCM;
	
	@FindBy(xpath = "//*[@id=\"append-users-here\"]/tr[1]/td[6]/button")
	private WebElement btnDeleteClientCM;
	
	@FindBy(css = "[id = 'fullName']")
	private WebElement txtAdminFullNameCM;
	
	@FindBy(css = "[id = 'email']")
	private WebElement txtAdminEmailCM;
	
	@FindBy(css = "[id = 'pwd']")
	private WebElement txtAdminPwdCM;
	
	@FindBy(xpath = "//*[@id=\"right-col\"]/div/div/form/button")
	private WebElement btnCreateClient;
	
	@FindBy(css = "[class = 'alert alert-success']")
	private WebElement msgCreateClientSuccess;
	
	@FindBy(xpath = "//*[@id=\"right-col\"]/table/thead/tr/th[1]")
	private WebElement colIdMM;
	
	@FindBy(xpath = "//*[@id=\"right-col\"]/table/thead/tr/th[2]")
	private WebElement colModuleNameMM;
	
	@FindBy(xpath = "//*[@id=\"right-col\"]/table/thead/tr/th[3]")
	private WebElement colStateMM;
	
	@FindBy(xpath = "//*[@id=\"append-users-here\"]/tr[1]/td[2]")
	private WebElement modulePoll;
	
	@FindBy(xpath = "//*[@id=\"append-users-here\"]/tr[2]/td[2]")
	private WebElement moduleAnimateReactions;
	
	@FindBy(xpath = "//*[@id=\"append-users-here\"]/tr[3]/td[2]")
	private WebElement moduleCommenting;
	
	@FindBy(xpath = "//*[@id=\"append-users-here\"]/tr[4]/td[2]")
	private WebElement modulePaidVoting;
	
	@FindBy(xpath = "//*[@id=\"append-users-here\"]/tr[5]/td[2]")
	private WebElement moduleBannerAds;
	
	@FindBy(xpath = "//*[@id=\"append-users-here\"]/tr[6]/td[2]")
	private WebElement moduleConvertBrandedInteration;
	
	
	
	public void CheckClappyTitle() {
		Assert.assertEquals("Frank.ai", driver.getTitle()); 
		// OR
		// isElementDisplayed(googleTitle);
	}
	
	public void EnterEmailAddress() {
		hardwait(5);
		txtEmail.sendKeys("admin1@clappy.com");
		hardwait(1);
	}
	
	public void EnterPassword() {
		txtPassword.sendKeys("12345678");
		hardwait(1);
	}
	
	public void ClickLogin() {
		btnLogin.click();
		hardwait(5);
	}
	
	public void VerifyLogin() {
		String lnkDashboard = driver.getCurrentUrl();
		assertEquals(lnkDashboard, "http://stage.clappy.live/admin/dashboard");
		hardwait(1);
	}
	
	public void ClickOnAdminManagement() {
		menuAdminManagement.click();
		hardwait(2);
	}
	
	public void VerifyRedirectionToAdminManagement() {
		String lnkAdminManagement = driver.getCurrentUrl();
		assertEquals(lnkAdminManagement, "http://stage.clappy.live/admin/all");
		hardwait(1);
	}
	
	public void VerifyAdminManagementElements() {
		isElementDisplayed(btnNewAdmin);
		isElementDisplayed(colIdAM);
		isElementDisplayed(colFullNameAM);
		isElementDisplayed(colEmailAddressAM);
		isElementDisplayed(colStateAM);
		isElementDisplayed(chkbxStateAM);
		isElementDisplayed(btnEditAdminAM);
		isElementDisplayed(btnDeleteAdminAM);
	}
	
	public void ClickNewAdminButton() {
		btnNewAdmin.click();
		hardwait(3);
	}
	
	public void VerifyRedirectionToCreateAdminForm() {
		String lnkCreateAdminForm = driver.getCurrentUrl();
		assertEquals(lnkCreateAdminForm, "http://stage.clappy.live/admin/user/add");
		hardwait(1);
	}
	
	public void FillCreateAdminForm() {
		txtAdminFullNameAM.sendKeys("AutoAdmin");
		txtAdminEmailAM.sendKeys("autoadmin"+currentDate()+"@clappy.com");
		hardwait(1);
		txtAdminPwdAM.sendKeys("12345678");
	}
	
	public void ClickCreateAdminButton() {
		btnCreateAdmin.click();
		hardwait(5);
	}
	
	public void VerifyCreateAdminSuccessMessage() {
		isElementDisplayed(msgCreateAdminSuccess);
	}
	
	public void ClickOnClientManagement() {
		menuClientManagement.click();
		hardwait(2);
	}

	public void VerifyRedirectionToClientManagement() {
		String lnkClientManagement = driver.getCurrentUrl();
		assertEquals(lnkClientManagement, "http://stage.clappy.live/admin/clients");
		hardwait(1);
	}
	
	public void VerifyClientManagementElements() {
		isElementDisplayed(btnNewClient);
		isElementDisplayed(colIdCM);
		isElementDisplayed(colFullNameCM);
		isElementDisplayed(colEmailAddressCM);
		isElementDisplayed(colSubDomainCM);
		isElementDisplayed(colStateCM);
		isElementDisplayed(chkbxStateCM);
		isElementDisplayed(btnLoginCM);
		isElementDisplayed(btnEditClientCM);
		isElementDisplayed(btnDeleteClientCM);
	}
	
	public void ClickNewClientButton() {
		btnNewClient.click();
		hardwait(3);
	}
	
	public void VerifyRedirectionToCreateClientForm() {
		String lnkCreateClientForm = driver.getCurrentUrl();
		assertEquals(lnkCreateClientForm, "http://stage.clappy.live/admin/client/add");
		hardwait(1);
	}
	
	public void FillCreateClientForm() {
		txtAdminFullNameCM.sendKeys("AutoClient");
		txtAdminEmailCM.sendKeys("autoclient"+currentDate()+"@clappy.com");
		hardwait(1);
		txtAdminPwdCM.sendKeys("12345678");
	}
	
	public void ClickCreateClientButton() {
		btnCreateClient.click();
		hardwait(5);
	}
	
	public void VerifyCreateClientSuccessMessage() {
		isElementDisplayed(msgCreateAdminSuccess);
	}
	
	public void ClickOnModuleManagement() {
		menuModulesManagement.click();
		hardwait(2);
	}
	
	public void VerifyRedirectionToModulesManagement() {
		String lnkModulesManagement = driver.getCurrentUrl();
		assertEquals(lnkModulesManagement, "http://stage.clappy.live/admin/modules");
		hardwait(1);
	}
	
	public void VerifyModuleManagementElements() {
		isElementDisplayed(colIdMM);
		isElementDisplayed(colModuleNameMM);
		isElementDisplayed(colStateMM);
	}
	
	public void VerifyModuleManagementModules() {
		isElementDisplayed(modulePoll);
		isElementDisplayed(moduleAnimateReactions);
		isElementDisplayed(moduleCommenting);
		isElementDisplayed(modulePaidVoting);
		isElementDisplayed(moduleBannerAds);
		isElementDisplayed(moduleConvertBrandedInteration);
	}
	
	
	
	/*public void CheckFooterCountryName() {
		isElementDisplayed(countryName);
		String footerCountryName = countryName.getText();
		if (footerCountryName.contentEquals("Pakistan")) {
			System.out.println("Country Name found");
		 
		}else {
			System.out.println("Country Name not found");
			
		}
	}*/
	
	
}

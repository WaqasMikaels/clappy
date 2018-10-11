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

public class CreateEpisode_UI extends BaseUi {
	WebDriver driver;
	

	public CreateEpisode_UI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(css = "[id = 'email']")
	private WebElement txtEmail;
	
	@FindBy(css = "[id = 'password']")
	private WebElement txtPassword;
	
	@FindBy(xpath = "/html/body/div/div/div/div/form/div[5]/button")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//*[@id=\"left-col\"]/ul/a[2]/li")
	private WebElement menuAdminManagement;
	
	@FindBy(xpath = "//*[@id=\"left-col\"]/ul/a[4]/li")
	private WebElement menuLiveAndUpcomingEpisode;
	
	@FindBy(xpath = "//*[@id=\"left-col\"]/ul/a[4]/li")
	private WebElement menuModulesManagement;
	
	@FindBy(xpath = "//*[@id=\"left-col\"]/ul/a[5]/li")
	private WebElement menuSystemSettings;
	
	@FindBy(css = "[id = 'newAdminBtn']")
	private WebElement btnNewEpisode;
	
	@FindBy(xpath = "//*[@id=\"main-admin-datatable\"]/thead/tr/th[1]")
	private WebElement colSNoShow;
	
	@FindBy(xpath = "//*[@id=\"main-admin-datatable\"]/thead/tr/th[2]")
	private WebElement colShowName;
	
	@FindBy(xpath = "//*[@id=\"main-admin-datatable\"]/thead/tr/th[3]")
	private WebElement colEpisodes;
	
	@FindBy(xpath = "//*[@id=\"main-admin-datatable\"]/thead/tr/th[4]")
	private WebElement colDateLive;
	
	@FindBy(xpath = "//*[@id=\"main-admin-datatable\"]/thead/tr/th[5]")
	private WebElement colLiveOffline;
	
	@FindBy(xpath = "//*[@id=\"main-admin-datatable\"]/thead/tr/th[6]")
	private WebElement colStatus;
	
	@FindBy(xpath = "//*[@id=\"append-users-here\"]/tr[1]/td[7]/a[1]/button")
	private WebElement btnPublishModules;
	
	@FindBy(css = "[id = 'edit_button']")
	private WebElement btnEditEpisode;
	
	@FindBy(xpath = "//*[@id=\"append-users-here\"]/tr[1]/td[7]/button")
	private WebElement btnDeleteEpisode;
	
	@FindBy(css = "[id = 'imgInp3']")
	private WebElement uploadImageEpisode;
	
	@FindBy(xpath = "//*[@id=\"add-validate-form\"]/div[2]/div[1]/div[1]/div/select")
	private WebElement drdSelectShow;
	
	@FindBy(xpath = "//*[@id=\"add-validate-form\"]/div[2]/div[1]/div[1]/div/select/option[2]")
	private WebElement drdValue;
	
	@FindBy(css = "[id = 'projectName']")
	private WebElement txtEpisodeName;
	
	@FindBy(css = "[id = 'projectDescription']")
	private WebElement txtEpisodeDescription;
	
	@FindBy(xpath = "//*[@id=\"add-validate-form\"]/div[3]/div/button")
	private WebElement btnSaveEpisode;
	
	@FindBy(xpath = "//*[@id=\"add-validate-form\"]/div[3]/div/button")
	private WebElement btnCreateEpisode;
	
	@FindBy(css = "[class = 'close']")
	private WebElement btnCloseSuccessPopup;
	
	
	
	
	public void CheckClappyTitle() {
		Assert.assertEquals("Frank.ai", driver.getTitle()); 
		// OR
		// isElementDisplayed(googleTitle);
	}
	
	public void EnterEmailAddress() {
		hardwait(5);
		txtEmail.sendKeys("akbar55831@gmail.com");
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
		assertEquals(lnkDashboard, "http://stage.clappy.live/client/dashboard");
		hardwait(1);
	}
	
	public void ClickOnLiveAndUpcomingEpisodes() {
		menuLiveAndUpcomingEpisode.click();
		hardwait(2);
	}

	public void VerifyRedirectionToLiveAndUpcomingEpisodes() {
		String lnkLiveAndUpcomingEpisodes = driver.getCurrentUrl();
		assertEquals(lnkLiveAndUpcomingEpisodes, "http://stage.clappy.live/client/projects/all");
		hardwait(1);
	}
	
	public void VerifyLiveAndUpcomingEpisodesElements() {
		isElementDisplayed(btnNewEpisode);
		isElementDisplayed(colSNoShow);
		isElementDisplayed(colShowName);
		isElementDisplayed(colEpisodes);
		isElementDisplayed(colDateLive);
		isElementDisplayed(colLiveOffline);
		isElementDisplayed(colStatus);
		isElementDisplayed(btnPublishModules);
		isElementDisplayed(btnEditEpisode);
		isElementDisplayed(btnDeleteEpisode);
	}
	
	public void ClickNewEpisodeButton() {
		btnNewEpisode.click();
		hardwait(3);
	}
	
	public void VerifyRedirectionToCreateNewEpisodeForm() {
		String lnkCreateNewEpisodeForm = driver.getCurrentUrl();
		assertEquals(lnkCreateNewEpisodeForm, "http://stage.clappy.live/client/projects/add");
		hardwait(1);
	}
	
	public void FillCreateEpisodeForm() throws IOException {
		uploadImageEpisode.click();
		hardwait(3);
		Runtime.getRuntime().exec("C:\\workspace\\clappy\\imageUploadEpisode.exe");
		hardwait(5);
		drdSelectShow.click();
		hardwait(2);
		drdValue.click();
		hardwait(1);
		txtEpisodeName.sendKeys("Auto Epi" +currentDate());
		txtEpisodeDescription.sendKeys("This is the description of episode");
		hardwait(1);
		
	}
	
	public void ClickCreateEpisodeButton() {
		btnCreateEpisode.click();
	}
	
	public void CloseSuccessPopup() {
		_clickOnExpectedPopUp();
		btnCloseSuccessPopup.click();
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

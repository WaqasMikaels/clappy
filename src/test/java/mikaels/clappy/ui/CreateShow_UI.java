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

public class CreateShow_UI extends BaseUi {
	WebDriver driver;
	

	public CreateShow_UI(WebDriver driver) {
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
	
	@FindBy(xpath = "//*[@id=\"left-col\"]/ul/a[3]/li")
	private WebElement menuShowLiabrary;
	
	@FindBy(xpath = "//*[@id=\"left-col\"]/ul/a[4]/li")
	private WebElement menuModulesManagement;
	
	@FindBy(xpath = "//*[@id=\"left-col\"]/ul/a[5]/li")
	private WebElement menuSystemSettings;
	
	@FindBy(css = "[id = 'newAdminBtn']")
	private WebElement btnNewShow;
	
	@FindBy(xpath = "//*[@id=\"main-admin-datatable\"]/thead/tr/th[1]")
	private WebElement colSNoShow;
	
	@FindBy(xpath = "//*[@id=\"main-admin-datatable\"]/thead/tr/th[2]")
	private WebElement colShowName;
	
	@FindBy(xpath = "//*[@id=\"main-admin-datatable\"]/thead/tr/th[3]")
	private WebElement colDescription;
	
	@FindBy(xpath = "//*[@id=\"main-admin-datatable\"]/thead/tr/th[4]")
	private WebElement colEpisodes;
	
	@FindBy(xpath = "//*[@id=\"main-admin-datatable\"]/thead/tr/th[5]")
	private WebElement colNextLive;
	
	@FindBy(xpath = "//*[@id=\"append-users-here\"]/tr[1]/td[6]/a[1]/button")
	private WebElement btnEpisodes;
	
	@FindBy(xpath = "//*[@id=\"append-users-here\"]/tr[1]/td[6]/a[2]/button")
	private WebElement btnDetails;
	
	@FindBy(xpath = "//*[@id=\"append-users-here\"]/tr[1]/td[6]/button")
	private WebElement btnDeleteShow;
	
	@FindBy(css = "[id = 'tvShowName']")
	private WebElement txtTvShowName;
	
	@FindBy(css = "[id = 'tvShowDescription']")
	private WebElement txtTvShowDescription;
	
	@FindBy(xpath = "//*[@id=\"right-col\"]/div/form/div[3]/button")
	private WebElement btnCreateShow;
	
	@FindBy(css = "[class = 'alert alert-success']")
	private WebElement msgCreateCreateTVShowSuccess;
	
	
	
	
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
	
	public void ClickOnShowLiabrary() {
		menuShowLiabrary.click();
		hardwait(2);
	}

	public void VerifyRedirectionToShowLiabrary() {
		String lnkShowLiabrary = driver.getCurrentUrl();
		assertEquals(lnkShowLiabrary, "http://stage.clappy.live/client/tvshows/all");
		hardwait(1);
	}
	
	public void VerifyShowLiabraryElements() {
		isElementDisplayed(btnNewShow);
		isElementDisplayed(colSNoShow);
		isElementDisplayed(colShowName);
		isElementDisplayed(colDescription);
		isElementDisplayed(colEpisodes);
		isElementDisplayed(colNextLive);
		isElementDisplayed(btnEpisodes);
		isElementDisplayed(btnDetails);
		isElementDisplayed(btnDeleteShow);
	}
	
	public void ClickNewShowButton() {
		btnNewShow.click();
		hardwait(3);
	}
	
	public void VerifyRedirectionToCreateNewShowForm() {
		String lnkCreateNewShowForm = driver.getCurrentUrl();
		assertEquals(lnkCreateNewShowForm, "http://stage.clappy.live/client/tvshows/add");
		hardwait(1);
	}
	
	public void FillCreateShowForm() {
		txtTvShowName.sendKeys("AutoShow"+currentDate());
		txtTvShowDescription.sendKeys("This show will be consist of n episodes");
		hardwait(1);
		
	}
	
	public void ClickCreateShowButton() {
		btnCreateShow.click();
		hardwait(5);
	}
	
	public void VerifyCreateShowSuccessMessage() {
		isElementDisplayed(msgCreateCreateTVShowSuccess);
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

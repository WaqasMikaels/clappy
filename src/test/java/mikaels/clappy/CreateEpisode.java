package mikaels.clappy;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import mikaels.clappy.baseclass.BaseUi;
import mikaels.clappy.resources.DSLLibDesktop;

public class CreateEpisode {
	mikaels.clappy.resources.DSLLibDesktop dsl;
	  //public String xPath = "D:/Excels/MyExcel.xls";
	  //public String xPath = "D:/Excels/MyFirstExcel.xlsx";
	  //public String xlPath_Res = "D:/Excels/userStatuses.xlsx";
	  //public static String XData[][];
	  //public String xlData[][];
	  

	  @BeforeClass
	  public void beforeClass() throws Exception {
		  	dsl = new DSLLibDesktop();
			//dsl.launchCubixCo();
		  	//dsl.launchGoogle();
		  	//dsl.xlRead(xPath);
		  	//dsl.launchFrank();
		  	dsl.launchClappy();
	  }
	  
	  @Test
	  public void Test01_Fill_Login_Credentials() {
		  dsl.createepisode.EnterEmailAddress();
		  dsl.createepisode.EnterPassword();
	  }
	  
	  @Test
	  public void Test02_Click_Login_Button() {
		  dsl.createepisode.ClickLogin();
	  }
	  
	  @Test
	  public void Test03_Verify_Login() {
		  dsl.createepisode.VerifyLogin();		  
	  }
	  
	  @Test
	  public void Test04_Redirect_To_LiveAndUpcoming_Episodes() {
		  dsl.createepisode.ClickOnLiveAndUpcomingEpisodes();
	  }
	  
	  @Test
	  public void Test05_Verify_Redirection_To_Episodes_Listing() {
		  dsl.createepisode.VerifyRedirectionToLiveAndUpcomingEpisodes();		  
	  }
	  
	  @Test
	  public void Test06_Verify_Episode_Listing_Elements() {
		  dsl.createepisode.VerifyLiveAndUpcomingEpisodesElements();
	  }
	  
	  @Test
	  public void Test07_Create_New_Episode() {
		  dsl.createepisode.ClickNewEpisodeButton();
	  }
	  
	  @Test
	  public void Test08_Verify_Redirection_To_Create_New_Episode() {
		  dsl.createepisode.VerifyRedirectionToCreateNewEpisodeForm();		  
	  }
	  
	  @Test
	  public void Test09_Fill_Create_Episode_Form() throws IOException {
		  dsl.createepisode.FillCreateEpisodeForm();		  
	  }
	  
	  @Test
	  public void Test10_Click_Create_Episode() {
		  dsl.createepisode.ClickCreateEpisodeButton();
	  }
	  
	  @Test
	  public void Test11_Verify_Create_Show_Success_Message() {
		  dsl.createshow.VerifyCreateShowSuccessMessage();
	  }
	 
	  @AfterClass
	  public void afterClass() throws Exception {
		  dsl.closeBrowser();
		  //xlwrite(xlPath_Res, XData);//Writes the results
		  //BaseUi.xlwrite(xlPath_Res, XData);
		  
	  }
}

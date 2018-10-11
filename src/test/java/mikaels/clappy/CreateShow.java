package mikaels.clappy;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import mikaels.clappy.baseclass.BaseUi;
import mikaels.clappy.resources.DSLLibDesktop;

public class CreateShow {
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
		  dsl.createshow.EnterEmailAddress();
		  dsl.createshow.EnterPassword();
	  }
	  
	  @Test
	  public void Test02_Click_Login_Button() {
		  dsl.createshow.ClickLogin();
	  }
	  
	  @Test
	  public void Test03_Verify_Login() {
		  dsl.createshow.VerifyLogin();		  
	  }
	  
	  @Test
	  public void Test04_Redirect_To_Show_Liabrary() {
		  dsl.createshow.ClickOnShowLiabrary();
	  }
	  
	  @Test
	  public void Test05_Verify_Redirection_To_Show_Liabrary() {
		  dsl.createshow.VerifyRedirectionToShowLiabrary();		  
	  }
	  
	  @Test
	  public void Test06_Verify_Show_Liabrary_Elements() {
		  dsl.createshow.VerifyShowLiabraryElements();
	  }
	  
	  @Test
	  public void Test07_Create_New_Show() {
		  dsl.createshow.ClickNewShowButton();
	  }
	  
	  @Test
	  public void Test08_Verify_Redirection_To_Create_New_Show() {
		  dsl.createshow.VerifyRedirectionToCreateNewShowForm();		  
	  }
	  
	  @Test
	  public void Test09_Fill_Create_Show_Form() {
		  dsl.createshow.FillCreateShowForm();		  
	  }
	  
	  @Test
	  public void Test10_Click_Create_Show() {
		  dsl.createshow.ClickCreateShowButton();
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

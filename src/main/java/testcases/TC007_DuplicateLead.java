package testcases;

	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import pages.LoginPage;
	import wdMethods.ProjectMethods;

	public class TC007_DuplicateLead extends ProjectMethods{
		@BeforeTest
		public void setData() {
			testCaseName="TC007_DuplicateLead";
			testDescription="Duplicate a Lead & verify";
			testNodes="Leads";
			category="Smoke";
			authors="Gayathri";
			browserName="chrome";
			dataSheetName="TC007";
		}	
		
		@Test(dataProvider="fetchData")
		public void EditLead(String uName,String pwd,String email,String vFirstName) {
			/*LoginPage lp = new LoginPage();
			lp.enterUserName();
			lp.enterPassword();
			lp.clickLogIn();*/
			
			new LoginPage()
			.enterUserName(uName)
			.enterPassword(pwd)
			.clickLogIn()
			.clickCRM()
			.clickLeads()
			.clickFindLeads()
			.clickEmailTab()
			.enterEmail(email)
			.clickSubmit()
			.clickFirstId()
			.clickDuplicate()
			.clickCreateLead()
			.verifyExactTextofFirstName(vFirstName)
				
			;
			
		
				
			
		}

	}
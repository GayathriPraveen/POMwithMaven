package testcases;

	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import pages.LoginPage;
	import wdMethods.ProjectMethods;

	public class TC004_EditLead extends ProjectMethods{
		@BeforeTest
		public void setData() {
			testCaseName="TC_004_EditLead";
			testDescription="Editing Lead & verifying";
			testNodes="Leads";
			category="Smoke";
			authors="Gayathri";
			browserName="chrome";
			dataSheetName="TC004";
		}	
		
		@Test(dataProvider="fetchData")
		public void EditLead(String uName,String pwd,String fname,String cName,String vCompanyName) {
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
			.enterFirstName(fname)
			.clickSubmit()
			.clickFirstId()
			.clickEdit()
			.updateCompanyName(cName)
			.clickUpdate()
			.verifyPartialTextofCompanyName(vCompanyName)
			;
			
		
				
			
		}

	}
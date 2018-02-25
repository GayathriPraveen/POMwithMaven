package testcases;

	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import pages.LoginPage;
	import wdMethods.ProjectMethods;

	public class TC006_DeleteLead extends ProjectMethods{
		@BeforeTest
		public void setData() {
			testCaseName="TC006_DeleteLead";
			testDescription="Delete a Lead & verify";
			testNodes="Leads";
			category="Smoke";
			authors="Gayathri";
			browserName="chrome";
			dataSheetName="TC006";
		}	
		
		@Test(dataProvider="fetchData")
		public void EditLead(String uName,String pwd,String phoneNum) {
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
			.clickPhoneTab()
			.enterPhoneNum(phoneNum)
			.clickSubmit()
			.capturedLead()
			.clickFirstId()
			.clickDelete()
			.clickFindLeads()
			
			.enterLeadId()
			.clickSubmit()
			.verifypartialDispalyedText()
			
			;
		}

	}
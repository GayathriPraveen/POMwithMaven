package testcases;

	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import pages.LoginPage;
	import wdMethods.ProjectMethods;

	public class TC005_MergeLead extends ProjectMethods{
		@BeforeTest
		public void setData() {
			testCaseName="TC_005_MergeLead";
			testDescription="Merging two Lead & verifying";
			testNodes="Leads";
			category="Smoke";
			authors="Gayathri";
			browserName="chrome";
			dataSheetName="TC005";
		}	
		
		@Test(dataProvider="fetchData")
		public void EditLead(String uName,String pwd,String ffname,String tfname) {
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
			.clickMergeLeads()
			.clickFromIdIcon()
	        .enterFirstNameforFromId(ffname)
	        
	        .clickFind()
	        .capturedLead()
			.clickFirstId()
			.clickToIdIcon()
			
			.enterFirstNameforToId(tfname)
			.clickFind()
			.clickFirstId()
			
			.clickMerge()
            .clickFindLeads()
			
			.enterLeadId()
			.clickSubmit()
			.verifypartialDispalyedText()
			
			;
			
		
				
			
		}

	}
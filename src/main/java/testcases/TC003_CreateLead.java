package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Creating Lead & verifying";
		testNodes="Leads";
		category="Smoke";
		authors="Sruthi";
		browserName="chrome";
		dataSheetName="TC003";
	}	
	
	@Test(dataProvider="fetchData")
	public void CreateLead(String uName,String pwd,String cName,String fName,String lName,String vCName) {
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
		.clickCreateLeads()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickSubmit()
		;	
		
	}

}

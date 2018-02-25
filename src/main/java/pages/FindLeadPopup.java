package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadPopup extends ProjectMethods{
	
	public FindLeadPopup() {
		PageFactory.initElements(driver,this);
	}	
	

	@FindBy(how=How.XPATH,using="(//label[text()='Lead ID:']/following::input)[2]")
	private WebElement eleFirstNameforFromId;
	
	public FindLeadPopup enterFirstNameforFromId(String ffname) {
		//WebElement eleUserName = locateElement("username");
		type(eleFirstNameforFromId, ffname);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleCaptured;
	public FindLeadPopup capturedLead() {
		 leadID = getText(eleCaptured);
		 System.out.println(leadID);
		return this;
	}
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement elesubmit;
	
	public FindLeadPopup clickFind() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(elesubmit);
		/*HomePage hp = new HomePage();
		return hp;*/
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//label[text()='Lead ID:']/following::input)[2]")
	private WebElement eleFirstNameforToId;
	
	public FindLeadPopup enterFirstNameforToId(String tfname) {
		//WebElement eleUserName = locateElement("username");
		type(eleFirstNameforToId, tfname);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-form-element']//input[@name='id']")
	private WebElement eleLeadid;
	
	public FindLeadsPage enterLeadId() {
		//WebElement eleUserName = locateElement("username");
		type(eleLeadid, leadID);
		return new FindLeadsPage();
	}
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleFirstId;
	
	public MergeLeadsPage clickFirstId() {
		//WebElement eleUserName = locateElement("username");
		clickWithNoSnap(eleFirstId);
		switchToWindow(0);
		return new MergeLeadsPage();
	}


}
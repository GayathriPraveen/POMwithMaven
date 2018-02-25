package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadPage extends ProjectMethods{
	
	public MyLeadPage() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement elecreateleads;
	
	public CreateLeadPage clickCreateLeads() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(elecreateleads);
		/*HomePage hp = new HomePage();
		return hp;*/
		return new CreateLeadPage();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement elefindleads;
	
	public FindLeadsPage clickFindLeads() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(elefindleads);
		/*HomePage hp = new HomePage();
		return hp;*/
		return new FindLeadsPage();
	}
	public FindLeadPopup clickFindLeads1() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(elefindleads);
		/*HomePage hp = new HomePage();
		return hp;*/
		return new FindLeadPopup();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement elemergeleads;
	
	public MergeLeadsPage clickMergeLeads() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(elemergeleads);
		/*HomePage hp = new HomePage();
		return hp;*/
		return new MergeLeadsPage();
	}

}

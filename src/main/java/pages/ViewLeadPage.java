package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{

	public ViewLeadPage() {
		PageFactory.initElements(driver,this);
	}


	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleverifyCName;

	public ViewLeadPage verifyCompanyName(String data) {
		verifyPartialText(eleverifyCName, data);
		return this;		
	}

	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleEdit;

	public opentapsCRM clickEdit() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleEdit);
		/*HomePage hp = new HomePage();
			return hp;*/
		return new opentapsCRM();
	}

	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleDuplicate;

	public DuplicateLeadPage clickDuplicate() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleDuplicate);
		/*HomePage hp = new HomePage();
			return hp;*/
		return new DuplicateLeadPage();
	}

	@FindBy(how=How.CLASS_NAME,using="subMenuButtonDangerous")
	private WebElement eleDelete;

	public MyLeadPage clickDelete() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleDelete);
		/*HomePage hp = new HomePage();
			return hp;*/
		return new MyLeadPage();
	}

	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement elepartCompanyName;

	public ViewLeadPage verifyPartialTextofCompanyName(String vCompanyName) {
		verifyPartialText(elepartCompanyName, vCompanyName);
		return this;		
	}
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleextactFirstName;

	public ViewLeadPage verifyExactTextofFirstName(String vFirstName) {
		verifyExactText(eleextactFirstName, vFirstName);
		return this;		
	}
	

}
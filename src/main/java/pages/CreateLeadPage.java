package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage() {
		PageFactory.initElements(driver,this);
	}	
	

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	public CreateLeadPage enterCompanyName(String data) {
		//WebElement eleUserName = locateElement("username");
		type(eleCompanyName, data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	public CreateLeadPage enterFirstName(String data) {
		//WebElement elePassword = locateElement("password");
		type(eleFirstName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	public CreateLeadPage enterLastName(String data) {
		//WebElement elePassword = locateElement("password");
		type(eleLastName, data);
		return this;
	}	

	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement elesubmit;
	
	public ViewLeadPage clickSubmit() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(elesubmit);
		/*HomePage hp = new HomePage();
		return hp;*/
		return new ViewLeadPage();
	}
}
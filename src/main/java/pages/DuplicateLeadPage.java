package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods{
	
	public DuplicateLeadPage() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLead;
	
	public ViewLeadPage clickCreateLead() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleCreateLead);
		/*HomePage hp = new HomePage();
		return hp;*/
		return new ViewLeadPage();
	}
}
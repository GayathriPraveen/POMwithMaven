package pages;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;

	import wdMethods.ProjectMethods;

	public class opentapsCRM extends ProjectMethods{
		
		public opentapsCRM() {
			PageFactory.initElements(driver,this);
		}	
			
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleUpdatecName;
	
	public opentapsCRM updateCompanyName(String cName) {
		//WebElement elePassword = locateElement("password");
		type(eleUpdatecName, cName);
		return this;
	}
		
		@FindBy(how=How.CLASS_NAME,using="smallSubmit")
		private WebElement eleUpdate;
		
		public ViewLeadPage clickUpdate() {
			//WebElement eleLogin = locateElement("class","decorativeSubmit");
			click(eleUpdate);
			/*HomePage hp = new HomePage();
			return hp;*/
			return new ViewLeadPage();
	}

}

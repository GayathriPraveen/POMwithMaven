package pages;

	import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;

	import wdMethods.ProjectMethods;

	public class MergeLeadsPage extends ProjectMethods{
		
		public MergeLeadsPage() {
			PageFactory.initElements(driver,this);
		}	
		

		@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[1]")
		private WebElement eleFromidIcon;
		
		public FindLeadPopup clickFromIdIcon() {
			//WebElement eleUserName = locateElement("username");
			click(eleFromidIcon);
			switchToWindow(1);
			return new FindLeadPopup();
		}
		
		@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
		private WebElement eleToidIcon;
		
		public FindLeadPopup clickToIdIcon() {
			//WebElement eleUserName = locateElement("username");
			click(eleToidIcon);
			switchToWindow(1);
			return new FindLeadPopup();
		}
		
		@FindBy(how=How.LINK_TEXT,using="Merge")
		private WebElement eleMerge;
		
		public MyLeadPage clickMerge() {
			//WebElement eleLogin = locateElement("class","decorativeSubmit");
			click(eleMerge);
			acceptAlert();
			return new MyLeadPage();
		}
	}

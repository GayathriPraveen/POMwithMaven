package pages;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;

	import wdMethods.ProjectMethods;

	public class FindLeadsPage extends ProjectMethods{
		public static String msg;
		public FindLeadsPage() {
			PageFactory.initElements(driver,this);
		}	
		

		@FindBy(how=How.XPATH,using="(//label[text()='Lead ID:']/following::input)[2]")
		private WebElement eleFirstName;
		
		public FindLeadsPage enterFirstName(String fname) {
			//WebElement eleUserName = locateElement("username");
			type(eleFirstName, fname);
			return this;
		}
	
		@FindBy(how=How.XPATH,using="//span[text()='Phone']")
		private WebElement elePhoneTab;
		
		public FindLeadsPage clickPhoneTab() {
			//WebElement eleLogin = locateElement("class","decorativeSubmit");
			click(elePhoneTab);
			/*HomePage hp = new HomePage();
			return hp;*/
			return this;
		}
		
		@FindBy(how=How.NAME,using="(phoneNumber")
		private WebElement elePhoneNum;
		
		public FindLeadsPage enterPhoneNum(String phoneNum) {
			//WebElement eleUserName = locateElement("username");
			type(elePhoneNum, ""+phoneNum);
			return this;
		}
		
		@FindBy(how=How.XPATH,using="//span[text()='Email']")
		private WebElement eleEmailTab;
		
		public FindLeadsPage clickEmailTab() {
			//WebElement eleLogin = locateElement("class","decorativeSubmit");
			click(eleEmailTab);
			/*HomePage hp = new HomePage();
			return hp;*/
			return this;
		}
		
		@FindBy(how=How.XPATH,using="(//label[text()='Email Address:']/following::input)[1]")
		private WebElement eleEmail;
		
		public FindLeadsPage enterEmail(String email) {
			//WebElement eleUserName = locateElement("username");
			type(eleEmail, email);
			return this;
		}
		
		
		@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
		private WebElement elesubmit;
		
		public FindLeadsPage clickSubmit() {
			//WebElement eleLogin = locateElement("class","decorativeSubmit");
			click(elesubmit);
			/*HomePage hp = new HomePage();
			return hp;*/
			return this;
		}
		
		@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
		private WebElement eleCaptured;
		public FindLeadsPage capturedLead() {
			 leadID = getText(eleCaptured);
			 System.out.println(leadID);
			return this;
		}
	
		@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
		private WebElement eleFirstId;
		
		public ViewLeadPage clickFirstId() {
			//WebElement eleUserName = locateElement("username");
			click(eleFirstId);
			return new ViewLeadPage();
		}
		
		@FindBy(how=How.XPATH,using="//div[@class='x-form-element']//input[@name='id']")
		private WebElement eleLeadid;
		
		public FindLeadsPage enterLeadId() {
			//WebElement eleUserName = locateElement("username");
			type(eleLeadid, leadID);
			System.out.println(leadID);
			return this;
		}
		
		@FindBy(how=How.XPATH,using="//div[text()='No records to display']")
		private WebElement eleExpectedText;
		public String verifyErrormsg() {
			 msg = getText(eleExpectedText);
			 System.out.println(msg);
			return msg;
		}
		
		@FindBy(how=How.XPATH,using="//div[text()='No records to display']")
		private WebElement eleverifyPartialTextDisplayed;

		public FindLeadsPage verifypartialDispalyedText() {
			verifyPartialText(eleverifyPartialTextDisplayed, "No records to display");
			return this;		
		}
		
	}

package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="(//a[text()='Organizations'])[1]")private WebElement Orglink;
	@FindBy(xpath="//a[text()='Contacts']")private WebElement contactslink;
	@FindBy(xpath="(//a[text()='Opportunities'])[1]")private WebElement opplink;
	@FindBy(xpath="(//td[@class='small'])[2]")private WebElement Adminimg;
	@FindBy(xpath="//a[text()='Sign Out']")private WebElement signoutlink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrglink() {
		return Orglink;
	}

	public WebElement getContactslink() {
		return contactslink;
	}

	public WebElement getOpplink() {
		return opplink;
	}

	public WebElement getAdminimg() {
		return Adminimg;
	}

	public WebElement getSignoutlink() {
		return signoutlink;
	}

}

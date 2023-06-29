package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createNewOrganizationPage {
	
	@FindBy(xpath="//input[@name='accountname']")private WebElement Orgnametxt;
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]']")private WebElement savebtn;
	
	public createNewOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgnametxt() {
		return Orgnametxt;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	

}

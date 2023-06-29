package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class organizationinformationPage {
	
	@FindBy(xpath="(//td[@class='dvtCellLabel']/following::td)[1]")private WebElement Orgeditfieldtxt;
	
	
	public organizationinformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getOrgeditfieldtxt() {
		return Orgeditfieldtxt;
	}

}

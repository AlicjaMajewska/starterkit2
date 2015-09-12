package pl.spring.demo.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pl.spring.demo.web.selenium.AbstractPageObject;

public class DialogAPage extends AbstractPageObject {

	@FindBy(tagName = "img")
	WebElement image;
	@FindBy(tagName = "h2")
	WebElement header;

	public DialogAPage(WebDriver driver) {
		super(driver);
	}
	
	

}

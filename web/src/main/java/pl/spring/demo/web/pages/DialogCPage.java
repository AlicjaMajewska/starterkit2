package pl.spring.demo.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pl.spring.demo.web.selenium.AbstractPageObject;

public class DialogCPage extends AbstractPageObject {

	@FindBy(tagName = "h2")
	WebElement header;

	public DialogCPage(WebDriver driver) {
		super(driver);
	}
}
	
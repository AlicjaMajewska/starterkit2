package pl.spring.demo.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.spring.demo.web.selenium.AbstractPageObject;

public class NewBookPage extends AbstractPageObject  {
	
	public NewBookPage(WebDriver driver) {
		super(driver);
	}

	private WebElement title;
	private WebElement firstName;
	private WebElement lastName;
    @FindBy(id = "submit")
    private WebElement adBookButton;
	
	public NewBookPage setTitle(String title) {
		this.title.sendKeys(title);
		return this;
	}
	public NewBookPage setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
		return this;
	}

	public NewBookPage setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
		return this;
	}

	
	public BookPage clickAddBookButton() {
		adBookButton.click();
		return PageFactory.initElements(driver, BookPage.class);
	}

}

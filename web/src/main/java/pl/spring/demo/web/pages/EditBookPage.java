package pl.spring.demo.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pl.spring.demo.web.selenium.AbstractPageObject;

public class EditBookPage extends AbstractPageObject {

	public EditBookPage(WebDriver driver) {
		super(driver);
	}

	private WebElement newTitle;
	@FindBy(id = "SaveNewTitle")
	private WebElement editBookButton;

	public EditBookPage setTitle(String title) {
		this.newTitle.sendKeys(title);
		return this;
	}

	public BookPage clickEditBookButton() {
		editBookButton.click();
		return PageFactory.initElements(driver, BookPage.class);
	}

}
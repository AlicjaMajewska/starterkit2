package pl.spring.demo.web.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pl.spring.demo.web.selenium.AbstractPageObject;

public class AuthorsPage extends AbstractPageObject {
	@FindBy(id = "AuthorSearchButton")
	private WebElement shearchButton;
	private WebElement authorName;
	@FindBy(className = "AuthorsTable")
	private WebElement authorsTable;
	@FindBy(tagName = "tr")
	List<WebElement> tableRows;

	public AuthorsPage(WebDriver driver) {
		super(driver);
	}

	public AuthorsPage setAuthorName(String authorName) {
		this.authorName.sendKeys(authorName);
		return this;
	}

	public boolean findAuthorByName(String firstName, String lastName) {
		for (WebElement row : tableRows) {
			if (row.getText().contains(firstName)
					&& row.getText().contains(lastName)) {
				return true;
			}
		}
		return false;
	}

	// public BookPage clickBooksDialog() {
	// booksDialog.click();
	// return PageFactory.initElements(driver, BookPage.class);
	// }

}
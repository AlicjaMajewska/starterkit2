package pl.spring.demo.web.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pl.spring.demo.web.selenium.AbstractPageObject;

public class BookPage extends AbstractPageObject {
	@FindBy(id = "AddBook")
	private WebElement addBookButton;
	@FindBy(id = "SearchBooks")
	private WebElement searchBooksButton;
	@FindBy(linkText = "Authors")
	private WebElement authorsLink;
	

	public BookPage(WebDriver driver) {
		super(driver);
	}

	public NewBookPage clickAddBook() {
		addBookButton.click();
		return PageFactory.initElements(driver, NewBookPage.class);
	}
	public BookPage clickSearchBook() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SearchBooks")));
		searchBooksButton.click();
		return this;
	}

	public AuthorsPage goToAuthors() {
		authorsLink.click();
		return PageFactory.initElements(driver, AuthorsPage.class);
	}

	public EditBookPage editBookByTitleAndName(String title, String firstName, String lastName) {
		clickSearchBook();
		List<WebElement> bookTableRows = driver.findElements(By.tagName("tr"));
		for (WebElement row : bookTableRows) {
			System.out.println("row: " + row.getText());
			if (row.getText().contains(title)
					&& row.getText().contains(firstName)
					&& row.getText().contains(lastName)) {
				row.findElement(By.name("edit")).click();
				return PageFactory.initElements(driver, EditBookPage.class);
				
			}
		}
		throw new RuntimeException("Specfied book not found");
	}
	public boolean findBookByTitleAndName(String title, String firstName, String lastName) {
		clickSearchBook();
		List<WebElement> bookTableRows = driver.findElements(By.tagName("tr"));
		for (WebElement row : bookTableRows) {
			System.out.println("row: " + row.getText());
			if (row.getText().contains(title)
					&& row.getText().contains(firstName)
					&& row.getText().contains(lastName)) {
				row.findElement(By.name("edit")).click();
				return true;
				
			}
		}
		return false;
	}
	
	

}

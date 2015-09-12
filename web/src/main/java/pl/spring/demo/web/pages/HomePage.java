package pl.spring.demo.web.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.spring.demo.web.selenium.AbstractPageObject;

public class HomePage extends AbstractPageObject{
	@FindBy(linkText="Books dialog")
	private WebElement booksDialog;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver.get("http://localhost:9721/workshop/");
	}
	
	public BookPage clickBooksDialog() {
		booksDialog.click();
		return PageFactory.initElements(driver, BookPage.class);
	}
	
}

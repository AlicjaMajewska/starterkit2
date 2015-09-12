package pl.spring.demo.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import pl.spring.demo.web.selenium.AbstractPageObject;

public class NavigationBar extends AbstractPageObject {


	@FindBys({ @FindBy(tagName="li" ), @FindBy(linkText="Books")})
	private WebElement booksDialog;
	@FindBys({ @FindBy(tagName="li" ), @FindBy(linkText="Authors")})
	private WebElement authorsDialog;
	@FindBys({ @FindBy(tagName="li" ), @FindBy(linkText="Dialog A")})
	private WebElement dialogA;
	@FindBys({ @FindBy(tagName="li" ), @FindBy(linkText="Dialog B")})
	private WebElement dialogB;
	@FindBys({ @FindBy(tagName="li" ), @FindBy(linkText="Dialog C")})
	private WebElement dialogC;

	public NavigationBar(WebDriver driver) {
		super(driver);
	}
	
	public BookPage clickBooksDialog() {
		booksDialog.click();
		return PageFactory.initElements(driver, BookPage.class);
	}
	public AuthorsPage clickAuthorsDialog() {
		authorsDialog.click();
		return PageFactory.initElements(driver, AuthorsPage.class);
	}
	public DialogAPage clickDialogA() {
		dialogA.click();
		return PageFactory.initElements(driver, DialogAPage.class);
	}
	public DialogBPage clickDialogB() {
		dialogC.click();
		return PageFactory.initElements(driver, DialogBPage.class);
	}
	public DialogCPage clickDialogC() {
		dialogC.click();
		return PageFactory.initElements(driver, DialogCPage.class);
	}
	
}


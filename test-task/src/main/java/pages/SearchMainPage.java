package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class SearchMainPage {

	@FindBy(xpath = "//input[@class='gLFyf gsfi']")
	protected SelenideElement searchBar;

	public SearchMainPage() {
		Selenide.page(this);
	}

	/**
	 * Выполняет поисковой запрос с указанным текстом.
	 *
	 * @param text Текст запроса.
	 */
	public PageWithLinkResults searchFor(String text) {
		searchBar.sendKeys(text);
		searchBar.pressEnter();
		return new PageWithLinkResults();
	}
}

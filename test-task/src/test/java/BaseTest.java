import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import enums.Urls;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import pages.SearchMainPage;

import static com.codeborne.selenide.Selenide.open;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class BaseTest {

	protected SearchMainPage searchMainPage;

	@BeforeAll
	public void setUpEnvironment() {
		Selenide.clearBrowserCookies();
		Configuration.browser = Browsers.CHROME;
		Configuration.pollingInterval = 500;
		Configuration.timeout = 10000;

		// 1. Открываем поисковую страницу:
		open(Urls.MAIN_PAGE.getUrl());
		searchMainPage = new SearchMainPage();
	}
}

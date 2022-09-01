package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public abstract class PageWithResults extends SearchMainPage {

	@FindBy(xpath = "//*[@id='hdtb-msb']/div[1]/div/div[2]/a/span")
	private SelenideElement imagesTab;

	public PageWithImageResults clickImagesTab() {
		imagesTab.click();
		return new PageWithImageResults();
	}
}

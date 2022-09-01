package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PageWithImageResults extends PageWithResults {

	@FindBy(xpath = "//div[@class='bRMDJf islir']")
	private List<SelenideElement> images;

	/**
	 * Кликает на картинку под переданным номером.
	 *
	 * @param index Номер картинки, которую необходимо скачать.
	 * @return Страница с модальным окном выбранной картинки.
	 */
	public PageWithImageResultsAndChosenImage clickOnImageByIndex(int index) {
		if (!images.isEmpty() && images.size() >= index) {
			images.get(index - 1).click();
			return new PageWithImageResultsAndChosenImage();
		}
		throw new InvalidArgumentException("Кол-во найденных картинок меньше, чем индекс запрошенной!");
	}
}

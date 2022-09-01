package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PageWithImageResultsAndChosenImage extends PageWithImageResults {

	@FindBy(xpath = "//img[@class='n3VNCb']")
	private SelenideElement chosenImage;

	/**
	 * Скачивает выбранную картинку.
	 *
	 * @throws FileNotFoundException если не смогли скачать картинку.
	 */
	public void downloadChosenImage(String path) throws IOException {
		try (InputStream in = new FileInputStream(chosenImage.screenshot())) {
			Files.copy(in, Paths.get(path));
		}
	}
}

import org.junit.jupiter.api.Test;
import pages.PageWithImageResults;
import pages.PageWithImageResultsAndChosenImage;
import pages.PageWithLinkResults;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DownloadImageTest extends BaseTest {

	@Test
	void shouldSearchForMyNameAndDownloadThirdImageTest() throws IOException {
		// 2. Ввести имя-фамилию:
		PageWithLinkResults pageWithLinkResults = searchMainPage.searchFor("Александр Наумов");

		// 3. Открываем картинки:
		PageWithImageResults pageWithImageResults = pageWithLinkResults.clickImagesTab();

		// 4. Кликаем на 3-ю картинку:
		PageWithImageResultsAndChosenImage pageWithImageResultsAndChosenImage = pageWithImageResults.clickOnImageByIndex(3);

		// 5. Сохраняем картинку:
		String pathToSaveImage = System.getProperty("user.dir")
				+ System.getProperty("file.separator") + UUID.randomUUID() + ".jpg";
		pageWithImageResultsAndChosenImage.downloadChosenImage(pathToSaveImage);

		// 6. Проверяем, что размер картинки > 0:
		assertTrue(new File(pathToSaveImage).length() > 0);
	}
}

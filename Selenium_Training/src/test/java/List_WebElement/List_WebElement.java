package List_WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class List_WebElement {
	public static WebDriver driver;

	@Test
	public void web() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		driver.findElement(By.name("submit_search")).click();

		List<WebElement> liste_articles = driver.findElements(By.xpath("//*[@class='product-desc']"));

		if (liste_articles.size() != 0) {
			System.out.println(liste_articles.size() + " robes trouvés par recherche \n");
			System.out.println("les articles sont : \n");

			for (WebElement inputElement : liste_articles) {
				System.out.println(inputElement.getAttribute("itemprop"));

			}
			
		

		}

	}
}

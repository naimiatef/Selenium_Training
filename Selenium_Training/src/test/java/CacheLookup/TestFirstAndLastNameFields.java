package CacheLookup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFirstAndLastNameFields {
	public static WebDriver driver;

	@Test
	public void open() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();

		WebDriverWait w = new WebDriverWait(driver, 3);
		w.until(ExpectedConditions.presenceOfElementLocated(By.id("firstName")));

		// Initialize the Page object
		PracticeFormPageObject pageObject = PageFactory.initElements(driver, PracticeFormPageObject.class);

		// Write some values to First and Last Name
		pageObject.firsName.sendKeys("Naimi"); // A FindBy call is triggered to fetch First Name
		long withoutCacheStartTime = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			pageObject.firsName.getText();
		}
		long withoutCacheEndTime = System.currentTimeMillis();
		System.out.println(
				"Time take in seconds Without cache " + ((withoutCacheEndTime - withoutCacheStartTime) / 1000));

		// Let us now repeat the same process on the cached element and see
		// the amount of time it takes to perform the same operation 1000 times
		long withCacheStartTime = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			pageObject.firsNameCached.getText();
		}
		long withCacheEndTime = System.currentTimeMillis();
		System.out.println("Time take in seconds With cache " + ((withCacheEndTime - withCacheStartTime) / 1000));

	}
}

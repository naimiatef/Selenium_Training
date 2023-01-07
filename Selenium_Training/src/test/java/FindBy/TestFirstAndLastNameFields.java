package FindBy;

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
		
		WebDriverWait w = new WebDriverWait(driver,3);
		w.until(ExpectedConditions.presenceOfElementLocated (By.id("firstName") ));
		
		
		// Initialize the Page object
		PracticeFormPageObject pageObject = PageFactory.initElements(driver, PracticeFormPageObject.class);

		// Write some values to First and Last Name
		pageObject.firsName.sendKeys("Naimi"); // A FindBy call is triggered to fetch First Name
		pageObject.lastName.sendKeys("Atef"); // A FindBy call is triggered to fetch Last Name

		// Read values from the Text box.
		pageObject.firsName.getText(); // A FindBy call is triggered to fetch First Name
		pageObject.lastName.getText(); // A FindBy call is triggered to fetch Last Name

	}
}

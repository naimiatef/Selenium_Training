package Basic_Selenium_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicMethods_1 {
	public static WebDriver driver;

	@Test
	public void open() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		String URL = driver.getCurrentUrl();
		if (URL.contentEquals("https://www.facebook.com/")) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");
		}

		String ActualTitle = driver.getTitle();
		if (ActualTitle.contentEquals("facebook")) {
			System.out.println("Title Pass");

		} else {
			System.out.println("Title Fail");
		}
	}
}

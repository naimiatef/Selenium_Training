package Basic_Selenium_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigatemethod_2 {
	public static WebDriver driver;

	@Test
	public void f() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://google.com");
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();

		// un numéro unique pour chaque page web
		System.out.println(driver.getWindowHandle());

		// driver.close(); // it will close the current page that was opened by selenium

		// driver.quit(); // it will close all pages that was opened by selenium

	}
}

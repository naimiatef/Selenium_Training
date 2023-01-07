package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class css_selector_1 {
	public static WebDriver driver;

	@Test
	public void CSS_selector() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("input[name='email'")).sendKeys("test@gmail.com");
	
		 

	}
}

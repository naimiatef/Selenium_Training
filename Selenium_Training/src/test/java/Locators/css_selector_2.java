package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class css_selector_2 {
	public static WebDriver driver;

	@Test
	public void CSS_selector() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();

		// ou bient tagName#ID
		driver.findElement(By.cssSelector("input#email")).sendKeys("test@gmail.com");

		// ou bient #ID
		driver.findElement(By.cssSelector("#email")).sendKeys("test@gmail.com");

		// ou bient tagname.className
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("12345");

		// ou bient .className
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("12345");
	}
}

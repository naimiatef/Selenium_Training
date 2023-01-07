package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class web_element {
	public static WebDriver driver;

	@Test
	public void web() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();

	 
		WebElement emailbutton = driver.findElement(By.id("email"));
		emailbutton.sendKeys("test@gmail.com");
		

	}
}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_3 {
	public static WebDriver driver;

	@Test
	public void ID() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		/*
		 * Comment attendre qu’un élément soit présent dans le sélénium ?
		 */
		WebDriverWait w = new WebDriverWait(driver,3);
		w.until(ExpectedConditions.presenceOfElementLocated (By.name("firstname") ));
		driver.findElement(By.name("firstname")).sendKeys("naimi");
		

	}
}

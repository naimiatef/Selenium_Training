package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_1 {
	public static WebDriver driver;

	@Test
	public void ID() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://testproject.io/");
		driver.manage().window().maximize();
		/*
		 * syntaxe:
		 * 
		 * //*[@attribut_html='valeur'] //tagname_html[@attribut='valeur']
		 */

		driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).sendKeys("test@gmail.com");

		// on peut utiliser @class
		driver.findElement(By.xpath("//input[@class='wpcf7-form-control wpcf7-submit']")).click();

		// on peut utiliser n'importe quelle attribut @attribut pour un objet dans HTML
		// donc on fait @....

	}
}

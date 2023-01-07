package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_2 {
	public static WebDriver driver;

	@Test
	public void ID() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		
		// trouver lxpath qui contient la valeur ....  syntaxe :   tagname[contains(@attribute,'valeur')]
		driver.findElement(By.xpath("//input[contains(@id,'u_0')]")).click();
		

	}
}

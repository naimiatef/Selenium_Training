package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class partialLinkText {
	public static WebDriver driver;
	
	@Test
	public void ID() {
		 
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		
		// faite attention au class qui contient des espaces 
		// faite attention parfoit plusieurs élément possede le meme nom class name
		driver.findElement(By.className("input__input")).sendKeys("test@gmail.com");
		 
		 
	}
}

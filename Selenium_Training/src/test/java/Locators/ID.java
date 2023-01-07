package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ID {
	public static WebDriver driver;
	
	@Test
	public void ID() {
		/*
		 * si l'ID est alpha numérique c-a-d que la valeur de ce ID va etre changer à chaque actualisation de page c-a-d dynamique
		   exemple ID="u_0_0_rL"
		 */
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("inputtext")).sendKeys("test@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345");
		 
	}
}

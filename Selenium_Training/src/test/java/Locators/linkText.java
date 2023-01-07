package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




public class linkText {
	public static WebDriver driver;
	
	@Test
	public void ID() {
	 
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.linkedin.com/login/fr?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		driver.manage().window().maximize();
		
		// linkText c-a-d href
		driver.findElement(By.linkText("Mot de passe oublié ?")).click();
		 
		 
	}
}

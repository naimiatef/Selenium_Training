package Technique_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class case_à_cocher_et_le_bouton_radio {
	public static WebDriver driver;

	@Test
	public void waitt() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();

		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		
		radio1.click();
		radio2.click();
		

	}
}

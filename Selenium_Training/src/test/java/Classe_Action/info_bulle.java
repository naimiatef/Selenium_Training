package Classe_Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class info_bulle {
	public static WebDriver driver;

	@Test
	public void clic() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

		driver.get("https://demoqa.com/tool-tips");

		// It is always advisable to Maximize the window before performing DragNDrop
		// action
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		// Instantiate Action Class
		Actions actions = new Actions(driver);
		// Retrieve WebElement 'Music' to perform mouse hover
		//Retrieve WebElement 
				WebElement element = driver.findElement(By.id("toolTipButton")); 
				
				// Use action class to mouse hover 
				actions.moveToElement(element).perform(); 
				
				WebElement toolTip = driver.findElement(By.xpath("//input[@id='toolTipTextField']")); 
				
				// To get the tool tip text and assert 
				String toolTipText = toolTip.getText();
				System.out.println("toolTipText-->"+toolTipText); 
				
				//Verification if tooltip text is matching expected value 
				if(toolTipText.equalsIgnoreCase("Nous vous demandons votre âge uniquement à des fins statistiques.")){ 
					System.out.println("Pass* : L’info-bulle correspondant à la valeur attendue");
				}else{
					System.out.println("Fail : L’info-bulle ne correspond PAS à la valeur attendue"); 
				} 
				
				// Close the main window 
				//driver.close();
	}
}

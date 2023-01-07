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

public class survol_souris {
	public static WebDriver driver;

	@Test
	public void clic() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

		driver.get("https://demoqa.com/menu/#");

		// It is always advisable to Maximize the window before performing DragNDrop
		// action
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		// Instantiate Action Class
		Actions actions = new Actions(driver);
		// Retrieve WebElement 'Music' to perform mouse hover
		WebElement menuOption = driver.findElement(By.xpath("//a[normalize-space()='Main Item 2']"));
		// Mouse hover menuOption 'Music'
		actions.moveToElement(menuOption).perform();
		System.out.println("Done Mouse hover on 'MuMain Item 2'  from Menu");
 
		
		WebElement subMenuOption = driver.findElement(By.xpath("//a[normalize-space()='SUB SUB LIST »']"));
		
		actions.moveToElement(subMenuOption).perform();
		System.out.println("Done Mouse hover on 'Sub Sub List' from Menu");

		
		WebElement selectMenuOption = driver.findElement(By.xpath("//a[normalize-space()='Sub Sub Item 2']"));
		selectMenuOption.click();
		System.out.println("Selected 'Alternative' from Menu");

		// Close the main window
		//driver.close();

	}
}

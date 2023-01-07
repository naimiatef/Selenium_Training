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

public class glisser_deposer {
	public static WebDriver driver;

	@Test
	public void clic() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

		driver.get("https://demoqa.com/droppable/");

		// It is always advisable to Maximize the window before performing DragNDrop action		 
				driver.manage().window().maximize();
				 
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
				
				//Actions class method to drag and drop		
				Actions builder = new Actions(driver);
				 
				WebElement from = driver.findElement(By.id("draggable"));
				 
				WebElement to = driver.findElement(By.id("droppable"));	 
				//Perform drag and drop
				builder.dragAndDrop(from, to).perform();
				
				//verify text changed in to 'Drop here' box 
				String textTo = to.getText();

				if(textTo.equals("Dropped!")) {
					System.out.println("PASS: Source is dropped to target as expected");
				}else {
					System.out.println("FAIL: Source couldn't be dropped to target as expected");
				}
			
				//driver.close();

	}
}

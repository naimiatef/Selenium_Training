package Classe_Action;

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

public class double_click {
	public static WebDriver driver;

	@Test
	public void clic() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		// Maximise browser window
		driver.manage().window().maximize();
		//Double click the button to launch an alertbox
		Actions action = new Actions(driver);
		WebElement link =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.doubleClick(link).perform();
		//Switch to the alert box and click on OK button
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text\n" +alert.getText());
		alert.accept();
		//Closing the driver instance
		//driver.quit();

	}
}

package Classe_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class clic_droit {
	public static WebDriver driver;

	@Test
	public void clic() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		// Maximise browser window
		driver.manage().window().maximize();
		/*
		 * WebDriverWait w = new WebDriverWait(driver,3);
		 * w.until(ExpectedConditions.presenceOfElementLocated (By.id("rightClickBtn")
		 * ));
		 */
		Actions action = new Actions(driver);
		By locator = By.cssSelector(".context-menu-one");
		// Wait for the element. Used Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement rightClickElement = driver.findElement(locator);
		
		
		action.contextClick(rightClickElement).build().perform();
		driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']")).click();
		driver.switchTo().alert().accept();

	}
}

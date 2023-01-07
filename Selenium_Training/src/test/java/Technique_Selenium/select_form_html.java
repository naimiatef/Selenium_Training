package Technique_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class select_form_html {
	public static WebDriver driver;

	@Test
	public void select_form() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		WebElement hear_about =driver.findElement(By.xpath("//select[@id='how-select']"));
		Select valeur = new Select(hear_about);
		valeur.selectByIndex(5);
		//valeur.selectByValue("7");
		//valeur.selectByVisibleText("youtube");

	}
}

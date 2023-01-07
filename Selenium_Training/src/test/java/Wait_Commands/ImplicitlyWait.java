package Wait_Commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWait {
	public static WebDriver driver;

	@Test
	public void waitt() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("visibleAfter")).click();
		

	}
}

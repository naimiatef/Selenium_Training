package Classe_Action;
import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class evenements_de_clavier {
	public static WebDriver driver;

	@Test
	public void clic() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		// Enter the Full Name
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Mr.Naimi Atef");
        
        //Enter the Email
        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("naimiatef@gmail.com");
        
        // Enter the Current Address
        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("43 School Lane London EC71 9GO");
        
        Actions actions = new Actions(driver);
        
        
        // Select the Current Address using CTRL + A
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("a");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        
        // Copy the Current Address using CTRL + C
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("c");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        
        //Press the TAB Key to Switch Focus to Permanent Address
        actions.sendKeys(Keys.TAB);
        actions.build().perform();
        
        //Paste the Address in the Permanent Address field using CTRL + V
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("v");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        
        
        //Compare Text of current Address and Permanent Address
        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        assertEquals(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));
        
        
        //driver.close();

	}
}

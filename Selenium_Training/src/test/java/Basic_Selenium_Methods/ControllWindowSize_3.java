package Basic_Selenium_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ControllWindowSize_3 {
	public static WebDriver driver;
  @Test
  public void f() {


		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://google.com");
		driver.navigate().to("https://www.youtube.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();

  } 
}

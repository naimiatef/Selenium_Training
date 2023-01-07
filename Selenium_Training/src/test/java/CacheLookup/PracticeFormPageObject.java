package CacheLookup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeFormPageObject {
	@FindBy(how = How.ID , using = "firstName")
	public WebElement firsName;

	@FindBy(how = How.ID, using = "firstName")
	@CacheLookup
	public WebElement firsNameCached;
	
}

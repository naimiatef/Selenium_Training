package Classe_robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class upload_file {
	public static WebDriver driver;

	@Test
	public void clic() throws AWTException, InterruptedException {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.zamzar.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='btn-input-file']")).click();
		String fileAbsolutePath = "C:\\atef\\cas_test.docx";
		StringSelection clipBoardPath = new StringSelection(fileAbsolutePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(clipBoardPath, null);

		Thread.sleep(5000);

		// Robot Class
		Robot robot = new Robot();

		// Keyboard Action : CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		// Keyboard Action : Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
	}
}

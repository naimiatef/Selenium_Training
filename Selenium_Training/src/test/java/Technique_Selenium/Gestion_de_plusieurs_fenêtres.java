package Technique_Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gestion_de_plusieurs_fenêtres {
	public static WebDriver driver;

	@Test
	public void plusieur_fenetres() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();			
		
        String MainWindow=driver.getWindowHandle();		
        		
        //   Pour gérer toutes les nouvelles fenêtres ouvertes.		
            Set<String> s1=driver.getWindowHandles();		
            Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
            	// Passage à la fenêtre enfant
                    driver.switchTo().window(ChildWindow);	                                                                                                           
                    driver.findElement(By.name("emailid"))
                    .sendKeys("gaurav.3n@gmail.com");                			
                    
                    driver.findElement(By.name("btnLogin")).click();			
                                 
			 		
            }		
        }		
        // Passer à la fenêtre parent, c'est-à-dire la fenêtre principale.
            driver.switchTo().window(MainWindow);				
    }
}
 
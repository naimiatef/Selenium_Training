package Technique_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 Notre cas d’utilisation suivrait les étapes ci-dessous-
Lancez le navigateur.
Ouvrez « https://demoqa.com/select-menu ».
Sélectionnez le menu de sélection à l’ancienne à l’aide de l’ID d’élément.
Imprimez toutes les options de la liste déroulante.
Sélectionnez « Violet » à l’aide de l’index.
Après cela, sélectionnez « Magenta » en utilisant du texte visible.
Sélectionnez une option à l’aide de la valeur.
Fermer le navigateur
 */
public class Gestion_de_la_liste_deroulante {
	public static WebDriver driver;

	@Test
	public void select_form() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
	    //Sélection de l'élément déroulant en localisant son identifiant
		Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
		//Impression des options du menu déroulant dans une liste lst
		List<WebElement> lst = select.getOptions();
		//Parcourir les options et les options de la liste déroulante d'impression
		System.out.println("Les options de la liste déroulante sont:");
        for(WebElement options: lst)
            System.out.println(options.getText());
        //Sélection de l'option comme 'Violet'-- selectByIndex
        System.out.println("Sélectionnez l'option par index 4");
        select.selectByIndex(4);
        System.out.println(" la valeur Sélectionnez est: " + select.getFirstSelectedOption().getText());
        //Sélection de l'option comme 'Magenta'-- selectByVisibleText
        System.out.println("Sélectionnez l'option par texte magenta");
        select.selectByVisibleText("Magenta");
        System.out.println("la valeur Sélectionnez est: " + select.getFirstSelectedOption().getText());
        //Sélection d'une option par sa valeur
        System.out.println("Sélectionnez l'option par valeur 6");
        select.selectByValue("6");
        System.out.println("la valeur Sélectionnez est: " + select.getFirstSelectedOption().getText());
	//driver.quit();
	}
}

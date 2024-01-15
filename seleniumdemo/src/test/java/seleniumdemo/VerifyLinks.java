package seleniumdemo;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLinks {
	
	
	 @Test
	  public void verifyAllLinks()
	  {
		 WebDriver driver ;

		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		  for (WebElement link : links)
		  {
			  System.out.println(link.getText());
			 
		  }
	  }
	

}

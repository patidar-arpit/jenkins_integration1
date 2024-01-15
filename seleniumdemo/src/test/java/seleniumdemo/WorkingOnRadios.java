package seleniumdemo;


import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingOnRadios {

	@Test
	public void selectRadio()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		List<WebElement> radios = driver.findElements(By.name("radiooptions"));
		for (WebElement rb : radios)
		{
			if(rb.getAttribute("value").equalsIgnoreCase("Male"))
			{
				rb.click();
				break;
			}
		}
	}
}

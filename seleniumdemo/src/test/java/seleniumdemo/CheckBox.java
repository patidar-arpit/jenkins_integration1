package seleniumdemo;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	static WebDriver driver;
	
	@BeforeClass
	public static void setUp()
	{
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://demo.automationtesting.in/Register.html");
		 driver.manage().window().maximize();
	}
	@Test
	public void selectCheckBox()
	{
		List<WebElement> chkboxes = driver.findElements(By.id("checkbox2"));
		for (WebElement ch : chkboxes)
		{
			if(ch.getAttribute("value").equalsIgnoreCase("Movies"))
			{
				if(!ch.isSelected())
				{
					ch.click();
					break;
				}
			}
		}
	}
}

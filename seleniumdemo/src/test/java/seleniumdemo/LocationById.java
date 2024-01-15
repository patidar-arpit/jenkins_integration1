package seleniumdemo;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocationById {

	@Test
	public void locateById()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		WebElement txtusername = driver.findElement(By.id("txtCustomerID"));
		txtusername.sendKeys("testuser");
		driver.findElement(By.id("txtPassword")).sendKeys("test@113");
		driver.findElement(By.name("Butsub")).click();
		

	}
}

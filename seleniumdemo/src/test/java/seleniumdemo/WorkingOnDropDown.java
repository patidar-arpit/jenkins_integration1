package seleniumdemo;


import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingOnDropDown {

	@Test
	public void selectDropDownItemByValue()
	{
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.automationtesting.in/Register.html");
		 driver.manage().window().maximize();
		 
		 WebElement dd = driver.findElement(By.id("Skills"));
		 Select dditems = new Select(dd);
		 List<WebElement> options = dditems.getOptions();
		 for(WebElement op : options)
		 {
			 if(op.getAttribute("Value").equalsIgnoreCase("Android"))
			 {
				 dditems.selectByValue("Android");
				 break;
			 }
		 }
	}
	
	@Test
	public void selectDropDownItemByText()
	{
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.automationtesting.in/Register.html");
		 driver.manage().window().maximize();
		 
		 WebElement dd = driver.findElement(By.id("countries"));
		 Select dditems = new Select(dd);
		 List<WebElement> options = dditems.getOptions();
		 for(WebElement op : options)
		 {
			 if(op.getText().equalsIgnoreCase("Japan"))
			 {
				 dditems.selectByVisibleText("Japan");
				 break;
			 }
		 }
	}
	
	@Test
	public void selectLanguage()
	{
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.automationtesting.in/Register.html");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("msdd")).click();
		 List<WebElement> langs = driver.findElements(By.id("msdd"));
		 for (WebElement lang : langs)
		 {
			 if(lang.getText().equalsIgnoreCase("Japanese"))
			 {
				 lang.click();
				 break;
			 }
		 }
	}
	
}

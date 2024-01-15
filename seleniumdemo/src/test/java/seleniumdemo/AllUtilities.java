package seleniumdemo;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllUtilities {
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
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
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
	
	@Test
	public void selectDropDownItemByValue()
	{
//		 WebDriverManager.chromedriver().setup();
//		 WebDriver driver = new ChromeDriver();
//		 driver.get("https://demo.automationtesting.in/Register.html");
//		 driver.manage().window().maximize();
		 
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
//		 WebDriverManager.chromedriver().setup();
//		 WebDriver driver = new ChromeDriver();
//		 driver.get("https://demo.automationtesting.in/Register.html");
//		 driver.manage().window().maximize();
		 
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
//		 WebDriverManager.chromedriver().setup();
//		 WebDriver driver = new ChromeDriver();
//		 driver.get("https://demo.automationtesting.in/Register.html");
//		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("msdd")).click();
		 List<WebElement> langs = driver.findElements(By.cssSelector("a.ui-corner-all"));
		 for (WebElement lang : langs)
		 {
			 if(lang.getText().equalsIgnoreCase("Japanese"))
			 {
				 lang.click();
				 break;
			 }
		 }
	}
	
	@Test
	public void selectRadio()
	{
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.automationtesting.in/Register.html");
		
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



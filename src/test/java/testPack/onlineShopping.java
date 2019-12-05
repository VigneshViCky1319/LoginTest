package testPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class onlineShopping {

	WebDriver dir;
	@Test
	public void login()
	{
		
		dir.findElement(By .xpath("//input[@name='userName']")).sendKeys("vicky");
		dir.findElement(By .xpath("//input[@name='password']")).sendKeys("vicky");
		dir.findElement(By .xpath("//input[@name='login']")).click();
	}
	@BeforeMethod
	public void beforeMethod() {
		  //launch browser and application
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver dri = new ChromeDriver();
		dri.get("http://www.newtours.demoaut.com/");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  Assert.assertTrue(dir.getTitle().contains("Flight"));
		  dir.close();
	  }

}

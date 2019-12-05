package testPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
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
	@BeforeTest
	public void beforeTest() {
		  //launch browser and application
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver dri = new ChromeDriver();
		dri.get("http://www.newtours.demoaut.com/");
	  }

	  @AfterTest
	  public void afterTest() {
		  Assert.assertTrue(dir.getTitle().contains("Flight"));
		  dir.close();
	  }

}

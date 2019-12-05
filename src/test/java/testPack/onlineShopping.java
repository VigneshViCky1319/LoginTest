package testPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class onlineShopping {

	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver dri = new ChromeDriver();
		dri.get("http://www.newtours.demoaut.com/");
		dri.findElement(By .xpath("//input[@name='userName']")).sendKeys("vicky");
		dri.findElement(By .xpath("//input[@name='password']")).sendKeys("vicky");
		dri.findElement(By .xpath("//input[@name='login']")).click();
	}

}

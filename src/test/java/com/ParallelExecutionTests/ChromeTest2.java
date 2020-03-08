package com.ParallelExecutionTests;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeTest2 
{
	WebDriver driver;
	
	@Test
	public void chromeTest2() throws MalformedURLException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
			
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.gmail.com");
		
		String title = driver.getTitle();
		System.out.println("The ChromeTest_2 Gmail Title is ::: " +title);
		
		driver.quit();
	}
}

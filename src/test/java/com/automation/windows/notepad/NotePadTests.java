package com.automation.windows.notepad;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.winapp.DriverManagerFactory;

public class NotePadTests {
	RemoteWebDriver driver;

	@BeforeClass
	public void setup() throws Exception {
		DriverManagerFactory factory = new DriverManagerFactory();
		driver = factory.getDriverManager("Windows").getDriver();
	}
	
	@Test
	public void test_1() {
		driver.findElement(By.name("Help")).click();
		driver.findElement(By.name("About Notepad")).click();
		driver.findElement(By.name("OK")).click();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}

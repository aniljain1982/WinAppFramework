package com.automation.windows.notepad;

import java.time.LocalDateTime;
import java.util.Date;

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

	/*
	 * 1. Open “Notepad” 2. Open “Help” menu item 3. Press “About Notepad” 4. Press
	 * “OK” button
	 */
	@Test
	public void test_1() {
		driver.findElement(By.name("Help")).click();
		driver.findElement(By.name("About Notepad")).click();
		driver.findElement(By.name("OK")).click();
	}

	/*
	 * 1. Open “Notepad” 2. Type current date 3. Clear the results
	 */
	@Test
	public void test_2() {
		driver.findElement(By.className("Edit")).sendKeys(LocalDateTime.now().toString());
		driver.findElement(By.className("Edit")).clear();
	}


	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}

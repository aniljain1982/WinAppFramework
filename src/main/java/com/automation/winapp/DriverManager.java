package com.automation.winapp;

import org.openqa.selenium.remote.RemoteWebDriver;

public abstract class DriverManager {
	protected RemoteWebDriver driver;
	static protected final String APPIUM = "http://localhost:4723/wd/hub";

	public RemoteWebDriver getDriver() {
		return driver;
	}
}

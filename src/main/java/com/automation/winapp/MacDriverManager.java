package com.automation.winapp;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.mac.Mac2Driver;

public class MacDriverManager extends DriverManager {
	public MacDriverManager() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
		capabilities.setCapability("platformName", "Windows");
		capabilities.setCapability("deviceName", "WindowsPC");
		driver = new Mac2Driver(new URL("http://localhost:4723/wd/hub"), capabilities);	}
}

package com.automation.winapp;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.windows.WindowsDriver;

public class WindowsDriverManager extends DriverManager {
	public WindowsDriverManager() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
		capabilities.setCapability("platformName", "Windows");
		capabilities.setCapability("deviceName", "WindowsPC");
		driver = new WindowsDriver(new URL("http://localhost:4723/wd/hub"), capabilities);	}
}

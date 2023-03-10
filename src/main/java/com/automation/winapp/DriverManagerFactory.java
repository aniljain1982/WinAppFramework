package com.automation.winapp;

public class DriverManagerFactory {
	public DriverManager getDriverManager(String os) throws Exception {
		DriverManager driverManager = null;
		switch (os) {
		case "Windows":
			driverManager = new WindowsDriverManager();
			break;
		case "Mac":
			driverManager = new MacDriverManager();
			break;
		default:
			driverManager = new WindowsDriverManager();
			break;
		}
		return driverManager;
	}
}

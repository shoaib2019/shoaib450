package com.sel.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstSeleniumTest_IE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "E:\\Selenium setup\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println("title: " + title);
		driver.quit();
	}
}

package com.sel.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest_FireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium setup\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println("title: " + title);

		driver.quit();
	}

}

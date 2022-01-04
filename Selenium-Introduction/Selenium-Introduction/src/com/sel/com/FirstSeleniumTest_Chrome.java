package com.sel.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest_Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Bangaore");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Bangalore@1");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		String title = driver.getTitle();
		System.out.println("title: " + title);
		boolean b=driver.findElement(By.xpath("//div[@class='_9ay7']")).isDisplayed();
		System.out.println("Boolean :"+b);
		if(b) {
			String text=driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
			System.out.println("Error Text: "+text);
		}
		driver.navigate().back();
		driver.quit();
	}
}

package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/mac/eclipse-workspace/Core_Java/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Title: " +title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("CurrentUrl: " +currentUrl);
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.facebook.com/");
		String NewUrl = driver.getCurrentUrl();
		System.out.println("Navigated Url: " +NewUrl);
		driver.navigate().refresh();
		String title3 = driver.getTitle();
		System.out.println("Refreshed Title: "+title3);
		driver.navigate().back();
		String OldUrl = driver.getCurrentUrl();
		System.out.println("Back to Old Url: " +OldUrl);
		driver.navigate().forward();
		String title5 = driver.getTitle();
		System.out.println("Forwarded Title: " +title5);
		
		
		
	}

}

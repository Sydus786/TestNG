package com.Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCode {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "/Users/mac/eclipse-workspace/Core_Java/Driver/chromedriver");
		WebDriver a = new ChromeDriver();
		a.get("https://opensource-demo.orangehrmlive.com");
		a.manage().window().maximize();
		WebElement findElement = a.findElement(By.id("txtUsername"));
		findElement.sendKeys("Admin");
		WebElement findElement2 = a.findElement(By.name("txtPassword"));
		findElement2.sendKeys("admin123");
		WebElement findElement3 = a.findElement(By.xpath("//input[@type='submit']"));
		findElement3.click();
		
		TakesScreenshot TS = (TakesScreenshot) a;
		File screenshotAs = TS.getScreenshotAs(OutputType.FILE);
		File destination = new File("/Users/mac/eclipse-workspace/Core_Java/SS/Hrm.jpeg");
		FileUtils.copyFile(screenshotAs, destination);
		Thread.sleep(3000);
		a.close();
		
		
		
	}

}

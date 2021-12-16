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

public class Locatrs {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "/Users/mac/eclipse-workspace/Core_Java/Driver/chromedriver");
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.co.in/");
		d.manage().window().maximize();
		WebElement findElement = d.findElement(By.xpath("//a[@class='gb_f']"));
		findElement.click();
		WebElement findElement2 = d.findElement(By.xpath("//a[@data-action='sign in']"));
		findElement2.click();
		WebElement findElement3 = d.findElement(By.id("identifierId"));
		findElement3.sendKeys("abc@gmail.com");
		WebElement findElement4 = d.findElement(By.xpath("//span[@jsname='V67aGc']"));
		findElement4.click();
		//d.quit();
		
		TakesScreenshot TS =(TakesScreenshot) d; //narowing
		File screenshotAs = TS.getScreenshotAs(OutputType.FILE);
		File Path = new File("/Users/mac/eclipse-workspace/Core_Java/SS/SS.png");
		FileUtils.copyFile(screenshotAs, Path);
	}

}

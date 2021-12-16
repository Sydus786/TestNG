package com.Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "/Users/mac/eclipse-workspace/Core_Java/Driver/chromedriver");
		WebDriver x = new ChromeDriver();
		x.get("https://www.facebook.com/");
		x.manage().window().maximize();
		WebElement CreateAcc = x.findElement(By.xpath("//a[@rel='async']"));
		CreateAcc.click();
		Thread.sleep(3000);
		
		WebElement FirstName = x.findElement(By.name("firstname"));
		FirstName.sendKeys("Abc");
		boolean displayed = FirstName.isDisplayed();
		System.out.println(displayed);

		WebElement LastName = x.findElement(By.name("lastname"));
		LastName.sendKeys("Xyz");
		boolean enabled = LastName.isEnabled();
		System.out.println(enabled);
		String attribute = LastName.getAttribute("value");
		System.out.println(attribute);
		
		WebElement Mobile = x.findElement(By.xpath("(//input[@type='text'])[4]"));
		Mobile.sendKeys("12345678");
		Mobile.clear();
		
		WebElement Pwd = x.findElement(By.xpath("(//input[@type='password'])[2]"));
		Pwd.sendKeys("12345");
		
		WebElement Day = x.findElement(By.id("day"));
		Select day = new Select(Day);
		day.selectByIndex(20);
		
		WebElement Month = x.findElement(By.id("month"));
		Select month = new Select(Month);
		month.selectByVisibleText("Mar");
		
		WebElement Year = x.findElement(By.id("year"));
		Select year = new Select(Year);
		year.selectByValue("1997");
		
		WebElement Sex = x.findElement(By.xpath("(//input[@type='radio'])[2]"));
		Sex.click();
		Thread.sleep(3000);
		
		WebElement SignUp = x.findElement(By.xpath("(//button[@type='submit'])[2]"));
		SignUp.click();
		Thread.sleep(3000);
		
		TakesScreenshot TS = (TakesScreenshot) x;
		File screenshotAs = TS.getScreenshotAs(OutputType.FILE);
		File destination = new File("/Users/mac/eclipse-workspace/Core_Java/SS/fb.png");
		FileUtils.copyFile(screenshotAs, destination);
		Thread.sleep(3000);
		x.close();
	}

}

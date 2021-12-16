package com.Selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Types {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/mac/eclipse-workspace/Core_Java/Driver/chromedriver");
		WebDriver win = new ChromeDriver();
		win.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		win.get("https://www.amazon.in/");
		win.manage().window().maximize();
		
		WebElement help = win.findElement(By.xpath("//a[contains(text(),'Help')]"));
		WebDriverWait w = new WebDriverWait(win, 30);
		w.until(ExpectedConditions.visibilityOf(help));
		
		Wait<WebDriver> fw = new FluentWait<WebDriver>(win)
				.withTimeout(50, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		win.close();


	}

}

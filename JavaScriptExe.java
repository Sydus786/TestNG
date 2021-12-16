package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExe {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/mac/eclipse-workspace/Core_Java/Driver/chromedriver");
		WebDriver win = new ChromeDriver();
		win.get("https://www.amazon.in/");
		win.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) win;
		js.executeScript("window.scroll(0,2000)", "");
		Thread.sleep(3000);
		js.executeScript("window.scroll(0,-2000)", "");
		Thread.sleep(3000);
		WebElement help = win.findElement(By.xpath("//a[contains(text(),'Help')]"));
		js.executeScript("arguments[0].scrollIntoView(true)", help);
		js.executeScript("arguments[0].click()", help);
//		win.close();
		win.quit();
	}

}

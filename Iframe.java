package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/mac/eclipse-workspace/Core_Java/Driver/chromedriver");
		WebDriver I = new ChromeDriver();
		I.get("http://www.leafground.com/pages/frame.html");
		I.manage().window().maximize();
		I.switchTo().frame(0);
		WebElement Click1 = I.findElement(By.id("Click"));
		Click1.click();
		String clicktext1 = Click1.getText();
		System.out.println(clicktext1);
		Thread.sleep(3000);
		
		I.switchTo().defaultContent();
		I.switchTo().frame(1);
		I.switchTo().frame("frame2");
		WebElement Click2 = I.findElement(By.xpath("//button[@id='Click1']"));
		Click2.click();
		String Clicktext2 = Click2.getText();
		System.out.println(Clicktext2);
		I.switchTo().defaultContent();
		List<WebElement> findElements = I.findElements(By.tagName("iframe"));
		int size = findElements.size();
		System.out.println(size);
		Thread.sleep(3000);
		I.close();
	}

}

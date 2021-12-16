package com.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Win_Han {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "/Users/mac/eclipse-workspace/Core_Java/Driver/chromedriver");
		WebDriver win = new ChromeDriver();
		win.get("https://www.amazon.in/");
		win.manage().window().maximize();
		org.openqa.selenium.interactions.Actions w = new org.openqa.selenium.interactions.Actions(win);
		WebElement Mob = win.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
//		w.contextClick();
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		w.keyDown(Keys.COMMAND).click(Mob).keyUp(Keys.COMMAND).build().perform();
		WebElement bs = win.findElement(By.xpath("//a[contains(text(),'Best Sellers')]"));
		w.keyDown(Keys.COMMAND).click(bs).keyUp(Keys.COMMAND).build().perform();
		int size = win.getWindowHandles().size();
		System.out.println(size);
//		String parentid = win.getWindowHandle();
//		System.out.println(parentid);
//		Set<String> allid = win.getWindowHandles();
//		System.out.println(allid);
		Set<String> all = win.getWindowHandles();
		for(String t:all) {
			String title = win.switchTo().window(t).getTitle();
			System.out.println(title);}
//		for(String close:all) {
//			if(close.equals(parentid)) {
//				win.switchTo().window(close).close();}}
		String Child = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in\n"
				+ "";
		for(String e:all) {
			if(win.switchTo().window(e).getTitle().equalsIgnoreCase(Child)) {
				break;}}
		
		win.close();
		}
	}


package com.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/mac/eclipse-workspace/Core_Java/Driver/chromedriver");
		WebDriver A = new ChromeDriver();
		A.get("http://www.leafground.com/pages/drop.html");
		A.manage().window().maximize();
		org.openqa.selenium.interactions.Actions a = new org.openqa.selenium.interactions.Actions(A);
        WebElement Drag = A.findElement(By.id("draggable"));
        WebElement Drop = A.findElement(By.id("droppable"));
        //a.clickAndHold(Drag).moveToElement(Drop).build().perform();
        a.dragAndDrop(Drag, Drop).build().perform();
        
        
        
        A.close();
		
		
	}

}

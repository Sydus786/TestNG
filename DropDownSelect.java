package com.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "/Users/mac/eclipse-workspace/Core_Java/Driver/chromedriver");
		
		WebDriver dd = new ChromeDriver();
		
		dd.get("http://www.leafground.com/");
		dd.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement Dropdown = dd.findElement(By.xpath("//img[@alt='ListBox']"));
		Dropdown.click();
		Thread.sleep(3000);
		
		WebElement D1 = dd.findElement(By.id("dropdown1"));
		Select s1 = new Select(D1);
		s1.selectByIndex(3);
		Thread.sleep(3000);
		
		WebElement D2 = dd.findElement(By.xpath("//select[@name='dropdown2']"));	
		Select s2 = new Select(D2);
		s2.selectByValue("1");
		Thread.sleep(3000);
		
		WebElement D3 = dd.findElement(By.name("dropdown3"));
		Select s3 = new Select(D3);
		s3.selectByVisibleText("Appium");
		Thread.sleep(3000);

		WebElement Multi = dd.findElement(By.xpath("(//select)[6]"));
		Select multidd = new Select (Multi);
		boolean multiple = multidd.isMultiple();
		System.out.println(multiple);
		List<WebElement> options = multidd.getOptions();
		for (WebElement i:options) {
			System.out.println(i.getText());}
		int size = options.size();
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			if (i==1 | i==3) {
				multidd.selectByIndex(i);}}
		Thread.sleep(3000);

		List<WebElement> allSelectedOptions = multidd.getAllSelectedOptions();
		for(WebElement i1:allSelectedOptions) {
		System.out.println(i1.getText());}
				
		WebElement firstSelectedOption = multidd.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		multidd.deselectByIndex(1);
		multidd.deselectAll();
		Thread.sleep(3000);

		TakesScreenshot T = (TakesScreenshot) dd;
		File screenshotAs = T.getScreenshotAs(OutputType.FILE);
		File destination = new File("/Users/mac/eclipse-workspace/Core_Java/SS/DD.png");
		FileUtils.copyFile(screenshotAs, destination);
		
		dd.close();}}
		
		
		
	



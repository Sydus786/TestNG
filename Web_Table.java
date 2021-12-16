package com.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/mac/eclipse-workspace/Core_Java/Driver/chromedriver");
		WebDriver w = new ChromeDriver();
		w.get("http://www.leafground.com/pages/table.html");
		w.manage().window().maximize();
		w.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("***All Data***");
		List<WebElement> alldata = w.findElements(By.xpath("//table/tbody/tr/td"));
		for(WebElement all:alldata) {
			System.out.println(all.getText());
		}
		System.out.println("***Header***");
		List<WebElement> header = w.findElements(By.xpath("//table/tbody/tr/th"));
		for(WebElement head:header) {
			System.out.println(head.getText());
		}
		System.out.println("***Row Data***");
		List<WebElement> rowdata = w.findElements(By.xpath("//table/tbody/tr[2]/td"));
		for(WebElement row:rowdata) {
			System.out.println(row.getText());
		}
		System.out.println("***Col Data***");
		List<WebElement> coldata = w.findElements(By.xpath("//table/tbody/tr/td[5]"));
		for(WebElement col:coldata) {
			System.out.println(col.getText());
		}
		System.out.println("***Part Data***");
		WebElement partdata = w.findElement(By.xpath("//table/tbody/tr[3]/td[5]"));
		System.out.println(partdata.getText());
		System.out.println("***Row Size***");
		List<WebElement> rowsize = w.findElements(By.tagName("tr"));
		int rs = rowsize.size();
		System.out.println(rs);
		System.out.println("***Col Size***");
		List<WebElement> colsize = w.findElements(By.tagName("td"));
		int cs = colsize.size();
		System.out.println(cs);
		System.out.println("***Fol Data***");
		WebElement fol = w.findElement(By.xpath("//td[normalize-space()='Learn Locators']//following::td[5]"));
		System.out.println(fol.getText());
		w.close();
	}

}

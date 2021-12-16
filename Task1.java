package com.Selenium;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/mac/eclipse-workspace/Core_Java/Driver/chromedriver");
		WebDriver t1 = new ChromeDriver();
		t1.get("http://automationpractice.com/index.php");
		t1.manage().window().maximize();
		WebElement Women = t1.findElement(By.xpath("//a[@title='Women']"));
		Women.click();
		Thread.sleep(3000);
		WebElement PrintedDress = t1.findElement(By.xpath("(//img[@title='Printed Dress'])[2]"));
		PrintedDress.click();
		t1.switchTo().frame(0);
		WebElement Qty = t1.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
		Qty.click();
		Qty.click();
		WebElement Size = t1.findElement(By.xpath("//select[@id='group_1']"));
		Select S = new Select (Size);
		S.selectByVisibleText("L");
		WebElement Color = t1.findElement(By.xpath("//a[@id='color_24']"));
		Color.click();
		WebElement A2C = t1.findElement(By.xpath("//p[@id='add_to_cart']"));
		A2C.click();
		t1.close();
		
		}

}

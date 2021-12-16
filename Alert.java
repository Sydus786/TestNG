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

public class Alert {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "/Users/mac/eclipse-workspace/Core_Java/Driver/chromedriver");
		
		WebDriver a = new ChromeDriver();
		
		a.get("http://demo.automationtesting.in/Alerts.html");
		a.manage().window().maximize();
		
		WebElement AlertOk = a.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		AlertOk.click();
		Thread.sleep(3000);
		WebElement SimpleAlert = a.findElement(By.xpath("//button[@onclick='alertbox()']"));
		SimpleAlert.click();
		Thread.sleep(3000);
		org.openqa.selenium.Alert ok = a.switchTo().alert();
		ok.accept();
		Thread.sleep(3000);
		
		WebElement AlertOkC = a.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		AlertOkC.click();
		Thread.sleep(3000);
		WebElement ConfirmAlert = a.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		ConfirmAlert.click();
		Thread.sleep(3000);
		org.openqa.selenium.Alert OkC = a.switchTo().alert();
		OkC.accept();
		Thread.sleep(3000);
		
		WebElement AlertText = a.findElement(By.xpath("//a[@href='#Textbox']"));
		AlertText.click();
		Thread.sleep(3000);
		WebElement Prompt = a.findElement(By.xpath("//button[contains(@class, 'info')]"));
		Prompt.click();
		Thread.sleep(3000);
		org.openqa.selenium.Alert Text = a.switchTo().alert();
		String GetText = Text.getText();
		System.out.println(GetText);
		Text.sendKeys("Syed Nayeemullah");
		Text.accept();
		Thread.sleep(3000);
		
		TakesScreenshot T = (TakesScreenshot) a;
		File screenshotAs = T.getScreenshotAs(OutputType.FILE);
		File destination = new File("/Users/mac/eclipse-workspace/Core_Java/SS/Alert.png");
		FileUtils.copyFile(screenshotAs, destination);
		a.close();
	}

}

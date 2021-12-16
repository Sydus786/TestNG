package com.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mini_Proj {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "/Users/mac/eclipse-workspace/Core_Java/Driver/chromedriver");
		WebDriver d = new ChromeDriver();
		d.get("http://adactinhotelapp.com/");
		d.manage().window().maximize();
		/*
		 * WebElement newuser =
		 * d.findElement(By.xpath("//a[contains(text(),'New User Register Here')]")
		 * ); newuser.click(); WebElement username =
		 * d.findElement(By.name("username")); username.sendKeys("Nayeemullah");
		 * WebElement pwd = d.findElement(By.id("password"));
		 * pwd.sendKeys("Syed@123"); WebElement repwd =
		 * d.findElement(By.id("re_password")); repwd.sendKeys("Syed@123");
		 * WebElement fullname = d.findElement(By.name("full_name"));
		 * fullname.sendKeys("Syed Nayeemullah"); WebElement emailid =
		 * d.findElement(By.id("email_add"));
		 * emailid.sendKeys("sydus786@gmail.com"); Thread.sleep(10000); WebElement agree
		 * = d.findElement(By.name("tnc_box")); agree.click(); WebElement register
		 * = d.findElement(By.name("Submit")); register.click();
		 */
		WebElement username = d.findElement(By.name("username"));
		username.sendKeys("Nayeemullah");
		WebElement pwd = d.findElement(By.id("password"));
		pwd.sendKeys("Syed@123");
		WebElement login = d.findElement(By.name("login"));
		login.click();
		WebElement location = d.findElement(By.name("location"));
		Select l1 = new Select(location);
		l1.selectByValue("Paris");
		WebElement hotel = d.findElement(By.id("hotels"));
		Select h1 = new Select (hotel);
		h1.selectByVisibleText("Hotel Sunshine");
		WebElement room = d.findElement(By.xpath("//select[@id='room_type']"));
		Select r1 = new Select (room);
		r1.selectByIndex(3);
		WebElement rooms = d.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));
		Select r2 = new Select (rooms);
		r2.selectByValue("1");
		WebElement checkin = d.findElement(By.id("datepick_in"));
		checkin.sendKeys("29/11/2021");
		WebElement checkout = d.findElement(By.name("datepick_out"));
		checkout.sendKeys("30/11/2021");
		WebElement adult = d.findElement(By.xpath("(//select[@class='search_combobox'])[5]"));
		Select a1 = new Select(adult);
		a1.selectByVisibleText("2 - Two");
		WebElement child = d.findElement(By.xpath("(//select[@class='search_combobox'])[6]"));
		Select c1 = new Select (child);
		c1.selectByValue("3");
		WebElement submit = d.findElement(By.id("Submit"));
		submit.click();
		
		WebElement select = d.findElement(By.name("radiobutton_0"));
		select.click();
		WebElement continues = d.findElement(By.id("continue"));
		continues.click();
		WebElement firstname = d.findElement(By.name("first_name"));
		firstname.sendKeys("Syed");
		WebElement lastname = d.findElement(By.id("last_name"));
		lastname.sendKeys("Nayeemullah");
		WebElement address = d.findElement(By.id("address"));
		address.sendKeys("5/1b,Cheran Street, Anbalagan Nagar, Sembium, Perambur, Ch-11, TN, INDIA");
		WebElement ccn = d.findElement(By.xpath("(//input[@type='text'])[13]"));
		ccn.sendKeys("1234567890987654321");
		WebElement cct = d.findElement(By.xpath("//select[@id='cc_type']"));
		Select cc1 = new Select (cct);
		cc1.selectByVisibleText("Master Card");
		WebElement expdate = d.findElement(By.id("cc_exp_month"));
		Select e1 = new Select(expdate);
		e1.selectByIndex(3);
		WebElement expyear = d.findElement(By.name("cc_exp_year"));
		Select e2 = new Select(expyear);
		e2.selectByValue("2022");
		WebElement cvv = d.findElement(By.xpath("//input[@id='cc_cvv']"));
		cvv.sendKeys("786");
		WebElement book = d.findElement(By.xpath("(//input[@type='button'])[1]"));
		book.click();
		Thread.sleep(7000);
		
		TakesScreenshot ts = (TakesScreenshot) d;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File ("/Users/mac/eclipse-workspace/Core_Java/SS/MiniProject.png");
		FileUtils.copyFile(screenshotAs, dest);
		
		WebElement itinerary = d.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/a[2]"));
		itinerary.click();
		TakesScreenshot ts1 = (TakesScreenshot) d;
		File screenshotAs1 = ts.getScreenshotAs(OutputType.FILE);
		File dest1 = new File ("/Users/mac/eclipse-workspace/Core_Java/SS/Itinerary.png");
		FileUtils.copyFile(screenshotAs1, dest1);
		
		WebElement select1 = d.findElement(By.xpath("(//input[@name='ids[]'])[1]"));
		select1.click();
		WebElement cancel = d.findElement(By.name("cancelall"));
		cancel.click();
		Thread.sleep(7000);
		d.switchTo().alert().accept();
		Thread.sleep(7000);
		TakesScreenshot ts2 = (TakesScreenshot) d;
		File screenshotAs2 = ts.getScreenshotAs(OutputType.FILE);
		File dest2 = new File ("/Users/mac/eclipse-workspace/Core_Java/SS/canceled.png");
		FileUtils.copyFile(screenshotAs2, dest2);
		WebElement logout = d.findElement(By.id("logout"));
		logout.click();
		Thread.sleep(7000);
		d.close();
	}

}

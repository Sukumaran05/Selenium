package org.test8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q7 {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	Thread.sleep(5000);
	WebElement usertext = driver.findElement(By.xpath("//input[@type='text']"));
	usertext.sendKeys("123456789");
	
	driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
	
	WebElement pass = driver.findElement(By.id("fldPasswordDispId"));
	pass.sendKeys("Sample@123");
	
	
	
	
	
	
	}

}

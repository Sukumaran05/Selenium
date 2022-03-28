package org.test8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6 {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://retail.onlinesbi.com/retail/login.htm");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[text()='CONTINUE TO LOGIN']")).click();
	WebElement btn = driver.findElement(By.xpath("//input[@title='Login']"));
	btn.click();
	Alert a = driver.switchTo().alert();
	Thread.sleep(5000);
	
	a.accept();

	driver.findElement(By.xpath("//input[@title='Login']")).click();
	
	
	
	
	}
	

}

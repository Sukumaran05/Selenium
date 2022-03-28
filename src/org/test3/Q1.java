package org.test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	WebElement srch = driver.findElement(By.xpath("//input[@dir='auto']"));
	srch.sendKeys("iphone");
	WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
	button.click();
	
	
	}
}

package org.test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	WebElement login = driver.findElement(By.xpath("//input[@name='email']"));
	login.sendKeys("Sample@gmail.com");
	
	WebElement pas = driver.findElement(By.xpath("//input[@name='pass']"));
	pas.sendKeys("sample123");
	
	WebElement log = driver.findElement(By.xpath("//button[@name='login']"));
	log.click();
	driver.manage().window().maximize();
	driver.quit();
	
	}
}

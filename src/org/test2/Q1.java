package org.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
		public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement login = driver.findElement(By.id("email"));
		login.sendKeys("Sample@gmail.com");
		
		WebElement pswd = driver.findElement(By.id("pass"));
		pswd.sendKeys("Sample@123");
		
		WebElement btn = driver.findElement(By.name("login"));
		
		btn.click();
		
		}

}

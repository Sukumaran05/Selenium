package org.test4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q7 {
	
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.google.com/");
	
	WebElement serch = driver.findElement(By.xpath("//input[@title='Search']"));
	serch.sendKeys("greens velmurugan");
	
	WebElement btn = driver.findElement(By.xpath("//input[@type='submit'][1]"));
	btn.click();
	
	WebElement link = driver.findElement(By.xpath("//h3[text()='Velmurugan K - Technical Manager']"));
	link.click();
	
	
	}

}

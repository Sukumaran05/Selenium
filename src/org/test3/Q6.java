package org.test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6 {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.redbus.in/");
	
	//WebElement drop = driver.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
	//drop.click();

	//WebElement signup = driver.findElement(By.xpath("//li[@id='signInLink']"));
	//signup.click();

	WebElement ph = driver.findElement(By.xpath("//input[@type='number']"));
	ph.sendKeys("9789673405");

	WebElement recapt = driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
	recapt.click();

	WebElement btn = driver.findElement(By.xpath("//span[@class='f-w-b']"));
	btn.click();
	
	
	}

}

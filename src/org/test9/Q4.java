package org.test9;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/python-training.html");

	driver.findElement(By.xpath("//h3[text()='Selenium Test Papers']")).click();
	driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']")).click();
	driver.findElement(By.xpath("//button[text()='Windows Handling']")).click();
	
	String parentID = driver.getWindowHandle();
	System.out.println(parentID);
	
	Set<String> allID = driver.getWindowHandles();
	System.out.println(allID);
	
	for (String s : allID) {
		
		if((parentID!=s)) {
			driver.switchTo().window(s);
		}
	}
	

	}

}

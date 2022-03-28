package org.test9;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get(" https://www.snapdeal.com/");

	driver.findElement(By.name("keyword")).sendKeys("sanitizer");
	driver.findElement(By.xpath("//span[text()='Search']")).click();
	
	driver.findElement(By.xpath("//p[text()='TRUE DERMA ESSENTIALS Green Apple (72% Isopropyl Alcohol) Soft Gel Base Hand Sanitizer 500 mL Pack of 1']")).click();
	String parentID = driver.getWindowHandle();
	System.out.println(parentID);
	
	Set<String> allID = driver.getWindowHandles();
	System.out.println(allID);
	
	for (String s : allID) {
		
		if((parentID!=s)) {
			driver.switchTo().window(s);
		}
	}
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text()='add to cart']")).click();

	
	}

}

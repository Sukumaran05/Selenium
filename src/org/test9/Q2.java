package org.test9;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.snapdeal.com/");

	driver.findElement(By.name("keyword")).sendKeys("iphones 7");
	
	driver.findElement(By.xpath("//span[text()='Search']")).click();
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
	driver.findElement(By.xpath("//p[text()='Apple iPhone 7 Shock Proof Case Shining Stars - Transparent']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//span[@class='intialtext'])[2]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@class='pdp-final-price']")).getText();
	
	}

}

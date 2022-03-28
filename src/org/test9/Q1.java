package org.test9;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com/");

	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphones X");
	
	driver.findElement(By.id("nav-search-submit-button")).click();
	String parentID = driver.getWindowHandle();
	System.out.println(parentID);
	
	Set<String> allID = driver.getWindowHandles();
	System.out.println(allID);
	
	for (String s : allID) {
		
		if((parentID!=s)) {
			driver.switchTo().window(s);
			System.out.println(s);
		}
	}
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text()='Apple iPhone 12 Pro Max, 256GB, Pacific Blue - Unlocked (Renewed Premium)']")).click();
	WebElement price = driver.findElement(By.xpath("//span[text()='$1,049.00']"));
	System.out.println(price.getText());
	
	
	
	}

}

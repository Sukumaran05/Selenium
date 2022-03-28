package org.test9;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.homedepot.com/");

	driver.findElement(By.id("headerSearch")).sendKeys("celling fan");
	
	driver.findElement(By.className("SearchBox__buttonIcon")).click();
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
	driver.findElement(By.xpath("//span[text()='Mercer 52 in. LED Indoor Brushed Nickel Ceiling Fan with Light Kit and Remote Control']")).click();
	Thread.sleep(5000);
	//driver.findElement(By.xpath("(//button[text()='Remote Included')")).click();

	driver.findElement(By.className("super-sku__inline-tile border-radius--medium")).click();
	}

}

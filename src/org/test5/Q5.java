package org.test5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q5 {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.shopclues.com/wholesale.html");
	driver.manage().window().maximize();
	
	Actions select = new Actions(driver);
	WebElement moveToSport = driver.findElement(By.xpath("//a[text()='Sports & More']"));
	select.moveToElement(moveToSport).perform();
	
	driver.findElement(By.xpath("//a[text()='Weight Gainers']")).click();
	
	
	
	}

}

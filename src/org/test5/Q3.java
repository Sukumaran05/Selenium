package org.test5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q3 {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.flipkart.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Actions select = new Actions(driver);
	WebElement moveToHome = driver.findElement(By.xpath("//img[@alt='Home']"));
	select.moveToElement(moveToHome).perform();
	
	WebElement findElement = driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[4]"));
	select.moveToElement(findElement).click().perform();

	
	
	
	
	}

}

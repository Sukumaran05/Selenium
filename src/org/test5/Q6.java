package org.test5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q6 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	
	Actions select = new Actions(driver);
	WebElement moveToCourse = driver.findElement(By.xpath("//div[text()='Courses ']"));
	select.moveToElement(moveToCourse).perform();
	
	WebElement moveToSoftw = driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
	select.moveToElement(moveToSoftw).perform();
	
	driver.findElement(By.xpath("//span[text()='Selenium Certification Training']")).click();
	
	
	}

}

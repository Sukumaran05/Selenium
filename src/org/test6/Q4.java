package org.test6;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q4 {
	
	public static void main(String[] args) throws AWTException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	Actions select = new Actions(driver);
	
	
	driver.findElement(By.xpath("(//h2[@class='mb-0'])[6]")).click();
	
	Robot r = new Robot();

	driver.findElement(By.xpath("//a[text()=' TESTNG']")).click();


	
	
	}
}

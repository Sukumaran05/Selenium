package org.test6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q3 {
	
	public static void main(String[] args) throws AWTException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	Actions select = new Actions(driver);
	
	driver.findElement(By.xpath("(//h2[@class='title mb-0 center'])[1]")).click();
	
	Robot r = new Robot();

	WebElement moveToCTS = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
	select.moveToElement(moveToCTS).perform();
	select.contextClick().perform();
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	}
}

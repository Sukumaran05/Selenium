package org.test6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q2 {

	public static void main(String[] args) throws AWTException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.co.in/webhp");
	Actions a = new Actions(driver);
	
	WebElement userText = driver.findElement(By.name("q"));
	userText.sendKeys("Vel Muruga");
	
	Robot r = new Robot();
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_A);
	
	r.keyRelease(KeyEvent.VK_A);
	r.keyRelease(KeyEvent.VK_CONTROL);
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_X);
	
	r.keyRelease(KeyEvent.VK_X);
	r.keyRelease(KeyEvent.VK_CONTROL);
	
	
	}
	
	
	
}

package org.test7;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q4 {
	
	public static void main(String[] args) throws AWTException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	JavascriptExecutor j = (JavascriptExecutor) driver;
	
	WebElement userText = driver.findElement(By.id("email"));
	j.executeScript("arguments[0].setAttribute('value','sample')", userText);
	Object fbuser = j.executeScript("return arguments[0].getAttribute('value')", userText);
	System.out.println(fbuser);
	
	WebElement userPass = driver.findElement(By.name("pass"));
	j.executeScript("arguments[0].setAttribute('value','sample@234')", userPass);
	Object fbpass = j.executeScript("return arguments[0].getAttribute('value')", userPass);
	System.out.println(fbpass);
	
	WebElement btn = driver.findElement(By.name("login"));
	j.executeScript("arguments[0].click()", btn);
	}

}

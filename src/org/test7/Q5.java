package org.test7;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {
	
	public static void main(String[] args) throws AWTException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://adactinhotelapp.com/");
	
	JavascriptExecutor j = (JavascriptExecutor) driver;
	
	WebElement userText = driver.findElement(By.id("username"));
	j.executeScript("arguments[0].setAttribute('value','hotel')", userText);
	Object userHotl = j.executeScript("return arguments[0].getAttribute('value')", userText);
	System.out.println(userHotl);
	
	WebElement userPass = driver.findElement(By.id("password"));
	j.executeScript("arguments[0].setAttribute('value','hotel@12345')", userPass);
	Object fbpass = j.executeScript("return arguments[0].getAttribute('value')", userPass);
	System.out.println(fbpass);
	
	WebElement btn = driver.findElement(By.id("login"));
	j.executeScript("arguments[0].click()", btn);
	}



}

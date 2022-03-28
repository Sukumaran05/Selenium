package org.test7;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q1 {

	public static void main(String[] args) throws AWTException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/");
	Actions a = new Actions(driver);
	
	WebElement add = driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
	a.moveToElement(add).perform();
	
	
	JavascriptExecutor j = (JavascriptExecutor) driver;
	
	Object obj = j.executeScript("return arguments[0].getAttribute('value')", add);
	System.out.println(obj);
	
}
}

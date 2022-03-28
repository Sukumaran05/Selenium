package org.test7;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6 {
	
	
	public static void main(String[] args) throws AWTException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	JavascriptExecutor j = (JavascriptExecutor) driver;
	
	//driver.findElement(By.xpath("//a[text()='Login']")).click();
	
	WebElement userName = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	j.executeScript("arguments[0].setAttribute('value','Flipkart')", userName);
	Object userFK = j.executeScript("return arguments[0].getAttribute('value')", userName);
	System.out.println(userFK);
	
	WebElement userPass = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
	j.executeScript("arguments[0].setAttribute('value','Flipkart@12345')", userPass);
	Object fbpass = j.executeScript("return arguments[0].getAttribute('value')", userPass);
	System.out.println(fbpass);
	
	WebElement btn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	j.executeScript("arguments[0].click()", btn);
	}

}

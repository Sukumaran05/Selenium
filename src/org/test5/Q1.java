package org.test5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q1 {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	
	Actions drag = new Actions(driver);
	
	WebElement srcBank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	
	WebElement destAcc = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	
	drag.dragAndDrop(srcBank, destAcc).perform();
	
	Thread.sleep(3000);
	
	Actions drag1 = new Actions(driver);
	WebElement srcFiveK = driver.findElement(By.xpath("//a[text()=' 5000']"));
	
	WebElement destAmt = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	
	drag1.dragAndDrop(srcFiveK, destAmt).perform();
	
//	WebElement srcBank1 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
//	
//	WebElement destAcc1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
//	
//	drag.dragAndDrop(srcBank1, destAcc1).perform();
//	
//	WebElement srcFiveK1 = driver.findElement(By.xpath("//a[text()=' 5000']"));
//	
//	WebElement destAmt1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
//	
//	drag.dragAndDrop(srcFiveK1, destAmt1).perform();
	
	}
	


}

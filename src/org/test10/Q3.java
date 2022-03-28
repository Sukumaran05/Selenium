package org.test10;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {
	public static void main(String[] args)throws InterruptedException, AWTException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/write-xpath-table.html");

	WebElement aTable = driver.findElement(By.xpath("//table[@border='l']"));
	List<WebElement> allRow = aTable.findElements(By.tagName("tr"));
		
	System.out.println(allRow.size());

	
	}
}

package org.test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q7 {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.cleartrip.com/trains");
	
	WebElement from = driver.findElement(By.xpath("//input[@title='From station']"));
	from.sendKeys("Chennai");
	
	WebElement to = driver.findElement(By.xpath("//input[@title='To station']"));
	to.sendKeys("Bangalore Cy Junction (SBC)");
	
	WebElement btn = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
	btn.click();
	
	}
	


}

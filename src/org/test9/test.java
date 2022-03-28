package org.test9;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	
	public static void main(String[] args)throws InterruptedException, AWTException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphones");
	
	driver.findElement(By.id("nav-search-submit-button")).click();

	List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	for (int i = 0; i < price.size(); i++) {
		WebElement priceList = price.get(i);
		System.out.println(priceList.getText());
	}
	System.out.println("Total no of mobile price taken is "+price.size());

	}

}

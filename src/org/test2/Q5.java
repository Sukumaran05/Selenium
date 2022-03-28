package org.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {
	
		public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/");
		
		WebElement userid = driver.findElement(By.name("fldLoginUserId"));
		userid.sendKeys("529018751");
		
		WebElement cont = driver.findElement(By.tagName("a"));
		cont.click();
		
		
		
		}

}

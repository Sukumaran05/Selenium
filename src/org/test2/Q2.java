package org.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {
	
		public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		WebElement frm = driver.findElement(By.id("src"));
		frm.sendKeys("Chennai");
		
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("Hyderabad");
		
		WebElement date = driver.findElement(By.id("onward_cal"));
		date.sendKeys("09-Feb-2022");
		
		WebElement srch = driver.findElement(By.id("search_btn"));
		srch.click();
		
		
		
		}
}

package org.test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q10 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement clk = driver.findElement(By.xpath("//a[@href='/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics']"));
		clk.click();
		
		
		
		
		
	}

}

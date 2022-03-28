package org.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8 {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		
		WebElement login = driver.findElement(By.name("username"));
		login.sendKeys("9789673405");
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("9789673405");
		
		WebElement btn = driver.findElement(By.tagName("button"));
		btn.click();

}
}

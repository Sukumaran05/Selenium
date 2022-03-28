package org.test4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8 {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://adactinhotelapp.com/");
	WebElement usernm = driver.findElement(By.xpath("//input[@name='username']"));
	usernm.sendKeys("Sukumaran.K");
	System.out.println("Username is "+usernm.getAttribute("value"));
	
	WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
	pass.sendKeys("abc123");
	System.out.println("Password is "+pass.getAttribute("value"));
	
	WebElement btn = driver.findElement(By.xpath("//input[@name='login']"));
	btn.click();
	
	
	
	
	
}

}

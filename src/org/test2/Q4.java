package org.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {
	
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	
	WebElement login = driver.findElement(By.name("IS_CIBRIB_LOGIN"));
	login.sendKeys("529018751");
	
	WebElement pwd = driver.findElement(By.name("IS_ACTION"));	
	pwd.sendKeys("Sugu@724428");
	
	
	}

}

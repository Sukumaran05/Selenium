package org.test5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q2 {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.amazon.in");
	driver.manage().window().maximize();
	
	Actions select = new Actions(driver);
	
	WebElement moveToPrime = driver.findElement(By.xpath("//span[text()='Prime']"));
	select.moveToElement(moveToPrime).perform();
	
	WebElement moveToFast = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/G/31/prime/NavFlyout/TryPrime/2018/Apr/IN-Prime-PIN-TryPrime-MultiBen-Apr18-400x400._CB442254244_.jpg']"));
	select.moveToElement(moveToFast).click().perform();
	
	}

}
